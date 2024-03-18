function TrPage()
{
this._requestQueue=new TrRequestQueue(window);
this._loadedLibraries=TrPage._collectLoadedLibraries();
}
TrPage._VIEW_STATE_ID="javax.faces.ViewState";
TrPage.getInstance=function()
{
if(TrPage._INSTANCE==null)
TrPage._INSTANCE=new TrPage();
return TrPage._INSTANCE;
}
TrPage.prototype.getRequestQueue=function()
{
return this._requestQueue;
}
TrPage.prototype.sendPartialFormPost=function(a0,a1,a2,a3)
{
var a4=this.getRequestQueue();
if(!this._xhrInited)
{
this._xhrInited=true;
if(this._noPprOverJsfAjax)
{
a4.__disableJsfBuiltInAjaxForXhr();
}
else if(a4.__useJsfBuiltInAjaxForXhr())
{
jsf.ajax.addOnEvent(TrUIUtils.createCallback(this,this._jsfAjaxCallback));
}
}
a4.sendFormPost(this,this._requestStatusChanged,a0,a1,a2,a3);
}
TrPage.prototype._requestStatusChanged=function(a5)
{
if(a5.getStatus()==TrXMLRequestEvent.STATUS_COMPLETE)
{
var a6=a5.getResponseStatusCode();
if(a6>=200&&a6<300)
{
_pprStopBlocking(window);
if(a5.isPprResponse())
{
var a7=a5.getResponseXML();
if(a7!=null)
{
if(a5.isJsfAjaxRequest())
{
this._handleJsfAjaxResponse(a5);
}
else
{
this._handlePprResponse(a5,a7);
}
}
}
else
{
}
}
else if(a6>=400)
{
_pprStopBlocking(window);
}
}
if(a5.isJsfAjaxRequest())
{
this._handleJsfAjaxResponse(a5);
}
}
TrPage.prototype._handleJsfAjaxResponse=function(a8)
{
try
{
var a9=a8.getResponseStatusCode();
if(a9>=200&&a9<300)
{
if(this._ajaxOldDomElements)
{
this._notifyDomReplacementListeners(this._ajaxOldDomElements);
}
if(this._activeNode)
{
var a10=this._activeNode;
delete this._activeNode;
var a11=-1;
if(a10.id)
{
for(var a12=0,size=this._ajaxOldDomElements.length;a12<size;++a12)
{
if(TrPage._isDomAncestorOf(a10,this._ajaxOldDomElements[a12].element))
{
a11=a12;
break;
}
}
if(a11>=0)
{
a10=document.getElementById(a10.id);
window._trActiveElement=a10;
if(a10)
{
a10.focus();
}
}
}
}
}
}
finally
{
delete this._ajaxOldDomElements;
delete this._activeNode;
}
}
TrPage.prototype._handlePprResponse=function(a13,a14)
{
var a15=a14.documentElement;
var a16=TrPage._getNodeName(a15);
if(a16=="partial-response")
{
var a17=a15.childNodes;
var a18=a17.length;
for(var a19=0;a19<a18;a19++)
{
var a20=a17[a19];
switch(TrPage._getNodeName(a20))
{
case"changes":
for(var a21=0,size=a20.childNodes.length;a21<size;++a21)
{
var a22=a20.childNodes[a21];
switch(TrPage._getNodeName(a22))
{
case"update":
this._handlePprResponseFragment(a22,a13.getFormId());
break;
case"eval":
this._handlePprResponseScript(a22);
break;
case"extension":
if(a22.getAttribute("id")=="tr-script-library")
{
this._handlePprResponseLibrary(a22);
}
break;
default:
break;
}
}
break;
case"error":
var a23=TrPage._getTextContent(a20.firstChild.nextSibling);
if(a23==null)
a23="Unknown error during PPR";
alert(a23);
return;
case"redirect":
var a24=a20.getAttribute("url");
window.location.href=a24;
}
}
}
else
{
window.location.reload(true);
}
}
TrPage.prototype.__disablePprOverJsfAjax=function()
{
this._noPprOverJsfAjax=true;
}
TrPage.prototype._addResetFields=function(a25,a26)
{
var a27=this._resetFields;
if(!a27)
{
a27=new Object();
this._resetFields=a27;
}
var a28=a27[a25];
if(!a28)
{
a28=new Object();
a27[a25]=a28;
}
for(var a29=0;a29<a26.length;a29++)
{
a28[a26[a29]]=true;
}
}
TrPage.prototype._resetHiddenValues=function(a30)
{
var a31=this._resetFields;
if(a31)
{
var a32=a31[a30.getAttribute("name")];
if(a32)
{
for(var a33 in a32)
{
var a34=a30[a33];
if(!a34)
a34=a30.elements.currField;
if(a34)
a34.value='';
}
}
}
}
TrPage.prototype._addResetCalls=function(a35,a36)
{
var a37=this._resetCalls;
if(!a37)
{
a37=new Object();
this._resetCalls=a37;
}
var a38=a37[a35];
if(!a38)
{
a38=new Object();
a37[a35]=a38;
}
for(var a39 in a36)
{
a38[a39]=a36[a39];
}
}
TrPage.prototype._resetForm=function(form)
{
var resetCalls=this._resetCalls;
if(!resetCalls)
return false;
var formReset=resetCalls[form.getAttribute("name")];
if(!formReset)
return false;
var doReload=false;
for(var k in formReset)
{
var trueResetCallback=unescape(formReset[k]);
if(eval(trueResetCallback))
doReload=true;
}
return doReload;
}
TrPage._getNodeName=function(a40)
{
var a41=a40.nodeName;
if(!a41)
a41=a40.tagName;
return a41;
}
TrPage.prototype.__handlePprResponseAction=function(a42)
{
var a43=window.document;
a43.forms[0].action=a42;
}
TrPage.prototype._handlePprResponseFragment=function(a44,a45)
{
var a46=window.document;
if(a44.getAttribute("id")==TrPage._VIEW_STATE_ID)
{
this._updateViewState(a46,a44,a45);
return;
}
var a47;
var a48;
var a49=null;
if(_agent.isWindowsMobile6)
{
var a50=a44.childNodes[0];
if(!a50)
return;
var a51="";
for(var a52=0,size=a44.childNodes.length;a52<size;++a52)
{
a51+=a44.childNodes[a52].data;
}
tempDiv=a46.createElement("div");
tempDiv.id="tempDiv";
tempDiv.hidden="true";
var a53=a46.body;
a53.appendChild(tempDiv);
tempDiv.innerHTML=a51;
var a54=TrPage._getFirstElementWithId(tempDiv);
a47=_getElementById(a46,a54.id);
if(!a47)
{
return;
}
a48=_getActiveElement();
if(a48&&TrPage._isDomAncestorOf(a48,a47))
a49=a48.id;
a47.parentNode.insertBefore(a54,a47);
a47.innerHTML="";
a47.parentNode.removeChild(a47);
tempDiv.innerHTML="";
a53.removeChild(tempDiv);
}
else
{
var a54=this._getFirstElementFromFragment(a44);
if(!a54)
return;
var a55=a54.getAttribute("id");
if(!a55)
return;
a47=_getElementById(a46,a55);
a48=_getActiveElement();
if(a48&&TrPage._isDomAncestorOf(a48,a47))
a49=a48.id;
if(a47)
a47.parentNode.replaceChild(a54,a47);
}
var a56=this._domReplaceListeners;
if(a56)
{
for(var a52=0;a52<a56.length;a52+=2)
{
var a57=a56[a52];
var a58=a56[a52+1];
if(a58!=null)
a57.call(a58,a47,a54);
else
a57(a47,a54);
}
}
if(a49)
{
a48=a46.getElementById(a49);
if(a48&&a48.focus)
{
a48.focus();
window._trActiveElement=a48;
}
}
}
TrPage.prototype._updateViewState=function(a59,a60,a61)
{
var a62=null;
if(a61)
a62=a59.getElementById(a61);
if(!a62)
a62=a59.forms[0];
if(!a62)
return;
var a63=a62.elements[TrPage._VIEW_STATE_ID];
if(!a63)
{
a63=a59.createElement("input");
a63.type='hidden';
if(_agent.isIE&&_agent.version<8)
{
a63.id=TrPage._VIEW_STATE_ID;
}
a63.name=TrPage._VIEW_STATE_ID;
a62.appendChild(a63);
}
a63.value=TrPage._getTextContent(a60);
}
TrPage._isDomAncestorOf=function(a64,a65)
{
while(a64)
{
if(a64==a65)
return true;
var a66=a64.parentNode;
if(a66==a64)
break;
a64=a66;
}
return false;
}
TrPage.prototype.__replaceDomElement=function(a67,a68)
{
a68.parentNode.replaceChild(a67,a68);
}
TrPage.prototype._getFirstElementFromFragment=function(a69)
{
var a70=a69.childNodes;
var a71="";
for(var a72=0,size=a70.length;a72<size;++a72)
{
if(a70[a72].nodeType==4)
{
a71+=a70[a72].data;
}
}
var a73=window.document;
var a74=a73.createElement("div");
a74.innerHTML=a71;
return TrPage._getFirstElementWithId(a74);
}
TrPage._getFirstElementWithId=function(a75)
{
var a76=a75.childNodes;
var a77=a76.length;
for(var a78=0;a78<a77;a78++)
{
var a79=a76[a78];
if(a79.id)
{
if(!_agent.supportsNodeType)
{
return a79;
}
else if(a79.nodeType==1)
{
return a79;
}
}
var a80=TrPage._getFirstElementWithId(a79);
if(a80!=null)
{
return a80;
}
}
return null;
}
TrPage.prototype._loadScript=function(source)
{
var loadedLibraries=this._loadedLibraries;
if(loadedLibraries[source])
return;
loadedLibraries[source]=true;
var xmlHttp=new TrXMLRequest();
xmlHttp.setSynchronous(true);
xmlHttp.send(source,null);
if(xmlHttp.getStatus()==200)
{
var responseText=xmlHttp.getResponseText();
if(responseText)
{
if(_agent.isIE||_agent.isWindowsMobile6)
{
try
{
window.execScript(responseText);
}catch(e){}
}
else
window.eval(responseText);
}
}
xmlHttp.cleanup();
}
TrPage.prototype._handlePprResponseScript=function(scriptNode)
{
var source=scriptNode.getAttribute("src");
if(source)
{
this._loadScript(source);
}
else
{
var nodeText=TrPage._getTextContent(scriptNode);
if(nodeText)
{
if(_agent.isIE||_agent.isWindowsMobile6)
{
try
{
window.execScript(nodeText);
}
catch(e){}
}
else if(_agent.isBlackBerry)
{
var head=document.getElementsByTagName("head")[0];
var scriptElement=document.createElement("script");
scriptElement.type="text/javascript";
scriptElement.text=nodeText;
head.insertBefore(scriptElement,head.firstChild);
head.removeChild(scriptElement);
}
else
window.eval(nodeText);
}
}
}
TrPage.prototype._handlePprResponseLibrary=function(a81)
{
var a82=TrPage._getTextContent(a81);
this._loadScript(a82);
}
TrPage._getTextContent=function(a83)
{
if(_agent.isIE||_agent.isWindowsMobile6)
{
var a84=a83.innerText;
if(a84==undefined)
a84=a83.text;
return a84;
}
if(_agent.isSafari||_agent.isBlackBerry)
{
var a85="";
var a86=a83.firstChild;
while(a86)
{
var a87=a86.nodeType;
if((a87==3)||(a87==4))
a85=a85+a86.data;
a86=a86.nextSibling;
}
return a85;
}
return a83.textContent;
}
TrPage._collectLoadedLibraries=function()
{
if(!_agent.supportsDomDocument)
{
return null;
}
else
{
var a88=new Object();
var a89=window.document;
var a90=a89.getElementsByTagName("script");
if(a90!=null)
{
for(var a91=0;a91<a90.length;a91++)
{
var a92=a90[a91].getAttribute("src");
if(a92)
{
a88[a92]=true;
}
}
}
return a88;
}
}
TrPage.prototype.addDomReplaceListener=function(a93,a94)
{
var a95=this._domReplaceListeners;
if(!a95)
{
a95=new Array();
this._domReplaceListeners=a95;
}
a95.push(a93);
a95.push(a94);
}
TrPage.prototype.removeDomReplaceListener=function(a96,a97)
{
var a98=this._domReplaceListeners;
var a99=a98.length;
for(var a100=0;a100<a99;a100++)
{
var a101=a98[a100];
a100++;
if(a101==a96)
{
var a102=a98[a100];
if(a102===a97)
{
a98.splice(a100-1,2);
break;
}
}
}
if(a98.length==0)
{
this._domReplaceListeners=null;
}
}
TrPage.prototype.addStyleClassMap=function(a103)
{
if(!a103)
return;
if(!this._styleClassMap)
this._styleClassMap=new Object();
for(var a104 in a103)
this._styleClassMap[a104]=a103[a104];
}
TrPage.prototype.getStyleClass=function(a105)
{
if(a105&&this._styleClassMap)
{
var a106=this._styleClassMap[a105];
if(a106)
return a106;
}
return a105;
}
TrPage._autoSubmit=function(a107,a108,a109,a110,a111)
{
if(_agent.isIE)
{
if(a109["type"]=="hidden")
a109=window.event;
}
var a112=true;
if(_TrEventBasedValidation)
a112=_validateInput(a109,true);
if(a112)
{
if(!a111)
a111=new Object();
a111.event="autosub";
a111.source=a108;
_submitPartialChange(a107,a110,a111,a109);
}
}
TrPage.prototype._jsfAjaxCallback=function(a113)
{
if(a113.status=="complete")
{
this._ajaxOldDomElements=this._getDomToBeUpdated(a113.responseCode,a113.responseXML);
this._activeNode=_getActiveElement();
}
}
TrPage.prototype._notifyDomReplacementListeners=function(a114)
{
var a115=this._domReplaceListeners;
if(!a115||a115.length==0)
{
return;
}
for(var a116=0,isize=a114.length;a116<isize;++a116)
{
var a117=a114[a116].element;
var a118=a114[a116].id;
var a119=a118==null?document.body:document.getElementById(a118);
for(var a120=0,jsize=a115.length;a120<jsize;++a120)
{
var a121=a115[a120];
var a122=a115[++a120];
if(a122!=null)
{
a121.call(a122,a117,a119);
}
else
{
a121(a117,a119);
}
}
}
}
TrPage.prototype._getDomToBeUpdated=function(a123,a124)
{
if(a123<200||a123>=300)
{
return null;
}
var a125=a124.getElementsByTagName("partial-response");
var a126=a125.length?a125[0].firstChild:null;
if(!a126||a126.nodeName!=="changes")
{
return null;
}
var a127=a126.childNodes;
var a128=[];
for(var a129=0,size=a127.length;a129<size;++a129)
{
var a130=a127[a129];
if(a130.nodeName!=="update")
{
continue;
}
var a131=a130.getAttribute("id");
if(a131==TrPage._VIEW_STATE_ID)
{
continue;
}
if(a131=="javax.faces.ViewRoot"||a131=="javax.faces.ViewBody")
{
a128.push(
{
"id":null,"element":document.body
});
}
else
{
a128.push(
{
"id":a131,"element":document.getElementById(a131)
});
}
}
return a128;
}
