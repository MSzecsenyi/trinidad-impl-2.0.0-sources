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
package org.apache.myfaces.trinidadinternal.taglib.html;

import javax.el.ValueExpression;
import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.component.html.HtmlRowLayout;
import org.apache.myfaces.trinidad.webapp.UIXComponentELTag;

/**
 * Auto-generated tag class.
 */
public class HtmlRowLayoutTag extends UIXComponentELTag
{

  /**
   * Construct an instance of the HtmlRowLayoutTag.
   */
  public HtmlRowLayoutTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.HtmlRowLayout";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.RowLayout";
  }

  private ValueExpression _halign;
  final public void setHalign(ValueExpression halign)
  {
    _halign = halign;
  }

  private ValueExpression _valign;
  final public void setValign(ValueExpression valign)
  {
    _valign = valign;
  }

  private ValueExpression _width;
  final public void setWidth(ValueExpression width)
  {
    _width = width;
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

  private ValueExpression _styleClass;
  final public void setStyleClass(ValueExpression styleClass)
  {
    _styleClass = styleClass;
  }

  private ValueExpression _inlineStyle;
  final public void setInlineStyle(ValueExpression inlineStyle)
  {
    _inlineStyle = inlineStyle;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setProperty(bean, HtmlRowLayout.ONKEYUP_KEY, _onkeyup);
    setProperty(bean, HtmlRowLayout.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, HtmlRowLayout.VALIGN_KEY, _valign);
    setProperty(bean, HtmlRowLayout.ONKEYDOWN_KEY, _onkeydown);
    setProperty(bean, HtmlRowLayout.ONCLICK_KEY, _onclick);
    setProperty(bean, HtmlRowLayout.HALIGN_KEY, _halign);
    setProperty(bean, HtmlRowLayout.ONMOUSEOUT_KEY, _onmouseout);
    setProperty(bean, HtmlRowLayout.ONKEYPRESS_KEY, _onkeypress);
    setProperty(bean, HtmlRowLayout.ONDBLCLICK_KEY, _ondblclick);
    setProperty(bean, HtmlRowLayout.ONMOUSEOVER_KEY, _onmouseover);
    setProperty(bean, HtmlRowLayout.SHORT_DESC_KEY, _shortDesc);
    setStringArrayProperty(bean, HtmlRowLayout.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, HtmlRowLayout.ONMOUSEMOVE_KEY, _onmousemove);
    setProperty(bean, HtmlRowLayout.ONMOUSEDOWN_KEY, _onmousedown);
    setProperty(bean, HtmlRowLayout.WIDTH_KEY, _width);
    setProperty(bean, HtmlRowLayout.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, HtmlRowLayout.ONMOUSEUP_KEY, _onmouseup);
  }

  @Override
  public void release()
  {
    super.release();
    _onkeyup = null;
    _inlineStyle = null;
    _valign = null;
    _onkeydown = null;
    _onclick = null;
    _halign = null;
    _onmouseout = null;
    _onkeypress = null;
    _ondblclick = null;
    _onmouseover = null;
    _shortDesc = null;
    _partialTriggers = null;
    _onmousemove = null;
    _onmousedown = null;
    _width = null;
    _styleClass = null;
    _onmouseup = null;
  }
}
