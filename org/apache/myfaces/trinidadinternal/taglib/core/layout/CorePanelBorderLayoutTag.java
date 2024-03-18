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
import org.apache.myfaces.trinidad.component.core.layout.CorePanelBorderLayout;
import org.apache.myfaces.trinidadinternal.taglib.UIXPanelTag;

/**
 * Auto-generated tag class.
 */
public class CorePanelBorderLayoutTag extends UIXPanelTag
{

  /**
   * Construct an instance of the CorePanelBorderLayoutTag.
   */
  public CorePanelBorderLayoutTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CorePanelBorderLayout";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.BorderLayout";
  }

  private ValueExpression _layout;
  final public void setLayout(ValueExpression layout)
  {
    _layout = layout;
  }

  private ValueExpression _topHeight;
  final public void setTopHeight(ValueExpression topHeight)
  {
    _topHeight = topHeight;
  }

  private ValueExpression _bottomHeight;
  final public void setBottomHeight(ValueExpression bottomHeight)
  {
    _bottomHeight = bottomHeight;
  }

  private ValueExpression _innerTopHeight;
  final public void setInnerTopHeight(ValueExpression innerTopHeight)
  {
    _innerTopHeight = innerTopHeight;
  }

  private ValueExpression _innerBottomHeight;
  final public void setInnerBottomHeight(ValueExpression innerBottomHeight)
  {
    _innerBottomHeight = innerBottomHeight;
  }

  private ValueExpression _startWidth;
  final public void setStartWidth(ValueExpression startWidth)
  {
    _startWidth = startWidth;
  }

  private ValueExpression _endWidth;
  final public void setEndWidth(ValueExpression endWidth)
  {
    _endWidth = endWidth;
  }

  private ValueExpression _leftWidth;
  final public void setLeftWidth(ValueExpression leftWidth)
  {
    _leftWidth = leftWidth;
  }

  private ValueExpression _rightWidth;
  final public void setRightWidth(ValueExpression rightWidth)
  {
    _rightWidth = rightWidth;
  }

  private ValueExpression _innerStartWidth;
  final public void setInnerStartWidth(ValueExpression innerStartWidth)
  {
    _innerStartWidth = innerStartWidth;
  }

  private ValueExpression _innerEndWidth;
  final public void setInnerEndWidth(ValueExpression innerEndWidth)
  {
    _innerEndWidth = innerEndWidth;
  }

  private ValueExpression _innerLeftWidth;
  final public void setInnerLeftWidth(ValueExpression innerLeftWidth)
  {
    _innerLeftWidth = innerLeftWidth;
  }

  private ValueExpression _innerRightWidth;
  final public void setInnerRightWidth(ValueExpression innerRightWidth)
  {
    _innerRightWidth = innerRightWidth;
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
    setProperty(bean, CorePanelBorderLayout.ONCLICK_KEY, _onclick);
    setProperty(bean, CorePanelBorderLayout.ONMOUSEUP_KEY, _onmouseup);
    setProperty(bean, CorePanelBorderLayout.LAYOUT_KEY, _layout);
    setProperty(bean, CorePanelBorderLayout.INNER_TOP_HEIGHT_KEY, _innerTopHeight);
    setProperty(bean, CorePanelBorderLayout.ONKEYPRESS_KEY, _onkeypress);
    setProperty(bean, CorePanelBorderLayout.START_WIDTH_KEY, _startWidth);
    setProperty(bean, CorePanelBorderLayout.ONMOUSEDOWN_KEY, _onmousedown);
    setProperty(bean, CorePanelBorderLayout.ONKEYDOWN_KEY, _onkeydown);
    setProperty(bean, CorePanelBorderLayout.INNER_RIGHT_WIDTH_KEY, _innerRightWidth);
    setProperty(bean, CorePanelBorderLayout.LEFT_WIDTH_KEY, _leftWidth);
    setProperty(bean, CorePanelBorderLayout.ONKEYUP_KEY, _onkeyup);
    setProperty(bean, CorePanelBorderLayout.ONMOUSEOVER_KEY, _onmouseover);
    setProperty(bean, CorePanelBorderLayout.INNER_START_WIDTH_KEY, _innerStartWidth);
    setProperty(bean, CorePanelBorderLayout.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, CorePanelBorderLayout.ONMOUSEOUT_KEY, _onmouseout);
    setProperty(bean, CorePanelBorderLayout.INLINE_STYLE_KEY, _inlineStyle);
    setStringArrayProperty(bean, CorePanelBorderLayout.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, CorePanelBorderLayout.ONMOUSEMOVE_KEY, _onmousemove);
    setProperty(bean, CorePanelBorderLayout.INNER_LEFT_WIDTH_KEY, _innerLeftWidth);
    setProperty(bean, CorePanelBorderLayout.RIGHT_WIDTH_KEY, _rightWidth);
    setProperty(bean, CorePanelBorderLayout.END_WIDTH_KEY, _endWidth);
    setProperty(bean, CorePanelBorderLayout.INNER_END_WIDTH_KEY, _innerEndWidth);
    setProperty(bean, CorePanelBorderLayout.SHORT_DESC_KEY, _shortDesc);
    setProperty(bean, CorePanelBorderLayout.INNER_BOTTOM_HEIGHT_KEY, _innerBottomHeight);
    setProperty(bean, CorePanelBorderLayout.TOP_HEIGHT_KEY, _topHeight);
    setProperty(bean, CorePanelBorderLayout.ONDBLCLICK_KEY, _ondblclick);
    setProperty(bean, CorePanelBorderLayout.BOTTOM_HEIGHT_KEY, _bottomHeight);
  }

  @Override
  public void release()
  {
    super.release();
    _onclick = null;
    _onmouseup = null;
    _layout = null;
    _innerTopHeight = null;
    _onkeypress = null;
    _startWidth = null;
    _onmousedown = null;
    _onkeydown = null;
    _innerRightWidth = null;
    _leftWidth = null;
    _onkeyup = null;
    _onmouseover = null;
    _innerStartWidth = null;
    _styleClass = null;
    _onmouseout = null;
    _inlineStyle = null;
    _partialTriggers = null;
    _onmousemove = null;
    _innerLeftWidth = null;
    _rightWidth = null;
    _endWidth = null;
    _innerEndWidth = null;
    _shortDesc = null;
    _innerBottomHeight = null;
    _topHeight = null;
    _ondblclick = null;
    _bottomHeight = null;
  }
}
