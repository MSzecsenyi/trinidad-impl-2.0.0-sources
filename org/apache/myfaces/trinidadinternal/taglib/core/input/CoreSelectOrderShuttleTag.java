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
import org.apache.myfaces.trinidad.component.core.input.CoreSelectOrderShuttle;
import org.apache.myfaces.trinidadinternal.taglib.UIXSelectOrderTag;

/**
 * Auto-generated tag class.
 */
public class CoreSelectOrderShuttleTag extends UIXSelectOrderTag
{

  /**
   * Construct an instance of the CoreSelectOrderShuttleTag.
   */
  public CoreSelectOrderShuttleTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CoreSelectOrderShuttle";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.Shuttle";
  }

  private ValueExpression _reorderOnly;
  final public void setReorderOnly(ValueExpression reorderOnly)
  {
    _reorderOnly = reorderOnly;
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

  private ValueExpression _size;
  final public void setSize(ValueExpression size)
  {
    _size = size;
  }

  private ValueExpression _leadingHeader;
  final public void setLeadingHeader(ValueExpression leadingHeader)
  {
    _leadingHeader = leadingHeader;
  }

  private ValueExpression _trailingHeader;
  final public void setTrailingHeader(ValueExpression trailingHeader)
  {
    _trailingHeader = trailingHeader;
  }

  private ValueExpression _leadingDescShown;
  final public void setLeadingDescShown(ValueExpression leadingDescShown)
  {
    _leadingDescShown = leadingDescShown;
  }

  private ValueExpression _trailingDescShown;
  final public void setTrailingDescShown(ValueExpression trailingDescShown)
  {
    _trailingDescShown = trailingDescShown;
  }

  private ValueExpression _label;
  final public void setLabel(ValueExpression label)
  {
    _label = label;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setProperty(bean, CoreSelectOrderShuttle.ONMOUSEUP_KEY, _onmouseup);
    setProperty(bean, CoreSelectOrderShuttle.SHORT_DESC_KEY, _shortDesc);
    setProperty(bean, CoreSelectOrderShuttle.ONKEYPRESS_KEY, _onkeypress);
    setProperty(bean, CoreSelectOrderShuttle.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, CoreSelectOrderShuttle.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, CoreSelectOrderShuttle.ONDBLCLICK_KEY, _ondblclick);
    setProperty(bean, CoreSelectOrderShuttle.TRAILING_DESC_SHOWN_KEY, _trailingDescShown);
    setProperty(bean, CoreSelectOrderShuttle.ONFOCUS_KEY, _onfocus);
    setStringArrayProperty(bean, CoreSelectOrderShuttle.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, CoreSelectOrderShuttle.SIZE_KEY, _size);
    setProperty(bean, CoreSelectOrderShuttle.ONCHANGE_KEY, _onchange);
    setProperty(bean, CoreSelectOrderShuttle.ONMOUSEOUT_KEY, _onmouseout);
    setProperty(bean, CoreSelectOrderShuttle.ONMOUSEDOWN_KEY, _onmousedown);
    setProperty(bean, CoreSelectOrderShuttle.LEADING_DESC_SHOWN_KEY, _leadingDescShown);
    setProperty(bean, CoreSelectOrderShuttle.READ_ONLY_KEY, _readOnly);
    setProperty(bean, CoreSelectOrderShuttle.ONKEYDOWN_KEY, _onkeydown);
    setProperty(bean, CoreSelectOrderShuttle.ONBLUR_KEY, _onblur);
    setProperty(bean, CoreSelectOrderShuttle.ONCLICK_KEY, _onclick);
    setProperty(bean, CoreSelectOrderShuttle.ONMOUSEOVER_KEY, _onmouseover);
    setProperty(bean, CoreSelectOrderShuttle.LEADING_HEADER_KEY, _leadingHeader);
    setProperty(bean, CoreSelectOrderShuttle.ONMOUSEMOVE_KEY, _onmousemove);
    setProperty(bean, CoreSelectOrderShuttle.LABEL_KEY, _label);
    setProperty(bean, CoreSelectOrderShuttle.ONKEYUP_KEY, _onkeyup);
    setProperty(bean, CoreSelectOrderShuttle.REORDER_ONLY_KEY, _reorderOnly);
    setProperty(bean, CoreSelectOrderShuttle.VALUE_PASS_THRU_KEY, _valuePassThru);
    setProperty(bean, CoreSelectOrderShuttle.DISABLED_KEY, _disabled);
    setProperty(bean, CoreSelectOrderShuttle.TRAILING_HEADER_KEY, _trailingHeader);
  }

  @Override
  public void release()
  {
    super.release();
    _onmouseup = null;
    _shortDesc = null;
    _onkeypress = null;
    _inlineStyle = null;
    _styleClass = null;
    _ondblclick = null;
    _trailingDescShown = null;
    _onfocus = null;
    _partialTriggers = null;
    _size = null;
    _onchange = null;
    _onmouseout = null;
    _onmousedown = null;
    _leadingDescShown = null;
    _readOnly = null;
    _onkeydown = null;
    _onblur = null;
    _onclick = null;
    _onmouseover = null;
    _leadingHeader = null;
    _onmousemove = null;
    _label = null;
    _onkeyup = null;
    _reorderOnly = null;
    _valuePassThru = null;
    _disabled = null;
    _trailingHeader = null;
  }
}
