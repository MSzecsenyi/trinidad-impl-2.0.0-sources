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
import org.apache.myfaces.trinidad.component.core.data.CoreColumn;
import org.apache.myfaces.trinidadinternal.taglib.UIXColumnTag;

/**
 * Auto-generated tag class.
 */
public class CoreColumnTag extends UIXColumnTag
{

  /**
   * Construct an instance of the CoreColumnTag.
   */
  public CoreColumnTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CoreColumn";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.Column";
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

  private ValueExpression _align;
  final public void setAlign(ValueExpression align)
  {
    _align = align;
  }

  private ValueExpression _defaultSortOrder;
  final public void setDefaultSortOrder(ValueExpression defaultSortOrder)
  {
    _defaultSortOrder = defaultSortOrder;
  }

  private ValueExpression _width;
  final public void setWidth(ValueExpression width)
  {
    _width = width;
  }

  private ValueExpression _headerText;
  final public void setHeaderText(ValueExpression headerText)
  {
    _headerText = headerText;
  }

  private ValueExpression _noWrap;
  final public void setNoWrap(ValueExpression noWrap)
  {
    _noWrap = noWrap;
  }

  private ValueExpression _headerNoWrap;
  final public void setHeaderNoWrap(ValueExpression headerNoWrap)
  {
    _headerNoWrap = headerNoWrap;
  }

  private ValueExpression _sortable;
  final public void setSortable(ValueExpression sortable)
  {
    _sortable = sortable;
  }

  private ValueExpression _separateRows;
  final public void setSeparateRows(ValueExpression separateRows)
  {
    _separateRows = separateRows;
  }

  private ValueExpression _rowHeader;
  final public void setRowHeader(ValueExpression rowHeader)
  {
    _rowHeader = rowHeader;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setProperty(bean, CoreColumn.ONKEYUP_KEY, _onkeyup);
    setProperty(bean, CoreColumn.ONDBLCLICK_KEY, _ondblclick);
    setProperty(bean, CoreColumn.DEFAULT_SORT_ORDER_KEY, _defaultSortOrder);
    setProperty(bean, CoreColumn.ONMOUSEOVER_KEY, _onmouseover);
    setStringArrayProperty(bean, CoreColumn.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, CoreColumn.SORTABLE_KEY, _sortable);
    setProperty(bean, CoreColumn.WIDTH_KEY, _width);
    setProperty(bean, CoreColumn.ALIGN_KEY, _align);
    setProperty(bean, CoreColumn.ONMOUSEOUT_KEY, _onmouseout);
    setProperty(bean, CoreColumn.ONMOUSEDOWN_KEY, _onmousedown);
    setProperty(bean, CoreColumn.HEADER_NO_WRAP_KEY, _headerNoWrap);
    setProperty(bean, CoreColumn.ONMOUSEUP_KEY, _onmouseup);
    setProperty(bean, CoreColumn.ROW_HEADER_KEY, _rowHeader);
    setProperty(bean, CoreColumn.NO_WRAP_KEY, _noWrap);
    setProperty(bean, CoreColumn.ONKEYPRESS_KEY, _onkeypress);
    setProperty(bean, CoreColumn.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, CoreColumn.SHORT_DESC_KEY, _shortDesc);
    setProperty(bean, CoreColumn.ONKEYDOWN_KEY, _onkeydown);
    setProperty(bean, CoreColumn.SEPARATE_ROWS_KEY, _separateRows);
    setProperty(bean, CoreColumn.ONCLICK_KEY, _onclick);
    setProperty(bean, CoreColumn.HEADER_TEXT_KEY, _headerText);
    setProperty(bean, CoreColumn.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, CoreColumn.ONMOUSEMOVE_KEY, _onmousemove);
  }

  @Override
  public void release()
  {
    super.release();
    _onkeyup = null;
    _ondblclick = null;
    _defaultSortOrder = null;
    _onmouseover = null;
    _partialTriggers = null;
    _sortable = null;
    _width = null;
    _align = null;
    _onmouseout = null;
    _onmousedown = null;
    _headerNoWrap = null;
    _onmouseup = null;
    _rowHeader = null;
    _noWrap = null;
    _onkeypress = null;
    _inlineStyle = null;
    _shortDesc = null;
    _onkeydown = null;
    _separateRows = null;
    _onclick = null;
    _headerText = null;
    _styleClass = null;
    _onmousemove = null;
  }
}
