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
import org.apache.myfaces.trinidad.component.core.input.CoreChooseDate;
import org.apache.myfaces.trinidadinternal.taglib.UIXChooseTag;

/**
 * Auto-generated tag class.
 */
public class CoreChooseDateTag extends UIXChooseTag
{

  /**
   * Construct an instance of the CoreChooseDateTag.
   */
  public CoreChooseDateTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CoreChooseDate";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.Date";
  }

  private ValueExpression _minValue;
  final public void setMinValue(ValueExpression minValue)
  {
    _minValue = minValue;
  }

  private ValueExpression _maxValue;
  final public void setMaxValue(ValueExpression maxValue)
  {
    _maxValue = maxValue;
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

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setMaxDateProperty(bean, CoreChooseDate.MAX_VALUE_KEY, _maxValue);
    setProperty(bean, CoreChooseDate.ONMOUSEOVER_KEY, _onmouseover);
    setProperty(bean, CoreChooseDate.ONMOUSEOUT_KEY, _onmouseout);
    setProperty(bean, CoreChooseDate.ONKEYPRESS_KEY, _onkeypress);
    setDateProperty(bean, CoreChooseDate.MIN_VALUE_KEY, _minValue);
    setProperty(bean, CoreChooseDate.INLINE_STYLE_KEY, _inlineStyle);
    setStringArrayProperty(bean, CoreChooseDate.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, CoreChooseDate.ONMOUSEMOVE_KEY, _onmousemove);
    setProperty(bean, CoreChooseDate.SHORT_DESC_KEY, _shortDesc);
    setProperty(bean, CoreChooseDate.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, CoreChooseDate.ONCLICK_KEY, _onclick);
    setProperty(bean, CoreChooseDate.ONKEYUP_KEY, _onkeyup);
    setProperty(bean, CoreChooseDate.ONMOUSEDOWN_KEY, _onmousedown);
    setProperty(bean, CoreChooseDate.ONMOUSEUP_KEY, _onmouseup);
    setProperty(bean, CoreChooseDate.ONKEYDOWN_KEY, _onkeydown);
    setProperty(bean, CoreChooseDate.ONDBLCLICK_KEY, _ondblclick);
  }

  @Override
  public void release()
  {
    super.release();
    _maxValue = null;
    _onmouseover = null;
    _onmouseout = null;
    _onkeypress = null;
    _minValue = null;
    _inlineStyle = null;
    _partialTriggers = null;
    _onmousemove = null;
    _shortDesc = null;
    _styleClass = null;
    _onclick = null;
    _onkeyup = null;
    _onmousedown = null;
    _onmouseup = null;
    _onkeydown = null;
    _ondblclick = null;
  }
}
