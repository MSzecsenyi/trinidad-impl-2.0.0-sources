var _pprBackRestoreInlineScripts=false;
var _pprBlocking=false;
var _blockOnEverySubmit=false;
var _pprFirstClickPass=false;
var _pprdivElementName='tr_pprBlockingDiv';
var _pprLibStore;
var _pprBlockStartTime=0;
var _pprBlockingTimeout=null;
var _pprEventElement=null;
var _pprSavedCursorFlag=false;
var _pprChoiceChanged=false;
var _agent=new Object();
var _lastDateSubmitted;
var _lastDateReset=0;
var _lastDateValidated=0;
var _lastValidationFailure=0;
var _delayedEventParams=new Object();
var _initialFocusID=null;
var _TrFocusRequestDoc=null;
var _TrFocusRequestID=null;
var _TrFocusRequestNext=false;
var _TrEventBasedValidation=false;
var _blockCheckUnloadFromDialog=false;
var _saveForm=null;
var _saveDoValidate=null;
var _saveParameters=null;
var _submitRejected=false;
var _inPartialSubmit=false;
var _pendingRadioButton=false;
var _IE_MOUSE_CAPTURE_EVENTS=[
"onclick",
"ondblclick",
"onmousedown",
"onmousemove",
"onmouseout",
"onmouseover",
"onmouseup"
];
var _GECKO_MOUSE_CAPTURE_EVENTS=[
"click",
"mousedown",
"mouseup",
"mouseover",
"mousemove",
"mouseout",
"contextmenu"
];
function _atLeast(
a0,
a1
)
{
return(!a0||(a0==_agent.kind))&&
(!a1||(a1<=_agent.version));
}
function _atMost(
a0,
a1
)
{
return(a0==_agent.kind)&&(a1>=_agent.version);
}
function _supportsDOM()
{
var a0=false;
if(_agent.isIE)
{
a0=_agent.version>=5.5;
}
else if(_agent.isNav)
{
a0=false;
}
else if(_agent.isGecko||_agent.isSafari||_agent.isOpera)
{
a0=true;
}
else if(_agent.isBlackBerry)
{
a0=false;
a0=_agent.version>=4.6;
}
return a0;
}
function _agentInit()
{
var a0=navigator.userAgent.toLowerCase();
var a1=parseFloat(navigator.appVersion);
var a2=false;
var a3=false;
var a4=false;
var a5=false;
var a6=false;
var a7=false;
var a8=false;
var a9=false;
var a10=false;
var a11=false;
var a12=false;
var a13=false;
var a14="unknown";
var a15=false;
var a16=false;
var a17=true;
var a18=true;
var a19=true;
var a20=true;
if(a0.indexOf("msie")!=-1)
{
var a21=a0.match(/msie (.*);/);
a1=parseFloat(a21[1]);
a15=true;
if(a0.indexOf("windows ce")!=-1)
{
a19=false;
a18=false;
a20=false;
if(a0.indexOf("ppc")!=-1&&
a1>=4.0)
{
a8=true;
a16=true;
a14="pie";
}
else
{
a12=true;
a14="iemobile";
a17=false;
}
}
else
{
a4=true;
a14="ie";
}
}
else if(a0.indexOf("opera")!=-1)
{
a7=true;
a14="opera";
}
else if((a0.indexOf("applewebkit")!=-1)||
(a0.indexOf("safari")!=-1))
{
a9=true
a14="safari";
}
else if(a0.indexOf("gecko/")!=-1)
{
a3=true;
a14="gecko";
a1=1.0;
}
else if(a0.indexOf("blackberry")!=-1)
{
a2=true;
a14="blackberry";
a17=false;
}
else if((a0.indexOf('mozilla')!=-1)&&
(a0.indexOf('spoofer')==-1)&&
(a0.indexOf('compatible')==-1))
{
if(a1>=5.0)
{
a3=true;
a14="gecko";
a1=1.0;
}
else
{
a6=true;
a14="nn";
}
}
if(a0.indexOf('win')!=-1)
{
a11=true;
}
else if(a0.indexOf('mac')!=-1)
{
a5=true;
}
else if(a0.indexOf('sunos')!=-1)
{
a10=true;
}
else if((a0.indexOf('symbian')!=-1)||
(a0.indexOf('nokia')!=-1))
{
a13=true;
a16=true;
}
_agent.isBlackBerry=a2;
_agent.isGecko=a3;
_agent.isIE=a4;
_agent.isIEGroup=a15;
_agent.isMac=a5;
_agent.isNav=a6;
_agent.isNokiaPhone=a13;
_agent.isOpera=a7;
_agent.isPIE=a8;
_agent.isSafari=a9;
_agent.isSolaris=a10;
_agent.isWindows=a11;
_agent.isWindowsMobile6=a12;
_agent.kind=a14;
_agent.pprUnsupported=a16;
_agent.useJsfAjax=a17;
_agent.supportsDomDocument=a18;
_agent.supportsNodeType=a19;
_agent.supportsValidation=a20;
_agent.version=a1;
_agent.atLeast=_atLeast;
_agent.atMost=_atMost;
}
_agentInit();
var _ieFeatures=
{
channelmode:1,
copyhistory:1,
directories:1,
fullscreen:1,
height:1,
location:1,
menubar:1,
resizable:1,
scrollbars:1,
status:1,
titlebar:1,
toolbar:1,
width:1
};
var _nnFeatures=
{
alwayslowered:1,
alwaysraised:1,
copyhistory:1,
dependent:1,
directories:1,
height:1,
hotkeys:1,
innerheight:1,
innerwidth:1,
location:1,
menubar:1,
outerwidth:1,
outerheight:1,
resizable:1,
scrollbars:1,
status:1,
titlebar:1,
toolbar:1,
width:1,
"z-lock":1
}
var _modelessFeatureOverrides=
{
};
var _modalFeatureOverrides=
{
};
var _featureDefaults=
{
document:
{
channelmode:false,
copyhistory:true,
dependent:false,
directories:true,
fullscreen:false,
hotkeys:false,
location:true,
menubar:true,
resizable:true,
scrollbars:true,
status:true,
toolbar:true
},
dialog:
{
channelmode:false,
copyhistory:false,
dependent:true,
directories:false,
fullscreen:false,
hotkeys:true,
location:false,
menubar:false,
resizable:true,
scrollbars:true,
status:true
}
}
var _signedFeatures=
{
alwayslowered:1,
alwaysraised:1,
titlebar:1,
"z-lock":1
};
var _booleanFeatures=
{
alwayslowered:1,
alwaysraised:1,
channelmode:1,
copyhistory:1,
dependent:1,
directories:1,
fullscreen:1,
hotkeys:1,
location:1,
menubar:1,
resizable:1,
scrollbars:1,
status:1,
titlebar:1,
toolbar:1,
"z-lock":1
};
function _addEvent(a0,a1,a2)
{
if(a0.addEventListener)
{
a0.addEventListener(a1,a2,false);
return true;
}
else if(a0.attachEvent)
{
var a3=a0.attachEvent("on"+a1,a2);
return a3;
}
else
{
return false;
}
}
function _removeEvent(a0,a1,a2)
{
if(a0.removeEventListener)
{
a0.removeEventListener(a1,a2,false);
return true;
}
else if(a0.detachEvent)
{
var a3=a0.detachEvent("on"+a1,a2);
return a3;
}
else
{
return false;
}
}
function _getBodyWidth(
a0,
a1,
a2
)
{
var a3=_getContentWidth(a0,a1,0);
var a4=10;
if(_isLTR()||(a2<=5))
{
a4=2*a2;
}
return a3+a4;
}
function _getContentWidth(
a0,
a1,
a2
)
{
var a3=a0.childNodes;
var a4=_agent.isIE;
var a5=(a4)
?"canHaveHTML"
:"tagName";
var a6=0;
for(var a7=0;a7<a3.length;a7++)
{
var a8=a3[a7];
if(a8[a5]&&(a8.offsetWidth>0))
{
var a9=0;
var a10=a8["offsetWidth"];
if(!a4)
{
if((a10==a1)||
(a10<=1))
{
var a11=a8.offsetLeft;
if(a8.parentNode!=a8.offsetParent)
{
a11=a11-
(a8.parentNode.offsetLeft);
}
a9=_getContentWidth(a8,
a10,
a11);
}
else
{
a9=a10;
}
}
else
{
a9=a8["clientWidth"];
if(a9==0)
{
var a11=a8.offsetLeft;
if(a8.parentElement!=a8.offsetParent)
{
a11=a11-
(a8.parentElement.offsetLeft);
}
a9=_getContentWidth(a8,
a10,
a11);
}
}
if(a9>a6)
{
a6=a9;
}
}
}
if(a6==0)
a6=a1;
return a6+a2;
}
function _getParentWindow(a0)
{
var a1=a0.parent;
try
{
a1.name;
return a1;
}
catch(e)
{
return undefined;
}
}
function _getTop(a0)
{
var a1=_getParentWindow(a0);
while(a1&&(a1!=a0))
{
a0=a1;
a1=_getParentWindow(a0);
}
return a0;
}
function t(a0,a1)
{
if(_tURL)
{
document.write('<img src="'+_tURL+'"');
if(a0)
document.write(' width="'+a0+'"');
if(a1)
document.write(' height="'+a1+'"');
if(_axm)
document.write(' alt=""');
document.write('>');
}
}
function _getDependents(
a0,
a1
)
{
var a2;
if(a0)
{
a2=a0["_dependents"];
if(!a2)
{
if(a1)
{
a2=new Object();
a0["_dependents"]=a2;
}
}
}
return a2;
}
function _getDependent(
a0,
a1
)
{
var a2=_getDependents(a0);
var a3;
if(a2)
{
a3=a2[a1];
}
return a3;
}
function _setDependent(
a0,
a1,
a2
)
{
var a3=_getDependents(a0,true);
if(a3)
{
a3[a1]=a2;
}
}
function _getModalDependent(
a0
)
{
return _getDependent(a0,"modalWindow");
}
function _isModalDependent(
a0,
a1
)
{
return(a1==_getModalDependent(a0));
}
function _unloadADFDialog(
a0
)
{
_blockCheckUnloadFromDialog=false;
_checkUnload(a0);
_blockCheckUnloadFromDialog=true;
}
function _checkUnload(
a0
)
{
a0=_getEventObj();
if(_blockCheckUnloadFromDialog)
{
_blockCheckUnloadFromDialog=false;
return;
}
if(_isModalAbandoned())
return;
var a1=_getModalDependent(window);
if(a1!=null)
{
_setModalAbandoned(a1);
a1.close();
}
var a2=_getTop(self);
if(!a2)
return;
var a3=a2["opener"];
if(!a3)
return;
var a4=_getDependent(a3,self.name);
if(_isModalDependent(a3,self))
{
_setDependent(a3,"modalWindow",(void 0));
a3.onfocus=null;
if(_agent.supportsDomDocument)
{
var a5=a3.document.body;
if(_agent.atLeast("ie",4))
{
if(_agent.atLeast("ie",5)&&_agent.isWindows)
{
a5.onlosecapture=null;
_removeModalCaptureIE(a5);
}
a5.style.filter=null;
}
if(_agent.isGecko)
{
if(a5!=(void 0))
{
_removeModalCaptureGecko(a3,a5);
}
}
}
}
if(a4!=(void 0))
{
_setDependent(a3,self.name,(void 0));
if(a0==(void 0))
a0=self.event;
a4(a2,a0);
}
}
function _addModalCaptureIE(a0)
{
var a1=new Object();
var a2=_IE_MOUSE_CAPTURE_EVENTS;
var a3=a2.length;
for(var a4=0;a4<a3;a4++)
{
var a5=a2[a4];
a1[a5]=a0[a5];
a0[a5]=_captureEventIE;
}
window._modalSavedListeners=a1;
window._trIeCapture=a0;
window._trIeCaptureCurrent=true;
a0.setCapture();
}
function _removeModalCaptureIE(a0)
{
a0.releaseCapture();
var a1=window._modalSavedListeners;
if(a1)
{
var a2=_IE_MOUSE_CAPTURE_EVENTS;
var a3=a2.length;
for(var a4=0;a4<a3;a4++)
{
var a5=a2[a4];
a0[a5]=a1[a5];
}
window._modalSavedListeners=null;
}
window._trIeCapture=undefined;
}
function _captureEventIE()
{
var a0=window.event;
if(a0.screenY>=window.screenTop&&a0.screenX>=window.screenLeft)
{
if(!window._trIeCaptureCurrent&&window._trIeCapture)
{
window._trIeCaptureCurrent=true;
window._trIeCapture.setCapture();
}
a0.cancelBubble=true;
}
else if(window._trIeCapture)
{
window._trIeCaptureCurrent=false;
window._trIeCapture.releaseCapture();
}
}
function _addModalCaptureGecko(a0)
{
var a1=_GECKO_MOUSE_CAPTURE_EVENTS;
var a2=a1.length;
for(var a3=0;a3<a2;a3++)
{
var a4=a1[a3];
a0.addEventListener(a4,_captureEventGecko,true);
}
}
function _removeModalCaptureGecko(a0,a1)
{
var a2=_GECKO_MOUSE_CAPTURE_EVENTS;
var a3=a2.length;
for(var a4=0;a4<a3;a4++)
{
var a5=a2[a4];
a1.removeEventListener(a5,
a0._captureEventGecko,
true);
}
}
function _captureEventGecko(
a0
)
{
a0.stopPropagation();
window.preventDefault=true;
}
function _isModalAbandoned()
{
var a0=_getTop(self);
return a0._abandoned;
}
function _setModalAbandoned(
a0
)
{
a0._abandoned=true;
}
function _getKeyValueString(
a0,
a1,
a2
)
{
var a3=a0[a1];
if(typeof(a3)=="function")
{
a3="[function]";
}
var a4=(_agent.isGecko)
?((a2+1)%3==0)
?'\n'
:'    '
:'\t';
return a1+':'+a3+a4;
}
function _dumpSuppress(
a0
)
{
_dump(a0,{innerText:1,outerText:1,outerHTML:1,innerHTML:1});
}
function _dump(
a0,
a1,
a2
)
{
var a3="";
if(a0)
{
if(!a2)
{
a2=a0["name"];
}
var a4="return _getKeyValueString(target, key, index);";
if(_agent.atLeast("ie",5)||_agent.isGecko||_agent.isSafari)
a4="try{"+a4+"}catch(e){return '';}";
var a5=new Function("target","key","index",a4);
var a6=0;
var a7=new Array();
for(var a8 in a0)
{
if((!a1||!a1[a8])&&!a8.match(/DOM/))
{
a7[a6]=a8;
a6++;
}
}
a7.sort();
for(var a9=0;a9<a7.length;a9++)
{
a3+=a5(a0,a7[a9],a9);
}
}
else
{
a2="(Undefined)";
}
if(a3=="")
{
a3="No properties";
}
alert(a2+":\n"+a3);
}
function _getJavascriptId(a0)
{
return a0.split(':').join('_');
}
function _getFormName(a0)
{
var a1=a0.name;
if((typeof a1)!='string')
{
if(_agent.isIE)
{
a1=a0.attributes['name'].nodeValue;
}
else
{
a1=a0.getAttribute('name');
}
}
return a1;
}
function _validateForm(
a0,
a1
)
{
if(!_agent.supportsValidation)
{
return true;
}
var a2='_'+_getJavascriptId(_getFormName(a0))+'Validator';
var a3=window[a2];
if(a3)
{
try
{
ret=a3(a0,a1);
}
catch(e)
{
if(_agent.isPIE||_agent.isNokiaPhone||_agent.isBlackBerry)
{
ret=true;
}
else
{
ret=false;
}
}
return ret;
}
return false;
}
function _valField(
formName,
nameInForm
)
{
if(nameInForm)
{
var target=document.forms[formName][nameInForm];
var blurFunc=target.onblur;
if(blurFunc)
{
var valFunc=blurFunc.toString();
var valContents=valFunc.substring(valFunc.indexOf("{")+1,
valFunc.lastIndexOf("}"));
var targetString="document.forms['"+
formName+
"']['"+
nameInForm+
"']";
valContents=valContents.replace(/this/,targetString);
var lastArg=valContents.lastIndexOf(",");
valContents=valContents.substring(0,lastArg)+")";
eval(valContents);
}
}
}
function _validateAlert(
a0,
a1,
a2,
a3,
a4
)
{
if(!a2)
a2=_getValidators(a0);
var a5=_multiValidate(a0,a1,a2);
var a6=true;
var a7=a4+'\n';
for(var a8 in a2)
{
var a9=a5[a8];
if(!a9||a9.length==0)
continue;
var a10=_getFormElement(a0,a8);
if(!a10)
continue;
var a11=a2[a8].label;
for(var a12=0;a12<a9.length;a12=a12+2)
{
if(a6)
{
_setFocus(a10);
a6=false;
}
var a13=a9[a12];
if(_agent.isNokiaPhone)
{
errorString=_getGlobalErrorString(a10,
a3,
a13,
a11);
}
else
{
errorString=_getGlobalErrorString(a10,
a3,
a13.getDetail(),
a11);
}
a7+=errorString+'\n';
}
}
if(a6)
return true;
_recordValidation(true,0);
alert(a7);
_recordValidation(true,0);
return false;
}
function _validateInline(
a0,
a1,
a2
)
{
if(!a2)
a2=_getValidators(a0);
var a3=_multiValidate(a0,a1,a2);
var a4=true;
for(var a5 in a2)
{
var a6=false;
var a7=_getElementById(document,a5+"::icon");
var a8=_getElementById(document,a5+"::msg");
if(a8&&a8.innerHTML!="")
a8.innerHTML="";
TrMessageBox.removeMessages(a5);
var a9=a3[a5];
if(!a9||a9.length==0)
{
if(a8)
a8.style.display="none";
if(a7)
a7.style.display="none";
continue;
}
var a10=_getFormElement(a0,a5);
if(!a10)
continue;
var a11=a2[a5].label;
for(var a12=0;a12<a9.length;a12=a12+2)
{
if(a4)
{
a4=false;
_setFocus(a10);
}
var a13=a9[a12];
if(a8)
{
if(_agent.isNokiaPhone)
{
a8.innerHTML=a13;
}
else
{
a8.innerHTML=a13.getDetail();
}
}
if(!a8&&!TrMessageBox.isPresent())
{
if(_agent.isNokiaPhone)
{
alert("Field Error ["+a5+"] - "+a13);
}
else
{
alert("Field Error ["+a5+"] - "+a13.getDetail());
}
}
TrMessageBox.addMessage(a5,a11,a13);
}
if(a8)
a8.style.display="";
if(a7)
a7.style.display="";
}
return a4;
}
function _validateInput(a0,a1)
{
if(!a0)
return true;
var a2=a0.target||a0.srcElement;
if(!a2||!a2.id)
return true;
var a3=_getForm(a2);
if(!a3)
return true;
var a4=_getValidators(a3);
if(!a4)
return true;
var a5=a2.id;
var a6=a4[a5];
if(!a6&&a2.name)
{
a5=a2.name;
a6=a4[a5];
}
if(!a6)
return true;
var a7=new Object();
a7[a5]=a6;
var a8=_validateInline(a3,null,a7,1,null);
if(a1)
return a8;
}
function _recordValidation(a0,a1)
{
if(!a1)
a1=new Date();
_lastDateValidated=a1;
if(a0)
_lastValidationFailure=a1;
}
function _recentValidation(a0)
{
var a1=false;
var a2=250;
if(_agent.isMac)
{
a2=600;
}
var a3=new Date();
var a4;
a4=a3-_lastValidationFailure;
if((a4>=0)&&(a4<a2))
{
a1=true;
}
else if(!a0)
{
a4=a3-_lastDateValidated;
if((a4>=0)&&(a4<a2))
{
a1=true;
}
}
return a1;
}
function _commandChoice(
a0,
a1
)
{
var a2=document.forms[a0].elements[a1].value;
if(a2==void(0))
a2=(document.forms[a0].elements[a1])[0].value;
var a3=a2.indexOf("#");
if(a3==0)
window.document.location.href=a2.substring(1,a2.length);
else
{
var a4=a2.indexOf("[");
var a5=a2.substring(0,a4);
var a6=a2.substring(a4+1,a4+2)
var a7=parseInt(a6);
submitForm(a0,a7,{source:a5});
}
}
function submitForm(
a0,
a1,
a2,
a3,
a4
)
{
var a5=true;
if(_agent.isIEGroup)
{
a5=false;
for(var a6 in _delayedEventParams)
{
a5=true;
break;
}
}
if(a5)
{
_delayedEventParams=new Object();
_delayedEventParams["reset"]=true;
}
if((typeof a0)=="string")
{
a0=document[a0];
}
else if((typeof a0)=="number")
{
a0=document.forms[a0];
}
if(!a0)
return false;
var a7=window["_"+_getJavascriptId(_getFormName(a0))+"Validator"];
if(a7==(void 0))
{
_saveFormForLaterSubmit(a0,a1,a2);
return false;
}
var a8=new Date();
if(_recentSubmit(a8))
{
if(_pprFirstClickPass&&_pprBlocking)
{
_saveFormForLaterSubmit(a0,a1,a2);
}
return;
}
_submitRejected=false;
_inPartialSubmit=false;
_lastDateSubmitted=a8;
if(a1==(void 0))
a1=true;
var a9=true;
var a10;
if(a2!=null)
a10=a2.source;
else
a10="";
if(a1&&!_validateForm(a0,a10))
a9=false;
var a11=window["_"+_getJavascriptId(_getFormName(a0))+"_Submit"];
if(typeof a11!="undefined"&&a9)
{
var a12=new Function("doValidate",a11);
var a13;
if(_agent.isPIE)
{
a13=a12(a4);
}
else
{
a0._tempFunc=a12;
a13=a0._tempFunc(a1);
a0._tempFunc=(void 0);
}
if(a1&&(a13==false))
{
a9=false;
}
}
if(a9)
{
TrPage.getInstance()._resetHiddenValues(a0);
if(a3&&_supportsPPR())
{
if(_agent.isPIE||_agent.isWindowsMobile6)
{
var a14=new Array(1);
a14['UA-pixels']=a0.elements['uapixels'].value;
TrPage.getInstance().sendPartialFormPost(a0,a2,a14);
}
else
{
TrPage.getInstance().sendPartialFormPost(a0,a2,null,a4);
}
}
else
{
var a15=_supportsDOM();
var a16=new Object();
if(a2)
{
for(var a17 in a2)
{
var a18=a2[a17];
if(a18!=(void 0))
{
var a19=a0.elements[a17];
if(_agent.isPIE)
{
a19.value=a18;
}
else
{
var a20=false;
if(a19&&(typeof(a19)!="string"))
{
if(a19.type=='submit'||a19.type=='button')
{
var a21=document.createElement("input");
a21.type="hidden";
a21.name=a17;
a21.value=a2[a17];
a0.appendChild(a21);
a16[a17]=a21;
a20=true;
}
else
{
a19.value=a18;
}
}
else
{
if(a15)
{
if(!a20)
{
var a21=document.createElement("input");
a21.type="hidden";
a21.name=a17;
a21.value=a2[a17];
a0.appendChild(a21);
a16[a17]=a21;
}
}
}
}
}
}
}
if(_agent.isIE)
_autoCompleteForm(a0);
try
{
a0.submit();
}
catch(e)
{
if(TrPage.getInstance().getRequestQueue()._isMultipartForm(a0))
{
var a22=_createFacesMessage(
'org.apache.myfaces.trinidad.component.core.input.CoreInputFile.INPUT_FILE_ERROR');
if(!TrMessageBox.isPresent())
alert(a22.getDetail());
else
TrMessageBox.addMessage(null,null,a22);
}
else
{
throw e;
}
}
if(_blockOnEverySubmit)
_pprStartBlocking(window);
if(a15)
{
for(var a17 in a16)
a0.removeChild(a16[a17]);
}
}
}
return a9;
}
function _autoCompleteForm(a0)
{
var a1=window.external;
if(a1&&(typeof a1.AutoCompleteSaveForm!="undefined"))
{
try
{
a1.AutoCompleteSaveForm(a0);
}
catch(e)
{
}
}
}
function _submitOnEnter(a0,a1,a2,a3,a4)
{
if(window.event!=null)
a0=window.event;
var a5;
if(a0.srcElement==undefined)
a5=a0.target;
else
a5=a0.srcElement;
if(!a5)return true;
if(a5.tagName=='A')return true;
if((a5.tagName=='INPUT')&&
(a5.type!='submit')&&
(a5.type!='reset'))
{
if(_getKC(a0)==13)
{
if(a2!=null)
{
var a6=new Object();
a6[a2]=a2;
a6['source']=a2;
if(a4!=true)
{
submitForm(a1,a3,a6);
}
else
{
TrPage._autoSubmit(a1,a2,a0,a3,a6);
}
}
return false;
}
}
return true;
}
function _saveFormForLaterSubmit(a0,a1,a2)
{
_saveForm=a0;
_saveDoValidate=a1;
_saveParameters=a2;
_submitRejected=true;
}
function _submitFormCheck()
{
if(_submitRejected)
{
if(_inPartialSubmit)
{
_submitPartialChange(_saveForm,_saveDoValidate,_saveParameters);
_inPartialSubmit=false;
}
else
{
submitForm(_saveForm,_saveDoValidate,_saveParameters);
}
_saveForm=null;
_saveDoValidate=null;
_saveParameters=null;
}
}
function resetForm(
a0
)
{
var a1=false;
if((typeof a0)=="string")
{
a0=document[a0];
}
else if((typeof a0)=="number")
{
a0=document.forms[a0];
}
if(!a0)
return false;
var a1=TrPage.getInstance()._resetForm(a0);
if(a1)
{
window.document.location.reload();
}
else
{
a0.reset();
}
_lastDateReset=new Date();
return a1;
}
function createNameValueString(a0){
var a1="";
try
{
var a2=a0.elements;
for(var a3=0;a3<a2.length;a3++)
{
try
{
var a4=a2[a3];
if(a4.name)
{
if(a4.type=="text"
||a4.type=="password"
||a4.type=="textarea"
||a4.type=="hidden")
{
a1+=(a4.name+"="+escape(a4.value)+"&");
}
else if(a4.type.indexOf("select")!=-1)
{
var a5="";
for(var a6=0;a6<a4.options.length;a6++)
{
if(a4.options[a6].selected==true)
a5+=a4.name+"="
+escape(a4.options[a6].value)+"&";
}
if(!a5)
{
var a7=_getValue(a4);
if(a7)
{
a5+=a4.name+"="+escape(a7)+"&";
}
}
if(a5)
{
a1+=a5;
}
}
else if(a4.type=="checkbox"&&a4.checked)
a1+=(a4.name+"="+escape(a4.value)+"&");
else if(a4.type=="radio"&&a4.checked==true)
a1+=(a4.name+"="+escape(a4.value)+"&");
}
}
catch(e)
{
}
a4=null;
}
}
catch(e)
{
}
return(a1.substring(0,a1.length-1));
}
function _getValue(a0)
{
var a1=a0;
var a2=a0.type;
if(!a2&&a0.length)
{
for(var a3=0;a3<a0.length;a3++)
{
a2=a0[a3].type;
if(a2!=(void 0))
{
a1=a0[a3];
break;
}
}
}
if(a2=="checkbox")
{
if(a0.length)
{
for(var a3=0;a3<a0.length;a3++)
{
if(a0[a3].type=="checkbox"&&
a0[a3].checked)
{
return a0[a3].value;
}
}
}
else
{
return a0.checked;
}
}
else if(a2=="select-multiple")
{
var a4=new Array();
for(var a3=0;a3<a0.length;a3++)
{
if(a0.options[a3].selected)
{
a4[a4.length]=a0.options[a3].value;
}
}
return(a4.length>0)?a4:"";
}
else if(a2.substring(0,6)=="select")
{
a0=a1;
var a5=a0.selectedIndex;
if(a5!=(void 0)&&
a5!=null&&
a5>=0)
{
var a6=a0.options[a5];
var a7=a6.value;
if(!a7)
{
for(var a3=0;a3<a0.options.length;a3++)
{
if(a0.options[a3].value)
return a7;
}
return a6.text;
}
return a7;
}
return"";
}
else if(a2=="radio")
{
if(a0.length)
{
for(var a3=0;a3<a0.length;a3++)
{
if(a0[a3].type=="radio"&&
a0[a3].checked)
{
return a0[a3].value;
}
}
}
else
{
if(a0.checked)
{
return a0.value;
}
}
return"";
}
else
{
return a0.value;
}
}
function _setSelectIndexById(a0,a1)
{
var a2=_getElementById(document,a0);
if(a2!=null)
a2.selectedIndex=a1;
}
function _syncChoiceIndex(a0)
{
var a1=a0.form;
var a2=a0.name;
var a3=a1.elements[a2];
for(i=0;i<a3.length;i++)
{
a3[i].selectedIndex=a0.selectedIndex;
}
}
function _clearPassword(a0,a1)
{
if(window.event!=(void 0))
a1=window.event;
if(a0.value!="******")
return true;
if((a1.keyCode==8)||
((a1.keyCode>=46)&&(a1.keyCode<112)))
a0.value="";
return true;
}
function _setFocus(a0)
{
if(_isShowing(a0))
{
if(a0.focus)
a0.focus();
if((a0.type=="text")
&&(a0.value!=(void 0))
&&(a0.value!=null)
&&(a0.value.length>0))
{
if(true!=_delayedEventParams["reset"])
a0.select();
}
}
}
function _addValidators(a0,a1,a2,a3,a4)
{
var a5=document.forms[a0];
var a6=_getValidators(a5);
if(!a6)
a6=new Object();
for(var a7=0;a7<a1.length;a7+=5)
{
var a8=a1[a7];
var a9=new Object();
if(a1[a7+1])
{
var a10=a1[a7+2];
a9.required=true;
a9.requiredFormat=a4[a10];
}
var a11=a1[a7+3];
if(a11!=null)
{
a9.converter=a2[a11];
}
var a12=a1[a7+4];
if(a12)
{
for(j=0;j<a12.length;j++)
{
a12[j]=a2[a12[j]];
}
a9.validators=a12;
}
var a13=a3[a8];
if(a13)
a9.label=a13;
a6[a8]=a9;
if(_TrEventBasedValidation)
{
var a14=_getElementById(document,a8);
if(a14)
{
_addEvent(a14,"change",_validateInput);
}
}
}
window["_"+_getJavascriptId(_getFormName(a5))+"_Validators"]=a6;
}
function _multiValidate(
form,
source,
validators
)
{
var failureMap=new Object();
var subforms=window[_getFormName(form)+"_SF"];
var ignorePrefixes=new Array();
var foundUsedSubform=false;
var key;
if(source!=(void 0))
{
for(key in subforms)
{
if(source.indexOf(key+":")==0)
{
foundUsedSubform=true;
break;
}
}
for(key in subforms)
{
if(source.indexOf(key+":")!=0)
{
if((foundUsedSubform)||(subforms[key]==1))
ignorePrefixes.push(key+":");
}
}
}
if(validators&&!_recentValidation(true))
{
for(var id in validators)
{
if(_getElementById(document,id)==null)
{
continue;
}
var isIgnored=false;
for(var j=0;j<ignorePrefixes.length;j++)
{
if(id.indexOf(ignorePrefixes[j])==0)
{
isIgnored=true;
break;
}
}
if(isIgnored)
continue;
var currInput=_getFormElement(form,id);
if(!currInput)
continue;
var inputFailures=new Array();
var descriptor=validators[id];
var label=descriptor.label;
var elementType=currInput.type;
if(!elementType&&currInput.length)
{
var firstType=currInput[0].type;
if(firstType!="radio"&&firstType!="checkbox")
{
currInput=currInput[0];
}
}
var value=_getValue(currInput);
var required=descriptor.required;
if(required&&((value=="")||(value==null)))
{
var requiredErrorString=_getErrorString(currInput,label,
descriptor.requiredFormat);
inputFailures[inputFailures.length]=
new TrFacesMessage(requiredErrorString,requiredErrorString);
}
else
{
var converterConstructor=descriptor.converter;
var converterError=false;
if(converterConstructor)
{
if((value!=null)&&
!((typeof value=="string")&&(value=="")))
{
var converter=eval(converterConstructor);
try
{
value=converter.getAsObject(value,label);
}
catch(e)
{
converterError=true;
if(_agent.isPIE||_agent.isNokiaPhone||_agent.isBlackBerry)
{
inputFailures[inputFailures.length]=e.message;
}
else
{
inputFailures[inputFailures.length]=e.getFacesMessage();
}
}
}
}
if(converterError==false)
{
var validatorArray=descriptor.validators;
if(validatorArray)
{
for(var j=0;j<validatorArray.length;j=j+1)
{
if((value!==null)&&
!((typeof value=="string")&&value==""))
{
var validatorConstructor=validatorArray[j];
if(validatorConstructor&&value!==undefined)
{
var validator=eval(validatorConstructor);
try
{
validator.validate(value,label,converter);
}
catch(e)
{
if(_agent.isPIE||_agent.isNokiaPhone||_agent.isBlackBerry)
{
inputFailures[inputFailures.length]=e.message;
}
else
{
inputFailures[inputFailures.length]=e.getFacesMessage();
}
}
}
}
}
}
}
}
if(inputFailures.length>0)
{
failureMap[id]=inputFailures;
}
}
}
return failureMap;
}
function _createFacesMessage(
a0,
a1,
a2,
a3,
a4
)
{
var a5=TrMessageFactory.getSummaryString(a0);
var a6=TrMessageFactory.getDetailString(a0);
if(a6!=null)
{
a6=TrFastMessageFormatUtils.format(a6,a1,a2,a3,a4);
}
return new TrFacesMessage(a5,
a6,
TrFacesMessage.SEVERITY_ERROR);
}
function _createCustomFacesMessage(
a0,
a1,
a2,
a3,
a4,
a5
)
{
if(a1!=null)
{
a1=TrFastMessageFormatUtils.format(a1,a2,a3,a4,a5);
}
return new TrFacesMessage(a0,
a1,
TrFacesMessage.SEVERITY_ERROR);
}
function _getGlobalErrorString(
a0,
a1,
a2,
a3
)
{
var a4=_getForm(a0);
if(a1&&a3!=null)
{
return _formatErrorString(a1,
{
"0":a3,
"1":a2
});
}
return a2;
}
function _isShowing(
a0)
{
if(a0.type=='hidden')
return false;
if(_agent.isIEGroup)
{
var a1=a0;
while(a1!=(void 0))
{
computedStyle=a1.currentStyle;
if((computedStyle!=(void 0))&&
((computedStyle["visibility"]=="hidden")||
(computedStyle["display"]=="none")))
{
return false;
}
a1=a1.parentNode;
}
return true;
}
if(_agent.isGecko||_agent.isSafari||_agent.BlackBerry)
{
if(!a0.ownerDocument&&a0.length)
a0=a0[0];
var a2=a0.ownerDocument.defaultView.getComputedStyle(a0,
null);
return((a2["visibility"]!="hidden")&&
(a2["display"]!="none"));
}
return true;
}
function _getID(
a0
)
{
if(_agent.isPIE)
{
return a0.name;
}
var a1=a0.id;
var a2=a0.type;
if(!a2&&a0.length)
a2=a0[0].type;
if(a2=="radio")
{
var a3;
if(a0.length)
{
a3=a0[0].parentNode;
if(a3.tagName=='FIELDSET')
a3=a3.parentNode;
}
else
{
a3=a0.parentNode;
}
a1=a3.id;
}
return a1;
}
function _getForm(
a0
)
{
var a1=a0.form;
if(a1==(void 0))
{
if(a0.length)
{
a1=a0[0].form;
}
}
return a1;
}
function _getFormElement(
a0,
a1)
{
var a2=null;
if(_agent.isPIE)
{
a2=a0.elements[a1];
}
else
{
a2=a0[a1];
if(a2==undefined)
{
a2=a0.elements[a1+":trailing:items"];
}
}
return a2;
}
function _getName(
a0
)
{
var a1=a0.name;
if(a1==(void 0))
{
var a2=a0.type;
if(!a2&&a0.length)
a2=a0[0].type;
if(a2=="radio"&&a0.length)
{
a1=a0[0].name;
}
}
return a1;
}
function _instanceof(
a0,
a1
)
{
if(a1==(void 0))
return false;
if(a0==(void 0))
return false;
while(typeof(a0)=="object")
{
if(a0.constructor==a1)
return true;
a0=a0.prototype;
}
return false;
}
function _getErrorString(
a0,
a1,
a2,
a3
)
{
var a4;
var a5=_getForm(a0);
var a6=_getValue(a0);
if(_instanceof(a3,window["TrConverterException"]))
{
a4=a3.getFacesMessage().getDetail();
}
else if(_instanceof(a3,window["TrValidatorException"]))
{
a4=a3.getFacesMessage().getDetail();
}
else
{
a4=a2;
}
if(a4)
{
var a7=_formatErrorString(a4,
{
"0":a1,
"1":a6
});
return a7;
}
}
function _getValidators(
a0
)
{
return window["_"+_getJavascriptId(_getFormName(a0))+"_Validators"];
}
function _formatErrorString(
a0,
a1
)
{
var a2=a0;
for(var a3 in a1)
{
var a4=a1[a3];
if(!a4)
{
a4="";
}
if(typeof a4=="string")
{
a4=a4.replace("{","{'");
a4=a4.replace("}","'}");
}
var a5="{"+a3+"}";
a2=a2.replace(new RegExp('%'+a3+'%','g'),
a5);
var a6=a2.indexOf(a5);
if(a4.indexOf&&a4.indexOf(a5)>=0)
{
var a7='';
for(i=0;i<a4.length;i++)
{
a7=a7+'placeHolderString';
}
while(a6>=0)
{
a2=(a2.substring(0,a6)
+a7
+a2.substring(a6+a5.length));
a6=a2.indexOf(a5);
}
a6=a2.indexOf(a7);
while(a6>=0)
{
a2=(a2.substring(0,a6)
+a4
+a2.substring(a6+a7.length));
a6=a2.indexOf(a7);
}
}
else
while(a6>=0)
{
a2=(a2.substring(0,a6)
+a4
+a2.substring(a6+a5.length));
a6=a2.indexOf(a5);
}
}
while(a2.indexOf("{'")!=-1)
{
a2=a2.replace("{'","{");
a2=a2.replace("'}","}");
}
var a8=/''/g;
return a2.replace(a8,"'");
}
function _chain(
a0,
a1,
a2,
a3,
a4
)
{
return _chainMultiple([a0,a1],a2,a3,a4);
}
function _chainMultiple(
a0,
a1,
a2,
a3
)
{
var a4=true;
for(var a5=0,size=a0.length;a5<size;++a5)
{
var a6=_callChained(a0[a5],a1,a2);
if(a6===false)
{
if(a3)
{
return false;
}
a4=false;
}
}
return a4;
}
function _callChained(
a0,
a1,
a2
)
{
if(a0&&(a0.length>0))
{
if((typeof(a2)=='undefined')||(a2==(void 0)))
{
a2=window.event;
}
var a3=new Function("event",a0);
var a4;
if(_agent.isPIE)
{
a4=a3(a2);
}
else
{
a1._tempFunc=a3;
a4=a1._tempFunc(a2);
a1._tempFunc=(void 0);
}
return!(a4==false);
}
else
{
return true;
}
}
function _checkLength(a0,a1,a2)
{
elementLength=a0.value.length;
if(elementLength>a1)
{
a0.value=a0.value.substr(0,a1);
return true;
}
if(elementLength<a1)
return true;
if(_agent.isIE)
{
if(a2["type"]=="hidden")
a2=window.event;
}
if(a2.type=='change')
return true;
if(a2)
{
if((a2.which<32)
||((a2.which==118)&&(a2["ctrlKey"])))
return true;
}
return false;
}
function _getElementById(
a0,
a1
)
{
if(typeof(a0.getElementById)!='undefined')
{
if(((_agent.kind!="ie")||(_agent.version>=5))&&(!_agent.isBlackBerry))
{
var a2=a0.getElementById(a1);
if((a2==null)||(a2.id==a1))
return a2;
return _findElementById(a0,a1);
}
return a0.getElementById(a1);
}
else if(typeof(a0.all)=='undefined')
{
if(a0.forms.length==0)
return window[a1];
else
for(var a3=0;a3<a0.forms.length;a3++)
{
var a4=a0.forms[a3];
if(a4[a1])
return a4[a1];
}
return window[a1];
}
else
{
return a0.all[a1];
}
}
function _findElementById(
a0,
a1
)
{
if(a0.id==a1)
return a0;
if(a0.childNodes)
{
var a2=a0.childNodes;
for(var a3=0;a3<a2.length;a3++)
{
var a4=_findElementById(a2.item(a3),a1);
if(a4!=null)
return a4;
}
}
return null;
}
function _getQuerySeparator(a0)
{
var a1=a0.charAt(a0.length-1);
if((a1=='&')||(a1=='?'))
return"";
return(a0.indexOf('?')>=0)?'&':'?';
}
function _addParameter(
a0,
a1,
a2
)
{
var a3=a0.indexOf('?');
if(a3==-1)
{
return a0+'?'+a1+'='+a2;
}
else
{
var a4=a0.indexOf('?'+a1+'=',a3);
if(a4==-1)
a4=a0.indexOf('&'+a1+'=',a3+1);
if(a4==-1)
{
return a0+'&'+a1+'='+a2;
}
else
{
var a5=a4+a1.length+2;
var a6=a0.substring(0,a5);
a6+=a2;
var a7=a0.indexOf('&',a5);
if(a7!=-1)
{
a6+=a0.substring(a7);
}
return a6;
}
}
}
function _addFormParameter(
a0,
a1,
a2
)
{
var a3=new Object();
if(a0)
{
for(var a4 in a0)
a3[a4]=a0[a4];
}
a3[a1]=a2;
return a3;
}
function _pprInstallBlockingHandlers(a0,a1)
{
var a2=a0.document;
if(a2==(void 0))
return;
if(!a2.attachEvent&&!a2.addEventListener)
{
return;
}
if(a2.attachEvent)
{
var a3=a0._pprConsumeFirstClick;
if(a1)
{
var a4=a0.event;
if(a4!=(void 0))
{
var a5=document.elementFromPoint(a4.x,a4.y);
if(!a0._pprFirstClickPass
||(((a4.type=='change')||(a4.type=='blur'))
&&(a4.srcElement==a5))
||(!_isSubmittingElement(a5)))
{
_pprControlCapture(a0,true);
return;
}
}
a2.attachEvent('onclick',a3);
}
else
{
a2.detachEvent('onclick',a3);
_pprControlCapture(a0,false);
}
}
else
{
var a3=a0._pprConsumeBlockedEvent;
var a6={'click':1,'keyup':1,'keydown':1,'keypress':1};
for(var a7 in a6)
{
if(a1)
a2.addEventListener(a7,a3,true);
else
a2.removeEventListener(a7,a3,true);
}
}
}
function _pprConsumeClick(a0)
{
if(_agent.isIE)
{
var a1=document.body;
if((a0.x<a1.offsetLeft)||(a0.y<a1.offsetTop)
||(a0.x>a1.offsetWidth)||(a0.y>a1.offsetHeight))
{
_pprStopBlocking(window);
}
}
return false;
}
function _pprStartBlocking(a0)
{
if(_agent.isPIE||_agent.isNokiaPhone||_agent.isBlackBerry)
return;
if(_agent.isIE)
{
a0._pprTimeoutFunc=a0.setTimeout("_doPprStartBlocking(window);",
1);
return;
}
else
{
_doPprStartBlocking(a0);
}
}
function _doPprStartBlocking(a0)
{
if(a0._pprTimeoutFunc)
{
a0.clearTimeout(a0._pprTimeoutFunc);
a0._pprTimeoutFunc=null;
}
if(!a0._pprBlocking)
{
var a1=a0.document.body;
a0._pprBlockStartTime=new Date();
if(_agent.isGecko)
{
if(a0._pprBlockingTimeout!=null)
{
a0.clearTimeout(a0._pprBlockingTimeout);
}
a0._pprBlockingTimeout=a0.setTimeout("_pprStopBlocking(window);",
8000);
}
else if(_agent.isIEGroup)
{
_pprEventElement=window.document.activeElement;
}
_pprInstallBlockingHandlers(a0,true);
a0._pprBlocking=true;
}
}
function _pprStopBlocking(a0)
{
if(a0._pprTimeoutFunc)
{
a0.clearTimeout(a0._pprTimeoutFunc);
a0._pprTimeoutFunc=null;
}
if(_agent.isPIE||_agent.isNokiaPhone||_agent.isBlackBerry)
return;
var a1=a0.document;
if(a0._pprBlocking)
{
if(_agent.isGecko)
{
if(a0._pprBlockingTimeout!=null)
{
a0.clearTimeout(a0._pprBlockingTimeout);
a0._pprBlockingTimeout==null;
}
}
_pprInstallBlockingHandlers(a0,false);
a0._pprEventElement=null;
a0._pprBlocking=false;
}
a0._pprBlocking=false;
}
function _pprFocus(a0,a1)
{
if(_agent.isIEGroup)
{
if(a0.parentNode==null)
return;
var a2=_getElementById(a1,_pprdivElementName);
if((a2)&&(a2["focus"]))
a2.focus();
}
a0.focus();
}
function _pprConsumeBlockedEvent(a0)
{
var a1=true;
if(_pprBlocking)
{
var a2=true;
if(window._pprFirstClickPass)
{
var a3=new Date();
var a4=a3-_pprBlockStartTime;
var a5=150;
if((a4<a5)&&(a0.type=='click'))
{
var a6=a0.explicitOriginalTarget;
a2=!_isSubmittingElement(a6);
}
}
if(a2)
{
a0.stopPropagation();
a0.preventDefault();
a1=false;
}
}
return a1;
}
function _pprConsumeFirstClick(a0)
{
if(_agent.isIE)
{
_pprControlCapture(window,true);
window.document.detachEvent('onclick',_pprConsumeFirstClick);
}
return false;
}
function _pprControlCapture(a0,a1)
{
if(_agent.isIE)
{
var a2=a0.document;
var a3=a2.body;
var a4=_getElementById(a2,_pprdivElementName);
if(a4)
{
if(a1)
{
a4.setCapture();
if(a0._pprEventElement)
a4.focus();
a0._pprSavedCursor=a3.style.cursor;
a3.style.cursor="wait";
a0._pprSavedCursorFlag=true;
}
else if(a0._pprSavedCursorFlag)
{
a4.releaseCapture();
if(a0._pprEventElement)
a0._pprEventElement.focus();
a3.style.cursor=a0._pprSavedCursor;
a0._pprSavedCursor=null;
a0._pprSavedCursorFlag=false;
}
}
}
return;
}
function _pprChoiceAction()
{
if(!_agent.isIE)
return true;
var a0=false;
if((!window._pprBlocking)&&(_pprChoiceChanged))
{
_pprChoiceChanged=false;
a0=true;
}
return a0;
}
function _pprChoiceChangeEvent(a0)
{
if(!_agent.isIE)
return true;
if(!window._pprBlocking)
_pprChoiceChanged=true;
return true;
}
function _supportsPPR()
{
return!_agent.pprUnsupported;
}
function _firePartialChange(a0)
{
var a1=TrPage.getInstance();
var a2=a1.getRequestQueue();
a2.sendRequest(
a1,a1._requestStatusChanged,a0);
}
function _submitPartialChange(
a0,
a1,
a2,
a3)
{
if(!_supportsPPR())
return submitForm(a0,a1,a2);
if((typeof a0)=="string")
a0=document[a0];
if(!a0)
return false;
a2=_addFormParameter(a2,"partial","true");
_pprStartBlocking(window);
var a4=submitForm(a0,a1,a2,true,a3);
if(!a4)
{
_pprStopBlocking(window);
}
}
function _setRequestedFocusNode(a0,a1,a2,a3)
{
if(!a3)
a3=window;
a3._TrFocusRequestDoc=a0;
a3._TrFocusRequestID=a1;
a3._TrFocusRequestNext=(a2==true);
}
function _getRequestedFocusNode(a0)
{
if(a0==(void 0))
a0=window;
if((a0._TrFocusRequestDoc!=null)
&&(a0._TrFocusRequestID!=null))
{
var a1=_getElementById(a0._TrFocusRequestDoc,
a0._TrFocusRequestID);
if(!a1)
return null;
if(a0._TrFocusRequestNext)
{
for(var a2=a1.nextSibling;
a2!=null;
a2=a2.nextSibling)
{
if(_isFocusable(a2)
||((_agent.isIE)&&(a2.nodeName.toLowerCase()=='a')))
{
a1=a2;
break;
}
}
}
return a1;
}
return null;
}
function _getFirstFocusable(a0)
{
if((a0==null)||_isFocusable(a0))
return a0;
if(a0.hasChildNodes)
{
var a1=a0.childNodes;
for(var a2=0;a2<a1.length;a2++)
{
var a3=a1[a2];
var a4=_getFirstFocusable(a3);
if(a4!=null)
return a4;
}
}
return null;
}
function _restoreFocus(a0,a1,a2)
{
if(a0==null)
return;
var a3=_getAncestorByName(a0,"DIV");
if(!a3)
{
_pprFocus(a0,a2);
}
else
{
var a4=a3.scrollTop;
var a5=a3.scrollLeft;
if(((a4==0)&&(a5==0))||!a1)
{
_pprFocus(a0,a2);
}
}
if((_agent.isIE)
&&(a0.tagName=='INPUT')
&&(_getAncestorByName(a0,'TABLE')))
{
_pprFocus(a0,a2);
}
}
function _getAncestorByName(
a0,
a1
)
{
a1=a1.toUpperCase();
while(a0)
{
if(a1==a0.nodeName)
return a0;
a0=a0.parentNode;
}
return null;
}
function _isDescendent(
a0,
a1
)
{
if(a0==null)
return false;
while(a0.parentNode)
{
if(a0==a1)
return true;
a0=a0.parentNode;
}
return false;
}
function _isFocusable(a0)
{
if(a0==null)
return false;
var a1=a0.nodeName.toLowerCase();
if(('a'==a1)&&(a0.href))
{
if(!_agent.isIE||(a0.id))
return true;
var a2=a0.childNodes;
if((a2)&&(a2.length==1))
{
var a3=a2[0].nodeName;
if('img'==a3.toLowerCase())
return false;
}
return true;
}
if(a0.disabled)
return false;
if('input'==a1)
{
return(a0.type!='hidden');
}
return(('select'==a1)||
('button'==a1)||
('textarea'==a1));
}
function _eval(targetWindow,code)
{
if(code==null)
return;
if(_agent.isIEGroup)
{
targetWindow.execScript(code);
}
else
targetWindow.eval(code);
}
function _getInputField(a0)
{
var a1=(void 0);
var a2=(void 0);
if(window.event)
{
kc=window.event.keyCode;
a2=window.event.srcElement;
}
else if(a0)
{
kc=a0.which;
a2=a0.target;
}
if(a2!=(void 0)
&&(a2.tagName=="INPUT"||
a2.tagName=="TEXTAREA"))
a1=a2;
return a1;
}
function _enterField(
a0
)
{
var a1;
var a2;
var a3=true;
var a1=_getInputField(a0);
if(a1!=(void 0))
{
a1.form._mayResetByInput=false;
a1._validValue=a1.value;
a3=false;
}
return a3;
}
function _resetOnEscape(a0)
{
var a1;
var a2=_getInputField(a0);
if(a2!=(void 0))
{
var a3=a2.form;
if(a1==27)
{
var a4=false;
if((a2.selectionStart!=(void 0))&&
(a2.selectionEnd!=(void 0)))
{
a4=(a2.selectionStart!=a2.selectionEnd);
}
else if(document.selection)
{
a4=(document.selection.createRange().text.length!=0);
}
if(!a4)
{
a2.value=a2._validValue;
if(a3._mayResetByInput==true)
{
a3.reset();
a3._mayResetByInput=false;
}
else
{
a3._mayResetByInput=true;
}
}
return false;
}
else
{
a3._mayResetByInput=false;
}
}
return true;
}
function _checkLoadNoPPR()
{
if(_initialFocusID!=null)
_setFocus(_getElementById(document,_initialFocusID));
_agent.pprUnsupported=true;
}
function _checkLoad()
{
if(!_agent.isIEGroup&&document.addEventListener)
{
document.addEventListener("keyup",_trTrackActiveElement,false);
document.addEventListener("mousedown",_trTrackActiveElement,false);
}
if(document.forms)
{
for(var a0=0;a0<document.forms.length;a0++)
{
var a1=document.forms[a0];
if(a1.addEventListener)
{
a1.addEventListener('focus',_enterField,true);
a1.addEventListener('keydown',_resetOnEscape,true);
}
else if(a1.attachEvent)
{
a1.attachEvent('onfocusin',_enterField);
a1.attachEvent('onkeydown',_resetOnEscape);
}
}
}
var a2=_getTop(self);
if((self!=a2)&&a2["_blockReload"])
{
document.onkeydown=_noReload;
}
if((!_agent.isNav)&&(_initialFocusID!=null))
{
var a3=_getElementById(document,_initialFocusID);
if(a3)
_setFocus(a3);
}
if(!_agent.isNokiaPhone)
{
TrPopupDialog._initDialogPage();
}
}
function _getActiveElement()
{
if(document.activeElement)
return document.activeElement;
return window._trActiveElement;
}
function _trTrackActiveElement(a0)
{
window._trActiveElement=a0.target;
}
function _noReload(a0)
{
if(!a0)a0=window.event;
var a1=a0.keyCode;
if((a1==116)||(a1==82&&a0.ctrlKey))
{
if(a0.preventDefault)a0.preventDefault();
a0.keyCode=0;
return false;
}
}
function _handleClientEvent(a0,a1,a2,a3)
{
var a4=new Object();
a4.type=a0;
a4.source=a1;
a4.params=a2;
var a5=new Function("event",a3);
return a5(a4);
}
function _getCookie(a0)
{
var a1=document.cookie;
var a2="";
var a3=a0+"=";
if(a1)
{
var a4=a1.indexOf("; "+a3);
if(a4<0)
{
a4=a1.indexOf(a3);
if(a4>0)
a4=-1;
}
else
a4+=2;
if(a4>=0)
{
var a5=a1.indexOf(";",a4);
if(a5<0)
a5=a1.length;
a2=unescape(a1.substring(a4+a0.length+1,a5));
}
}
return a2;
}
function _setCookie(a0,a1)
{
var a2=window.location.host;
var a3=a2.indexOf(":");
if(a3>=0)
a2=a2.substr(0,a3);
var a4=new Date();
a4.setFullYear(a4.getFullYear()+10);
var a5=a0+"="+a1+
"; path=/;domain="+a2+"; expires="+a4.toGMTString();
document.cookie=a5;
}
function _getTimeZoneID()
{
var a0=-(new Date()).getTimezoneOffset();
var a1;
if(a0>0)
a1="GMT+";
else
{
a1="GMT-";
a0=-a0;
}
var a2=""+a0%60;
if(a2.length==1)
a2="0"+a2;
return(a1+(Math.floor(a0/60))+":"+a2);
}
function _isLTR()
{
return document.documentElement["dir"].toUpperCase()=="LTR";
}
function _isSubmittingElement(a0)
{
var a1=false;
var a2=a0.nodeName.toUpperCase();
if(a2=="BUTTON")
{
a1=true;
}
else if(a2=="IMG")
{
var a3=a0.parentNode;
var a4=a3.nodeName.toUpperCase();
if(('A'==a4)&&(a3.href))
{
var a5=""+a3["onclick"];
if((a5!=(void 0))&&(a5!=null))
{
a1=((a5.indexOf("submitForm")>0)
||(a5.indexOf("_uixspu")>0)
||(a5.indexOf("_adfspu")>0)
||(a5.indexOf("_addRowSubmit")>0));
}
}
}
return a1;
}
function _getKC(a0)
{
if(window.event)
return window.event.keyCode;
else if(a0)
return a0.which;
return-1;
}
function _recentSubmit(a0)
{
if(_lastDateSubmitted)
{
var a1=a0-_lastDateSubmitted;
if((a1>=0)&&(a1<200))
return true;
}
return false;
}
function _recentReset(a0)
{
if(_lastDateReset)
{
var a1=a0-_lastDateReset;
if((a1>=0)&&(a1<200))
return true;
}
return false;
}
function _radioSet_uixspu(a0,a1,a2,a3,a4,a5,a6)
{
_radioSet_adfspu(a0,a1,a2,a3,a6);
}
function _radioSet_adfspu(a0,a1,a2,a3,a4)
{
if(window._pprBlocking)
return;
if(_pendingRadioButton)
{
_pendingRadioButton=false;
_adfspu(a0,a1,a2,a3,a4);
}
else
{
_pendingRadioButton=true;
var a5="_pendingRadioButton=false;_adfspu(";
if((a0!=(void 0))&&(a0!=null))
a5+="'"+a0+"'";
a5+=",";
if(a1!=(void 0))
a5+=a1;
a5+=",";
if((a2!=(void 0))&&(a2!=null))
a5+="'"+a2+"'";
a5+=",";
if((a3!=(void 0))&&(a3!=null))
a5+="'"+a3+"'";
a5+=");";
window.setTimeout(a5,200);
}
}
function _stepSpinboxValue(a0,a1,a2,a3,a4)
{
var a5=false;
var a6=_getElementById(document,a0);
if(a6)
{
var a7=a6.value;
if(isNaN(a7)||isNaN(a2)||isNaN(a3)||isNaN(a4))
{
alert("value, stepSize, min, and max must all be numbers. value: "+
a7+", stepSize: "+a2+", min: "+a3+", max: "+a4);
return false;
}
if(a1)
{
var a8=parseFloat(a7)+parseFloat(a2);
if(a8<a4)
a6.value=a8;
else if(a5)
a6.value=a3;
else a6.value=a4;
}
else
{
var a9=parseFloat(a7)-parseFloat(a2);
if(a9>a3)
a6.value=a9;
else if(a5)
a6.value=a4;
else a6.value=a3;
}
return true;
}
return false;
}
function _clearSpinbox()
{
window.clearTimeout(_spinboxRepeat.timer);
_spinboxRepeat.functionString=null;
}
function _spinboxRepeat(a0,a1,a2,a3,a4)
{
var a5=_stepSpinboxValue(a0,a1,a2,a3,a4);
if(!a5)
{
window.clearTimeout(_spinboxRepeat.timer);
}
else
{
if(_spinboxRepeat.functionString==null)
{
_spinboxRepeat.functionString=
"_spinboxRepeat('"+a0+"',"+a1+
","+a2+","+a3+","+a4+");";
}
_spinboxRepeat.timer=
window.setTimeout(_spinboxRepeat.functionString,1000);
}
}
function _getEventObj()
{
if(typeof(event)=='undefined')
return window.event;
else
return event;
return null;
}
var TrUIUtils=new Object();
TrUIUtils.trim=function(
a0)
{
if(a0!=null&&(typeof a0)=='string')
return a0.replace(TrUIUtils._TRIM_ALL_RE,'');
return a0;
}
TrUIUtils._TRIM_ALL_RE=/^\s*|\s*$/g;
TrUIUtils.createCallback=function(a1,a2)
{
var a3=new Function(
"var f=arguments.callee; return f._func.apply(f._owner, arguments);");
a3._owner=a1;
a3._func=a2;
return a3;
}
TrUIUtils._getWindowClientSize=function()
{
var a4;
if(TrUIUtils['_getWinClientSize']==null)
{
if(_agent.isIE)
{
TrUIUtils._getWinClientSize=function()
{
var a5=((document.compatMode=="BackCompat")?document.body:document.documentElement);
return{w:a5.clientWidth,h:a5.clientHeight};
}
}
else
{
TrUIUtils._getWinClientSize=function()
{
return{w:window.innerWidth,h:window.innerHeight};
}
}
}
return TrUIUtils._getWinClientSize();
}
TrUIUtils._getElementBounds=function(a6)
{
if(typeof(a6)=="string")
{
a6=document.getElementById(a6);
}
if(!a6)
{
return null;
}
var a7=TrUIUtils._getElementLocation(a6);
return{x:a7.x,y:a7.y,w:a6.offsetWidth,h:a6.offsetHeight};
}
TrUIUtils._getElementLocation=function(a8)
{
if(typeof(a8)=="string")
{
a8=document.getElementById(a8);
}
if(!a8)
{
return null;
}
var a9;
if(TrUIUtils['_getElemLoc']==null)
{
if(_agent.isGecko)
{
TrUIUtils._getElemLoc=function(a8)
{
var a10=a8.ownerDocument;
if(a10.getBoxObjectFor===undefined)
{
var a11=a8.getBoundingClientRect();
var a12=Math.round(a11.top);
var a13=a11.left;
var a14=a10.documentElement;
a13+=a14.scrollLeft;
a12+=a14.scrollTop;
return{x:a13,y:a12};
}
else
{
var a15=a10.getBoxObjectFor(a8);
var a16={x:a15.screenX,y:a15.screenY};
a15=a10.getBoxObjectFor(a10.documentElement);
a16.x-=a15.screenX;
a16.y-=a15.screenY;
return a16;
}
}
}
else if(_agent.isIE)
{
TrUIUtils._getElemLoc=function(a8)
{
var a10=a8.ownerDocument;
var a17=a8.getBoundingClientRect();
var a16={x:a17.left,y:a17.top};
var a18=a10.documentElement;
var a19=a18.scrollLeft;
var a20=a18["dir"]=="rtl";
if(a20)
{
a19+=a18.clientWidth-a18.scrollWidth;
}
a16.x-=a18.clientLeft-a19;
a16.y-=(a18.clientTop-a18.scrollTop);
return a16;
}
}
else
{
TrUIUtils._getElemLoc=function(a8)
{
var a21=a8.ownerDocument.contentWindow;
var a22=0;
var a23=0;
for(var a24=a8;a24&&a24!=a21;a24=a24.offsetParent)
{
a22+=a24.offsetLeft;
a23+=a24.offsetTop;
}
return{x:a22,y:a23};
}
}
}
return TrUIUtils._getElemLoc(a8);
}
TrUIUtils._cssToJs=function(a25)
{
var a26='';
var a27=false;
for(var a28=0;a28<a25.length;a28++)
{
if(a25.charAt(a28)=='-')
{
a27=true;
continue;
}
if(a27)
{
a26+=a25.charAt(a28).toUpperCase();
}
else
{
a26+=a25.charAt(a28);
}
a27=false;
}
return a26;
}
TrUIUtils._getStyle=function(a29,a30)
{
if(a29.currentStyle)
{
var a31=this._cssToJs(a30);
return a29.currentStyle[a31];
}
else if(window.getComputedStyle)
{
return document.defaultView.getComputedStyle(a29,'')
.getPropertyValue(a30);
}
return'';
}
TrUIUtils.isNumberConvertible=function(a32)
{
if(a32!=null)
{
var a33=0;
for(var a34=0;a34<a32.length;a34++)
{
var a35=a32.charCodeAt(a34);
if(a35>47&&a35<58)
{
a33++;
}
}
if(a33>15)
return false;
}
return true;
}
