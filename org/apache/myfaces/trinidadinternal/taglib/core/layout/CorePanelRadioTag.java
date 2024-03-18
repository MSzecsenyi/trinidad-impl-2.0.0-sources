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
import org.apache.myfaces.trinidad.component.core.layout.CorePanelRadio;
import org.apache.myfaces.trinidadinternal.taglib.UIXShowOneTag;

/**
 * Auto-generated tag class.
 */
public class CorePanelRadioTag extends UIXShowOneTag
{

  /**
   * Construct an instance of the CorePanelRadioTag.
   */
  public CorePanelRadioTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CorePanelRadio";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.Radio";
  }

  private ValueExpression _label;
  final public void setLabel(ValueExpression label)
  {
    _label = label;
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

  private ValueExpression _position;
  final public void setPosition(ValueExpression position)
  {
    _position = position;
  }

  private ValueExpression _alignment;
  final public void setAlignment(ValueExpression alignment)
  {
    _alignment = alignment;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setProperty(bean, CorePanelRadio.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, CorePanelRadio.ONMOUSEOVER_KEY, _onmouseover);
    setProperty(bean, CorePanelRadio.ONMOUSEMOVE_KEY, _onmousemove);
    setProperty(bean, CorePanelRadio.ONKEYDOWN_KEY, _onkeydown);
    setProperty(bean, CorePanelRadio.SHORT_DESC_KEY, _shortDesc);
    setProperty(bean, CorePanelRadio.ONKEYUP_KEY, _onkeyup);
    setProperty(bean, CorePanelRadio.ONMOUSEOUT_KEY, _onmouseout);
    setProperty(bean, CorePanelRadio.ONKEYPRESS_KEY, _onkeypress);
    setProperty(bean, CorePanelRadio.ONDBLCLICK_KEY, _ondblclick);
    setProperty(bean, CorePanelRadio.POSITION_KEY, _position);
    setProperty(bean, CorePanelRadio.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, CorePanelRadio.ONCLICK_KEY, _onclick);
    setProperty(bean, CorePanelRadio.ONMOUSEUP_KEY, _onmouseup);
    setStringArrayProperty(bean, CorePanelRadio.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, CorePanelRadio.LABEL_KEY, _label);
    setProperty(bean, CorePanelRadio.ONMOUSEDOWN_KEY, _onmousedown);
    setProperty(bean, CorePanelRadio.ALIGNMENT_KEY, _alignment);
  }

  @Override
  public void release()
  {
    super.release();
    _inlineStyle = null;
    _onmouseover = null;
    _onmousemove = null;
    _onkeydown = null;
    _shortDesc = null;
    _onkeyup = null;
    _onmouseout = null;
    _onkeypress = null;
    _ondblclick = null;
    _position = null;
    _styleClass = null;
    _onclick = null;
    _onmouseup = null;
    _partialTriggers = null;
    _label = null;
    _onmousedown = null;
    _alignment = null;
  }
}
