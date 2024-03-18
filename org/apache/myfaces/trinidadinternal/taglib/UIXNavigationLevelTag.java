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

import javax.el.ValueExpression;
import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.component.UIXNavigationLevel;

/**
 * Auto-generated tag class.
 */
abstract public class UIXNavigationLevelTag extends UIXCollectionTag
{

  /**
   * Construct an instance of the UIXNavigationLevelTag.
   */
  public UIXNavigationLevelTag()
  {
  }

  private ValueExpression _value;
  final public void setValue(ValueExpression value)
  {
    _value = value;
  }

  private ValueExpression _level;
  final public void setLevel(ValueExpression level)
  {
    _level = level;
  }

  private java.lang.String _varStatus;
  final public void setVarStatus(java.lang.String varStatus)
  {
    _varStatus = varStatus;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setProperty(bean, UIXNavigationLevel.VALUE_KEY, _value);
    bean.setProperty(UIXNavigationLevel.VAR_STATUS_KEY, _varStatus);
    setProperty(bean, UIXNavigationLevel.LEVEL_KEY, _level);
  }

  @Override
  public void release()
  {
    super.release();
    _value = null;
    _varStatus = null;
    _level = null;
  }
}
