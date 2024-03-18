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
package org.apache.myfaces.trinidadinternal.taglib.core.output;

import javax.el.ValueExpression;
import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.component.core.output.CoreMedia;
import org.apache.myfaces.trinidadinternal.taglib.UIXObjectTag;

/**
 * Auto-generated tag class.
 */
public class CoreMediaTag extends UIXObjectTag
{

  /**
   * Construct an instance of the CoreMediaTag.
   */
  public CoreMediaTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CoreMedia";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.Media";
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

  private ValueExpression _innerWidth;
  final public void setInnerWidth(ValueExpression innerWidth)
  {
    _innerWidth = innerWidth;
  }

  private ValueExpression _innerHeight;
  final public void setInnerHeight(ValueExpression innerHeight)
  {
    _innerHeight = innerHeight;
  }

  private ValueExpression _source;
  final public void setSource(ValueExpression source)
  {
    _source = source;
  }

  private ValueExpression _autostart;
  final public void setAutostart(ValueExpression autostart)
  {
    _autostart = autostart;
  }

  private ValueExpression _playCount;
  final public void setPlayCount(ValueExpression playCount)
  {
    _playCount = playCount;
  }

  private ValueExpression _contentType;
  final public void setContentType(ValueExpression contentType)
  {
    _contentType = contentType;
  }

  private ValueExpression _standbyText;
  final public void setStandbyText(ValueExpression standbyText)
  {
    _standbyText = standbyText;
  }

  private ValueExpression _player;
  final public void setPlayer(ValueExpression player)
  {
    _player = player;
  }

  private ValueExpression _controls;
  final public void setControls(ValueExpression controls)
  {
    _controls = controls;
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
    setProperty(bean, CoreMedia.ONKEYPRESS_KEY, _onkeypress);
    setProperty(bean, CoreMedia.SHORT_DESC_KEY, _shortDesc);
    setProperty(bean, CoreMedia.CONTENT_TYPE_KEY, _contentType);
    setProperty(bean, CoreMedia.ONMOUSEUP_KEY, _onmouseup);
    setProperty(bean, CoreMedia.ONMOUSEDOWN_KEY, _onmousedown);
    setProperty(bean, CoreMedia.AUTOSTART_KEY, _autostart);
    setProperty(bean, CoreMedia.INNER_HEIGHT_KEY, _innerHeight);
    setProperty(bean, CoreMedia.WIDTH_KEY, _width);
    setProperty(bean, CoreMedia.ONMOUSEMOVE_KEY, _onmousemove);
    setProperty(bean, CoreMedia.PLAY_COUNT_KEY, _playCount);
    setProperty(bean, CoreMedia.ONMOUSEOUT_KEY, _onmouseout);
    setProperty(bean, CoreMedia.ONDBLCLICK_KEY, _ondblclick);
    setProperty(bean, CoreMedia.ONKEYDOWN_KEY, _onkeydown);
    setProperty(bean, CoreMedia.SOURCE_KEY, _source);
    setProperty(bean, CoreMedia.ONCLICK_KEY, _onclick);
    setProperty(bean, CoreMedia.HEIGHT_KEY, _height);
    setProperty(bean, CoreMedia.ONKEYUP_KEY, _onkeyup);
    setProperty(bean, CoreMedia.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, CoreMedia.PLAYER_KEY, _player);
    setStringArrayProperty(bean, CoreMedia.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, CoreMedia.INNER_WIDTH_KEY, _innerWidth);
    setProperty(bean, CoreMedia.CONTROLS_KEY, _controls);
    setProperty(bean, CoreMedia.STANDBY_TEXT_KEY, _standbyText);
    setProperty(bean, CoreMedia.ONMOUSEOVER_KEY, _onmouseover);
    setProperty(bean, CoreMedia.INLINE_STYLE_KEY, _inlineStyle);
  }

  @Override
  public void release()
  {
    super.release();
    _onkeypress = null;
    _shortDesc = null;
    _contentType = null;
    _onmouseup = null;
    _onmousedown = null;
    _autostart = null;
    _innerHeight = null;
    _width = null;
    _onmousemove = null;
    _playCount = null;
    _onmouseout = null;
    _ondblclick = null;
    _onkeydown = null;
    _source = null;
    _onclick = null;
    _height = null;
    _onkeyup = null;
    _styleClass = null;
    _player = null;
    _partialTriggers = null;
    _innerWidth = null;
    _controls = null;
    _standbyText = null;
    _onmouseover = null;
    _inlineStyle = null;
  }
}
