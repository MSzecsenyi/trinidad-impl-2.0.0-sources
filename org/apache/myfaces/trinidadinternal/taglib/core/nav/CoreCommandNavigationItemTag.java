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
import org.apache.myfaces.trinidad.component.core.nav.CoreCommandNavigationItem;
import org.apache.myfaces.trinidadinternal.taglib.UIXCommandTag;
import org.apache.myfaces.trinidadinternal.taglib.util.VirtualAttributeUtils;

/**
 * Auto-generated tag class.
 */
public class CoreCommandNavigationItemTag extends UIXCommandTag
{

  /**
   * Construct an instance of the CoreCommandNavigationItemTag.
   */
  public CoreCommandNavigationItemTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CoreCommandNavigationItem";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.NavigationItem";
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

  private ValueExpression _accessKey;
  final public void setAccessKey(ValueExpression accessKey)
  {
    _accessKey = accessKey;
  }

  private ValueExpression _destination;
  final public void setDestination(ValueExpression destination)
  {
    _destination = destination;
  }

  private ValueExpression _disabled;
  final public void setDisabled(ValueExpression disabled)
  {
    _disabled = disabled;
  }

  private ValueExpression _icon;
  final public void setIcon(ValueExpression icon)
  {
    _icon = icon;
  }

  private ValueExpression _partialSubmit;
  final public void setPartialSubmit(ValueExpression partialSubmit)
  {
    _partialSubmit = partialSubmit;
  }

  private ValueExpression _selected;
  final public void setSelected(ValueExpression selected)
  {
    _selected = selected;
  }

  private ValueExpression _visited;
  final public void setVisited(ValueExpression visited)
  {
    _visited = visited;
  }

  private ValueExpression _targetFrame;
  final public void setTargetFrame(ValueExpression targetFrame)
  {
    _targetFrame = targetFrame;
  }

  private ValueExpression _text;
  final public void setText(ValueExpression text)
  {
    _text = text;
  }

  private ValueExpression _textAndAccessKey;
  final public void setTextAndAccessKey(ValueExpression textAndAccessKey)
  {
    _textAndAccessKey = textAndAccessKey;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setProperty(bean, CoreCommandNavigationItem.ONMOUSEDOWN_KEY, _onmousedown);
    setProperty(bean, CoreCommandNavigationItem.ONDBLCLICK_KEY, _ondblclick);
    setProperty(bean, CoreCommandNavigationItem.SHORT_DESC_KEY, _shortDesc);
    setProperty(bean, CoreCommandNavigationItem.ONMOUSEMOVE_KEY, _onmousemove);
    setProperty(bean, CoreCommandNavigationItem.ONMOUSEOVER_KEY, _onmouseover);
    setStringArrayProperty(bean, CoreCommandNavigationItem.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, CoreCommandNavigationItem.WINDOW_HEIGHT_KEY, _windowHeight);
    setProperty(bean, CoreCommandNavigationItem.ONKEYUP_KEY, _onkeyup);
    setProperty(bean, CoreCommandNavigationItem.DISABLED_KEY, _disabled);
    setProperty(bean, CoreCommandNavigationItem.VISITED_KEY, _visited);
    setProperty(bean, CoreCommandNavigationItem.USE_WINDOW_KEY, _useWindow);
    setProperty(bean, CoreCommandNavigationItem.ONMOUSEUP_KEY, _onmouseup);
    setProperty(bean, CoreCommandNavigationItem.TARGET_FRAME_KEY, _targetFrame);
    setProperty(bean, CoreCommandNavigationItem.ONCLICK_KEY, _onclick);
    setProperty(bean, CoreCommandNavigationItem.SELECTED_KEY, _selected);
    setProperty(bean, CoreCommandNavigationItem.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, CoreCommandNavigationItem.ICON_KEY, _icon);
    setProperty(bean, CoreCommandNavigationItem.ONMOUSEOUT_KEY, _onmouseout);
    setProperty(bean, CoreCommandNavigationItem.TEXT_KEY, _text);
    setProperty(bean, CoreCommandNavigationItem.WINDOW_WIDTH_KEY, _windowWidth);
    setProperty(bean, CoreCommandNavigationItem.ONKEYPRESS_KEY, _onkeypress);
    if (_textAndAccessKey != null)
    {
      if (!_textAndAccessKey.isLiteralText())
      {
        VirtualAttributeUtils.setAccessKeyAttribute(
          bean,
          _textAndAccessKey,
          CoreCommandNavigationItem.TEXT_KEY,
          CoreCommandNavigationItem.ACCESS_KEY_KEY);
      }
      else
      {
        String s = _textAndAccessKey.getExpressionString();
        if (s != null)
          VirtualAttributeUtils.setAccessKeyAttribute(
            bean,
            s,
            CoreCommandNavigationItem.TEXT_KEY,
            CoreCommandNavigationItem.ACCESS_KEY_KEY);
      }
    }
    setProperty(bean, CoreCommandNavigationItem.ONKEYDOWN_KEY, _onkeydown);
    setProperty(bean, CoreCommandNavigationItem.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, CoreCommandNavigationItem.DESTINATION_KEY, _destination);
    setProperty(bean, CoreCommandNavigationItem.ACCESS_KEY_KEY, _accessKey);
    setProperty(bean, CoreCommandNavigationItem.PARTIAL_SUBMIT_KEY, _partialSubmit);
  }

  @Override
  public void release()
  {
    super.release();
    _onmousedown = null;
    _ondblclick = null;
    _shortDesc = null;
    _onmousemove = null;
    _onmouseover = null;
    _partialTriggers = null;
    _windowHeight = null;
    _onkeyup = null;
    _disabled = null;
    _visited = null;
    _useWindow = null;
    _onmouseup = null;
    _targetFrame = null;
    _onclick = null;
    _selected = null;
    _inlineStyle = null;
    _icon = null;
    _onmouseout = null;
    _text = null;
    _windowWidth = null;
    _onkeypress = null;
    _textAndAccessKey = null;
    _onkeydown = null;
    _styleClass = null;
    _destination = null;
    _accessKey = null;
    _partialSubmit = null;
  }
}
