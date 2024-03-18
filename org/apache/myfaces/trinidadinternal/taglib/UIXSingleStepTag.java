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
import org.apache.myfaces.trinidad.component.UIXSingleStep;
import org.apache.myfaces.trinidad.webapp.UIXComponentELTag;
import org.apache.myfaces.trinidadinternal.taglib.util.MethodExpressionMethodBinding;

/**
 * Auto-generated tag class.
 */
abstract public class UIXSingleStepTag extends UIXComponentELTag
{

  /**
   * Construct an instance of the UIXSingleStepTag.
   */
  public UIXSingleStepTag()
  {
  }

  private ValueExpression _selectedStep;
  final public void setSelectedStep(ValueExpression selectedStep)
  {
    _selectedStep = selectedStep;
  }

  private ValueExpression _maxStep;
  final public void setMaxStep(ValueExpression maxStep)
  {
    _maxStep = maxStep;
  }

  private MethodExpression _previousActionListener;
  final public void setPreviousActionListener(MethodExpression previousActionListener)
  {
    _previousActionListener = previousActionListener;
  }

  private MethodExpression _nextActionListener;
  final public void setNextActionListener(MethodExpression nextActionListener)
  {
    _nextActionListener = nextActionListener;
  }

  private MethodExpression _nextAction;
  final public void setNextAction(MethodExpression nextAction)
  {
    _nextAction = nextAction;
  }

  private MethodExpression _previousAction;
  final public void setPreviousAction(MethodExpression previousAction)
  {
    _previousAction = previousAction;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    if (_previousAction != null)
      bean.setProperty(UIXSingleStep.PREVIOUS_ACTION_KEY, new MethodExpressionMethodBinding(_previousAction));
    if (_previousActionListener != null)
      bean.setProperty(UIXSingleStep.PREVIOUS_ACTION_LISTENER_KEY, new MethodExpressionMethodBinding(_previousActionListener));
    setProperty(bean, UIXSingleStep.MAX_STEP_KEY, _maxStep);
    if (_nextAction != null)
      bean.setProperty(UIXSingleStep.NEXT_ACTION_KEY, new MethodExpressionMethodBinding(_nextAction));
    if (_nextActionListener != null)
      bean.setProperty(UIXSingleStep.NEXT_ACTION_LISTENER_KEY, new MethodExpressionMethodBinding(_nextActionListener));
    setProperty(bean, UIXSingleStep.SELECTED_STEP_KEY, _selectedStep);
  }

  @Override
  public void release()
  {
    super.release();
    _previousAction = null;
    _previousActionListener = null;
    _maxStep = null;
    _nextAction = null;
    _nextActionListener = null;
    _selectedStep = null;
  }
}
