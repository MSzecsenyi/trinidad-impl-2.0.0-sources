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
import org.apache.myfaces.trinidad.component.UIXSelectRange;
import org.apache.myfaces.trinidad.webapp.UIXComponentELTag;

/**
 * Auto-generated tag class.
 */
abstract public class UIXSelectRangeTag extends UIXComponentELTag
{

  /**
   * Construct an instance of the UIXSelectRangeTag.
   */
  public UIXSelectRangeTag()
  {
  }

  private java.lang.String _var;
  final public void setVar(java.lang.String var)
  {
    _var = var;
  }

  private ValueExpression _immediate;
  final public void setImmediate(ValueExpression immediate)
  {
    _immediate = immediate;
  }

  private MethodExpression _rangeChangeListener;
  final public void setRangeChangeListener(MethodExpression rangeChangeListener)
  {
    _rangeChangeListener = rangeChangeListener;
  }

  private ValueExpression _value;
  final public void setValue(ValueExpression value)
  {
    _value = value;
  }

  private ValueExpression _rows;
  final public void setRows(ValueExpression rows)
  {
    _rows = rows;
  }

  private ValueExpression _first;
  final public void setFirst(ValueExpression first)
  {
    _first = first;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setProperty(bean, UIXSelectRange.VALUE_KEY, _value);
    setProperty(bean, UIXSelectRange.FIRST_KEY, _first);
    bean.setProperty(UIXSelectRange.RANGE_CHANGE_LISTENER_KEY, _rangeChangeListener);
    setProperty(bean, UIXSelectRange.IMMEDIATE_KEY, _immediate);
    setProperty(bean, UIXSelectRange.ROWS_KEY, _rows);
    bean.setProperty(UIXSelectRange.VAR_KEY, _var);
  }

  @Override
  public void release()
  {
    super.release();
    _value = null;
    _first = null;
    _rangeChangeListener = null;
    _immediate = null;
    _rows = null;
    _var = null;
  }
}
