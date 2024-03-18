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
import org.apache.myfaces.trinidad.component.core.nav.CoreGoLink;
import org.apache.myfaces.trinidadinternal.taglib.UIXGoTag;
import org.apache.myfaces.trinidadinternal.taglib.util.VirtualAttributeUtils;

/**
 * Auto-generated tag class.
 */
public class CoreGoLinkTag extends UIXGoTag
{

  /**
   * Construct an instance of the CoreGoLinkTag.
   */
  public CoreGoLinkTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CoreGoLink";
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

  private ValueExpression _targetFrame;
  final public void setTargetFrame(ValueExpression targetFrame)
  {
    _targetFrame = targetFrame;
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

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setProperty(bean, CoreGoLink.ONMOUSEOVER_KEY, _onmouseover);
    setProperty(bean, CoreGoLink.TARGET_FRAME_KEY, _targetFrame);
    setProperty(bean, CoreGoLink.TEXT_KEY, _text);
    if (_textAndAccessKey != null)
    {
      if (!_textAndAccessKey.isLiteralText())
      {
        VirtualAttributeUtils.setAccessKeyAttribute(
          bean,
          _textAndAccessKey,
          CoreGoLink.TEXT_KEY,
          CoreGoLink.ACCESS_KEY_KEY);
      }
      else
      {
        String s = _textAndAccessKey.getExpressionString();
        if (s != null)
          VirtualAttributeUtils.setAccessKeyAttribute(
            bean,
            s,
            CoreGoLink.TEXT_KEY,
            CoreGoLink.ACCESS_KEY_KEY);
      }
    }
    setProperty(bean, CoreGoLink.ONCLICK_KEY, _onclick);
    setProperty(bean, CoreGoLink.ONKEYPRESS_KEY, _onkeypress);
    setProperty(bean, CoreGoLink.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, CoreGoLink.DISABLED_KEY, _disabled);
    setProperty(bean, CoreGoLink.ONKEYDOWN_KEY, _onkeydown);
    setStringArrayProperty(bean, CoreGoLink.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, CoreGoLink.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, CoreGoLink.ONMOUSEOUT_KEY, _onmouseout);
    setProperty(bean, CoreGoLink.ONDBLCLICK_KEY, _ondblclick);
    setProperty(bean, CoreGoLink.ONMOUSEUP_KEY, _onmouseup);
    setProperty(bean, CoreGoLink.ONKEYUP_KEY, _onkeyup);
    setProperty(bean, CoreGoLink.ACCESS_KEY_KEY, _accessKey);
    setProperty(bean, CoreGoLink.ONMOUSEDOWN_KEY, _onmousedown);
    setProperty(bean, CoreGoLink.SHORT_DESC_KEY, _shortDesc);
    setProperty(bean, CoreGoLink.ONBLUR_KEY, _onblur);
    setProperty(bean, CoreGoLink.ONMOUSEMOVE_KEY, _onmousemove);
    setProperty(bean, CoreGoLink.ONFOCUS_KEY, _onfocus);
  }

  @Override
  public void release()
  {
    super.release();
    _onmouseover = null;
    _targetFrame = null;
    _text = null;
    _textAndAccessKey = null;
    _onclick = null;
    _onkeypress = null;
    _styleClass = null;
    _disabled = null;
    _onkeydown = null;
    _partialTriggers = null;
    _inlineStyle = null;
    _onmouseout = null;
    _ondblclick = null;
    _onmouseup = null;
    _onkeyup = null;
    _accessKey = null;
    _onmousedown = null;
    _shortDesc = null;
    _onblur = null;
    _onmousemove = null;
    _onfocus = null;
  }
}
