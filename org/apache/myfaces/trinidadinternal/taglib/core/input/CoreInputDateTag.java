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
import org.apache.myfaces.trinidad.component.core.input.CoreInputDate;
import org.apache.myfaces.trinidadinternal.taglib.UIXSelectInputTag;
import org.apache.myfaces.trinidadinternal.taglib.util.VirtualAttributeUtils;

/**
 * Auto-generated tag class.
 */
public class CoreInputDateTag extends UIXSelectInputTag
{

  /**
   * Construct an instance of the CoreInputDateTag.
   */
  public CoreInputDateTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CoreInputDate";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.Date";
  }

  private ValueExpression _contentStyle;
  final public void setContentStyle(ValueExpression contentStyle)
  {
    _contentStyle = contentStyle;
  }

  private ValueExpression _chooseId;
  final public void setChooseId(ValueExpression chooseId)
  {
    _chooseId = chooseId;
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

  private ValueExpression _columns;
  final public void setColumns(ValueExpression columns)
  {
    _columns = columns;
  }

  private ValueExpression _maximumLength;
  final public void setMaximumLength(ValueExpression maximumLength)
  {
    _maximumLength = maximumLength;
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
    setProperty(bean, CoreInputDate.ONCLICK_KEY, _onclick);
    setProperty(bean, CoreInputDate.ONMOUSEOUT_KEY, _onmouseout);
    setProperty(bean, CoreInputDate.ONMOUSEUP_KEY, _onmouseup);
    setProperty(bean, CoreInputDate.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, CoreInputDate.ONFOCUS_KEY, _onfocus);
    setProperty(bean, CoreInputDate.SHORT_DESC_KEY, _shortDesc);
    setProperty(bean, CoreInputDate.MAXIMUM_LENGTH_KEY, _maximumLength);
    setProperty(bean, CoreInputDate.ONMOUSEMOVE_KEY, _onmousemove);
    setProperty(bean, CoreInputDate.READ_ONLY_KEY, _readOnly);
    setProperty(bean, CoreInputDate.SIMPLE_KEY, _simple);
    setProperty(bean, CoreInputDate.AUTO_COMPLETE_KEY, _autoComplete);
    setProperty(bean, CoreInputDate.COLUMNS_KEY, _columns);
    setProperty(bean, CoreInputDate.ACCESS_KEY_KEY, _accessKey);
    setProperty(bean, CoreInputDate.DISABLED_KEY, _disabled);
    setProperty(bean, CoreInputDate.ONDBLCLICK_KEY, _ondblclick);
    if (_labelAndAccessKey != null)
    {
      if (!_labelAndAccessKey.isLiteralText())
      {
        VirtualAttributeUtils.setAccessKeyAttribute(
          bean,
          _labelAndAccessKey,
          CoreInputDate.LABEL_KEY,
          CoreInputDate.ACCESS_KEY_KEY);
      }
      else
      {
        String s = _labelAndAccessKey.getExpressionString();
        if (s != null)
          VirtualAttributeUtils.setAccessKeyAttribute(
            bean,
            s,
            CoreInputDate.LABEL_KEY,
            CoreInputDate.ACCESS_KEY_KEY);
      }
    }
    setProperty(bean, CoreInputDate.ONCHANGE_KEY, _onchange);
    setProperty(bean, CoreInputDate.CONTENT_STYLE_KEY, _contentStyle);
    setProperty(bean, CoreInputDate.ONKEYUP_KEY, _onkeyup);
    setProperty(bean, CoreInputDate.ONKEYPRESS_KEY, _onkeypress);
    setProperty(bean, CoreInputDate.AUTO_SUBMIT_KEY, _autoSubmit);
    setProperty(bean, CoreInputDate.SHOW_REQUIRED_KEY, _showRequired);
    setProperty(bean, CoreInputDate.ONMOUSEOVER_KEY, _onmouseover);
    setProperty(bean, CoreInputDate.ONBLUR_KEY, _onblur);
    setProperty(bean, CoreInputDate.ONKEYDOWN_KEY, _onkeydown);
    setProperty(bean, CoreInputDate.LABEL_KEY, _label);
    setProperty(bean, CoreInputDate.CHOOSE_ID_KEY, _chooseId);
    setProperty(bean, CoreInputDate.ONMOUSEDOWN_KEY, _onmousedown);
    setProperty(bean, CoreInputDate.INLINE_STYLE_KEY, _inlineStyle);
    setStringArrayProperty(bean, CoreInputDate.PARTIAL_TRIGGERS_KEY, _partialTriggers);
  }

  @Override
  public void release()
  {
    super.release();
    _onclick = null;
    _onmouseout = null;
    _onmouseup = null;
    _styleClass = null;
    _onfocus = null;
    _shortDesc = null;
    _maximumLength = null;
    _onmousemove = null;
    _readOnly = null;
    _simple = null;
    _autoComplete = null;
    _columns = null;
    _accessKey = null;
    _disabled = null;
    _ondblclick = null;
    _labelAndAccessKey = null;
    _onchange = null;
    _contentStyle = null;
    _onkeyup = null;
    _onkeypress = null;
    _autoSubmit = null;
    _showRequired = null;
    _onmouseover = null;
    _onblur = null;
    _onkeydown = null;
    _label = null;
    _chooseId = null;
    _onmousedown = null;
    _inlineStyle = null;
    _partialTriggers = null;
  }
}
