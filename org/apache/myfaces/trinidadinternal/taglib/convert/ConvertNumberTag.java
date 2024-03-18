// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
*/
package org.apache.myfaces.trinidadinternal.taglib.convert;

import java.util.Locale;
import javax.el.ValueExpression;
import javax.faces.application.Application;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.servlet.jsp.JspException;
import org.apache.myfaces.trinidad.webapp.TrinidadConverterELTag;
import org.apache.myfaces.trinidadinternal.convert.NumberConverter;
import org.apache.myfaces.trinidadinternal.taglib.util.TagUtils;

/**
 * Auto-generated tag class.
 */
public class ConvertNumberTag extends TrinidadConverterELTag
{

  /**
   * Construct an instance of the ConvertNumberTag.
   */
  public ConvertNumberTag()
  {
  }

  private ValueExpression _currencyCode;
  public void setCurrencyCode(ValueExpression currencyCode)
  {
    _currencyCode = currencyCode;
  }

  private ValueExpression _messageDetailConvertCurrency;
  public void setMessageDetailConvertCurrency(ValueExpression messageDetailConvertCurrency)
  {
    _messageDetailConvertCurrency = messageDetailConvertCurrency;
  }

  private ValueExpression _messageDetailConvertNumber;
  public void setMessageDetailConvertNumber(ValueExpression messageDetailConvertNumber)
  {
    _messageDetailConvertNumber = messageDetailConvertNumber;
  }

  private ValueExpression _messageDetailConvertPattern;
  public void setMessageDetailConvertPattern(ValueExpression messageDetailConvertPattern)
  {
    _messageDetailConvertPattern = messageDetailConvertPattern;
  }

  private ValueExpression _messageDetailConvertPercent;
  public void setMessageDetailConvertPercent(ValueExpression messageDetailConvertPercent)
  {
    _messageDetailConvertPercent = messageDetailConvertPercent;
  }

  private ValueExpression _currencySymbol;
  public void setCurrencySymbol(ValueExpression currencySymbol)
  {
    _currencySymbol = currencySymbol;
  }

  private ValueExpression _groupingUsed;
  public void setGroupingUsed(ValueExpression groupingUsed)
  {
    _groupingUsed = groupingUsed;
  }

  private ValueExpression _integerOnly;
  public void setIntegerOnly(ValueExpression integerOnly)
  {
    _integerOnly = integerOnly;
  }

  private ValueExpression _locale;
  public void setLocale(ValueExpression locale)
  {
    _locale = locale;
  }

  private ValueExpression _maxFractionDigits;
  public void setMaxFractionDigits(ValueExpression maxFractionDigits)
  {
    _maxFractionDigits = maxFractionDigits;
  }

  private ValueExpression _maxIntegerDigits;
  public void setMaxIntegerDigits(ValueExpression maxIntegerDigits)
  {
    _maxIntegerDigits = maxIntegerDigits;
  }

  private ValueExpression _minFractionDigits;
  public void setMinFractionDigits(ValueExpression minFractionDigits)
  {
    _minFractionDigits = minFractionDigits;
  }

  private ValueExpression _minIntegerDigits;
  public void setMinIntegerDigits(ValueExpression minIntegerDigits)
  {
    _minIntegerDigits = minIntegerDigits;
  }

  private ValueExpression _pattern;
  public void setPattern(ValueExpression pattern)
  {
    _pattern = pattern;
  }

  private ValueExpression _type;
  public void setType(ValueExpression type)
  {
    _type = type;
  }

  @Override
  protected Converter createConverter() throws JspException
  {
    String converterId = NumberConverter.CONVERTER_ID;
    Application appl = FacesContext.getCurrentInstance().getApplication();
    NumberConverter converter = (NumberConverter)appl.createConverter(converterId);
    _setProperties(converter);
    return converter;
  }

  private void _setProperties(
    NumberConverter converter) throws JspException
  {
    if (_currencyCode != null)
    {
      if (!_currencyCode.isLiteralText())
      {
        converter.setValueExpression("currencyCode", _currencyCode);
      }
      else
      {
        String value = TagUtils.getString(_currencyCode.getValue(null));
        converter.setCurrencyCode(value);
      }
    }
    if (_messageDetailConvertCurrency != null)
    {
      if (!_messageDetailConvertCurrency.isLiteralText())
      {
        converter.setValueExpression("messageDetailConvertCurrency", _messageDetailConvertCurrency);
      }
      else
      {
        String value = TagUtils.getString(_messageDetailConvertCurrency.getValue(null));
        converter.setMessageDetailConvertCurrency(value);
      }
    }
    if (_messageDetailConvertNumber != null)
    {
      if (!_messageDetailConvertNumber.isLiteralText())
      {
        converter.setValueExpression("messageDetailConvertNumber", _messageDetailConvertNumber);
      }
      else
      {
        String value = TagUtils.getString(_messageDetailConvertNumber.getValue(null));
        converter.setMessageDetailConvertNumber(value);
      }
    }
    if (_messageDetailConvertPattern != null)
    {
      if (!_messageDetailConvertPattern.isLiteralText())
      {
        converter.setValueExpression("messageDetailConvertPattern", _messageDetailConvertPattern);
      }
      else
      {
        String value = TagUtils.getString(_messageDetailConvertPattern.getValue(null));
        converter.setMessageDetailConvertPattern(value);
      }
    }
    if (_messageDetailConvertPercent != null)
    {
      if (!_messageDetailConvertPercent.isLiteralText())
      {
        converter.setValueExpression("messageDetailConvertPercent", _messageDetailConvertPercent);
      }
      else
      {
        String value = TagUtils.getString(_messageDetailConvertPercent.getValue(null));
        converter.setMessageDetailConvertPercent(value);
      }
    }
    if (_currencySymbol != null)
    {
      if (!_currencySymbol.isLiteralText())
      {
        converter.setValueExpression("currencySymbol", _currencySymbol);
      }
      else
      {
        String value = TagUtils.getString(_currencySymbol.getValue(null));
        converter.setCurrencySymbol(value);
      }
    }
    if (_groupingUsed != null)
    {
      if (!_groupingUsed.isLiteralText())
      {
        converter.setValueExpression("groupingUsed", _groupingUsed);
      }
      else
      {
        boolean value = TagUtils.getBoolean(_groupingUsed.getValue(null));
        converter.setGroupingUsed(value);
      }
    }
    if (_integerOnly != null)
    {
      if (!_integerOnly.isLiteralText())
      {
        converter.setValueExpression("integerOnly", _integerOnly);
      }
      else
      {
        boolean value = TagUtils.getBoolean(_integerOnly.getValue(null));
        converter.setIntegerOnly(value);
      }
    }
    if (_locale != null)
    {
      if (!_locale.isLiteralText())
      {
        converter.setValueExpression("locale", _locale);
      }
      else
      {
        Locale value = TagUtils.getLocale(_locale.getValue(null));
        converter.setLocale(value);
      }
    }
    if (_maxFractionDigits != null)
    {
      if (!_maxFractionDigits.isLiteralText())
      {
        converter.setValueExpression("maxFractionDigits", _maxFractionDigits);
      }
      else
      {
        int value = TagUtils.getInteger(_maxFractionDigits.getValue(null));
        converter.setMaxFractionDigits(value);
      }
    }
    if (_maxIntegerDigits != null)
    {
      if (!_maxIntegerDigits.isLiteralText())
      {
        converter.setValueExpression("maxIntegerDigits", _maxIntegerDigits);
      }
      else
      {
        int value = TagUtils.getInteger(_maxIntegerDigits.getValue(null));
        converter.setMaxIntegerDigits(value);
      }
    }
    if (_minFractionDigits != null)
    {
      if (!_minFractionDigits.isLiteralText())
      {
        converter.setValueExpression("minFractionDigits", _minFractionDigits);
      }
      else
      {
        int value = TagUtils.getInteger(_minFractionDigits.getValue(null));
        converter.setMinFractionDigits(value);
      }
    }
    if (_minIntegerDigits != null)
    {
      if (!_minIntegerDigits.isLiteralText())
      {
        converter.setValueExpression("minIntegerDigits", _minIntegerDigits);
      }
      else
      {
        int value = TagUtils.getInteger(_minIntegerDigits.getValue(null));
        converter.setMinIntegerDigits(value);
      }
    }
    if (_pattern != null)
    {
      if (!_pattern.isLiteralText())
      {
        converter.setValueExpression("pattern", _pattern);
      }
      else
      {
        String value = TagUtils.getString(_pattern.getValue(null));
        converter.setPattern(value);
      }
    }
    if (_type != null)
    {
      if (!_type.isLiteralText())
      {
        converter.setValueExpression("type", _type);
      }
      else
      {
        String value = TagUtils.getString(_type.getValue(null));
        converter.setType(value);
      }
    }
  }

  @Override
  public void release()
  {
    super.release();
    _currencyCode = null;
    _messageDetailConvertCurrency = null;
    _messageDetailConvertNumber = null;
    _messageDetailConvertPattern = null;
    _messageDetailConvertPercent = null;
    _currencySymbol = null;
    _groupingUsed = null;
    _integerOnly = null;
    _locale = null;
    _maxFractionDigits = null;
    _maxIntegerDigits = null;
    _minFractionDigits = null;
    _minIntegerDigits = null;
    _pattern = null;
    _type = null;
  }
}
