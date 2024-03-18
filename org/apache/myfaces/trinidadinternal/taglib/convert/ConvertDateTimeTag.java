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
import java.util.TimeZone;
import javax.el.ValueExpression;
import javax.faces.application.Application;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.servlet.jsp.JspException;
import org.apache.myfaces.trinidad.webapp.TrinidadConverterELTag;
import org.apache.myfaces.trinidadinternal.convert.DateTimeConverter;
import org.apache.myfaces.trinidadinternal.taglib.util.TagUtils;

/**
 * Auto-generated tag class.
 */
public class ConvertDateTimeTag extends TrinidadConverterELTag
{

  /**
   * Construct an instance of the ConvertDateTimeTag.
   */
  public ConvertDateTimeTag()
  {
  }

  private ValueExpression _messageDetailConvertDate;
  public void setMessageDetailConvertDate(ValueExpression messageDetailConvertDate)
  {
    _messageDetailConvertDate = messageDetailConvertDate;
  }

  private ValueExpression _messageDetailConvertTime;
  public void setMessageDetailConvertTime(ValueExpression messageDetailConvertTime)
  {
    _messageDetailConvertTime = messageDetailConvertTime;
  }

  private ValueExpression _messageDetailConvertBoth;
  public void setMessageDetailConvertBoth(ValueExpression messageDetailConvertBoth)
  {
    _messageDetailConvertBoth = messageDetailConvertBoth;
  }

  private ValueExpression _dateStyle;
  public void setDateStyle(ValueExpression dateStyle)
  {
    _dateStyle = dateStyle;
  }

  private ValueExpression _locale;
  public void setLocale(ValueExpression locale)
  {
    _locale = locale;
  }

  private ValueExpression _pattern;
  public void setPattern(ValueExpression pattern)
  {
    _pattern = pattern;
  }

  private ValueExpression _secondaryPattern;
  public void setSecondaryPattern(ValueExpression secondaryPattern)
  {
    _secondaryPattern = secondaryPattern;
  }

  private ValueExpression _timeStyle;
  public void setTimeStyle(ValueExpression timeStyle)
  {
    _timeStyle = timeStyle;
  }

  private ValueExpression _timeZone;
  public void setTimeZone(ValueExpression timeZone)
  {
    _timeZone = timeZone;
  }

  private ValueExpression _type;
  public void setType(ValueExpression type)
  {
    _type = type;
  }

  @Override
  protected Converter createConverter() throws JspException
  {
    String converterId = DateTimeConverter.CONVERTER_ID;
    Application appl = FacesContext.getCurrentInstance().getApplication();
    DateTimeConverter converter = (DateTimeConverter)appl.createConverter(converterId);
    _setProperties(converter);
    return converter;
  }

  private void _setProperties(
    DateTimeConverter converter) throws JspException
  {
    if (_messageDetailConvertDate != null)
    {
      if (!_messageDetailConvertDate.isLiteralText())
      {
        converter.setValueExpression("messageDetailConvertDate", _messageDetailConvertDate);
      }
      else
      {
        String value = TagUtils.getString(_messageDetailConvertDate.getValue(null));
        converter.setMessageDetailConvertDate(value);
      }
    }
    if (_messageDetailConvertTime != null)
    {
      if (!_messageDetailConvertTime.isLiteralText())
      {
        converter.setValueExpression("messageDetailConvertTime", _messageDetailConvertTime);
      }
      else
      {
        String value = TagUtils.getString(_messageDetailConvertTime.getValue(null));
        converter.setMessageDetailConvertTime(value);
      }
    }
    if (_messageDetailConvertBoth != null)
    {
      if (!_messageDetailConvertBoth.isLiteralText())
      {
        converter.setValueExpression("messageDetailConvertBoth", _messageDetailConvertBoth);
      }
      else
      {
        String value = TagUtils.getString(_messageDetailConvertBoth.getValue(null));
        converter.setMessageDetailConvertBoth(value);
      }
    }
    if (_dateStyle != null)
    {
      if (!_dateStyle.isLiteralText())
      {
        converter.setValueExpression("dateStyle", _dateStyle);
      }
      else
      {
        String value = TagUtils.getString(_dateStyle.getValue(null));
        converter.setDateStyle(value);
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
    if (_secondaryPattern != null)
    {
      if (!_secondaryPattern.isLiteralText())
      {
        converter.setValueExpression("secondaryPattern", _secondaryPattern);
      }
      else
      {
        String value = TagUtils.getString(_secondaryPattern.getValue(null));
        converter.setSecondaryPattern(value);
      }
    }
    if (_timeStyle != null)
    {
      if (!_timeStyle.isLiteralText())
      {
        converter.setValueExpression("timeStyle", _timeStyle);
      }
      else
      {
        String value = TagUtils.getString(_timeStyle.getValue(null));
        converter.setTimeStyle(value);
      }
    }
    if (_timeZone != null)
    {
      if (!_timeZone.isLiteralText())
      {
        converter.setValueExpression("timeZone", _timeZone);
      }
      else
      {
        TimeZone value = TagUtils.getTimeZone(_timeZone.getValue(null));
        converter.setTimeZone(value);
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
    _messageDetailConvertDate = null;
    _messageDetailConvertTime = null;
    _messageDetailConvertBoth = null;
    _dateStyle = null;
    _locale = null;
    _pattern = null;
    _secondaryPattern = null;
    _timeStyle = null;
    _timeZone = null;
    _type = null;
  }
}
