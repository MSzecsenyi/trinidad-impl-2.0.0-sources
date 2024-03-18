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
import org.apache.myfaces.trinidad.component.UIXCommand;
import org.apache.myfaces.trinidad.webapp.UIXComponentELTag;
import org.apache.myfaces.trinidadinternal.taglib.util.MethodExpressionMethodBinding;

/**
 * Auto-generated tag class.
 */
abstract public class UIXCommandTag extends UIXComponentELTag
{

  /**
   * Construct an instance of the UIXCommandTag.
   */
  public UIXCommandTag()
  {
  }

  private MethodExpression _actionExpression;
  final public void setAction(MethodExpression actionExpression)
  {
    _actionExpression = actionExpression;
  }

  private MethodExpression _actionListener;
  final public void setActionListener(MethodExpression actionListener)
  {
    _actionListener = actionListener;
  }

  private MethodExpression _returnListener;
  final public void setReturnListener(MethodExpression returnListener)
  {
    _returnListener = returnListener;
  }

  private MethodExpression _launchListener;
  final public void setLaunchListener(MethodExpression launchListener)
  {
    _launchListener = launchListener;
  }

  private ValueExpression _immediate;
  final public void setImmediate(ValueExpression immediate)
  {
    _immediate = immediate;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    bean.setProperty(UIXCommand.LAUNCH_LISTENER_KEY, _launchListener);
    bean.setProperty(UIXCommand.RETURN_LISTENER_KEY, _returnListener);
    if (_actionListener != null)
      bean.setProperty(UIXCommand.ACTION_LISTENER_KEY, new MethodExpressionMethodBinding(_actionListener));
    setProperty(bean, UIXCommand.IMMEDIATE_KEY, _immediate);
    bean.setProperty(UIXCommand.ACTION_EXPRESSION_KEY, _actionExpression);
  }

  @Override
  public void release()
  {
    super.release();
    _launchListener = null;
    _returnListener = null;
    _actionListener = null;
    _immediate = null;
    _actionExpression = null;
  }
}
