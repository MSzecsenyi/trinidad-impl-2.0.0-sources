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
import org.apache.myfaces.trinidad.component.core.layout.CorePanelTabbed;
import org.apache.myfaces.trinidadinternal.taglib.UIXShowOneTag;

/**
 * Auto-generated tag class.
 */
public class CorePanelTabbedTag extends UIXShowOneTag
{

  /**
   * Construct an instance of the CorePanelTabbedTag.
   */
  public CorePanelTabbedTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CorePanelTabbed";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.Tab";
  }

  private ValueExpression _position;
  final public void setPosition(ValueExpression position)
  {
    _position = position;
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
    setProperty(bean, CorePanelTabbed.ONMOUSEUP_KEY, _onmouseup);
    setStringArrayProperty(bean, CorePanelTabbed.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, CorePanelTabbed.POSITION_KEY, _position);
    setProperty(bean, CorePanelTabbed.SHORT_DESC_KEY, _shortDesc);
    setProperty(bean, CorePanelTabbed.ONMOUSEOVER_KEY, _onmouseover);
    setProperty(bean, CorePanelTabbed.ONCLICK_KEY, _onclick);
    setProperty(bean, CorePanelTabbed.ONMOUSEMOVE_KEY, _onmousemove);
    setProperty(bean, CorePanelTabbed.ONMOUSEOUT_KEY, _onmouseout);
    setProperty(bean, CorePanelTabbed.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, CorePanelTabbed.ONDBLCLICK_KEY, _ondblclick);
    setProperty(bean, CorePanelTabbed.ONKEYDOWN_KEY, _onkeydown);
    setProperty(bean, CorePanelTabbed.ONMOUSEDOWN_KEY, _onmousedown);
    setProperty(bean, CorePanelTabbed.ONKEYUP_KEY, _onkeyup);
    setProperty(bean, CorePanelTabbed.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, CorePanelTabbed.ONKEYPRESS_KEY, _onkeypress);
  }

  @Override
  public void release()
  {
    super.release();
    _onmouseup = null;
    _partialTriggers = null;
    _position = null;
    _shortDesc = null;
    _onmouseover = null;
    _onclick = null;
    _onmousemove = null;
    _onmouseout = null;
    _inlineStyle = null;
    _ondblclick = null;
    _onkeydown = null;
    _onmousedown = null;
    _onkeyup = null;
    _styleClass = null;
    _onkeypress = null;
  }
}
