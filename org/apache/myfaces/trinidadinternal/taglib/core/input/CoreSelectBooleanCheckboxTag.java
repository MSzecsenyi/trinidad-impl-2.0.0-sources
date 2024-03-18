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
import org.apache.myfaces.trinidad.component.core.input.CoreSelectBooleanCheckbox;
import org.apache.myfaces.trinidadinternal.taglib.UIXSelectBooleanTag;
import org.apache.myfaces.trinidadinternal.taglib.util.VirtualAttributeUtils;

/**
 * Auto-generated tag class.
 */
public class CoreSelectBooleanCheckboxTag extends UIXSelectBooleanTag
{

  /**
   * Construct an instance of the CoreSelectBooleanCheckboxTag.
   */
  public CoreSelectBooleanCheckboxTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CoreSelectBooleanCheckbox";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.Checkbox";
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
    setProperty(bean, CoreSelectBooleanCheckbox.ONFOCUS_KEY, _onfocus);
    setProperty(bean, CoreSelectBooleanCheckbox.SHORT_DESC_KEY, _shortDesc);
    setProperty(bean, CoreSelectBooleanCheckbox.ONMOUSEDOWN_KEY, _onmousedown);
    setProperty(bean, CoreSelectBooleanCheckbox.CONTENT_STYLE_KEY, _contentStyle);
    setProperty(bean, CoreSelectBooleanCheckbox.SHOW_REQUIRED_KEY, _showRequired);
    setProperty(bean, CoreSelectBooleanCheckbox.ONMOUSEOVER_KEY, _onmouseover);
    setProperty(bean, CoreSelectBooleanCheckbox.ONDBLCLICK_KEY, _ondblclick);
    if (_textAndAccessKey != null)
    {
      if (!_textAndAccessKey.isLiteralText())
      {
        VirtualAttributeUtils.setAccessKeyAttribute(
          bean,
          _textAndAccessKey,
          CoreSelectBooleanCheckbox.TEXT_KEY,
          CoreSelectBooleanCheckbox.ACCESS_KEY_KEY);
      }
      else
      {
        String s = _textAndAccessKey.getExpressionString();
        if (s != null)
          VirtualAttributeUtils.setAccessKeyAttribute(
            bean,
            s,
            CoreSelectBooleanCheckbox.TEXT_KEY,
            CoreSelectBooleanCheckbox.ACCESS_KEY_KEY);
      }
    }
    setProperty(bean, CoreSelectBooleanCheckbox.READ_ONLY_KEY, _readOnly);
    setProperty(bean, CoreSelectBooleanCheckbox.ONCLICK_KEY, _onclick);
    setProperty(bean, CoreSelectBooleanCheckbox.ONMOUSEOUT_KEY, _onmouseout);
    setProperty(bean, CoreSelectBooleanCheckbox.ONKEYDOWN_KEY, _onkeydown);
    setProperty(bean, CoreSelectBooleanCheckbox.ONCHANGE_KEY, _onchange);
    setProperty(bean, CoreSelectBooleanCheckbox.LABEL_KEY, _label);
    setProperty(bean, CoreSelectBooleanCheckbox.ACCESS_KEY_KEY, _accessKey);
    setProperty(bean, CoreSelectBooleanCheckbox.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, CoreSelectBooleanCheckbox.SIMPLE_KEY, _simple);
    setProperty(bean, CoreSelectBooleanCheckbox.DISABLED_KEY, _disabled);
    setProperty(bean, CoreSelectBooleanCheckbox.ONKEYUP_KEY, _onkeyup);
    setProperty(bean, CoreSelectBooleanCheckbox.ONMOUSEMOVE_KEY, _onmousemove);
    setProperty(bean, CoreSelectBooleanCheckbox.ONMOUSEUP_KEY, _onmouseup);
    setStringArrayProperty(bean, CoreSelectBooleanCheckbox.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, CoreSelectBooleanCheckbox.TEXT_KEY, _text);
    setProperty(bean, CoreSelectBooleanCheckbox.ONKEYPRESS_KEY, _onkeypress);
    setProperty(bean, CoreSelectBooleanCheckbox.AUTO_SUBMIT_KEY, _autoSubmit);
    setProperty(bean, CoreSelectBooleanCheckbox.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, CoreSelectBooleanCheckbox.ONBLUR_KEY, _onblur);
  }

  @Override
  public void release()
  {
    super.release();
    _onfocus = null;
    _shortDesc = null;
    _onmousedown = null;
    _contentStyle = null;
    _showRequired = null;
    _onmouseover = null;
    _ondblclick = null;
    _textAndAccessKey = null;
    _readOnly = null;
    _onclick = null;
    _onmouseout = null;
    _onkeydown = null;
    _onchange = null;
    _label = null;
    _accessKey = null;
    _styleClass = null;
    _simple = null;
    _disabled = null;
    _onkeyup = null;
    _onmousemove = null;
    _onmouseup = null;
    _partialTriggers = null;
    _text = null;
    _onkeypress = null;
    _autoSubmit = null;
    _inlineStyle = null;
    _onblur = null;
  }
}
