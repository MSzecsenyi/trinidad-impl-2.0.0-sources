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
import org.apache.myfaces.trinidad.component.html.HtmlFrame;
import org.apache.myfaces.trinidad.webapp.UIXComponentELTag;

/**
 * Auto-generated tag class.
 */
public class HtmlFrameTag extends UIXComponentELTag
{

  /**
   * Construct an instance of the HtmlFrameTag.
   */
  public HtmlFrameTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.HtmlFrame";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.Frame";
  }

  private ValueExpression _source;
  final public void setSource(ValueExpression source)
  {
    _source = source;
  }

  private ValueExpression _longDescURL;
  final public void setLongDescURL(ValueExpression longDescURL)
  {
    _longDescURL = longDescURL;
  }

  private ValueExpression _name;
  final public void setName(ValueExpression name)
  {
    _name = name;
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

  private ValueExpression _marginWidth;
  final public void setMarginWidth(ValueExpression marginWidth)
  {
    _marginWidth = marginWidth;
  }

  private ValueExpression _marginHeight;
  final public void setMarginHeight(ValueExpression marginHeight)
  {
    _marginHeight = marginHeight;
  }

  private ValueExpression _scrolling;
  final public void setScrolling(ValueExpression scrolling)
  {
    _scrolling = scrolling;
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
    setProperty(bean, HtmlFrame.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, HtmlFrame.LONG_DESC_URL_KEY, _longDescURL);
    setProperty(bean, HtmlFrame.HEIGHT_KEY, _height);
    setProperty(bean, HtmlFrame.MARGIN_WIDTH_KEY, _marginWidth);
    setProperty(bean, HtmlFrame.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, HtmlFrame.NAME_KEY, _name);
    setStringArrayProperty(bean, HtmlFrame.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, HtmlFrame.SCROLLING_KEY, _scrolling);
    setProperty(bean, HtmlFrame.SHORT_DESC_KEY, _shortDesc);
    setProperty(bean, HtmlFrame.WIDTH_KEY, _width);
    setProperty(bean, HtmlFrame.SOURCE_KEY, _source);
    setProperty(bean, HtmlFrame.MARGIN_HEIGHT_KEY, _marginHeight);
  }

  @Override
  public void release()
  {
    super.release();
    _styleClass = null;
    _longDescURL = null;
    _height = null;
    _marginWidth = null;
    _inlineStyle = null;
    _name = null;
    _partialTriggers = null;
    _scrolling = null;
    _shortDesc = null;
    _width = null;
    _source = null;
    _marginHeight = null;
  }
}
