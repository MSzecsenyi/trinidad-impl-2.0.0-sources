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
import org.apache.myfaces.trinidad.component.UIXPoll;
import org.apache.myfaces.trinidad.webapp.UIXComponentELTag;

/**
 * Auto-generated tag class.
 */
abstract public class UIXPollTag extends UIXComponentELTag
{

  /**
   * Construct an instance of the UIXPollTag.
   */
  public UIXPollTag()
  {
  }

  private ValueExpression _immediate;
  final public void setImmediate(ValueExpression immediate)
  {
    _immediate = immediate;
  }

  private MethodExpression _pollListener;
  final public void setPollListener(MethodExpression pollListener)
  {
    _pollListener = pollListener;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    bean.setProperty(UIXPoll.POLL_LISTENER_KEY, _pollListener);
    setProperty(bean, UIXPoll.IMMEDIATE_KEY, _immediate);
  }

  @Override
  public void release()
  {
    super.release();
    _pollListener = null;
    _immediate = null;
  }
}
