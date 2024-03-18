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
import org.apache.myfaces.trinidad.component.core.layout.CorePanelPopup;
import org.apache.myfaces.trinidadinternal.taglib.UIXPanelTag;

/**
 * Auto-generated tag class.
 */
public class CorePanelPopupTag extends UIXPanelTag
{

  /**
   * Construct an instance of the CorePanelPopupTag.
   */
  public CorePanelPopupTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CorePanelPopup";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.Popup";
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

  private ValueExpression _triggerType;
  final public void setTriggerType(ValueExpression triggerType)
  {
    _triggerType = triggerType;
  }

  private ValueExpression _icon;
  final public void setIcon(ValueExpression icon)
  {
    _icon = icon;
  }

  private ValueExpression _text;
  final public void setText(ValueExpression text)
  {
    _text = text;
  }

  private ValueExpression _title;
  final public void setTitle(ValueExpression title)
  {
    _title = title;
  }

  private ValueExpression _modal;
  final public void setModal(ValueExpression modal)
  {
    _modal = modal;
  }

  private ValueExpression _position;
  final public void setPosition(ValueExpression position)
  {
    _position = position;
  }

  private ValueExpression _xoffset;
  final public void setXoffset(ValueExpression xoffset)
  {
    _xoffset = xoffset;
  }

  private ValueExpression _yoffset;
  final public void setYoffset(ValueExpression yoffset)
  {
    _yoffset = yoffset;
  }

  private ValueExpression _contentStyle;
  final public void setContentStyle(ValueExpression contentStyle)
  {
    _contentStyle = contentStyle;
  }

  private ValueExpression _width;
  final public void setWidth(ValueExpression width)
  {
    _width = width;
  }

  private ValueExpression _height;
  final public void setHeight(ValueExpression height)
  {
    _height = height;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setProperty(bean, CorePanelPopup.ONMOUSEMOVE_KEY, _onmousemove);
    setStringArrayProperty(bean, CorePanelPopup.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, CorePanelPopup.XOFFSET_KEY, _xoffset);
    setProperty(bean, CorePanelPopup.HEIGHT_KEY, _height);
    setProperty(bean, CorePanelPopup.ONDBLCLICK_KEY, _ondblclick);
    setProperty(bean, CorePanelPopup.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, CorePanelPopup.TRIGGER_TYPE_KEY, _triggerType);
    setProperty(bean, CorePanelPopup.MODAL_KEY, _modal);
    setProperty(bean, CorePanelPopup.WIDTH_KEY, _width);
    setProperty(bean, CorePanelPopup.ONMOUSEDOWN_KEY, _onmousedown);
    setProperty(bean, CorePanelPopup.YOFFSET_KEY, _yoffset);
    setProperty(bean, CorePanelPopup.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, CorePanelPopup.TITLE_KEY, _title);
    setProperty(bean, CorePanelPopup.ONMOUSEOVER_KEY, _onmouseover);
    setProperty(bean, CorePanelPopup.ONCLICK_KEY, _onclick);
    setProperty(bean, CorePanelPopup.ONKEYPRESS_KEY, _onkeypress);
    setProperty(bean, CorePanelPopup.SHORT_DESC_KEY, _shortDesc);
    setProperty(bean, CorePanelPopup.ONMOUSEUP_KEY, _onmouseup);
    setProperty(bean, CorePanelPopup.ONMOUSEOUT_KEY, _onmouseout);
    setProperty(bean, CorePanelPopup.ONKEYDOWN_KEY, _onkeydown);
    setProperty(bean, CorePanelPopup.CONTENT_STYLE_KEY, _contentStyle);
    setProperty(bean, CorePanelPopup.TEXT_KEY, _text);
    setProperty(bean, CorePanelPopup.ICON_KEY, _icon);
    setProperty(bean, CorePanelPopup.POSITION_KEY, _position);
    setProperty(bean, CorePanelPopup.ONKEYUP_KEY, _onkeyup);
  }

  @Override
  public void release()
  {
    super.release();
    _onmousemove = null;
    _partialTriggers = null;
    _xoffset = null;
    _height = null;
    _ondblclick = null;
    _inlineStyle = null;
    _triggerType = null;
    _modal = null;
    _width = null;
    _onmousedown = null;
    _yoffset = null;
    _styleClass = null;
    _title = null;
    _onmouseover = null;
    _onclick = null;
    _onkeypress = null;
    _shortDesc = null;
    _onmouseup = null;
    _onmouseout = null;
    _onkeydown = null;
    _contentStyle = null;
    _text = null;
    _icon = null;
    _position = null;
    _onkeyup = null;
  }
}
