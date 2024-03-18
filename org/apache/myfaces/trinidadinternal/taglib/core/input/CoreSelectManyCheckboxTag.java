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
import org.apache.myfaces.trinidad.component.core.input.CoreSelectManyCheckbox;
import org.apache.myfaces.trinidadinternal.taglib.UIXSelectManyTag;
import org.apache.myfaces.trinidadinternal.taglib.util.VirtualAttributeUtils;

/**
 * Auto-generated tag class.
 */
public class CoreSelectManyCheckboxTag extends UIXSelectManyTag
{

  /**
   * Construct an instance of the CoreSelectManyCheckboxTag.
   */
  public CoreSelectManyCheckboxTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CoreSelectManyCheckbox";
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

  private ValueExpression _layout;
  final public void setLayout(ValueExpression layout)
  {
    _layout = layout;
  }

  private ValueExpression _valuePassThru;
  final public void setValuePassThru(ValueExpression valuePassThru)
  {
    _valuePassThru = valuePassThru;
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

  private ValueExpression _accessKey;
  final public void setAccessKey(ValueExpression accessKey)
  {
    _accessKey = accessKey;
  }

  private ValueExpression _labelAndAccessKey;
  final public void setLabelAndAccessKey(ValueExpression labelAndAccessKey)
  {
    _labelAndAccessKey = labelAndAccessKey;
  }

  private ValueExpression _autoSubmit;
  final public void setAutoSubmit(ValueExpression autoSubmit)
  {
    _autoSubmit = autoSubmit;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setStringArrayProperty(bean, CoreSelectManyCheckbox.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, CoreSelectManyCheckbox.ONMOUSEOVER_KEY, _onmouseover);
    setProperty(bean, CoreSelectManyCheckbox.ONKEYPRESS_KEY, _onkeypress);
    setProperty(bean, CoreSelectManyCheckbox.SHOW_REQUIRED_KEY, _showRequired);
    setProperty(bean, CoreSelectManyCheckbox.LABEL_KEY, _label);
    setProperty(bean, CoreSelectManyCheckbox.ONKEYUP_KEY, _onkeyup);
    setProperty(bean, CoreSelectManyCheckbox.ONBLUR_KEY, _onblur);
    setProperty(bean, CoreSelectManyCheckbox.CONTENT_STYLE_KEY, _contentStyle);
    setProperty(bean, CoreSelectManyCheckbox.ONFOCUS_KEY, _onfocus);
    setProperty(bean, CoreSelectManyCheckbox.VALUE_PASS_THRU_KEY, _valuePassThru);
    setProperty(bean, CoreSelectManyCheckbox.AUTO_SUBMIT_KEY, _autoSubmit);
    if (_labelAndAccessKey != null)
    {
      if (!_labelAndAccessKey.isLiteralText())
      {
        VirtualAttributeUtils.setAccessKeyAttribute(
          bean,
          _labelAndAccessKey,
          CoreSelectManyCheckbox.LABEL_KEY,
          CoreSelectManyCheckbox.ACCESS_KEY_KEY);
      }
      else
      {
        String s = _labelAndAccessKey.getExpressionString();
        if (s != null)
          VirtualAttributeUtils.setAccessKeyAttribute(
            bean,
            s,
            CoreSelectManyCheckbox.LABEL_KEY,
            CoreSelectManyCheckbox.ACCESS_KEY_KEY);
      }
    }
    setProperty(bean, CoreSelectManyCheckbox.ONCLICK_KEY, _onclick);
    setProperty(bean, CoreSelectManyCheckbox.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, CoreSelectManyCheckbox.ONMOUSEDOWN_KEY, _onmousedown);
    setProperty(bean, CoreSelectManyCheckbox.ONMOUSEMOVE_KEY, _onmousemove);
    setProperty(bean, CoreSelectManyCheckbox.SIMPLE_KEY, _simple);
    setProperty(bean, CoreSelectManyCheckbox.READ_ONLY_KEY, _readOnly);
    setProperty(bean, CoreSelectManyCheckbox.ONKEYDOWN_KEY, _onkeydown);
    setProperty(bean, CoreSelectManyCheckbox.LAYOUT_KEY, _layout);
    setProperty(bean, CoreSelectManyCheckbox.ACCESS_KEY_KEY, _accessKey);
    setProperty(bean, CoreSelectManyCheckbox.ONCHANGE_KEY, _onchange);
    setProperty(bean, CoreSelectManyCheckbox.ONDBLCLICK_KEY, _ondblclick);
    setProperty(bean, CoreSelectManyCheckbox.ONMOUSEUP_KEY, _onmouseup);
    setProperty(bean, CoreSelectManyCheckbox.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, CoreSelectManyCheckbox.ONMOUSEOUT_KEY, _onmouseout);
    setProperty(bean, CoreSelectManyCheckbox.SHORT_DESC_KEY, _shortDesc);
    setProperty(bean, CoreSelectManyCheckbox.DISABLED_KEY, _disabled);
  }

  @Override
  public void release()
  {
    super.release();
    _partialTriggers = null;
    _onmouseover = null;
    _onkeypress = null;
    _showRequired = null;
    _label = null;
    _onkeyup = null;
    _onblur = null;
    _contentStyle = null;
    _onfocus = null;
    _valuePassThru = null;
    _autoSubmit = null;
    _labelAndAccessKey = null;
    _onclick = null;
    _styleClass = null;
    _onmousedown = null;
    _onmousemove = null;
    _simple = null;
    _readOnly = null;
    _onkeydown = null;
    _layout = null;
    _accessKey = null;
    _onchange = null;
    _ondblclick = null;
    _onmouseup = null;
    _inlineStyle = null;
    _onmouseout = null;
    _shortDesc = null;
    _disabled = null;
  }
}
