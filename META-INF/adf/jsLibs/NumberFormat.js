function TrNumberFormat(a0,a1)
{
if(!a0)
alert("type for TrNumberFormat not defined!");
this._type=a0;
this._localeSymbols=getLocaleSymbols(a1);
this._pPre=this._localeSymbols.getPositivePrefix();
this._pSuf=this._localeSymbols.getPositiveSuffix();
this._nPre=this._localeSymbols.getNegativePrefix();
this._nSuf=this._localeSymbols.getNegativeSuffix();
this._maxFractionDigits=3;
this._maxIntegerDigits=40;
if(this._type=="currency")
{
this._minFractionDigits=2;
}
else
{
this._minFractionDigits=0;
}
this._minIntegerDigits=1;
this._groupingUsed=true;
}
TrNumberFormat.getNumberInstance=function(a2)
{
return new TrNumberFormat("number",a2);
}
TrNumberFormat.getCurrencyInstance=function(a3)
{
return new TrNumberFormat("currency",a3);
}
TrNumberFormat.getPercentInstance=function(a4)
{
return new TrNumberFormat("percent",a4);
}
TrNumberFormat.prototype.setGroupingUsed=function(a5)
{
this._groupingUsed=a5;
}
TrNumberFormat.prototype.isGroupingUsed=function()
{
return this._groupingUsed;
}
TrNumberFormat.prototype.setMaximumIntegerDigits=function(a6)
{
if(a6)
{
this._maxIntegerDigits=a6<0?0:a6;
if(this._minIntegerDigits>this._maxIntegerDigits)
{
this._minIntegerDigits=this._maxIntegerDigits;
}
}
}
TrNumberFormat.prototype.getMaximumIntegerDigits=function()
{
return this._maxIntegerDigits;
}
TrNumberFormat.prototype.setMaximumFractionDigits=function(a7)
{
if(a7)
{
this._maxFractionDigits=a7<0?0:a7;
if(this._maxFractionDigits<this._minFractionDigits)
{
this._minFractionDigits=this._maxFractionDigits;
}
}
}
TrNumberFormat.prototype.getMaximumFractionDigits=function()
{
return this._maxFractionDigits;
}
TrNumberFormat.prototype.setMinimumIntegerDigits=function(a8)
{
if(a8)
{
this._minIntegerDigits=a8<0?0:a8;
if(this._minIntegerDigits>this._maxIntegerDigits)
{
this._maxIntegerDigits=this._minIntegerDigits;
}
}
}
TrNumberFormat.prototype.getMinimumIntegerDigits=function()
{
return this._minIntegerDigits;
}
TrNumberFormat.prototype.setMinimumFractionDigits=function(a9)
{
if(a9)
{
this._minFractionDigits=a9<0?0:a9;
if(this._maxFractionDigits<this._minFractionDigits)
{
this._maxFractionDigits=this._minFractionDigits;
}
}
}
TrNumberFormat.prototype.getMinimumFractionDigits=function()
{
return this._minFractionDigits;
}
TrNumberFormat.prototype.format=function(a10)
{
if(this._type=="percent")
return this.percentageToString(a10);
else if(this._type=="currency")
return this.currencyToString(a10);
else if(this._type=="number")
return this.numberToString(a10);
}
TrNumberFormat.prototype.parse=function(a11)
{
if(this._type=="percent")
return this.stringToPercentage(a11);
else if(this._type=="currency")
return this.stringToCurrency(a11);
return this.stringToNumber(a11);
}
TrNumberFormat.prototype.stringToNumber=function(a12)
{
if(isNaN(a12)||a12.indexOf('e')!=-1||a12.indexOf('E')!=-1)
{
throw new TrParseException("not able to parse number");
}
return parseFloat(a12);
}
TrNumberFormat.prototype.stringToCurrency=function(a13)
{
var a14=a13.indexOf(this._nPre);
var a15=this._nSuf;
if(a15.charAt(0)==' '||a15.charAt(0)=='\xa0')
a15=a15.substring(1);
var a16=a13.indexOf(a15);
if(a14!=-1&&a16!=-1)
{
a13=a13.substr(this._nPre.length,a13.length-(this._nPre.length+a15.length));
return(this.stringToNumber(a13)*-1);
}
else
{
var a17=a13.indexOf(this._pPre);
var a18=this._pSuf;
if(a18.charAt(0)==' '||a18.charAt(0)=='\xa0')
a18=a18.substring(1);
var a19=a13.indexOf(a18);
if(a17!=-1&&a19!=-1)
{
a13=a13.substr(this._pPre.length,a13.length-(this._pPre.length+a18.length));
a13=this.stringToNumber(a13);
return a13;
}
else
{
throw new TrParseException("not able to parse number");
}
}
}
TrNumberFormat.prototype.stringToPercentage=function(a20)
{
var a21=(a20.indexOf('%')!=-1);
if(!a21)
{
throw new TrParseException("not able to parse number");
}
var a22=a20.replace(/\%/g,'');
return this.stringToNumber(a22);
}
TrNumberFormat.prototype.numberToString=function(a23)
{
var a24=a23<0;
if(a24)
a23=(a23*-1);
var a25=a23+"";
a25=TrNumberFormat.scientificToExpanded(a25);
var a26=a25.indexOf(".");
var a27=a25.length;
var a28;
var a29;
if(a26!=-1)
{
a28=a25.substring(0,a26);
a29=a25.substring(a26+1,a27);
}
else
{
a28=a25;
a29="";
}
a28=this._formatIntegers(a28);
a29=this._formatFractions(a29)
var a30=this._localeSymbols.getDecimalSeparator();
if(a29!="")
a25=(a28+a30+a29);
else
a25=(a28);
if(a24)
a25="-"+a25;
return a25;
}
TrNumberFormat.prototype.currencyToString=function(a31)
{
if(a31<0)
{
a31=(a31*-1)+"";
a31=this.numberToString(a31);
return this._nPre+a31+this._nSuf;
}
else
{
a31=this.numberToString(a31);
return this._pPre+a31+this._pSuf;
}
}
TrNumberFormat.prototype.percentageToString=function(a32)
{
a32=a32*100;
a32=this.getRounded(a32);
if(isNaN(a32))
{
throw new TrParseException("not able to parse number");
}
var a33=this._localeSymbols.getPercentSuffix();
if(!a33||a33=="")
{
throw new TrParseException("percent suffix undefined or empty");
}
a32=this.numberToString(a32);
return a32+a33;
}
TrNumberFormat.scientificToExpanded=function(a34)
{
var a35=a34.indexOf('e');
if(a35==-1)
return a34;
var a36="";
if(a34.charAt(0)=='-')
{
a36="-";
a34=a34.substring(1);
a35-=1;
}
var a37=a34.charAt(a35+1)=='+';
var a38=parseInt(a34.substring(a35+2));
var a39=a35-2;
var a40="";
if(a37)
{
for(var a41=0;a41<a38-a39;++a41)
a40+="0";
return a36+a34.charAt(0)+a34.substring(2,a35)+a40;
}
for(var a41=0;a41<a38-1;++a41)
a40+="0";
return a36+"0."+a40+a34.charAt(0)+a34.substring(2,a35);
}
TrNumberFormat.trimLeadingZeroes=function(a42)
{
var a43=[];
var a44,ch;
for(a44=0;a44<a42.length;++a44)
{
ch=a42.charAt(a44);
if((ch>='1'&&ch<='9')||ch=='.')
break;
if(ch=='0'&&a44+1<a42.length&&a42.charAt(a44+1)!='.')
continue;
a43.push(ch);
}
return a43.join('')+a42.substring(a44);
}
TrNumberFormat.prototype.getRounded=function(a45)
{
a45=this.moveDecimalRight(a45);
a45=Math.round(a45);
a45=this.moveDecimalLeft(a45);
return a45;
}
TrNumberFormat.prototype.moveDecimalRight=function(a46)
{
var a47='';
a47=this.moveDecimal(a46,false);
return a47;
}
TrNumberFormat.prototype.moveDecimalLeft=function(a48)
{
var a49='';
a49=this.moveDecimal(a48,true);
return a49;
}
TrNumberFormat.prototype.moveDecimal=function(a50,a51)
{
var a52='';
a52=this.moveDecimalAsString(a50,a51);
return parseFloat(a52);
}
TrNumberFormat.prototype.moveDecimalAsString=function(a53,a54)
{
var a55=2;
if(a55<=0)
return a53;
var a56=a53+'';
var a57=this.getZeros(a55);
var a58=new RegExp('([0-9.]+)');
if(a54)
{
a56=a56.replace(a58,a57+'$1');
var a59=new RegExp('(-?)([0-9]*)([0-9]{'+a55+'})(\\.?)');
a56=a56.replace(a59,'$1$2.$3');
}
else
{
var a60=a58.exec(a56);
if(a60!=null)
{
a56=a56.substring(0,a60.index)+a60[1]+a57+a56.substring(a60.index+a60[0].length);
}
var a59=new RegExp('(-?)([0-9]*)(\\.?)([0-9]{'+a55+'})');
a56=a56.replace(a59,'$1$2$4.');
}
a56=a56.replace(/\.$/,'');
return a56;
}
TrNumberFormat.prototype.getZeros=function(a61)
{
var a62='';
var a63;
for(a63=0;a63<a61;a63++){
a62+='0';
}
return a62;
}
TrNumberFormat.prototype._formatIntegers=function(a64)
{
var a65=a64.length;
var a66=this.getMaximumIntegerDigits();
var a67=this.getMinimumIntegerDigits();
var a68;
if(a65>a66)
{
a68=a65-a66;
a64=a64.substring(a68,a65);
}
else if(a65<a67)
{
a68=a67-a65;
var a69="";
while(a68>0)
{
a69="0"+a69;
--a68;
}
a64=a69+a64;
}
if(this.isGroupingUsed())
{
a64=this._addGroupingSeparators(a64);
}
return a64;
}
TrNumberFormat.prototype._formatFractions=function(a70)
{
var a71=a70.length;
var a72=this.getMaximumFractionDigits();
var a73=this.getMinimumFractionDigits();
if(a71>a72&&a72>=a73)
{
a70=a70.substring(0,a72);
}
if(a71<a73)
{
var a74=a73-a71;
while(a74>0)
{
a70=a70+"0";
--a74;
}
}
return a70;
}
TrNumberFormat.prototype._addGroupingSeparators=function(a75)
{
var a76=a75.length;
var a77=a76%3;
var a78;
var a79;
var a80="";
var a81=this._localeSymbols.getGroupingSeparator();
if(a77>0)
{
a78=(a76<4)?a75.substring(0,a77):a75.substring(0,a77)+a81;
a79=a75.substring(a77,a76);
}
else
{
a78="";
a79=a75;
}
for(i=0;i<a79.length;i++)
{
if(i%3==0&&i!=0)
{
a80+=a81;
}
a80+=a79.charAt(i);
}
a75=a78+a80;
return a75;
}
function TrParseException(
a0
)
{
this._message=a0;
}
TrParseException.prototype.getMessage=function()
{
return this._message;
}
