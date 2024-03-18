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
package org.apache.myfaces.trinidadinternal.taglib.core.data;

import javax.el.ValueExpression;
import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.component.core.data.CoreChart;
import org.apache.myfaces.trinidadinternal.taglib.UIXChartTag;

/**
 * Auto-generated tag class.
 */
public class CoreChartTag extends UIXChartTag
{

  /**
   * Construct an instance of the CoreChartTag.
   */
  public CoreChartTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CoreChart";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.Chart";
  }

  private ValueExpression _inlineStyle;
  final public void setInlineStyle(ValueExpression inlineStyle)
  {
    _inlineStyle = inlineStyle;
  }

  private ValueExpression _styleClass;
  final public void setStyleClass(ValueExpression styleClass)
  {
    _styleClass = styleClass;
  }

  private ValueExpression _shortDesc;
  final public void setShortDesc(ValueExpression shortDesc)
  {
    _shortDesc = shortDesc;
  }

  private ValueExpression _partialTriggers;
  final public void setPartialTriggers(ValueExpression partialTriggers)
  {
    _partialTriggers = partialTriggers;
  }

  private ValueExpression _type;
  final public void setType(ValueExpression type)
  {
    _type = type;
  }

  private ValueExpression _templateSource;
  final public void setTemplateSource(ValueExpression templateSource)
  {
    _templateSource = templateSource;
  }

  private ValueExpression _perspective;
  final public void setPerspective(ValueExpression perspective)
  {
    _perspective = perspective;
  }

  private ValueExpression _legendPosition;
  final public void setLegendPosition(ValueExpression legendPosition)
  {
    _legendPosition = legendPosition;
  }

  private ValueExpression _animationDuration;
  final public void setAnimationDuration(ValueExpression animationDuration)
  {
    _animationDuration = animationDuration;
  }

  private ValueExpression _YMajorGridLineCount;
  final public void setYMajorGridLineCount(ValueExpression YMajorGridLineCount)
  {
    _YMajorGridLineCount = YMajorGridLineCount;
  }

  private ValueExpression _YMinorGridLineCount;
  final public void setYMinorGridLineCount(ValueExpression YMinorGridLineCount)
  {
    _YMinorGridLineCount = YMinorGridLineCount;
  }

  private ValueExpression _XMajorGridLineCount;
  final public void setXMajorGridLineCount(ValueExpression XMajorGridLineCount)
  {
    _XMajorGridLineCount = XMajorGridLineCount;
  }

  private ValueExpression _maxPrecision;
  final public void setMaxPrecision(ValueExpression maxPrecision)
  {
    _maxPrecision = maxPrecision;
  }

  private ValueExpression _gradientsUsed;
  final public void setGradientsUsed(ValueExpression gradientsUsed)
  {
    _gradientsUsed = gradientsUsed;
  }

  private ValueExpression _tooltipsVisible;
  final public void setTooltipsVisible(ValueExpression tooltipsVisible)
  {
    _tooltipsVisible = tooltipsVisible;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setProperty(bean, CoreChart.LEGEND_POSITION_KEY, _legendPosition);
    setProperty(bean, CoreChart.ANIMATION_DURATION_KEY, _animationDuration);
    setProperty(bean, CoreChart.MAX_PRECISION_KEY, _maxPrecision);
    setProperty(bean, CoreChart.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, CoreChart.TEMPLATE_SOURCE_KEY, _templateSource);
    setProperty(bean, CoreChart.SHORT_DESC_KEY, _shortDesc);
    setProperty(bean, CoreChart.TYPE_KEY, _type);
    setProperty(bean, CoreChart.PERSPECTIVE_KEY, _perspective);
    setProperty(bean, CoreChart.YMINOR_GRID_LINE_COUNT_KEY, _YMinorGridLineCount);
    setProperty(bean, CoreChart.YMAJOR_GRID_LINE_COUNT_KEY, _YMajorGridLineCount);
    setStringArrayProperty(bean, CoreChart.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, CoreChart.GRADIENTS_USED_KEY, _gradientsUsed);
    setProperty(bean, CoreChart.XMAJOR_GRID_LINE_COUNT_KEY, _XMajorGridLineCount);
    setProperty(bean, CoreChart.TOOLTIPS_VISIBLE_KEY, _tooltipsVisible);
    setProperty(bean, CoreChart.STYLE_CLASS_KEY, _styleClass);
  }

  @Override
  public void release()
  {
    super.release();
    _legendPosition = null;
    _animationDuration = null;
    _maxPrecision = null;
    _inlineStyle = null;
    _templateSource = null;
    _shortDesc = null;
    _type = null;
    _perspective = null;
    _YMinorGridLineCount = null;
    _YMajorGridLineCount = null;
    _partialTriggers = null;
    _gradientsUsed = null;
    _XMajorGridLineCount = null;
    _tooltipsVisible = null;
    _styleClass = null;
  }
}
