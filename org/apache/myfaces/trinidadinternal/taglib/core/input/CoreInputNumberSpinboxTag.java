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
import org.apache.myfaces.trinidad.component.core.input.CoreInputNumberSpinbox;
import org.apache.myfaces.trinidadinternal.taglib.UIXInputTag;
import org.apache.myfaces.trinidadinternal.taglib.util.VirtualAttributeUtils;

/**
 * Auto-generated tag class.
 */
public class CoreInputNumberSpinboxTag extends UIXInputTag
{

  /**
   * Construct an instance of the CoreInputNumberSpinboxTag.
   */
  public CoreInputNumberSpinboxTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CoreInputNumberSpinbox";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.NumberSpinbox";
  }

  private ValueExpression _contentStyle;
  final public void setContentStyle(ValueExpression contentStyle)
  {
    _contentStyle = contentStyle;
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

  private ValueExpression _autoComplete;
  final public void setAutoComplete(ValueExpression autoComplete)
  {
    _autoComplete = autoComplete;
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

  private ValueExpression _styleClass;
  final public void setStyleClass(ValueExpression styleClass)
  {
    _styleClass = styleClass;
  }

  private ValueExpression _inlineStyle;
  final public void setInlineStyle(ValueExpression inlineStyle)
  {
    _inlineStyle = inlineStyle;
  }

  private ValueExpression _showRequired;
  final public void setShowRequired(ValueExpression showRequired)
  {
    _showRequired = showRequired;
  }

  private ValueExpression _columns;
  final public void setColumns(ValueExpression columns)
  {
    _columns = columns;
  }

  private ValueExpression _maximum;
  final public void setMaximum(ValueExpression maximum)
  {
    _maximum = maximum;
  }

  private ValueExpression _minimum;
  final public void setMinimum(ValueExpression minimum)
  {
    _minimum = minimum;
  }

  private ValueExpression _stepSize;
  final public void setStepSize(ValueExpression stepSize)
  {
    _stepSize = stepSize;
  }

  private ValueExpression _onselect;
  final public void setOnselect(ValueExpression onselect)
  {
    _onselect = onselect;
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
    setProperty(bean, CoreInputNumberSpinbox.SHOW_REQUIRED_KEY, _showRequired);
    setProperty(bean, CoreInputNumberSpinbox.READ_ONLY_KEY, _readOnly);
    setProperty(bean, CoreInputNumberSpinbox.CONTENT_STYLE_KEY, _contentStyle);
    setProperty(bean, CoreInputNumberSpinbox.LABEL_KEY, _label);
    setProperty(bean, CoreInputNumberSpinbox.SHORT_DESC_KEY, _shortDesc);
    setProperty(bean, CoreInputNumberSpinbox.ONMOUSEOUT_KEY, _onmouseout);
    setProperty(bean, CoreInputNumberSpinbox.ONMOUSEUP_KEY, _onmouseup);
    setProperty(bean, CoreInputNumberSpinbox.ONKEYDOWN_KEY, _onkeydown);
    if (_labelAndAccessKey != null)
    {
      if (!_labelAndAccessKey.isLiteralText())
      {
        VirtualAttributeUtils.setAccessKeyAttribute(
          bean,
          _labelAndAccessKey,
          CoreInputNumberSpinbox.LABEL_KEY,
          CoreInputNumberSpinbox.ACCESS_KEY_KEY);
      }
      else
      {
        String s = _labelAndAccessKey.getExpressionString();
        if (s != null)
          VirtualAttributeUtils.setAccessKeyAttribute(
            bean,
            s,
            CoreInputNumberSpinbox.LABEL_KEY,
            CoreInputNumberSpinbox.ACCESS_KEY_KEY);
      }
    }
    setProperty(bean, CoreInputNumberSpinbox.ONSELECT_KEY, _onselect);
    setProperty(bean, CoreInputNumberSpinbox.MAXIMUM_KEY, _maximum);
    setProperty(bean, CoreInputNumberSpinbox.ONMOUSEMOVE_KEY, _onmousemove);
    setProperty(bean, CoreInputNumberSpinbox.ONDBLCLICK_KEY, _ondblclick);
    setProperty(bean, CoreInputNumberSpinbox.ONCHANGE_KEY, _onchange);
    setProperty(bean, CoreInputNumberSpinbox.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, CoreInputNumberSpinbox.COLUMNS_KEY, _columns);
    setProperty(bean, CoreInputNumberSpinbox.MINIMUM_KEY, _minimum);
    setProperty(bean, CoreInputNumberSpinbox.ONKEYPRESS_KEY, _onkeypress);
    setProperty(bean, CoreInputNumberSpinbox.DISABLED_KEY, _disabled);
    setProperty(bean, CoreInputNumberSpinbox.ONFOCUS_KEY, _onfocus);
    setProperty(bean, CoreInputNumberSpinbox.ACCESS_KEY_KEY, _accessKey);
    setProperty(bean, CoreInputNumberSpinbox.ONMOUSEDOWN_KEY, _onmousedown);
    setStringArrayProperty(bean, CoreInputNumberSpinbox.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, CoreInputNumberSpinbox.AUTO_COMPLETE_KEY, _autoComplete);
    setProperty(bean, CoreInputNumberSpinbox.AUTO_SUBMIT_KEY, _autoSubmit);
    setProperty(bean, CoreInputNumberSpinbox.ONKEYUP_KEY, _onkeyup);
    setProperty(bean, CoreInputNumberSpinbox.STEP_SIZE_KEY, _stepSize);
    setProperty(bean, CoreInputNumberSpinbox.ONCLICK_KEY, _onclick);
    setProperty(bean, CoreInputNumberSpinbox.SIMPLE_KEY, _simple);
    setProperty(bean, CoreInputNumberSpinbox.ONBLUR_KEY, _onblur);
    setProperty(bean, CoreInputNumberSpinbox.ONMOUSEOVER_KEY, _onmouseover);
    setProperty(bean, CoreInputNumberSpinbox.INLINE_STYLE_KEY, _inlineStyle);
  }

  @Override
  public void release()
  {
    super.release();
    _showRequired = null;
    _readOnly = null;
    _contentStyle = null;
    _label = null;
    _shortDesc = null;
    _onmouseout = null;
    _onmouseup = null;
    _onkeydown = null;
    _labelAndAccessKey = null;
    _onselect = null;
    _maximum = null;
    _onmousemove = null;
    _ondblclick = null;
    _onchange = null;
    _styleClass = null;
    _columns = null;
    _minimum = null;
    _onkeypress = null;
    _disabled = null;
    _onfocus = null;
    _accessKey = null;
    _onmousedown = null;
    _partialTriggers = null;
    _autoComplete = null;
    _autoSubmit = null;
    _onkeyup = null;
    _stepSize = null;
    _onclick = null;
    _simple = null;
    _onblur = null;
    _onmouseover = null;
    _inlineStyle = null;
  }
}
