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
import org.apache.myfaces.trinidad.component.html.HtmlFrameBorderLayout;
import org.apache.myfaces.trinidad.webapp.UIXComponentELTag;

/**
 * Auto-generated tag class.
 */
public class HtmlFrameBorderLayoutTag extends UIXComponentELTag
{

  /**
   * Construct an instance of the HtmlFrameBorderLayoutTag.
   */
  public HtmlFrameBorderLayoutTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.HtmlFrameBorderLayout";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.FrameBorderLayout";
  }

  private ValueExpression _onload;
  final public void setOnload(ValueExpression onload)
  {
    _onload = onload;
  }

  private ValueExpression _onunload;
  final public void setOnunload(ValueExpression onunload)
  {
    _onunload = onunload;
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

  private ValueExpression _frameSpacing;
  final public void setFrameSpacing(ValueExpression frameSpacing)
  {
    _frameSpacing = frameSpacing;
  }

  private ValueExpression _borderWidth;
  final public void setBorderWidth(ValueExpression borderWidth)
  {
    _borderWidth = borderWidth;
  }

  private ValueExpression _frameBorderWidth;
  final public void setFrameBorderWidth(ValueExpression frameBorderWidth)
  {
    _frameBorderWidth = frameBorderWidth;
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
    setProperty(bean, HtmlFrameBorderLayout.BORDER_WIDTH_KEY, _borderWidth);
    setProperty(bean, HtmlFrameBorderLayout.SHORT_DESC_KEY, _shortDesc);
    setProperty(bean, HtmlFrameBorderLayout.HEIGHT_KEY, _height);
    setProperty(bean, HtmlFrameBorderLayout.FRAME_SPACING_KEY, _frameSpacing);
    setProperty(bean, HtmlFrameBorderLayout.ONUNLOAD_KEY, _onunload);
    setProperty(bean, HtmlFrameBorderLayout.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, HtmlFrameBorderLayout.ONLOAD_KEY, _onload);
    setProperty(bean, HtmlFrameBorderLayout.FRAME_BORDER_WIDTH_KEY, _frameBorderWidth);
    setProperty(bean, HtmlFrameBorderLayout.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, HtmlFrameBorderLayout.WIDTH_KEY, _width);
    setStringArrayProperty(bean, HtmlFrameBorderLayout.PARTIAL_TRIGGERS_KEY, _partialTriggers);
  }

  @Override
  public void release()
  {
    super.release();
    _borderWidth = null;
    _shortDesc = null;
    _height = null;
    _frameSpacing = null;
    _onunload = null;
    _styleClass = null;
    _onload = null;
    _frameBorderWidth = null;
    _inlineStyle = null;
    _width = null;
    _partialTriggers = null;
  }
}
