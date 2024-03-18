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
package org.apache.myfaces.trinidadinternal.taglib.core.input;

import javax.el.ValueExpression;
import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.component.core.input.CoreSelectBooleanRadio;
import org.apache.myfaces.trinidadinternal.taglib.UIXSelectBooleanTag;
import org.apache.myfaces.trinidadinternal.taglib.util.VirtualAttributeUtils;

/**
 * Auto-generated tag class.
 */
public class CoreSelectBooleanRadioTag extends UIXSelectBooleanTag
{

  /**
   * Construct an instance of the CoreSelectBooleanRadioTag.
   */
  public CoreSelectBooleanRadioTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CoreSelectBooleanRadio";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.Radio";
  }

  private ValueExpression _contentStyle;
  final public void setContentStyle(ValueExpression contentStyle)
  {
    _contentStyle = contentStyle;
  }

  private ValueExpression _autoSubmit;
  final public void setAutoSubmit(ValueExpression autoSubmit)
  {
    _autoSubmit = autoSubmit;
  }

  private ValueExpression _readOnly;
  final public void setReadOnly(ValueExpression readOnly)
  {
    _readOnly = readOnly;
  }

  private ValueExpression _disabled;
  final public void setDisabled(ValueExpression disabled)
  {
    _disabled = disabled;
  }

  private ValueExpression _label;
  final public void setLabel(ValueExpression label)
  {
    _label = label;
  }

  private ValueExpression _simple;
  final public void setSimple(ValueExpression simple)
  {
    _simple = simple;
  }

  private ValueExpression _text;
  final public void setText(ValueExpression text)
  {
    _text = text;
  }

  private ValueExpression _accessKey;
  final public void setAccessKey(ValueExpression accessKey)
  {
    _accessKey = accessKey;
  }

  private ValueExpression _textAndAccessKey;
  final public void setTextAndAccessKey(ValueExpression textAndAccessKey)
  {
    _textAndAccessKey = textAndAccessKey;
  }

  private ValueExpression _group;
  final public void setGroup(ValueExpression group)
  {
    _group = group;
  }

  private ValueExpression _onchange;
  final public void setOnchange(ValueExpression onchange)
  {
    _onchange = onchange;
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

  private ValueExpression _showRequired;
  final public void setShowRequired(ValueExpression showRequired)
  {
    _showRequired = showRequired;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setProperty(bean, CoreSelectBooleanRadio.ACCESS_KEY_KEY, _accessKey);
    setProperty(bean, CoreSelectBooleanRadio.ONMOUSEMOVE_KEY, _onmousemove);
    setProperty(bean, CoreSelectBooleanRadio.ONFOCUS_KEY, _onfocus);
    if (_textAndAccessKey != null)
    {
      if (!_textAndAccessKey.isLiteralText())
      {
        VirtualAttributeUtils.setAccessKeyAttribute(
          bean,
          _textAndAccessKey,
          CoreSelectBooleanRadio.TEXT_KEY,
          CoreSelectBooleanRadio.ACCESS_KEY_KEY);
      }
      else
      {
        String s = _textAndAccessKey.getExpressionString();
        if (s != null)
          VirtualAttributeUtils.setAccessKeyAttribute(
            bean,
            s,
            CoreSelectBooleanRadio.TEXT_KEY,
            CoreSelectBooleanRadio.ACCESS_KEY_KEY);
      }
    }
    setProperty(bean, CoreSelectBooleanRadio.LABEL_KEY, _label);
    setProperty(bean, CoreSelectBooleanRadio.ONKEYPRESS_KEY, _onkeypress);
    setProperty(bean, CoreSelectBooleanRadio.ONKEYUP_KEY, _onkeyup);
    setStringArrayProperty(bean, CoreSelectBooleanRadio.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, CoreSelectBooleanRadio.ONMOUSEOVER_KEY, _onmouseover);
    setProperty(bean, CoreSelectBooleanRadio.SHORT_DESC_KEY, _shortDesc);
    setProperty(bean, CoreSelectBooleanRadio.ONBLUR_KEY, _onblur);
    setProperty(bean, CoreSelectBooleanRadio.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, CoreSelectBooleanRadio.ONKEYDOWN_KEY, _onkeydown);
    setProperty(bean, CoreSelectBooleanRadio.READ_ONLY_KEY, _readOnly);
    setProperty(bean, CoreSelectBooleanRadio.SHOW_REQUIRED_KEY, _showRequired);
    setProperty(bean, CoreSelectBooleanRadio.ONCHANGE_KEY, _onchange);
    setProperty(bean, CoreSelectBooleanRadio.GROUP_KEY, _group);
    setProperty(bean, CoreSelectBooleanRadio.DISABLED_KEY, _disabled);
    setProperty(bean, CoreSelectBooleanRadio.AUTO_SUBMIT_KEY, _autoSubmit);
    setProperty(bean, CoreSelectBooleanRadio.CONTENT_STYLE_KEY, _contentStyle);
    setProperty(bean, CoreSelectBooleanRadio.ONDBLCLICK_KEY, _ondblclick);
    setProperty(bean, CoreSelectBooleanRadio.ONMOUSEOUT_KEY, _onmouseout);
    setProperty(bean, CoreSelectBooleanRadio.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, CoreSelectBooleanRadio.SIMPLE_KEY, _simple);
    setProperty(bean, CoreSelectBooleanRadio.ONCLICK_KEY, _onclick);
    setProperty(bean, CoreSelectBooleanRadio.ONMOUSEUP_KEY, _onmouseup);
    setProperty(bean, CoreSelectBooleanRadio.ONMOUSEDOWN_KEY, _onmousedown);
    setProperty(bean, CoreSelectBooleanRadio.TEXT_KEY, _text);
  }

  @Override
  public void release()
  {
    super.release();
    _accessKey = null;
    _onmousemove = null;
    _onfocus = null;
    _textAndAccessKey = null;
    _label = null;
    _onkeypress = null;
    _onkeyup = null;
    _partialTriggers = null;
    _onmouseover = null;
    _shortDesc = null;
    _onblur = null;
    _inlineStyle = null;
    _onkeydown = null;
    _readOnly = null;
    _showRequired = null;
    _onchange = null;
    _group = null;
    _disabled = null;
    _autoSubmit = null;
    _contentStyle = null;
    _ondblclick = null;
    _onmouseout = null;
    _styleClass = null;
    _simple = null;
    _onclick = null;
    _onmouseup = null;
    _onmousedown = null;
    _text = null;
  }
}
