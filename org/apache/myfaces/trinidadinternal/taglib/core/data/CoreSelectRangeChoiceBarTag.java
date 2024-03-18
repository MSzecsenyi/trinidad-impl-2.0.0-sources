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
package org.apache.myfaces.trinidadinternal.taglib.core.data;

import javax.el.ValueExpression;
import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.component.core.data.CoreSelectRangeChoiceBar;
import org.apache.myfaces.trinidadinternal.taglib.UIXSelectRangeTag;

/**
 * Auto-generated tag class.
 */
public class CoreSelectRangeChoiceBarTag extends UIXSelectRangeTag
{

  /**
   * Construct an instance of the CoreSelectRangeChoiceBarTag.
   */
  public CoreSelectRangeChoiceBarTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CoreSelectRangeChoiceBar";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.ChoiceBar";
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
    setProperty(bean, CoreSelectRangeChoiceBar.ONMOUSEUP_KEY, _onmouseup);
    setProperty(bean, CoreSelectRangeChoiceBar.ONKEYUP_KEY, _onkeyup);
    setProperty(bean, CoreSelectRangeChoiceBar.ONKEYDOWN_KEY, _onkeydown);
    setProperty(bean, CoreSelectRangeChoiceBar.ONCLICK_KEY, _onclick);
    setProperty(bean, CoreSelectRangeChoiceBar.ONMOUSEDOWN_KEY, _onmousedown);
    setProperty(bean, CoreSelectRangeChoiceBar.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, CoreSelectRangeChoiceBar.ONDBLCLICK_KEY, _ondblclick);
    setProperty(bean, CoreSelectRangeChoiceBar.ONKEYPRESS_KEY, _onkeypress);
    setProperty(bean, CoreSelectRangeChoiceBar.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, CoreSelectRangeChoiceBar.ONMOUSEOVER_KEY, _onmouseover);
    setProperty(bean, CoreSelectRangeChoiceBar.ONMOUSEOUT_KEY, _onmouseout);
    setStringArrayProperty(bean, CoreSelectRangeChoiceBar.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, CoreSelectRangeChoiceBar.SHORT_DESC_KEY, _shortDesc);
    setProperty(bean, CoreSelectRangeChoiceBar.ONMOUSEMOVE_KEY, _onmousemove);
  }

  @Override
  public void release()
  {
    super.release();
    _onmouseup = null;
    _onkeyup = null;
    _onkeydown = null;
    _onclick = null;
    _onmousedown = null;
    _styleClass = null;
    _ondblclick = null;
    _onkeypress = null;
    _inlineStyle = null;
    _onmouseover = null;
    _onmouseout = null;
    _partialTriggers = null;
    _shortDesc = null;
    _onmousemove = null;
  }
}
