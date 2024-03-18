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
package org.apache.myfaces.trinidadinternal.taglib.validator;

import javax.el.ValueExpression;
import javax.faces.application.Application;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.servlet.jsp.JspException;
import org.apache.myfaces.trinidad.webapp.TrinidadValidatorELTag;
import org.apache.myfaces.trinidadinternal.taglib.util.TagUtils;
import org.apache.myfaces.trinidadinternal.validator.RegExpValidator;

/**
 * Auto-generated tag class.
 */
public class ValidateRegExpTag extends TrinidadValidatorELTag
{

  /**
   * Construct an instance of the ValidateRegExpTag.
   */
  public ValidateRegExpTag()
  {
  }

  private ValueExpression _pattern;
  public void setPattern(ValueExpression pattern)
  {
    _pattern = pattern;
  }

  private ValueExpression _messageDetailNoMatch;
  public void setMessageDetailNoMatch(ValueExpression messageDetailNoMatch)
  {
    _messageDetailNoMatch = messageDetailNoMatch;
  }


  @Override
  protected Validator createValidator() throws JspException
  {
    String validatorId = RegExpValidator.VALIDATOR_ID;
    Application appl = FacesContext.getCurrentInstance().getApplication();
    RegExpValidator validator = (RegExpValidator)appl.createValidator(validatorId);
    _setProperties(validator);
    return validator;
  }

  private void _setProperties(
    RegExpValidator validator) throws JspException
  {
    if (_pattern != null)
    {
      if (!_pattern.isLiteralText())
      {
        validator.setValueExpression("pattern", _pattern);
      }
      else
      {
        String value = TagUtils.getString(_pattern.getValue(null));
        validator.setPattern(value);
      }
    }
    if (_messageDetailNoMatch != null)
    {
      if (!_messageDetailNoMatch.isLiteralText())
      {
        validator.setValueExpression("messageDetailNoMatch", _messageDetailNoMatch);
      }
      else
      {
        String value = TagUtils.getString(_messageDetailNoMatch.getValue(null));
        validator.setMessageDetailNoMatch(value);
      }
    }
  }

  @Override
  public void release()
  {
    super.release();
    _pattern = null;
    _messageDetailNoMatch = null;
  }
}
