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
import org.apache.myfaces.trinidad.component.core.nav.CoreCommandButton;
import org.apache.myfaces.trinidadinternal.taglib.UIXCommandTag;
import org.apache.myfaces.trinidadinternal.taglib.util.VirtualAttributeUtils;

/**
 * Auto-generated tag class.
 */
public class CoreCommandButtonTag extends UIXCommandTag
{

  /**
   * Construct an instance of the CoreCommandButtonTag.
   */
  public CoreCommandButtonTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CoreCommandButton";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.Button";
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

  private ValueExpression _icon;
  final public void setIcon(ValueExpression icon)
  {
    _icon = icon;
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
    setProperty(bean, CoreCommandButton.ONMOUSEOVER_KEY, _onmouseover);
    setProperty(bean, CoreCommandButton.PARTIAL_SUBMIT_KEY, _partialSubmit);
    setProperty(bean, CoreCommandButton.ACCESS_KEY_KEY, _accessKey);
    setProperty(bean, CoreCommandButton.ONMOUSEUP_KEY, _onmouseup);
    setProperty(bean, CoreCommandButton.ONFOCUS_KEY, _onfocus);
    setProperty(bean, CoreCommandButton.WINDOW_HEIGHT_KEY, _windowHeight);
    setProperty(bean, CoreCommandButton.WINDOW_WIDTH_KEY, _windowWidth);
    setProperty(bean, CoreCommandButton.SHORT_DESC_KEY, _shortDesc);
    if (_textAndAccessKey != null)
    {
      if (!_textAndAccessKey.isLiteralText())
      {
        VirtualAttributeUtils.setAccessKeyAttribute(
          bean,
          _textAndAccessKey,
          CoreCommandButton.TEXT_KEY,
          CoreCommandButton.ACCESS_KEY_KEY);
      }
      else
      {
        String s = _textAndAccessKey.getExpressionString();
        if (s != null)
          VirtualAttributeUtils.setAccessKeyAttribute(
            bean,
            s,
            CoreCommandButton.TEXT_KEY,
            CoreCommandButton.ACCESS_KEY_KEY);
      }
    }
    setProperty(bean, CoreCommandButton.ONKEYUP_KEY, _onkeyup);
    setProperty(bean, CoreCommandButton.ONMOUSEMOVE_KEY, _onmousemove);
    setProperty(bean, CoreCommandButton.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, CoreCommandButton.ONBLUR_KEY, _onblur);
    setProperty(bean, CoreCommandButton.USE_WINDOW_KEY, _useWindow);
    setProperty(bean, CoreCommandButton.ONDBLCLICK_KEY, _ondblclick);
    setProperty(bean, CoreCommandButton.BLOCKING_KEY, _blocking);
    setProperty(bean, CoreCommandButton.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, CoreCommandButton.TEXT_KEY, _text);
    setProperty(bean, CoreCommandButton.ONKEYDOWN_KEY, _onkeydown);
    setStringArrayProperty(bean, CoreCommandButton.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, CoreCommandButton.ONMOUSEDOWN_KEY, _onmousedown);
    setProperty(bean, CoreCommandButton.ONCLICK_KEY, _onclick);
    setProperty(bean, CoreCommandButton.ONMOUSEOUT_KEY, _onmouseout);
    setProperty(bean, CoreCommandButton.ONKEYPRESS_KEY, _onkeypress);
    setProperty(bean, CoreCommandButton.ICON_KEY, _icon);
    setProperty(bean, CoreCommandButton.DISABLED_KEY, _disabled);
  }

  @Override
  public void release()
  {
    super.release();
    _onmouseover = null;
    _partialSubmit = null;
    _accessKey = null;
    _onmouseup = null;
    _onfocus = null;
    _windowHeight = null;
    _windowWidth = null;
    _shortDesc = null;
    _textAndAccessKey = null;
    _onkeyup = null;
    _onmousemove = null;
    _styleClass = null;
    _onblur = null;
    _useWindow = null;
    _ondblclick = null;
    _blocking = null;
    _inlineStyle = null;
    _text = null;
    _onkeydown = null;
    _partialTriggers = null;
    _onmousedown = null;
    _onclick = null;
    _onmouseout = null;
    _onkeypress = null;
    _icon = null;
    _disabled = null;
  }
}
