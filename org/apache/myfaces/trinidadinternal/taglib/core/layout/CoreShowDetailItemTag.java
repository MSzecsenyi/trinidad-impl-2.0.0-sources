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
package org.apache.myfaces.trinidadinternal.taglib.core.layout;

import javax.el.ValueExpression;
import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.component.core.layout.CoreShowDetailItem;
import org.apache.myfaces.trinidadinternal.taglib.UIXShowDetailTag;
import org.apache.myfaces.trinidadinternal.taglib.util.VirtualAttributeUtils;

/**
 * Auto-generated tag class.
 */
public class CoreShowDetailItemTag extends UIXShowDetailTag
{

  /**
   * Construct an instance of the CoreShowDetailItemTag.
   */
  public CoreShowDetailItemTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CoreShowDetailItem";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.Item";
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

  private ValueExpression _disabled;
  final public void setDisabled(ValueExpression disabled)
  {
    _disabled = disabled;
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

  private ValueExpression _accessKey;
  final public void setAccessKey(ValueExpression accessKey)
  {
    _accessKey = accessKey;
  }

  private ValueExpression _flex;
  final public void setFlex(ValueExpression flex)
  {
    _flex = flex;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setProperty(bean, CoreShowDetailItem.TEXT_KEY, _text);
    setProperty(bean, CoreShowDetailItem.FLEX_KEY, _flex);
    setProperty(bean, CoreShowDetailItem.ONMOUSEMOVE_KEY, _onmousemove);
    setProperty(bean, CoreShowDetailItem.STYLE_CLASS_KEY, _styleClass);
    setStringArrayProperty(bean, CoreShowDetailItem.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, CoreShowDetailItem.ONKEYPRESS_KEY, _onkeypress);
    setProperty(bean, CoreShowDetailItem.ONKEYDOWN_KEY, _onkeydown);
    setProperty(bean, CoreShowDetailItem.ONMOUSEDOWN_KEY, _onmousedown);
    setProperty(bean, CoreShowDetailItem.ONCLICK_KEY, _onclick);
    setProperty(bean, CoreShowDetailItem.ONDBLCLICK_KEY, _ondblclick);
    setProperty(bean, CoreShowDetailItem.ONMOUSEOUT_KEY, _onmouseout);
    setProperty(bean, CoreShowDetailItem.ACCESS_KEY_KEY, _accessKey);
    setProperty(bean, CoreShowDetailItem.DISABLED_KEY, _disabled);
    if (_textAndAccessKey != null)
    {
      if (!_textAndAccessKey.isLiteralText())
      {
        VirtualAttributeUtils.setAccessKeyAttribute(
          bean,
          _textAndAccessKey,
          CoreShowDetailItem.TEXT_KEY,
          CoreShowDetailItem.ACCESS_KEY_KEY);
      }
      else
      {
        String s = _textAndAccessKey.getExpressionString();
        if (s != null)
          VirtualAttributeUtils.setAccessKeyAttribute(
            bean,
            s,
            CoreShowDetailItem.TEXT_KEY,
            CoreShowDetailItem.ACCESS_KEY_KEY);
      }
    }
    setProperty(bean, CoreShowDetailItem.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, CoreShowDetailItem.ONKEYUP_KEY, _onkeyup);
    setProperty(bean, CoreShowDetailItem.SHORT_DESC_KEY, _shortDesc);
    setProperty(bean, CoreShowDetailItem.ONMOUSEUP_KEY, _onmouseup);
    setProperty(bean, CoreShowDetailItem.ONMOUSEOVER_KEY, _onmouseover);
  }

  @Override
  public void release()
  {
    super.release();
    _text = null;
    _flex = null;
    _onmousemove = null;
    _styleClass = null;
    _partialTriggers = null;
    _onkeypress = null;
    _onkeydown = null;
    _onmousedown = null;
    _onclick = null;
    _ondblclick = null;
    _onmouseout = null;
    _accessKey = null;
    _disabled = null;
    _textAndAccessKey = null;
    _inlineStyle = null;
    _onkeyup = null;
    _shortDesc = null;
    _onmouseup = null;
    _onmouseover = null;
  }
}
