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
import org.apache.myfaces.trinidad.component.core.layout.CorePanelBox;
import org.apache.myfaces.trinidadinternal.taglib.UIXPanelTag;

/**
 * Auto-generated tag class.
 */
public class CorePanelBoxTag extends UIXPanelTag
{

  /**
   * Construct an instance of the CorePanelBoxTag.
   */
  public CorePanelBoxTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CorePanelBox";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.Box";
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

  private ValueExpression _text;
  final public void setText(ValueExpression text)
  {
    _text = text;
  }

  private ValueExpression _background;
  final public void setBackground(ValueExpression background)
  {
    _background = background;
  }

  private ValueExpression _icon;
  final public void setIcon(ValueExpression icon)
  {
    _icon = icon;
  }

  private ValueExpression _contentStyle;
  final public void setContentStyle(ValueExpression contentStyle)
  {
    _contentStyle = contentStyle;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setProperty(bean, CorePanelBox.ONMOUSEOVER_KEY, _onmouseover);
    setProperty(bean, CorePanelBox.ONKEYUP_KEY, _onkeyup);
    setStringArrayProperty(bean, CorePanelBox.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, CorePanelBox.TEXT_KEY, _text);
    setProperty(bean, CorePanelBox.BACKGROUND_KEY, _background);
    setProperty(bean, CorePanelBox.ONMOUSEOUT_KEY, _onmouseout);
    setProperty(bean, CorePanelBox.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, CorePanelBox.ONKEYDOWN_KEY, _onkeydown);
    setProperty(bean, CorePanelBox.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, CorePanelBox.ONDBLCLICK_KEY, _ondblclick);
    setProperty(bean, CorePanelBox.ONMOUSEMOVE_KEY, _onmousemove);
    setProperty(bean, CorePanelBox.SHORT_DESC_KEY, _shortDesc);
    setProperty(bean, CorePanelBox.ONMOUSEDOWN_KEY, _onmousedown);
    setProperty(bean, CorePanelBox.ONMOUSEUP_KEY, _onmouseup);
    setProperty(bean, CorePanelBox.CONTENT_STYLE_KEY, _contentStyle);
    setProperty(bean, CorePanelBox.ICON_KEY, _icon);
    setProperty(bean, CorePanelBox.ONCLICK_KEY, _onclick);
    setProperty(bean, CorePanelBox.ONKEYPRESS_KEY, _onkeypress);
  }

  @Override
  public void release()
  {
    super.release();
    _onmouseover = null;
    _onkeyup = null;
    _partialTriggers = null;
    _text = null;
    _background = null;
    _onmouseout = null;
    _styleClass = null;
    _onkeydown = null;
    _inlineStyle = null;
    _ondblclick = null;
    _onmousemove = null;
    _shortDesc = null;
    _onmousedown = null;
    _onmouseup = null;
    _contentStyle = null;
    _icon = null;
    _onclick = null;
    _onkeypress = null;
  }
}
