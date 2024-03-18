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
import org.apache.myfaces.trinidad.component.core.input.CoreInputListOfValues;
import org.apache.myfaces.trinidadinternal.taglib.UIXSelectInputTag;
import org.apache.myfaces.trinidadinternal.taglib.util.VirtualAttributeUtils;

/**
 * Auto-generated tag class.
 */
public class CoreInputListOfValuesTag extends UIXSelectInputTag
{

  /**
   * Construct an instance of the CoreInputListOfValuesTag.
   */
  public CoreInputListOfValuesTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CoreInputListOfValues";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.Text";
  }

  private ValueExpression _contentStyle;
  final public void setContentStyle(ValueExpression contentStyle)
  {
    _contentStyle = contentStyle;
  }

  private ValueExpression _searchDesc;
  final public void setSearchDesc(ValueExpression searchDesc)
  {
    _searchDesc = searchDesc;
  }

  private ValueExpression _icon;
  final public void setIcon(ValueExpression icon)
  {
    _icon = icon;
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

  private ValueExpression _onselect;
  final public void setOnselect(ValueExpression onselect)
  {
    _onselect = onselect;
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

  private ValueExpression _autoSubmit;
  final public void setAutoSubmit(ValueExpression autoSubmit)
  {
    _autoSubmit = autoSubmit;
  }

  private ValueExpression _windowWidth;
  final public void setWindowWidth(ValueExpression windowWidth)
  {
    _windowWidth = windowWidth;
  }

  private ValueExpression _windowHeight;
  final public void setWindowHeight(ValueExpression windowHeight)
  {
    _windowHeight = windowHeight;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setProperty(bean, CoreInputListOfValues.SHORT_DESC_KEY, _shortDesc);
    setProperty(bean, CoreInputListOfValues.ONKEYDOWN_KEY, _onkeydown);
    setProperty(bean, CoreInputListOfValues.READ_ONLY_KEY, _readOnly);
    setProperty(bean, CoreInputListOfValues.WINDOW_HEIGHT_KEY, _windowHeight);
    setProperty(bean, CoreInputListOfValues.MAXIMUM_LENGTH_KEY, _maximumLength);
    setProperty(bean, CoreInputListOfValues.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, CoreInputListOfValues.ACCESS_KEY_KEY, _accessKey);
    setProperty(bean, CoreInputListOfValues.CONTENT_STYLE_KEY, _contentStyle);
    setProperty(bean, CoreInputListOfValues.DISABLED_KEY, _disabled);
    setProperty(bean, CoreInputListOfValues.ONMOUSEOVER_KEY, _onmouseover);
    setProperty(bean, CoreInputListOfValues.ONMOUSEDOWN_KEY, _onmousedown);
    setProperty(bean, CoreInputListOfValues.ONBLUR_KEY, _onblur);
    setProperty(bean, CoreInputListOfValues.ONSELECT_KEY, _onselect);
    setProperty(bean, CoreInputListOfValues.WINDOW_WIDTH_KEY, _windowWidth);
    setProperty(bean, CoreInputListOfValues.ONCLICK_KEY, _onclick);
    setProperty(bean, CoreInputListOfValues.ONMOUSEMOVE_KEY, _onmousemove);
    setProperty(bean, CoreInputListOfValues.AUTO_SUBMIT_KEY, _autoSubmit);
    setProperty(bean, CoreInputListOfValues.ONCHANGE_KEY, _onchange);
    setProperty(bean, CoreInputListOfValues.ONFOCUS_KEY, _onfocus);
    if (_labelAndAccessKey != null)
    {
      if (!_labelAndAccessKey.isLiteralText())
      {
        VirtualAttributeUtils.setAccessKeyAttribute(
          bean,
          _labelAndAccessKey,
          CoreInputListOfValues.LABEL_KEY,
          CoreInputListOfValues.ACCESS_KEY_KEY);
      }
      else
      {
        String s = _labelAndAccessKey.getExpressionString();
        if (s != null)
          VirtualAttributeUtils.setAccessKeyAttribute(
            bean,
            s,
            CoreInputListOfValues.LABEL_KEY,
            CoreInputListOfValues.ACCESS_KEY_KEY);
      }
    }
    setProperty(bean, CoreInputListOfValues.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, CoreInputListOfValues.ONDBLCLICK_KEY, _ondblclick);
    setProperty(bean, CoreInputListOfValues.LABEL_KEY, _label);
    setProperty(bean, CoreInputListOfValues.SEARCH_DESC_KEY, _searchDesc);
    setStringArrayProperty(bean, CoreInputListOfValues.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, CoreInputListOfValues.AUTO_COMPLETE_KEY, _autoComplete);
    setProperty(bean, CoreInputListOfValues.SHOW_REQUIRED_KEY, _showRequired);
    setProperty(bean, CoreInputListOfValues.ICON_KEY, _icon);
    setProperty(bean, CoreInputListOfValues.SIMPLE_KEY, _simple);
    setProperty(bean, CoreInputListOfValues.ONMOUSEUP_KEY, _onmouseup);
    setProperty(bean, CoreInputListOfValues.ONKEYPRESS_KEY, _onkeypress);
    setProperty(bean, CoreInputListOfValues.ONMOUSEOUT_KEY, _onmouseout);
    setProperty(bean, CoreInputListOfValues.ONKEYUP_KEY, _onkeyup);
    setProperty(bean, CoreInputListOfValues.COLUMNS_KEY, _columns);
  }

  @Override
  public void release()
  {
    super.release();
    _shortDesc = null;
    _onkeydown = null;
    _readOnly = null;
    _windowHeight = null;
    _maximumLength = null;
    _styleClass = null;
    _accessKey = null;
    _contentStyle = null;
    _disabled = null;
    _onmouseover = null;
    _onmousedown = null;
    _onblur = null;
    _onselect = null;
    _windowWidth = null;
    _onclick = null;
    _onmousemove = null;
    _autoSubmit = null;
    _onchange = null;
    _onfocus = null;
    _labelAndAccessKey = null;
    _inlineStyle = null;
    _ondblclick = null;
    _label = null;
    _searchDesc = null;
    _partialTriggers = null;
    _autoComplete = null;
    _showRequired = null;
    _icon = null;
    _simple = null;
    _onmouseup = null;
    _onkeypress = null;
    _onmouseout = null;
    _onkeyup = null;
    _columns = null;
  }
}
