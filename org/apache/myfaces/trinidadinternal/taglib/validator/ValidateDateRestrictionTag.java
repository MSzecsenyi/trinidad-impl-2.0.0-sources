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

import java.text.ParseException;
import javax.el.ValueExpression;
import javax.faces.application.Application;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.servlet.jsp.JspException;
import org.apache.myfaces.trinidad.model.DateListProvider;
import org.apache.myfaces.trinidad.webapp.TrinidadValidatorELTag;
import org.apache.myfaces.trinidadinternal.taglib.util.TagUtils;
import org.apache.myfaces.trinidadinternal.validator.DateRestrictionValidator;

/**
 * Auto-generated tag class.
 */
public class ValidateDateRestrictionTag extends TrinidadValidatorELTag
{

  /**
   * Construct an instance of the ValidateDateRestrictionTag.
   */
  public ValidateDateRestrictionTag()
  {
  }

  private ValueExpression _invalidMonths;
  public void setInvalidMonths(ValueExpression invalidMonths)
  {
    _invalidMonths = invalidMonths;
  }

  private ValueExpression _invalidDaysOfWeek;
  public void setInvalidDaysOfWeek(ValueExpression invalidDaysOfWeek)
  {
    _invalidDaysOfWeek = invalidDaysOfWeek;
  }

  private ValueExpression _invalidDays;
  public void setInvalidDays(ValueExpression invalidDays)
  {
    _invalidDays = invalidDays;
  }

  private ValueExpression _messageDetailInvalidMonths;
  public void setMessageDetailInvalidMonths(ValueExpression messageDetailInvalidMonths)
  {
    _messageDetailInvalidMonths = messageDetailInvalidMonths;
  }

  private ValueExpression _messageDetailInvalidDaysOfWeek;
  public void setMessageDetailInvalidDaysOfWeek(ValueExpression messageDetailInvalidDaysOfWeek)
  {
    _messageDetailInvalidDaysOfWeek = messageDetailInvalidDaysOfWeek;
  }

  private ValueExpression _messageDetailInvalidDays;
  public void setMessageDetailInvalidDays(ValueExpression messageDetailInvalidDays)
  {
    _messageDetailInvalidDays = messageDetailInvalidDays;
  }


  @Override
  protected Validator createValidator() throws JspException
  {
    String validatorId = DateRestrictionValidator.VALIDATOR_ID;
    Application appl = FacesContext.getCurrentInstance().getApplication();
    DateRestrictionValidator validator = (DateRestrictionValidator)appl.createValidator(validatorId);
    _setProperties(validator);
    return validator;
  }

  private void _setProperties(
    DateRestrictionValidator validator) throws JspException
  {
    if (_invalidMonths != null)
    {
      if (!_invalidMonths.isLiteralText())
      {
        validator.setValueExpression("invalidMonths", _invalidMonths);
      }
      else
      {
        try
        {
        String[] value = TagUtils.getStringArray(_invalidMonths.getValue(null));
        validator.setInvalidMonths(value);
        }
        catch (ParseException pe)
        {
          throw new JspException(
            pe.getMessage() + ": " + "Position " + pe.getErrorOffset());
        }
      }
    }
    if (_invalidDaysOfWeek != null)
    {
      if (!_invalidDaysOfWeek.isLiteralText())
      {
        validator.setValueExpression("invalidDaysOfWeek", _invalidDaysOfWeek);
      }
      else
      {
        try
        {
        String[] value = TagUtils.getStringArray(_invalidDaysOfWeek.getValue(null));
        validator.setInvalidDaysOfWeek(value);
        }
        catch (ParseException pe)
        {
          throw new JspException(
            pe.getMessage() + ": " + "Position " + pe.getErrorOffset());
        }
      }
    }
    if (_invalidDays != null)
    {
      if (!_invalidDays.isLiteralText())
      {
        validator.setValueExpression("invalidDays", _invalidDays);
      }
    }
    if (_messageDetailInvalidMonths != null)
    {
      if (!_messageDetailInvalidMonths.isLiteralText())
      {
        validator.setValueExpression("messageDetailInvalidMonths", _messageDetailInvalidMonths);
      }
      else
      {
        String value = TagUtils.getString(_messageDetailInvalidMonths.getValue(null));
        validator.setMessageDetailInvalidMonths(value);
      }
    }
    if (_messageDetailInvalidDaysOfWeek != null)
    {
      if (!_messageDetailInvalidDaysOfWeek.isLiteralText())
      {
        validator.setValueExpression("messageDetailInvalidDaysOfWeek", _messageDetailInvalidDaysOfWeek);
      }
      else
      {
        String value = TagUtils.getString(_messageDetailInvalidDaysOfWeek.getValue(null));
        validator.setMessageDetailInvalidDaysOfWeek(value);
      }
    }
    if (_messageDetailInvalidDays != null)
    {
      if (!_messageDetailInvalidDays.isLiteralText())
      {
        validator.setValueExpression("messageDetailInvalidDays", _messageDetailInvalidDays);
      }
      else
      {
        String value = TagUtils.getString(_messageDetailInvalidDays.getValue(null));
        validator.setMessageDetailInvalidDays(value);
      }
    }
  }

  @Override
  public void release()
  {
    super.release();
    _invalidMonths = null;
    _invalidDaysOfWeek = null;
    _invalidDays = null;
    _messageDetailInvalidMonths = null;
    _messageDetailInvalidDaysOfWeek = null;
    _messageDetailInvalidDays = null;
  }
}
