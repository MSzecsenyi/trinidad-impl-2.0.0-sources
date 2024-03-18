function TrXMLRequestEvent(
a0,
a1,
a2,
a3
)
{
this._status=a0;
this._request=a1;
this._source=a2;
this._formId=a3;
}
TrXMLRequestEvent.STATUS_QUEUED=1;
TrXMLRequestEvent.STATUS_SEND_BEFORE=2;
TrXMLRequestEvent.STATUS_SEND_AFTER=3;
TrXMLRequestEvent.STATUS_COMPLETE=4;
TrXMLRequestEvent.prototype.getFormId=function()
{
return this._formId;
}
TrXMLRequestEvent.prototype.getStatus=function()
{
return this._status;
}
TrXMLRequestEvent.prototype.getSource=function()
{
return this._source;
}
TrXMLRequestEvent.prototype.getResponseXML=function()
{
return this._request.getResponseXML();
}
TrXMLRequestEvent.prototype._isResponseValidXML=function()
{
var a4=this._request.getResponseXML();
if(!a4)
return false;
var a5=a4.documentElement;
if(!a5)
return false;
var a6=a5.nodeName;
if(!a6)
a6=a5.tagName;
if(a6=="parsererror")
return false;
return true;
}
TrXMLRequestEvent.prototype.getResponseText=function()
{
return this._request.getResponseText();
}
TrXMLRequestEvent.prototype.getResponseStatusCode=function()
{
return this._request.getStatus();
}
TrXMLRequestEvent.prototype._getAllResponseHeaders=function()
{
return this._request.getAllResponseHeaders();
}
TrXMLRequestEvent.prototype.getResponseHeader=function(
a7
)
{
var a8=this._request.getAllResponseHeaders();
return(a8.indexOf(a7)!=-1)?
this._request.getResponseHeader(a7)
:null;
}
TrXMLRequestEvent.prototype.isPprResponse=function()
{
var a9=true;
if(a9&&(!this._isResponseValidXML()))
{
TrRequestQueue._logError("Invalid PPR response."+
" The response-headers were:\n"+
this._getAllResponseHeaders()+
"\n The invalid response was:\n"+
this.getResponseText());
}
return a9;
}
TrXMLRequestEvent.prototype.getResponseContentType=function()
{
this.getResponseHeader("Content-Type");
}
TrXMLRequestEvent.prototype.isJsfAjaxRequest=function()
{
return(this._request instanceof TrXMLJsfAjaxRequest);
};
