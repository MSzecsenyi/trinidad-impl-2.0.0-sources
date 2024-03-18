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
import org.apache.myfaces.trinidadinternal.validator.DoubleRangeValidator;

/**
 * Auto-generated tag class.
 */
public class ValidateDoubleRangeTag extends TrinidadValidatorELTag
{

  /**
   * Construct an instance of the ValidateDoubleRangeTag.
   */
  public ValidateDoubleRangeTag()
  {
  }

  private ValueExpression _maximum;
  public void setMaximum(ValueExpression maximum)
  {
    _maximum = maximum;
  }

  private ValueExpression _minimum;
  public void setMinimum(ValueExpression minimum)
  {
    _minimum = minimum;
  }

  private ValueExpression _messageDetailMaximum;
  public void setMessageDetailMaximum(ValueExpression messageDetailMaximum)
  {
    _messageDetailMaximum = messageDetailMaximum;
  }

  private ValueExpression _messageDetailMinimum;
  public void setMessageDetailMinimum(ValueExpression messageDetailMinimum)
  {
    _messageDetailMinimum = messageDetailMinimum;
  }

  private ValueExpression _messageDetailNotInRange;
  public void setMessageDetailNotInRange(ValueExpression messageDetailNotInRange)
  {
    _messageDetailNotInRange = messageDetailNotInRange;
  }


  @Override
  protected Validator createValidator() throws JspException
  {
    String validatorId = DoubleRangeValidator.VALIDATOR_ID;
    Application appl = FacesContext.getCurrentInstance().getApplication();
    DoubleRangeValidator validator = (DoubleRangeValidator)appl.createValidator(validatorId);
    _setProperties(validator);
    return validator;
  }

  private void _setProperties(
    DoubleRangeValidator validator) throws JspException
  {
    if (_maximum != null)
    {
      if (!_maximum.isLiteralText())
      {
        validator.setValueExpression("maximum", _maximum);
      }
      else
      {
        double value = TagUtils.getDouble(_maximum.getValue(null));
        validator.setMaximum(value);
      }
    }
    if (_minimum != null)
    {
      if (!_minimum.isLiteralText())
      {
        validator.setValueExpression("minimum", _minimum);
      }
      else
      {
        double value = TagUtils.getDouble(_minimum.getValue(null));
        validator.setMinimum(value);
      }
    }
    if (_messageDetailMaximum != null)
    {
      if (!_messageDetailMaximum.isLiteralText())
      {
        validator.setValueExpression("messageDetailMaximum", _messageDetailMaximum);
      }
      else
      {
        String value = TagUtils.getString(_messageDetailMaximum.getValue(null));
        validator.setMessageDetailMaximum(value);
      }
    }
    if (_messageDetailMinimum != null)
    {
      if (!_messageDetailMinimum.isLiteralText())
      {
        validator.setValueExpression("messageDetailMinimum", _messageDetailMinimum);
      }
      else
      {
        String value = TagUtils.getString(_messageDetailMinimum.getValue(null));
        validator.setMessageDetailMinimum(value);
      }
    }
    if (_messageDetailNotInRange != null)
    {
      if (!_messageDetailNotInRange.isLiteralText())
      {
        validator.setValueExpression("messageDetailNotInRange", _messageDetailNotInRange);
      }
      else
      {
        String value = TagUtils.getString(_messageDetailNotInRange.getValue(null));
        validator.setMessageDetailNotInRange(value);
      }
    }
  }

  @Override
  public void release()
  {
    super.release();
    _maximum = null;
    _minimum = null;
    _messageDetailMaximum = null;
    _messageDetailMinimum = null;
    _messageDetailNotInRange = null;
  }
}
