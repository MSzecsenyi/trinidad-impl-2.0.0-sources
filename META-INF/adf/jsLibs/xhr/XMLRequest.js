function TrXMLRequest()
{
this.isSynchronous=false;
this.callback=null;
this._state=TrXMLRequest.UNINITIALIZED;
this.headers=new Object();
this.xmlhttp=TrXMLRequest._createXmlHttpRequest();
}
TrXMLRequest.UNINITIALIZED=0;
TrXMLRequest.LOADING=1;
TrXMLRequest.LOADED=2;
TrXMLRequest.INTERACTIVE=3;
TrXMLRequest.COMPLETED=4;
TrXMLRequest.prototype.setSynchronous=
function(a0)
{
this.isSynchronous=a0;
};
TrXMLRequest.prototype.setCallback=
function(a1)
{
this.callback=a1;
};
TrXMLRequest.prototype.getCompletionState=
function()
{
return this._state;
};
TrXMLRequest.prototype.getStatus=
function()
{
return this.xmlhttp.status;
}
TrXMLRequest.prototype.getResponseXML=
function()
{
return this.xmlhttp.responseXML;
}
TrXMLRequest.prototype.getResponseText=
function()
{
return this.xmlhttp.responseText;
}
TrXMLRequest.prototype.send=
function(a2,a3)
{
var a4=this.xmlhttp;
if(!this.isSynchronous)
{
var a5=new Function("arguments.callee.obj.__onReadyStateChange();");
a5.obj=this;
a4.onreadystatechange=a5;
}
var a6=a3?"POST":"GET";
a4.open(a6,a2,!this.isSynchronous);
for(var a7 in this.headers)
a4.setRequestHeader(a7,this.headers[a7]);
a4.setRequestHeader("Tr-XHR-Message","true");
a4.send(a3);
if(this.isSynchronous)
{
this._state=a4.readyState;
}
}
TrXMLRequest.prototype.getResponseHeader=
function(a8)
{
return this.xmlhttp.getResponseHeader(a8);
}
TrXMLRequest.prototype.getAllResponseHeaders=
function()
{
return this.xmlhttp.getAllResponseHeaders();
}
TrXMLRequest.prototype.setRequestHeader=
function(a9,a10)
{
this.headers[a9]=a10;
}
TrXMLRequest._createXmlHttpRequest=function()
{
var a11;
if(window.XMLHttpRequest)
{
a11=new XMLHttpRequest();
}
else if(window.ActiveXObject)
{
try
{
a11=new ActiveXObject("Msxml2.XMLHTTP");
}
catch(e)
{
try
{
a11=new ActiveXObject("Microsoft.XMLHTTP");
}
catch(e)
{
}
}
}
return a11;
}
TrXMLRequest.prototype.__onReadyStateChange=
function()
{
this._state=this.xmlhttp.readyState;
if(this.callback)
this.callback(this);
}
TrXMLRequest.prototype.cleanup=function()
{
this.callback=null
delete this.xmlhttp;
}
function TrXMLJsfAjaxRequest(
a0,
a1,
a2)
{
this.isSynchronous=false;
this.callback=null;
this._event=a0;
this._params=a1||new Object();
this._status=0;
this._state=TrXMLRequest.UNINITIALIZED;
this._formId=a2;
}
TrXMLJsfAjaxRequest.prototype.setCallback=function(a3)
{
this.callback=a3;
}
TrXMLJsfAjaxRequest.prototype.getCompletionState=function()
{
return this._state;
}
TrXMLJsfAjaxRequest.prototype.getStatus=function()
{
return this._status;
}
TrXMLJsfAjaxRequest.prototype.getResponseXML=function()
{
return this._responseXML;
}
TrXMLJsfAjaxRequest.prototype.getResponseText=function()
{
return this._responseText;
}
TrXMLJsfAjaxRequest.prototype.cleanup=function()
{
if(this._formElements!=null)
{
for(var a4 in this._formElements)
{
var a5=this._origFormValues[a4];
this._formElements[a4].value=a5;
}
}
delete this._origFormValues;
delete this._formElements;
this.callback=null;
}
TrXMLJsfAjaxRequest.prototype._ajaxCallback=function(
a6
)
{
switch(a6.status)
{
case"begin":
this._state=TrXMLRequest.LOADING;
break;
case"complete":
this._state=TrXMLRequest.LOADED;
break;
case"success":
default:
this._state=TrXMLRequest.COMPLETED;
break;
}
if(a6.status!="begin")
{
this._status=a6.responseCode;
this._responseXML=a6.responseXML;
this._responseText=a6.responseText;
}
if(this.callback)
{
this.callback(this);
}
}
TrXMLJsfAjaxRequest.prototype.__onerror=function(
a7
)
{
this._state=TrXMLRequest.COMPLETED;
this._status=a7.responseCode;
this._responseXML=a7.responseXML;
this._responseText=a7.responseText;
if(this.callback)
{
this.callback(this);
}
}
TrXMLJsfAjaxRequest.prototype.send=function()
{
var a8=this._params.source?
_getElementById(window.document,this._params.source):null;
var a9=TrUIUtils.createCallback(this,this._ajaxCallback);
var a10={
"onevent":a9,
"onerror":a9,
"Tr-PPR-Message":true
};
for(var a11 in this._params)
{
a10[a11]=this._params[a11];
}
this._origFormValues={};
this._formElements={};
if(this._formId!=null)
{
var a12=document.getElementById(this._formId);
if(a12!=null)
{
var a13=a12.elements;
for(var a14=0;a14<a13.length;++a14)
{
var a15=a13[a14];
if(a15.name&&!a15.disabled&&!(a15.tagName=="INPUT"&&a15.type=="submit"))
{
for(a11 in a10)
{
if(a11==a15.name)
{
var a16=a10[a11];
delete a10[a11];
this._origFormValues[a11]=a15.value;
this._formElements[a11]=a15;
a15.value=a16;
break;
}
}
}
}
}
}
jsf.ajax.request(
a8,
this._event,
a10);
delete this._event;
}
TrXMLJsfAjaxRequest.prototype.setSynchronous=
TrXMLJsfAjaxRequest.prototype.setRequestHeader=function(){}
TrXMLJsfAjaxRequest.prototype.getAllResponseHeaders=function()
{
return new Object();
};
TrXMLJsfAjaxRequest.prototype.getResponseHeader=function()
{
return null;
};
