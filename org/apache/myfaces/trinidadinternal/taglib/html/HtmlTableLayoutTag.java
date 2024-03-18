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
import org.apache.myfaces.trinidad.component.html.HtmlTableLayout;
import org.apache.myfaces.trinidad.webapp.UIXComponentELTag;

/**
 * Auto-generated tag class.
 */
public class HtmlTableLayoutTag extends UIXComponentELTag
{

  /**
   * Construct an instance of the HtmlTableLayoutTag.
   */
  public HtmlTableLayoutTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.HtmlTableLayout";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.TableLayout";
  }

  private ValueExpression _width;
  final public void setWidth(ValueExpression width)
  {
    _width = width;
  }

  private ValueExpression _halign;
  final public void setHalign(ValueExpression halign)
  {
    _halign = halign;
  }

  private ValueExpression _cellSpacing;
  final public void setCellSpacing(ValueExpression cellSpacing)
  {
    _cellSpacing = cellSpacing;
  }

  private ValueExpression _cellPadding;
  final public void setCellPadding(ValueExpression cellPadding)
  {
    _cellPadding = cellPadding;
  }

  private ValueExpression _borderWidth;
  final public void setBorderWidth(ValueExpression borderWidth)
  {
    _borderWidth = borderWidth;
  }

  private ValueExpression _summary;
  final public void setSummary(ValueExpression summary)
  {
    _summary = summary;
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
    setProperty(bean, HtmlTableLayout.HALIGN_KEY, _halign);
    setProperty(bean, HtmlTableLayout.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, HtmlTableLayout.ONMOUSEMOVE_KEY, _onmousemove);
    setProperty(bean, HtmlTableLayout.BORDER_WIDTH_KEY, _borderWidth);
    setProperty(bean, HtmlTableLayout.ONDBLCLICK_KEY, _ondblclick);
    setProperty(bean, HtmlTableLayout.CELL_PADDING_KEY, _cellPadding);
    setProperty(bean, HtmlTableLayout.ONKEYDOWN_KEY, _onkeydown);
    setProperty(bean, HtmlTableLayout.CELL_SPACING_KEY, _cellSpacing);
    setProperty(bean, HtmlTableLayout.ONMOUSEUP_KEY, _onmouseup);
    setProperty(bean, HtmlTableLayout.ONKEYPRESS_KEY, _onkeypress);
    setProperty(bean, HtmlTableLayout.ONCLICK_KEY, _onclick);
    setProperty(bean, HtmlTableLayout.ONMOUSEOVER_KEY, _onmouseover);
    setProperty(bean, HtmlTableLayout.ONKEYUP_KEY, _onkeyup);
    setProperty(bean, HtmlTableLayout.ONMOUSEDOWN_KEY, _onmousedown);
    setProperty(bean, HtmlTableLayout.ONMOUSEOUT_KEY, _onmouseout);
    setProperty(bean, HtmlTableLayout.SUMMARY_KEY, _summary);
    setProperty(bean, HtmlTableLayout.SHORT_DESC_KEY, _shortDesc);
    setProperty(bean, HtmlTableLayout.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, HtmlTableLayout.WIDTH_KEY, _width);
    setStringArrayProperty(bean, HtmlTableLayout.PARTIAL_TRIGGERS_KEY, _partialTriggers);
  }

  @Override
  public void release()
  {
    super.release();
    _halign = null;
    _styleClass = null;
    _onmousemove = null;
    _borderWidth = null;
    _ondblclick = null;
    _cellPadding = null;
    _onkeydown = null;
    _cellSpacing = null;
    _onmouseup = null;
    _onkeypress = null;
    _onclick = null;
    _onmouseover = null;
    _onkeyup = null;
    _onmousedown = null;
    _onmouseout = null;
    _summary = null;
    _shortDesc = null;
    _inlineStyle = null;
    _width = null;
    _partialTriggers = null;
  }
}
