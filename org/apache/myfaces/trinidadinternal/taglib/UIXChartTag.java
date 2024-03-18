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
import org.apache.myfaces.trinidad.component.UIXChart;
import org.apache.myfaces.trinidad.webapp.UIXComponentELTag;

/**
 * Auto-generated tag class.
 */
abstract public class UIXChartTag extends UIXComponentELTag
{

  /**
   * Construct an instance of the UIXChartTag.
   */
  public UIXChartTag()
  {
  }

  private ValueExpression _value;
  final public void setValue(ValueExpression value)
  {
    _value = value;
  }

  private MethodExpression _chartDrillDownListener;
  final public void setChartDrillDownListener(MethodExpression chartDrillDownListener)
  {
    _chartDrillDownListener = chartDrillDownListener;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setProperty(bean, UIXChart.VALUE_KEY, _value);
    bean.setProperty(UIXChart.CHART_DRILL_DOWN_LISTENER_KEY, _chartDrillDownListener);
  }

  @Override
  public void release()
  {
    super.release();
    _value = null;
    _chartDrillDownListener = null;
  }
}
