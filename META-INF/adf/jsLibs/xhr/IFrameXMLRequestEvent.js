function TrIFrameXMLRequestEvent(
a0,
a1,
a2)
{
this._iframeDoc=a0;
this._source=a1;
this._formId=a2;
}
TrIFrameXMLRequestEvent.prototype.getSource=function()
{
return this._source;
}
TrIFrameXMLRequestEvent.prototype.getFormId=function()
{
return this._formId;
}
TrIFrameXMLRequestEvent.prototype.getStatus=function()
{
return TrXMLRequestEvent.STATUS_COMPLETE;
}
TrIFrameXMLRequestEvent.prototype.getResponseXML=function()
{
var a3=_agent.isIE;
var a4=this._iframeDoc;
if(a3&&a4.XMLDocument)
return a4.XMLDocument;
else
return a4;
}
TrIFrameXMLRequestEvent.prototype.getResponseText=function()
{
var a5=_agent.isIE;
var a6=this._iframeDoc,xmlDocument=null;
if(a5&&a6.XMLDocument)
xmlDocument=a6.XMLDocument;
else if(window.XMLDocument&&this._isResponseValidXML())
xmlDocument=a6;
if(xmlDocument)
{
if(typeof XMLSerializer!="undefined")
{
return(new XMLSerializer()).serializeToString(xmlDocument);
}
else if(a5)
{
return xmlDocument.xml;
}
else
{
return null;
}
}
else
return a6.documentElement.innerHTML;
}
TrIFrameXMLRequestEvent.prototype._isResponseValidXML=function()
{
var a7=_agent.isIE;
var a8=this._iframeDoc;
if(a7&&a8.XMLDocument)
return true;
else if(window.XMLDocument&&(a8 instanceof XMLDocument))
return true;
else if(_agent.isSafari&&a8.xmlVersion!=null)
return true;
else
return false;
}
TrIFrameXMLRequestEvent.prototype.getResponseStatusCode=function()
{
return 200;
}
TrIFrameXMLRequestEvent.prototype.isPprResponse=function()
{
var a9=_agent.isIE;
var a10=this._iframeDoc;
var a11=false;
if(a9&&a10.XMLDocument)
{
var a12=a10.XMLDocument,childNodes=a12.childNodes;
if(childNodes.length>=2&&childNodes[1].nodeName=="partial-response")
a11=true;
}
else
{
if(a10.firstChild&&a10.firstChild.nodeName=="partial-response")
a11=true;
}
return a11;
}
TrIFrameXMLRequestEvent.prototype.getResponseContentType=function()
{
if(this._isResponseValidXML())
return"text/xml";
return"text/html";
}
TrIFrameXMLRequestEvent.prototype.isJsfAjaxRequest=function()
{
return false;
};
