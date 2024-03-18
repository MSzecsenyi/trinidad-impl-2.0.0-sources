function TrNumberConverter(
a0,
a1,
a2,
a3,
a4,
a5,
a6,
a7,
a8,
a9,
a10,
a11)
{
this._pattern=a0;
this._type=a1;
this._locale=a2;
this._messages=a3;
this._currencyCode=a6;
this._currencySymbol=a7;
this._maxFractionDigits=a8;
this._maxIntegerDigits=a9;
this._minFractionDigits=a10;
this._minIntegerDigits=a11;
if(a4!==undefined)
this._integerOnly=a4;
else
this._integerOnly=false;
if(a5!==undefined)
this._groupingUsed=a5;
else
this._groupingUsed=true;
this._initNumberFormat(a2);
this._class="TrNumberConverter";
}
TrNumberConverter.prototype=new TrConverter();
TrNumberConverter.prototype.setCurrencyCode=function(a12)
{
this._currencyCode=a12;
}
TrNumberConverter.prototype.getCurrencyCode=function()
{
return this._currencyCode;
}
TrNumberConverter.prototype.setCurrencySymbol=function(a13)
{
this._currencySymbol=a13;
}
TrNumberConverter.prototype.getCurrencySymbol=function()
{
return this._currencySymbol;
}
TrNumberConverter.prototype.setMaxFractionDigits=function(a14)
{
this._maxFractionDigits=a14;
}
TrNumberConverter.prototype.getMaxFractionDigits=function()
{
return this._maxFractionDigits;
}
TrNumberConverter.prototype.setMaxIntegerDigits=function(a15)
{
this._maxIntegerDigits=a15;
}
TrNumberConverter.prototype.getMaxIntegerDigits=function()
{
return this._maxIntegerDigits;
}
TrNumberConverter.prototype.setMinFractionDigits=function(a16)
{
this._minFractionDigits=a16;
}
TrNumberConverter.prototype.getMinFractionDigits=function()
{
return this._minFractionDigits;
}
TrNumberConverter.prototype.setMinIntegerDigits=function(a17)
{
this._minIntegerDigits=a17;
}
TrNumberConverter.prototype.getMinIntegerDigits=function()
{
return this._minIntegerDigits;
}
TrNumberConverter.prototype.setGroupingUsed=function(a18)
{
this._groupingUsed=a18;
}
TrNumberConverter.prototype.isGroupingUsed=function()
{
return this._groupingUsed;
}
TrNumberConverter.prototype.setIntegerOnly=function(a19)
{
this._integerOnly=a19;
}
TrNumberConverter.prototype.isIntegerOnly=function()
{
return this._integerOnly;
}
TrNumberConverter.prototype.getFormatHint=function()
{
if(this._messages&&this._messages["hintPattern"])
{
return TrMessageFactory.createCustomMessage(
this._messages["hintPattern"],
this._pattern);
}
else
{
if(this._pattern)
{
return TrMessageFactory.createMessage(
"org.apache.myfaces.trinidad.convert.NumberConverter.FORMAT_HINT",
this._pattern);
}
else
{
return null;
}
}
}
TrNumberConverter.prototype.getAsString=function(
a20,
a21
)
{
if(this._isConvertible())
{
if(this._type=="percent"||this._type=="currency")
{
var a22=this._numberFormat.format(a20);
if(this._type=="currency")
{
if(this._currencyCode)
{
a22=a22.replace(getLocaleSymbols().getCurrencyCode(),this._currencyCode);
}
else if(this._currencySymbol)
{
a22=a22.replace(getLocaleSymbols().getCurrencySymbol(),this._currencySymbol);
}
}
return a22;
}
else
{
if(typeof a20==="string")
{
return this._numberFormat.format(parseFloat(a20));
}
else
{
return this._numberFormat.format(parseFloat(a20.toFixed(this._numberFormat.getMaximumFractionDigits())));
}
}
}
else
{
return undefined;
}
}
TrNumberConverter.prototype.getAsObject=function(
a23,
a24
)
{
a23=TrUIUtils.trim(a23);
if(this._isConvertible(a23))
{
if(a23==null)
return null;
if(a23.length==0)
return null
var a25;
if(this._type=="percent"||this._type=="currency")
{
var a26=getLocaleSymbols(this._locale);
var a27=a26.getGroupingSeparator();
if(a27=="\xa0")
{
var a28=new RegExp("\\ ","g");
a23=a23.replace(a28,"\xa0");
}
var a29=new RegExp("\\"+a27,"g");
a23=a23.replace(a29,"");
var a30=a26.getDecimalSeparator();
var a31=new RegExp("\\"+a30,"g");
a23=a23.replace(a31,".");
try
{
a23=this._numberFormat.parse(a23)+"";
}
catch(e)
{
try
{
a23=TrNumberFormat.getNumberInstance().parse(a23)+"";
}
catch(e)
{
var a32;
var a33=this._numberFormat.format(this._example);
var a34="org.apache.myfaces.trinidad.convert.NumberConverter.CONVERT_"+this._type.toUpperCase();
if(this._messages&&this._messages[this._type])
{
a32=_createCustomFacesMessage(TrMessageFactory.getSummaryString(a34),this._messages[this._type],a24,a23,a33);
}
else
{
a32=_createFacesMessage(a34,a24,a23,a33);
}
throw new TrConverterException(a32);
}
}
var a35=new RegExp("\\"+".","g");
a23=a23.replace(a35,getLocaleSymbols().getDecimalSeparator());
}
a25=_decimalParse(a23,
this._messages,
"org.apache.myfaces.trinidad.convert.NumberConverter",
null,
null,
null,
null,
a24,
!this.isIntegerOnly());
a25=parseFloat(a25.toFixed(this._numberFormat.getMaximumFractionDigits()));
if(this._type=="percent")
{
a25=a25/100;
}
return a25;
}
else
{
return undefined;
}
}
TrNumberConverter.prototype._isConvertible=function(a36)
{
if(this._pattern!=null)
return false;
return TrUIUtils.isNumberConvertible(a36);
}
TrNumberConverter.prototype._initNumberFormat=function(a37)
{
if(this._type=="percent")
{
this._example=0.3423;
this._numberFormat=TrNumberFormat.getPercentInstance(a37);
}
else if(this._type=="currency")
{
this._example=10250;
this._numberFormat=TrNumberFormat.getCurrencyInstance(a37);
}
else if(this._type=="number")
{
this._numberFormat=TrNumberFormat.getNumberInstance(a37);
}
this._numberFormat.setGroupingUsed(this.isGroupingUsed());
this._numberFormat.setMaximumFractionDigits(this.getMaxFractionDigits());
this._numberFormat.setMaximumIntegerDigits(this.getMaxIntegerDigits());
this._numberFormat.setMinimumFractionDigits(this.getMinFractionDigits());
this._numberFormat.setMinimumIntegerDigits(this.getMinIntegerDigits());
}
