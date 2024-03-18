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
import org.apache.myfaces.trinidad.component.core.data.CoreTreeTable;
import org.apache.myfaces.trinidadinternal.taglib.UIXTreeTableTag;

/**
 * Auto-generated tag class.
 */
public class CoreTreeTableTag extends UIXTreeTableTag
{

  /**
   * Construct an instance of the CoreTreeTableTag.
   */
  public CoreTreeTableTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CoreTreeTable";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.TreeTable";
  }

  private ValueExpression _horizontalGridVisible;
  final public void setHorizontalGridVisible(ValueExpression horizontalGridVisible)
  {
    _horizontalGridVisible = horizontalGridVisible;
  }

  private ValueExpression _verticalGridVisible;
  final public void setVerticalGridVisible(ValueExpression verticalGridVisible)
  {
    _verticalGridVisible = verticalGridVisible;
  }

  private ValueExpression _emptyText;
  final public void setEmptyText(ValueExpression emptyText)
  {
    _emptyText = emptyText;
  }

  private ValueExpression _columnBandingInterval;
  final public void setColumnBandingInterval(ValueExpression columnBandingInterval)
  {
    _columnBandingInterval = columnBandingInterval;
  }

  private ValueExpression _rowBandingInterval;
  final public void setRowBandingInterval(ValueExpression rowBandingInterval)
  {
    _rowBandingInterval = rowBandingInterval;
  }

  private ValueExpression _rowSelection;
  final public void setRowSelection(ValueExpression rowSelection)
  {
    _rowSelection = rowSelection;
  }

  private ValueExpression _autoSubmit;
  final public void setAutoSubmit(ValueExpression autoSubmit)
  {
    _autoSubmit = autoSubmit;
  }

  private ValueExpression _width;
  final public void setWidth(ValueExpression width)
  {
    _width = width;
  }

  private ValueExpression _summary;
  final public void setSummary(ValueExpression summary)
  {
    _summary = summary;
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

  private ValueExpression _onclick;
  final public void setOnclick(ValueExpression onclick)
  {
    _onclick = onclick;
  }

  private ValueExpression _ondblclick;
  final public void setOndblclick(ValueExpression ondblclick)
  {
    _ondblclick = ondblclick;
  }

  private ValueExpression _onmousedown;
  final public void setOnmousedown(ValueExpression onmousedown)
  {
    _onmousedown = onmousedown;
  }

  private ValueExpression _onmouseup;
  final public void setOnmouseup(ValueExpression onmouseup)
  {
    _onmouseup = onmouseup;
  }

  private ValueExpression _onmouseover;
  final public void setOnmouseover(ValueExpression onmouseover)
  {
    _onmouseover = onmouseover;
  }

  private ValueExpression _onmousemove;
  final public void setOnmousemove(ValueExpression onmousemove)
  {
    _onmousemove = onmousemove;
  }

  private ValueExpression _onmouseout;
  final public void setOnmouseout(ValueExpression onmouseout)
  {
    _onmouseout = onmouseout;
  }

  private ValueExpression _onkeypress;
  final public void setOnkeypress(ValueExpression onkeypress)
  {
    _onkeypress = onkeypress;
  }

  private ValueExpression _onkeydown;
  final public void setOnkeydown(ValueExpression onkeydown)
  {
    _onkeydown = onkeydown;
  }

  private ValueExpression _onkeyup;
  final public void setOnkeyup(ValueExpression onkeyup)
  {
    _onkeyup = onkeyup;
  }

  private ValueExpression _expandAllEnabled;
  final public void setExpandAllEnabled(ValueExpression expandAllEnabled)
  {
    _expandAllEnabled = expandAllEnabled;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setProperty(bean, CoreTreeTable.ONCLICK_KEY, _onclick);
    setProperty(bean, CoreTreeTable.SHORT_DESC_KEY, _shortDesc);
    setProperty(bean, CoreTreeTable.ONDBLCLICK_KEY, _ondblclick);
    setProperty(bean, CoreTreeTable.ONMOUSEOVER_KEY, _onmouseover);
    setProperty(bean, CoreTreeTable.VERTICAL_GRID_VISIBLE_KEY, _verticalGridVisible);
    setProperty(bean, CoreTreeTable.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, CoreTreeTable.ONMOUSEUP_KEY, _onmouseup);
    setProperty(bean, CoreTreeTable.ROW_SELECTION_KEY, _rowSelection);
    setProperty(bean, CoreTreeTable.ROW_BANDING_INTERVAL_KEY, _rowBandingInterval);
    setProperty(bean, CoreTreeTable.WIDTH_KEY, _width);
    setProperty(bean, CoreTreeTable.ONKEYPRESS_KEY, _onkeypress);
    setProperty(bean, CoreTreeTable.ONMOUSEMOVE_KEY, _onmousemove);
    setProperty(bean, CoreTreeTable.AUTO_SUBMIT_KEY, _autoSubmit);
    setProperty(bean, CoreTreeTable.ONMOUSEDOWN_KEY, _onmousedown);
    setProperty(bean, CoreTreeTable.HORIZONTAL_GRID_VISIBLE_KEY, _horizontalGridVisible);
    setProperty(bean, CoreTreeTable.ONKEYUP_KEY, _onkeyup);
    setProperty(bean, CoreTreeTable.EMPTY_TEXT_KEY, _emptyText);
    setProperty(bean, CoreTreeTable.COLUMN_BANDING_INTERVAL_KEY, _columnBandingInterval);
    setProperty(bean, CoreTreeTable.ONMOUSEOUT_KEY, _onmouseout);
    setProperty(bean, CoreTreeTable.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, CoreTreeTable.EXPAND_ALL_ENABLED_KEY, _expandAllEnabled);
    setStringArrayProperty(bean, CoreTreeTable.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, CoreTreeTable.SUMMARY_KEY, _summary);
    setProperty(bean, CoreTreeTable.ONKEYDOWN_KEY, _onkeydown);
  }

  @Override
  public void release()
  {
    super.release();
    _onclick = null;
    _shortDesc = null;
    _ondblclick = null;
    _onmouseover = null;
    _verticalGridVisible = null;
    _styleClass = null;
    _onmouseup = null;
    _rowSelection = null;
    _rowBandingInterval = null;
    _width = null;
    _onkeypress = null;
    _onmousemove = null;
    _autoSubmit = null;
    _onmousedown = null;
    _horizontalGridVisible = null;
    _onkeyup = null;
    _emptyText = null;
    _columnBandingInterval = null;
    _onmouseout = null;
    _inlineStyle = null;
    _expandAllEnabled = null;
    _partialTriggers = null;
    _summary = null;
    _onkeydown = null;
  }
}
