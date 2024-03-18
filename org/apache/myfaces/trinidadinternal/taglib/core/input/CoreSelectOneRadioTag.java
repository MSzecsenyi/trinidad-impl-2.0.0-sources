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
import org.apache.myfaces.trinidad.component.core.input.CoreSelectOneRadio;
import org.apache.myfaces.trinidadinternal.taglib.UIXSelectOneTag;
import org.apache.myfaces.trinidadinternal.taglib.util.VirtualAttributeUtils;

/**
 * Auto-generated tag class.
 */
public class CoreSelectOneRadioTag extends UIXSelectOneTag
{

  /**
   * Construct an instance of the CoreSelectOneRadioTag.
   */
  public CoreSelectOneRadioTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CoreSelectOneRadio";
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

  private ValueExpression _unselectedLabel;
  final public void setUnselectedLabel(ValueExpression unselectedLabel)
  {
    _unselectedLabel = unselectedLabel;
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
    setProperty(bean, CoreSelectOneRadio.ONFOCUS_KEY, _onfocus);
    setProperty(bean, CoreSelectOneRadio.READ_ONLY_KEY, _readOnly);
    setProperty(bean, CoreSelectOneRadio.VALUE_PASS_THRU_KEY, _valuePassThru);
    setProperty(bean, CoreSelectOneRadio.ONKEYPRESS_KEY, _onkeypress);
    setProperty(bean, CoreSelectOneRadio.ONKEYUP_KEY, _onkeyup);
    setProperty(bean, CoreSelectOneRadio.ONCHANGE_KEY, _onchange);
    setProperty(bean, CoreSelectOneRadio.AUTO_SUBMIT_KEY, _autoSubmit);
    setProperty(bean, CoreSelectOneRadio.ONMOUSEOVER_KEY, _onmouseover);
    setProperty(bean, CoreSelectOneRadio.SHOW_REQUIRED_KEY, _showRequired);
    setProperty(bean, CoreSelectOneRadio.UNSELECTED_LABEL_KEY, _unselectedLabel);
    setStringArrayProperty(bean, CoreSelectOneRadio.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, CoreSelectOneRadio.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, CoreSelectOneRadio.ONMOUSEDOWN_KEY, _onmousedown);
    setProperty(bean, CoreSelectOneRadio.ONMOUSEMOVE_KEY, _onmousemove);
    if (_labelAndAccessKey != null)
    {
      if (!_labelAndAccessKey.isLiteralText())
      {
        VirtualAttributeUtils.setAccessKeyAttribute(
          bean,
          _labelAndAccessKey,
          CoreSelectOneRadio.LABEL_KEY,
          CoreSelectOneRadio.ACCESS_KEY_KEY);
      }
      else
      {
        String s = _labelAndAccessKey.getExpressionString();
        if (s != null)
          VirtualAttributeUtils.setAccessKeyAttribute(
            bean,
            s,
            CoreSelectOneRadio.LABEL_KEY,
            CoreSelectOneRadio.ACCESS_KEY_KEY);
      }
    }
    setProperty(bean, CoreSelectOneRadio.ONMOUSEOUT_KEY, _onmouseout);
    setProperty(bean, CoreSelectOneRadio.ONKEYDOWN_KEY, _onkeydown);
    setProperty(bean, CoreSelectOneRadio.ONMOUSEUP_KEY, _onmouseup);
    setProperty(bean, CoreSelectOneRadio.SHORT_DESC_KEY, _shortDesc);
    setProperty(bean, CoreSelectOneRadio.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, CoreSelectOneRadio.SIMPLE_KEY, _simple);
    setProperty(bean, CoreSelectOneRadio.LAYOUT_KEY, _layout);
    setProperty(bean, CoreSelectOneRadio.CONTENT_STYLE_KEY, _contentStyle);
    setProperty(bean, CoreSelectOneRadio.DISABLED_KEY, _disabled);
    setProperty(bean, CoreSelectOneRadio.LABEL_KEY, _label);
    setProperty(bean, CoreSelectOneRadio.ONDBLCLICK_KEY, _ondblclick);
    setProperty(bean, CoreSelectOneRadio.ONCLICK_KEY, _onclick);
    setProperty(bean, CoreSelectOneRadio.ONBLUR_KEY, _onblur);
    setProperty(bean, CoreSelectOneRadio.ACCESS_KEY_KEY, _accessKey);
  }

  @Override
  public void release()
  {
    super.release();
    _onfocus = null;
    _readOnly = null;
    _valuePassThru = null;
    _onkeypress = null;
    _onkeyup = null;
    _onchange = null;
    _autoSubmit = null;
    _onmouseover = null;
    _showRequired = null;
    _unselectedLabel = null;
    _partialTriggers = null;
    _styleClass = null;
    _onmousedown = null;
    _onmousemove = null;
    _labelAndAccessKey = null;
    _onmouseout = null;
    _onkeydown = null;
    _onmouseup = null;
    _shortDesc = null;
    _inlineStyle = null;
    _simple = null;
    _layout = null;
    _contentStyle = null;
    _disabled = null;
    _label = null;
    _ondblclick = null;
    _onclick = null;
    _onblur = null;
    _accessKey = null;
  }
}
