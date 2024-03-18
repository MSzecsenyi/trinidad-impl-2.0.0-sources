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
import org.apache.myfaces.trinidad.component.core.layout.CorePanelFormLayout;
import org.apache.myfaces.trinidadinternal.taglib.UIXPanelTag;

/**
 * Auto-generated tag class.
 */
public class CorePanelFormLayoutTag extends UIXPanelTag
{

  /**
   * Construct an instance of the CorePanelFormLayoutTag.
   */
  public CorePanelFormLayoutTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CorePanelFormLayout";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.FormLayout";
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

  private ValueExpression _fieldWidth;
  final public void setFieldWidth(ValueExpression fieldWidth)
  {
    _fieldWidth = fieldWidth;
  }

  private ValueExpression _labelWidth;
  final public void setLabelWidth(ValueExpression labelWidth)
  {
    _labelWidth = labelWidth;
  }

  private ValueExpression _maxColumns;
  final public void setMaxColumns(ValueExpression maxColumns)
  {
    _maxColumns = maxColumns;
  }

  private ValueExpression _rows;
  final public void setRows(ValueExpression rows)
  {
    _rows = rows;
  }

  private ValueExpression _labelAlignment;
  final public void setLabelAlignment(ValueExpression labelAlignment)
  {
    _labelAlignment = labelAlignment;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setProperty(bean, CorePanelFormLayout.ONDBLCLICK_KEY, _ondblclick);
    setProperty(bean, CorePanelFormLayout.SHORT_DESC_KEY, _shortDesc);
    setProperty(bean, CorePanelFormLayout.ONKEYPRESS_KEY, _onkeypress);
    setProperty(bean, CorePanelFormLayout.ONKEYUP_KEY, _onkeyup);
    setProperty(bean, CorePanelFormLayout.ONKEYDOWN_KEY, _onkeydown);
    setProperty(bean, CorePanelFormLayout.ONMOUSEMOVE_KEY, _onmousemove);
    setProperty(bean, CorePanelFormLayout.MAX_COLUMNS_KEY, _maxColumns);
    setStringArrayProperty(bean, CorePanelFormLayout.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, CorePanelFormLayout.ONMOUSEOVER_KEY, _onmouseover);
    setProperty(bean, CorePanelFormLayout.ONCLICK_KEY, _onclick);
    setProperty(bean, CorePanelFormLayout.LABEL_ALIGNMENT_KEY, _labelAlignment);
    setProperty(bean, CorePanelFormLayout.LABEL_WIDTH_KEY, _labelWidth);
    setProperty(bean, CorePanelFormLayout.FIELD_WIDTH_KEY, _fieldWidth);
    setProperty(bean, CorePanelFormLayout.ROWS_KEY, _rows);
    setProperty(bean, CorePanelFormLayout.ONMOUSEDOWN_KEY, _onmousedown);
    setProperty(bean, CorePanelFormLayout.ONMOUSEUP_KEY, _onmouseup);
    setProperty(bean, CorePanelFormLayout.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, CorePanelFormLayout.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, CorePanelFormLayout.ONMOUSEOUT_KEY, _onmouseout);
  }

  @Override
  public void release()
  {
    super.release();
    _ondblclick = null;
    _shortDesc = null;
    _onkeypress = null;
    _onkeyup = null;
    _onkeydown = null;
    _onmousemove = null;
    _maxColumns = null;
    _partialTriggers = null;
    _onmouseover = null;
    _onclick = null;
    _labelAlignment = null;
    _labelWidth = null;
    _fieldWidth = null;
    _rows = null;
    _onmousedown = null;
    _onmouseup = null;
    _styleClass = null;
    _inlineStyle = null;
    _onmouseout = null;
  }
}
