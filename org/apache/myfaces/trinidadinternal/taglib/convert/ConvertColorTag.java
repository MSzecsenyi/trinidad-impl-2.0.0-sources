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

import java.text.ParseException;
import javax.el.ValueExpression;
import javax.faces.application.Application;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.servlet.jsp.JspException;
import org.apache.myfaces.trinidad.webapp.TrinidadConverterELTag;
import org.apache.myfaces.trinidadinternal.convert.ColorConverter;
import org.apache.myfaces.trinidadinternal.taglib.util.TagUtils;

/**
 * Auto-generated tag class.
 */
public class ConvertColorTag extends TrinidadConverterELTag
{

  /**
   * Construct an instance of the ConvertColorTag.
   */
  public ConvertColorTag()
  {
  }

  private ValueExpression _patterns;
  public void setPatterns(ValueExpression patterns)
  {
    _patterns = patterns;
  }

  private ValueExpression _transparentAllowed;
  public void setTransparentAllowed(ValueExpression transparentAllowed)
  {
    _transparentAllowed = transparentAllowed;
  }

  private ValueExpression _messageDetailConvert;
  public void setMessageDetailConvert(ValueExpression messageDetailConvert)
  {
    _messageDetailConvert = messageDetailConvert;
  }

  @Override
  protected Converter createConverter() throws JspException
  {
    String converterId = ColorConverter.CONVERTER_ID;
    Application appl = FacesContext.getCurrentInstance().getApplication();
    ColorConverter converter = (ColorConverter)appl.createConverter(converterId);
    _setProperties(converter);
    return converter;
  }

  private void _setProperties(
    ColorConverter converter) throws JspException
  {
    if (_patterns != null)
    {
      if (!_patterns.isLiteralText())
      {
        converter.setValueExpression("patterns", _patterns);
      }
      else
      {
        try
        {
        String[] value = TagUtils.getStringArray(_patterns.getValue(null));
        converter.setPatterns(value);
        }
        catch (ParseException pe)
        {
          throw new JspException(
            pe.getMessage() + ": " + "Position " + pe.getErrorOffset());
        }
      }
    }
    if (_transparentAllowed != null)
    {
      if (!_transparentAllowed.isLiteralText())
      {
        converter.setValueExpression("transparentAllowed", _transparentAllowed);
      }
      else
      {
        boolean value = TagUtils.getBoolean(_transparentAllowed.getValue(null));
        converter.setTransparentAllowed(value);
      }
    }
    if (_messageDetailConvert != null)
    {
      if (!_messageDetailConvert.isLiteralText())
      {
        converter.setValueExpression("messageDetailConvert", _messageDetailConvert);
      }
      else
      {
        String value = TagUtils.getString(_messageDetailConvert.getValue(null));
        converter.setMessageDetailConvert(value);
      }
    }
  }

  @Override
  public void release()
  {
    super.release();
    _patterns = null;
    _transparentAllowed = null;
    _messageDetailConvert = null;
  }
}
