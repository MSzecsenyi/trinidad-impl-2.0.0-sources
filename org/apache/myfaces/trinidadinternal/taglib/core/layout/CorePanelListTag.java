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
package org.apache.myfaces.trinidadinternal.taglib.core.layout;

import javax.el.ValueExpression;
import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.component.core.layout.CorePanelList;
import org.apache.myfaces.trinidadinternal.taglib.UIXPanelTag;

/**
 * Auto-generated tag class.
 */
public class CorePanelListTag extends UIXPanelTag
{

  /**
   * Construct an instance of the CorePanelListTag.
   */
  public CorePanelListTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CorePanelList";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.List";
  }

  private ValueExpression _listStyle;
  final public void setListStyle(ValueExpression listStyle)
  {
    _listStyle = listStyle;
  }

  private ValueExpression _rows;
  final public void setRows(ValueExpression rows)
  {
    _rows = rows;
  }

  private ValueExpression _maxColumns;
  final public void setMaxColumns(ValueExpression maxColumns)
  {
    _maxColumns = maxColumns;
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

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setProperty(bean, CorePanelList.ONDBLCLICK_KEY, _ondblclick);
    setProperty(bean, CorePanelList.ONKEYDOWN_KEY, _onkeydown);
    setStringArrayProperty(bean, CorePanelList.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, CorePanelList.ONMOUSEUP_KEY, _onmouseup);
    setProperty(bean, CorePanelList.ONMOUSEMOVE_KEY, _onmousemove);
    setProperty(bean, CorePanelList.ONMOUSEOVER_KEY, _onmouseover);
    setProperty(bean, CorePanelList.ONMOUSEDOWN_KEY, _onmousedown);
    setProperty(bean, CorePanelList.ONMOUSEOUT_KEY, _onmouseout);
    setProperty(bean, CorePanelList.LIST_STYLE_KEY, _listStyle);
    setProperty(bean, CorePanelList.SHORT_DESC_KEY, _shortDesc);
    setProperty(bean, CorePanelList.MAX_COLUMNS_KEY, _maxColumns);
    setProperty(bean, CorePanelList.ONKEYUP_KEY, _onkeyup);
    setProperty(bean, CorePanelList.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, CorePanelList.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, CorePanelList.ONKEYPRESS_KEY, _onkeypress);
    setProperty(bean, CorePanelList.ROWS_KEY, _rows);
    setProperty(bean, CorePanelList.ONCLICK_KEY, _onclick);
  }

  @Override
  public void release()
  {
    super.release();
    _ondblclick = null;
    _onkeydown = null;
    _partialTriggers = null;
    _onmouseup = null;
    _onmousemove = null;
    _onmouseover = null;
    _onmousedown = null;
    _onmouseout = null;
    _listStyle = null;
    _shortDesc = null;
    _maxColumns = null;
    _onkeyup = null;
    _inlineStyle = null;
    _styleClass = null;
    _onkeypress = null;
    _rows = null;
    _onclick = null;
  }
}
