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
import org.apache.myfaces.trinidad.component.html.HtmlCellFormat;
import org.apache.myfaces.trinidad.webapp.UIXComponentELTag;

/**
 * Auto-generated tag class.
 */
public class HtmlCellFormatTag extends UIXComponentELTag
{

  /**
   * Construct an instance of the HtmlCellFormatTag.
   */
  public HtmlCellFormatTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.HtmlCellFormat";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.CellFormat";
  }

  private ValueExpression _shortText;
  final public void setShortText(ValueExpression shortText)
  {
    _shortText = shortText;
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

  private ValueExpression _height;
  final public void setHeight(ValueExpression height)
  {
    _height = height;
  }

  private ValueExpression _columnSpan;
  final public void setColumnSpan(ValueExpression columnSpan)
  {
    _columnSpan = columnSpan;
  }

  private ValueExpression _rowSpan;
  final public void setRowSpan(ValueExpression rowSpan)
  {
    _rowSpan = rowSpan;
  }

  private ValueExpression _wrappingDisabled;
  final public void setWrappingDisabled(ValueExpression wrappingDisabled)
  {
    _wrappingDisabled = wrappingDisabled;
  }

  private ValueExpression _headers;
  final public void setHeaders(ValueExpression headers)
  {
    _headers = headers;
  }

  private ValueExpression _header;
  final public void setHeader(ValueExpression header)
  {
    _header = header;
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
    setProperty(bean, HtmlCellFormat.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, HtmlCellFormat.COLUMN_SPAN_KEY, _columnSpan);
    setProperty(bean, HtmlCellFormat.ROW_SPAN_KEY, _rowSpan);
    setProperty(bean, HtmlCellFormat.ONMOUSEMOVE_KEY, _onmousemove);
    setProperty(bean, HtmlCellFormat.HEADER_KEY, _header);
    setProperty(bean, HtmlCellFormat.ONKEYDOWN_KEY, _onkeydown);
    setProperty(bean, HtmlCellFormat.HEADERS_KEY, _headers);
    setProperty(bean, HtmlCellFormat.ONMOUSEUP_KEY, _onmouseup);
    setProperty(bean, HtmlCellFormat.HALIGN_KEY, _halign);
    setProperty(bean, HtmlCellFormat.ONKEYUP_KEY, _onkeyup);
    setProperty(bean, HtmlCellFormat.VALIGN_KEY, _valign);
    setProperty(bean, HtmlCellFormat.ONMOUSEOUT_KEY, _onmouseout);
    setProperty(bean, HtmlCellFormat.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, HtmlCellFormat.WIDTH_KEY, _width);
    setProperty(bean, HtmlCellFormat.ONMOUSEOVER_KEY, _onmouseover);
    setProperty(bean, HtmlCellFormat.SHORT_DESC_KEY, _shortDesc);
    setProperty(bean, HtmlCellFormat.ONDBLCLICK_KEY, _ondblclick);
    setProperty(bean, HtmlCellFormat.ONCLICK_KEY, _onclick);
    setStringArrayProperty(bean, HtmlCellFormat.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, HtmlCellFormat.SHORT_TEXT_KEY, _shortText);
    setProperty(bean, HtmlCellFormat.WRAPPING_DISABLED_KEY, _wrappingDisabled);
    setProperty(bean, HtmlCellFormat.ONKEYPRESS_KEY, _onkeypress);
    setProperty(bean, HtmlCellFormat.ONMOUSEDOWN_KEY, _onmousedown);
    setProperty(bean, HtmlCellFormat.HEIGHT_KEY, _height);
  }

  @Override
  public void release()
  {
    super.release();
    _inlineStyle = null;
    _columnSpan = null;
    _rowSpan = null;
    _onmousemove = null;
    _header = null;
    _onkeydown = null;
    _headers = null;
    _onmouseup = null;
    _halign = null;
    _onkeyup = null;
    _valign = null;
    _onmouseout = null;
    _styleClass = null;
    _width = null;
    _onmouseover = null;
    _shortDesc = null;
    _ondblclick = null;
    _onclick = null;
    _partialTriggers = null;
    _shortText = null;
    _wrappingDisabled = null;
    _onkeypress = null;
    _onmousedown = null;
    _height = null;
  }
}
