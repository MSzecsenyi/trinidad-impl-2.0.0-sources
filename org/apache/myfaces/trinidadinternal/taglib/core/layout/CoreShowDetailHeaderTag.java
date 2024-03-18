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
import org.apache.myfaces.trinidad.component.core.layout.CoreShowDetailHeader;
import org.apache.myfaces.trinidadinternal.taglib.UIXShowDetailTag;

/**
 * Auto-generated tag class.
 */
public class CoreShowDetailHeaderTag extends UIXShowDetailTag
{

  /**
   * Construct an instance of the CoreShowDetailHeaderTag.
   */
  public CoreShowDetailHeaderTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CoreShowDetailHeader";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.Header";
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

  private ValueExpression _icon;
  final public void setIcon(ValueExpression icon)
  {
    _icon = icon;
  }

  private ValueExpression _messageType;
  final public void setMessageType(ValueExpression messageType)
  {
    _messageType = messageType;
  }

  private ValueExpression _size;
  final public void setSize(ValueExpression size)
  {
    _size = size;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setStringArrayProperty(bean, CoreShowDetailHeader.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, CoreShowDetailHeader.SIZE_KEY, _size);
    setProperty(bean, CoreShowDetailHeader.ONDBLCLICK_KEY, _ondblclick);
    setProperty(bean, CoreShowDetailHeader.TEXT_KEY, _text);
    setProperty(bean, CoreShowDetailHeader.ONMOUSEOVER_KEY, _onmouseover);
    setProperty(bean, CoreShowDetailHeader.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, CoreShowDetailHeader.ONMOUSEDOWN_KEY, _onmousedown);
    setProperty(bean, CoreShowDetailHeader.ONMOUSEOUT_KEY, _onmouseout);
    setProperty(bean, CoreShowDetailHeader.ONKEYPRESS_KEY, _onkeypress);
    setProperty(bean, CoreShowDetailHeader.MESSAGE_TYPE_KEY, _messageType);
    setProperty(bean, CoreShowDetailHeader.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, CoreShowDetailHeader.ONMOUSEMOVE_KEY, _onmousemove);
    setProperty(bean, CoreShowDetailHeader.ONCLICK_KEY, _onclick);
    setProperty(bean, CoreShowDetailHeader.ONMOUSEUP_KEY, _onmouseup);
    setProperty(bean, CoreShowDetailHeader.ONKEYDOWN_KEY, _onkeydown);
    setProperty(bean, CoreShowDetailHeader.ICON_KEY, _icon);
    setProperty(bean, CoreShowDetailHeader.ONKEYUP_KEY, _onkeyup);
    setProperty(bean, CoreShowDetailHeader.SHORT_DESC_KEY, _shortDesc);
  }

  @Override
  public void release()
  {
    super.release();
    _partialTriggers = null;
    _size = null;
    _ondblclick = null;
    _text = null;
    _onmouseover = null;
    _inlineStyle = null;
    _onmousedown = null;
    _onmouseout = null;
    _onkeypress = null;
    _messageType = null;
    _styleClass = null;
    _onmousemove = null;
    _onclick = null;
    _onmouseup = null;
    _onkeydown = null;
    _icon = null;
    _onkeyup = null;
    _shortDesc = null;
  }
}
