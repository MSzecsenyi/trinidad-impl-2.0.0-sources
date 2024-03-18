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
import org.apache.myfaces.trinidad.component.core.data.CoreTable;
import org.apache.myfaces.trinidadinternal.taglib.UIXTableTag;

/**
 * Auto-generated tag class.
 */
public class CoreTableTag extends UIXTableTag
{

  /**
   * Construct an instance of the CoreTableTag.
   */
  public CoreTableTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CoreTable";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.Table";
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

  private ValueExpression _allDetailsEnabled;
  final public void setAllDetailsEnabled(ValueExpression allDetailsEnabled)
  {
    _allDetailsEnabled = allDetailsEnabled;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setProperty(bean, CoreTable.ONMOUSEUP_KEY, _onmouseup);
    setProperty(bean, CoreTable.HORIZONTAL_GRID_VISIBLE_KEY, _horizontalGridVisible);
    setProperty(bean, CoreTable.ONKEYDOWN_KEY, _onkeydown);
    setProperty(bean, CoreTable.ONMOUSEMOVE_KEY, _onmousemove);
    setProperty(bean, CoreTable.COLUMN_BANDING_INTERVAL_KEY, _columnBandingInterval);
    setProperty(bean, CoreTable.ONMOUSEDOWN_KEY, _onmousedown);
    setProperty(bean, CoreTable.VERTICAL_GRID_VISIBLE_KEY, _verticalGridVisible);
    setProperty(bean, CoreTable.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, CoreTable.ONDBLCLICK_KEY, _ondblclick);
    setProperty(bean, CoreTable.ALL_DETAILS_ENABLED_KEY, _allDetailsEnabled);
    setProperty(bean, CoreTable.ROW_SELECTION_KEY, _rowSelection);
    setProperty(bean, CoreTable.ROW_BANDING_INTERVAL_KEY, _rowBandingInterval);
    setProperty(bean, CoreTable.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, CoreTable.ONMOUSEOVER_KEY, _onmouseover);
    setProperty(bean, CoreTable.ONCLICK_KEY, _onclick);
    setProperty(bean, CoreTable.EMPTY_TEXT_KEY, _emptyText);
    setProperty(bean, CoreTable.AUTO_SUBMIT_KEY, _autoSubmit);
    setProperty(bean, CoreTable.SUMMARY_KEY, _summary);
    setStringArrayProperty(bean, CoreTable.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, CoreTable.ONMOUSEOUT_KEY, _onmouseout);
    setProperty(bean, CoreTable.WIDTH_KEY, _width);
    setProperty(bean, CoreTable.ONKEYPRESS_KEY, _onkeypress);
    setProperty(bean, CoreTable.SHORT_DESC_KEY, _shortDesc);
    setProperty(bean, CoreTable.ONKEYUP_KEY, _onkeyup);
  }

  @Override
  public void release()
  {
    super.release();
    _onmouseup = null;
    _horizontalGridVisible = null;
    _onkeydown = null;
    _onmousemove = null;
    _columnBandingInterval = null;
    _onmousedown = null;
    _verticalGridVisible = null;
    _styleClass = null;
    _ondblclick = null;
    _allDetailsEnabled = null;
    _rowSelection = null;
    _rowBandingInterval = null;
    _inlineStyle = null;
    _onmouseover = null;
    _onclick = null;
    _emptyText = null;
    _autoSubmit = null;
    _summary = null;
    _partialTriggers = null;
    _onmouseout = null;
    _width = null;
    _onkeypress = null;
    _shortDesc = null;
    _onkeyup = null;
  }
}
