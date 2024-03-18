function TrRequestQueue(a0)
{
this._state=TrRequestQueue.STATE_READY;
this._requestQueue=new Array();
this._stateChangeListeners=null;
this._window=a0;
this._useJsfBuiltInAjaxForXhr=(_agent.useJsfAjax&&typeof jsf!="undefined");
}
TrRequestQueue.STATE_READY=0;
TrRequestQueue.STATE_BUSY=1;
TrRequestQueue._MULTIPART_FRAME="_trDTSFrame";
TrRequestQueue._XMLHTTP_TYPE=0;
TrRequestQueue._MULTIPART_TYPE=1;
TrRequestQueue.prototype.dispose=function()
{
this._requestQueue=null;
this._stateChangeListeners=null;
this._window=null;
}
TrRequestQueue._RequestItem=function(
a1,
a2,
a3,
a4,
a5,
a6,
a7,
a8,
a9
)
{
this._type=a1;
this._context=a2;
this._actionURL=a3;
this._headerParams=a4;
this._content=a5;
this._method=a6;
this._event=a7;
this._source=a8;
this._formId=a9;
}
TrRequestQueue.prototype._broadcastRequestStatusChanged=function(
a10,a11,a12)
{
if(a11)
{
try
{
a11.call(a10,a12);
}
catch(e)
{
TrRequestQueue._logError(
"Error ",e," delivering XML request status changed to ",
a11);
}
}
}
TrRequestQueue.prototype._addRequestToQueue=function(
a13,
a14,
a15,
a16,
a17,
a18,
a19,
a20,
a21
)
{
var a22=new TrRequestQueue._RequestItem(
a13,a14,a16,a18,a17,
a15,a19,a20,a21);
if(this._useJsfBuiltInAjaxForXhr&&a13==TrRequestQueue._XMLHTTP_TYPE)
{
this._state=TrRequestQueue.STATE_BUSY;
this._broadcastStateChangeEvent(TrRequestQueue.STATE_BUSY);
this._doXmlHttpRequest(a22);
return;
}
this._requestQueue.push(a22);
try
{
var a23=new TrXMLRequestEvent(
TrXMLRequestEvent.STATUS_QUEUED,
null,
a20);
this._broadcastRequestStatusChanged(a14,a15,a23);
}
catch(e)
{
TrRequestQueue._logError("Error on listener callback invocation - STATUS_QUEUED",e);
}
if(this._state==TrRequestQueue.STATE_READY)
{
this._state=TrRequestQueue.STATE_BUSY;
this._broadcastStateChangeEvent(TrRequestQueue.STATE_BUSY);
this._doRequest();
}
}
TrRequestQueue.prototype.sendFormPost=function(
a24,
a25,
a26,
a27,
a28,
a29
)
{
var a30;
try
{
a30=a26.getAttribute("_trinPPRAction");
}
catch(e){;}
var a31=a30?a30:a26.action;
if(this._isMultipartForm(a26))
{
this.sendMultipartRequest(a24,a25,a31,a26,a27);
}
else
{
if(_agent.isIE)
this._autoCompleteForm(a26);
if(this._useJsfBuiltInAjaxForXhr)
{
this.sendRequest(a24,a25,a31,a27,a28,a29,
a27?a27.source:null,a26.id);
}
else
{
var a32=this._getPostbackContent(a26,a27);
this.sendRequest(a24,a25,a31,a32,a28,a29,
a27?a27.source:null,a26.id);
}
}
}
TrRequestQueue.prototype._autoCompleteForm=function(a33)
{
var a34=window.external;
if(a34&&(typeof a34.AutoCompleteSaveForm!="undefined"))
{
try
{
a34.AutoCompleteSaveForm(a33);
}
catch(e)
{
}
}
}
TrRequestQueue.prototype._isMultipartForm=function(a35)
{
if(!_agent.supportsDomDocument)
{
return false;
}
if(a35.enctype.toLowerCase()!="multipart/form-data")
return false;
var a36=a35.getElementsByTagName("input"),
inputCount=a36.length,multiPartForm=null;
for(var a37=0;a37<inputCount;++a37)
{
var a38=a36[a37];
if(a38.type=="file"&&a38.value)
{
return true;
}
}
return false;
}
TrRequestQueue.prototype._getPostbackContent=function(a39,a40)
{
var a41=a39.elements;
var a42={};
if(a41)
{
for(var a43=0;a43<a41.length;a43++)
{
var a44=a41[a43];
if(a44.name&&!a44.disabled&&!(a44.tagName=="INPUT"&&a44.type=="submit"))
{
if(a44.options)
{
a42[a44.name]=new Array();
for(var a45=0;a45<a44.options.length;a45++)
{
var a46=a44.options[a45];
if(a46.selected)
{
var a47=(a46.value===null)?
a46.text:a46.value;
a42[a44.name].push(a47);
}
}
}
else if(!((a44.type=="checkbox"||
a44.type=="radio")&&
!a44.checked))
{
var a48=a42[a44.name];
if(a48)
{
if(!a48.join)
{
var a49=new Array();
a49.push(a48);
a42[a44.name]=a49;
a48=a49;
}
a48.push(a44.value);
}
else
{
a42[a44.name]=a44.value;
}
}
}
}
}
for(var a50 in a40)
{
var a51=a40[a50];
a42[a50]=a40[a50];
}
var a52="";
for(var a50 in a42)
{
var a53=a42[a50];
if(a53!=null)
{
if(a53.join)
{
var a54=a53;
for(var a55=0;a55<a54.length;a55++)
{
a52=TrRequestQueue._appendUrlFormEncoded(a52,a50,a54[a55]);
}
}
else
{
a52=TrRequestQueue._appendUrlFormEncoded(a52,a50,a53);
}
}
}
return a52;
}
TrRequestQueue._appendUrlFormEncoded=function(
a56,
a57,
a58)
{
if(a56.length>0)
{
a56=a56+"&";
}
return a56+a57+"="+a58.toString().replace(/\%/g,'%25')
.replace(/\+/g,'%2B')
.replace(/\//g,'%2F')
.replace(/\&/g,'%26')
.replace(/\"/g,'%22')
.replace(/\'/g,'%27');
}
TrRequestQueue.prototype.sendRequest=function(
a59,
a60,
a61,
a62,
a63,
a64,
a65,
a66
)
{
this._addRequestToQueue(TrRequestQueue._XMLHTTP_TYPE,a59,a60,a61,a62,
a63,a64,a65,a66);
}
TrRequestQueue.prototype.sendMultipartRequest=function(
a67,
a68,
a69,
a70,
a71
)
{
var a72=
{"htmlForm":a70,"params":a71,"context":a67,"method":a68};
this._addRequestToQueue(TrRequestQueue._MULTIPART_TYPE,a72,null,a69,
a71?a71.source:null,a70.id);
}
TrRequestQueue.prototype._doRequest=function()
{
var a73=this._requestQueue.shift();
switch(a73._type)
{
case TrRequestQueue._XMLHTTP_TYPE:
this._doXmlHttpRequest(a73);
break;
case TrRequestQueue._MULTIPART_TYPE:
this._doRequestThroughIframe(a73);
break;
}
}
TrRequestQueue.prototype._doXmlHttpRequest=function(a74)
{
var a75;
if(this._useJsfBuiltInAjaxForXhr)
{
a75=new TrXMLJsfAjaxRequest(a74._event,a74._content,
a74._formId);
}
else
{
a75=new TrXMLRequest();
}
a75.__dtsRequestContext=a74._context;
a75.__dtsRequestMethod=a74._method;
a75.__dtsRequestSource=a74._source;
a75.__dtsRequestFormId=a74._formId;
var a76=TrUIUtils.createCallback(this,this._handleRequestCallback);
a75.setCallback(a76);
if(!this._useJsfBuiltInAjaxForXhr)
{
a75.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
var a77=a74._headerParams;
if(a77!=null)
{
for(var a78 in a77)
{
var a79=a77[a78];
if(a79["join"])
a79=a79.join(',')
a75.setRequestHeader(a78,a79);
}
}
}
a75.send(a74._actionURL,a74._content);
}
TrRequestQueue.prototype._doRequestThroughIframe=function(a80)
{
var a81=a80._context.htmlForm;
var a82=a80._actionURL;
var a83=a80._context.params;
var a84=TrRequestQueue._MULTIPART_FRAME;
var a85=this._getDomDocument();
var a86=a85.getElementById(a84),iframeDoc;
var a87=_agent.isIE;
if(!a86)
{
a86=a85.createElement('iframe');
a86.name=a84;
a86.id=a84;
var a88=a86.style;
a88.top=a88.left='0px';
a88.width=a88.height='1px'
a88.position='absolute';
a88.visibility="hidden";
a85.body.appendChild(a86);
}
if(a87)
{
a86=a85.frames[a84];
a86.name=a84;
iframeDoc=a86.document;
}
else if(_agent.isSafari)
{
iframeDoc=a86.document;
}
else
{
iframeDoc=a86.contentDocument;
}
if(iframeDoc&&iframeDoc.firstChild)
iframeDoc.removeChild(iframeDoc.firstChild);
this._source=a80.params?
a80.params["javax.faces.source"]||a80.params["source"]:null;
this._dtsContext=a80._context.context;
this._dtsRequestMethod=a80._context.method;
this._htmlForm=a81;
this._dtsSource=a80._source;
this._savedActionUrl=a81.action;
this._savedTarget=a81.target;
a81.method="POST";
a81.action=a82;
a81.target=a84;
this._appendParamNode(a85,a81,"Tr-XHR-Message","true");
if(a83)
{
for(var a89 in a83)
{
var a90=a83[a89];
this._appendParamNode(a85,a81,a89,a90);
}
}
if(this._iframeLoadCallback==null)
this._iframeLoadCallback=TrUIUtils.createCallback(this,this._handleIFrameLoad);
if(_agent.isIE)
this._autoCompleteForm(a81);
try
{
a81.submit();
}
catch(e)
{
if(this._isMultipartForm(a81))
{
var a91=_createFacesMessage(
'org.apache.myfaces.trinidad.component.core.input.CoreInputFile.INPUT_FILE_ERROR');
if(!TrMessageBox.isPresent())
alert(a91.getDetail());
else
TrMessageBox.addMessage(null,null,a91);
}
else
{
throw e;
}
}
this._window.setTimeout(this._iframeLoadCallback,50);
}
TrRequestQueue.prototype._appendParamNode=function(a92,a93,a94,a95)
{
var a96=this._paramNodes;
if(!a96)
{
a96=new Array();
this._paramNodes=a96;
}
if(a94=="source")
{
var a97=a92.getElementsByName("source");
if(a97.length>0)
{
for(var a98=0,size=a97.length;a98<size;++a98)
{
var a99=a97[a98];
if(a99.tagName=="INPUT")
{
a99.value=a95;
return;
}
}
}
}
var a100=a92.createElement("input");
a100.type="hidden";
a100.name=a94;
a100.value=a95;
a96.push(a100);
a93.appendChild(a100);
}
TrRequestQueue.prototype._clearParamNodes=function()
{
var a101=this._paramNodes;
if(a101)
{
var a102=a101[0].parentNode;
var a103=a101.length;
for(var a104=0;a104<a103;a104++)
{
a102.removeChild(a101[a104]);
}
delete this._paramNodes;
}
}
TrRequestQueue.prototype._isIFrameBlankHTML=function(a105)
{
return(_agent.isSafari&&a105.documentURI=="about:blank");
}
TrRequestQueue.prototype._handleIFrameLoad=function()
{
var a106=this._getDomDocument();
var a107=_agent.isIE;
var a108=TrRequestQueue._MULTIPART_FRAME;
var a109,iframeDoc;
if(a107)
{
a109=a106.frames[a108];
var a110=a109.document;
}
else
{
a109=a106.getElementById(a108);
a110=a109.contentDocument;
}
try
{
if(!a110.documentElement||!a110.documentElement.firstChild
||(a107&&a110.readyState!="complete")||
this._isIFrameBlankHTML(a110))
{
this._window.setTimeout(this._iframeLoadCallback,50);
}
else
{
this._onIFrameLoadComplete(a110,this._dtsContext,
this._dtsRequestMethod);
}
}
catch(e)
{
TrRequestQueue._alertError();
TrRequestQueue._logError("Error while performing request",e);
this._htmlForm.action=this._savedActionUrl;
this._htmlForm.target=this._savedTarget;
}
}
TrRequestQueue.prototype._onIFrameLoadComplete=function(
a111,
a112,
a113)
{
try
{
var a114=new TrIFrameXMLRequestEvent(
a111,
this._dtsSource,
this._htmlForm.id);
this._broadcastRequestStatusChanged(a112,a113,a114);
}
finally
{
if(a111.firstChild)
a111.removeChild(a111.firstChild);
this._htmlForm.action=this._savedActionUrl;
this._htmlForm.target=this._savedTarget;
delete this._dtsSource;
this._clearParamNodes();
this._requestDone();
}
}
TrRequestQueue.prototype._handleRequestCallback=function(
a115
)
{
var a116=a115.getCompletionState();
if(a116!=TrXMLRequest.COMPLETED)
return;
var a117=0;
var a118=TrRequestQueue._getFailedConnectionText();
try
{
a117=a115.getStatus();
}
catch(e)
{
}
if((a117<200||a117>=300)&&(a117!=0))
{
TrRequestQueue._alertError();
TrRequestQueue._logError("Error StatusCode(",
a117,
") while performing request\n",
a115.getResponseText());
}
try
{
if(a117!=0)
{
var a119=new TrXMLRequestEvent(
TrXMLRequestEvent.STATUS_COMPLETE,
a115,
a115.__dtsRequestSource,
a115.__dtsRequestFormId);
this._broadcastRequestStatusChanged(
a115.__dtsRequestContext,
a115.__dtsRequestMethod,
a119);
}
}
finally
{
a115.cleanup();
delete a115;
this._requestDone();
}
}
TrRequestQueue.prototype._requestDone=function()
{
if(this._requestQueue.length>0)
{
this._doRequest();
}
else
{
this._state=TrRequestQueue.STATE_READY;
this._broadcastStateChangeEvent(TrRequestQueue.STATE_READY);
}
}
TrRequestQueue.prototype.addStateChangeListener=function(a120,a121)
{
var a122=this._stateChangeListeners;
if(!a122)
{
a122=new Array();
this._stateChangeListeners=a122;
}
a122.push(a120);
a122.push(a121);
}
TrRequestQueue.prototype.removeStateChangeListener=function(a123,a124)
{
var a125=this._stateChangeListeners;
var a126=a125.length;
for(var a127=0;a127<a126;a127++)
{
var a128=a125[a127];
a127++;
if(a128==a123)
{
var a129=a125[a127];
if(a129===a124)
{
a125.splice(a127-1,2);
}
}
}
if(a125.length==0)
{
this._stateChangeListeners=null;
}
}
TrRequestQueue.prototype.getDTSState=function()
{
return this._state;
}
TrRequestQueue.prototype.__useJsfBuiltInAjaxForXhr=function()
{
return this._useJsfBuiltInAjaxForXhr;
}
TrRequestQueue.prototype.__disableJsfBuiltInAjaxForXhr=function()
{
this._useJsfBuiltInAjaxForXhr=false;
}
TrRequestQueue.prototype._broadcastStateChangeEvent=function(a130)
{
var a131=this._stateChangeListeners;
if(a131)
{
var a132=a131.length;
for(var a133=0;a133<a132;a133++)
{
try
{
var a134=a131[a133];
a133++;
var a135=a131[a133];
if(a135!=null)
a134.call(a135,a130);
else
a134(a130);
}
catch(e)
{
TrRequestQueue._logError("Error on DTS State Change Listener",e);
}
}
}
}
TrRequestQueue.prototype._getDomDocument=function()
{
return this._window.document;
}
TrRequestQueue._getFailedConnectionText=function()
{
return"Connection failed";
}
TrRequestQueue._alertError=function()
{
var a136=TrRequestQueue._getFailedConnectionText();
if(a136!=null)
alert(a136);
}
TrRequestQueue._logWarning=function(a137)
{
if(window.console&&console.warn)
console.warn(arguments);
}
TrRequestQueue._logError=function(a138)
{
if(window.console&&console.error)
{
console.error(arguments);
}
}
