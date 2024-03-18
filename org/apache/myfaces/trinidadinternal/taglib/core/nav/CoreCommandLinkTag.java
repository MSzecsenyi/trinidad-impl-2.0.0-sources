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
package org.apache.myfaces.trinidadinternal.taglib.core.nav;

import javax.el.ValueExpression;
import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.component.core.nav.CoreCommandLink;
import org.apache.myfaces.trinidadinternal.taglib.UIXCommandTag;
import org.apache.myfaces.trinidadinternal.taglib.util.VirtualAttributeUtils;

/**
 * Auto-generated tag class.
 */
public class CoreCommandLinkTag extends UIXCommandTag
{

  /**
   * Construct an instance of the CoreCommandLinkTag.
   */
  public CoreCommandLinkTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CoreCommandLink";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.Link";
  }

  private ValueExpression _text;
  final public void setText(ValueExpression text)
  {
    _text = text;
  }

  private ValueExpression _disabled;
  final public void setDisabled(ValueExpression disabled)
  {
    _disabled = disabled;
  }

  private ValueExpression _textAndAccessKey;
  final public void setTextAndAccessKey(ValueExpression textAndAccessKey)
  {
    _textAndAccessKey = textAndAccessKey;
  }

  private ValueExpression _accessKey;
  final public void setAccessKey(ValueExpression accessKey)
  {
    _accessKey = accessKey;
  }

  private ValueExpression _partialSubmit;
  final public void setPartialSubmit(ValueExpression partialSubmit)
  {
    _partialSubmit = partialSubmit;
  }

  private ValueExpression _blocking;
  final public void setBlocking(ValueExpression blocking)
  {
    _blocking = blocking;
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

  private ValueExpression _onblur;
  final public void setOnblur(ValueExpression onblur)
  {
    _onblur = onblur;
  }

  private ValueExpression _onfocus;
  final public void setOnfocus(ValueExpression onfocus)
  {
    _onfocus = onfocus;
  }

  private ValueExpression _useWindow;
  final public void setUseWindow(ValueExpression useWindow)
  {
    _useWindow = useWindow;
  }

  private ValueExpression _windowHeight;
  final public void setWindowHeight(ValueExpression windowHeight)
  {
    _windowHeight = windowHeight;
  }

  private ValueExpression _windowWidth;
  final public void setWindowWidth(ValueExpression windowWidth)
  {
    _windowWidth = windowWidth;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setProperty(bean, CoreCommandLink.ONBLUR_KEY, _onblur);
    setProperty(bean, CoreCommandLink.ONKEYUP_KEY, _onkeyup);
    setProperty(bean, CoreCommandLink.STYLE_CLASS_KEY, _styleClass);
    if (_textAndAccessKey != null)
    {
      if (!_textAndAccessKey.isLiteralText())
      {
        VirtualAttributeUtils.setAccessKeyAttribute(
          bean,
          _textAndAccessKey,
          CoreCommandLink.TEXT_KEY,
          CoreCommandLink.ACCESS_KEY_KEY);
      }
      else
      {
        String s = _textAndAccessKey.getExpressionString();
        if (s != null)
          VirtualAttributeUtils.setAccessKeyAttribute(
            bean,
            s,
            CoreCommandLink.TEXT_KEY,
            CoreCommandLink.ACCESS_KEY_KEY);
      }
    }
    setProperty(bean, CoreCommandLink.ONMOUSEOVER_KEY, _onmouseover);
    setStringArrayProperty(bean, CoreCommandLink.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, CoreCommandLink.ONKEYDOWN_KEY, _onkeydown);
    setProperty(bean, CoreCommandLink.WINDOW_WIDTH_KEY, _windowWidth);
    setProperty(bean, CoreCommandLink.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, CoreCommandLink.PARTIAL_SUBMIT_KEY, _partialSubmit);
    setProperty(bean, CoreCommandLink.ACCESS_KEY_KEY, _accessKey);
    setProperty(bean, CoreCommandLink.ONDBLCLICK_KEY, _ondblclick);
    setProperty(bean, CoreCommandLink.ONFOCUS_KEY, _onfocus);
    setProperty(bean, CoreCommandLink.TEXT_KEY, _text);
    setProperty(bean, CoreCommandLink.BLOCKING_KEY, _blocking);
    setProperty(bean, CoreCommandLink.WINDOW_HEIGHT_KEY, _windowHeight);
    setProperty(bean, CoreCommandLink.ONMOUSEUP_KEY, _onmouseup);
    setProperty(bean, CoreCommandLink.SHORT_DESC_KEY, _shortDesc);
    setProperty(bean, CoreCommandLink.ONKEYPRESS_KEY, _onkeypress);
    setProperty(bean, CoreCommandLink.ONMOUSEDOWN_KEY, _onmousedown);
    setProperty(bean, CoreCommandLink.ONCLICK_KEY, _onclick);
    setProperty(bean, CoreCommandLink.ONMOUSEOUT_KEY, _onmouseout);
    setProperty(bean, CoreCommandLink.ONMOUSEMOVE_KEY, _onmousemove);
    setProperty(bean, CoreCommandLink.USE_WINDOW_KEY, _useWindow);
    setProperty(bean, CoreCommandLink.DISABLED_KEY, _disabled);
  }

  @Override
  public void release()
  {
    super.release();
    _onblur = null;
    _onkeyup = null;
    _styleClass = null;
    _textAndAccessKey = null;
    _onmouseover = null;
    _partialTriggers = null;
    _onkeydown = null;
    _windowWidth = null;
    _inlineStyle = null;
    _partialSubmit = null;
    _accessKey = null;
    _ondblclick = null;
    _onfocus = null;
    _text = null;
    _blocking = null;
    _windowHeight = null;
    _onmouseup = null;
    _shortDesc = null;
    _onkeypress = null;
    _onmousedown = null;
    _onclick = null;
    _onmouseout = null;
    _onmousemove = null;
    _useWindow = null;
    _disabled = null;
  }
}
