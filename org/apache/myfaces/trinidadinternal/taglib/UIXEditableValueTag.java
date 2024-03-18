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
package org.apache.myfaces.trinidadinternal.taglib;

import javax.el.MethodExpression;
import javax.el.ValueExpression;
import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.component.UIXEditableValue;
import org.apache.myfaces.trinidadinternal.taglib.util.MethodExpressionMethodBinding;

/**
 * Auto-generated tag class.
 */
abstract public class UIXEditableValueTag extends UIXValueTag
{

  /**
   * Construct an instance of the UIXEditableValueTag.
   */
  public UIXEditableValueTag()
  {
  }

  private ValueExpression _immediate;
  final public void setImmediate(ValueExpression immediate)
  {
    _immediate = immediate;
  }

  private ValueExpression _required;
  final public void setRequired(ValueExpression required)
  {
    _required = required;
  }

  private MethodExpression _validator;
  final public void setValidator(MethodExpression validator)
  {
    _validator = validator;
  }

  private MethodExpression _valueChangeListener;
  final public void setValueChangeListener(MethodExpression valueChangeListener)
  {
    _valueChangeListener = valueChangeListener;
  }

  private ValueExpression _requiredMessageDetail;
  final public void setRequiredMessageDetail(ValueExpression requiredMessageDetail)
  {
    _requiredMessageDetail = requiredMessageDetail;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setProperty(bean, UIXEditableValue.IMMEDIATE_KEY, _immediate);
    setProperty(bean, UIXEditableValue.REQUIRED_MESSAGE_DETAIL_KEY, _requiredMessageDetail);
    if (_validator != null)
      bean.setProperty(UIXEditableValue.VALIDATOR_KEY, new MethodExpressionMethodBinding(_validator));
    setProperty(bean, UIXEditableValue.REQUIRED_KEY, _required);
    if (_valueChangeListener != null)
      bean.setProperty(UIXEditableValue.VALUE_CHANGE_LISTENER_KEY, new MethodExpressionMethodBinding(_valueChangeListener));
  }

  @Override
  public void release()
  {
    super.release();
    _immediate = null;
    _requiredMessageDetail = null;
    _validator = null;
    _required = null;
    _valueChangeListener = null;
  }
}
