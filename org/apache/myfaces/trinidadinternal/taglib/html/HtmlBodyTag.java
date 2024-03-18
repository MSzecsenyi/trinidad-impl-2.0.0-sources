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
package org.apache.myfaces.trinidadinternal.taglib.html;

import javax.el.ValueExpression;
import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.component.html.HtmlBody;
import org.apache.myfaces.trinidad.webapp.UIXComponentELTag;

/**
 * Auto-generated tag class.
 */
public class HtmlBodyTag extends UIXComponentELTag
{

  /**
   * Construct an instance of the HtmlBodyTag.
   */
  public HtmlBodyTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.HtmlBody";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.Body";
  }

  private ValueExpression _firstClickPassed;
  final public void setFirstClickPassed(ValueExpression firstClickPassed)
  {
    _firstClickPassed = firstClickPassed;
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

  private ValueExpression _onload;
  final public void setOnload(ValueExpression onload)
  {
    _onload = onload;
  }

  private ValueExpression _onunload;
  final public void setOnunload(ValueExpression onunload)
  {
    _onunload = onunload;
  }

  private ValueExpression _initialFocusId;
  final public void setInitialFocusId(ValueExpression initialFocusId)
  {
    _initialFocusId = initialFocusId;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setProperty(bean, HtmlBody.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, HtmlBody.ONLOAD_KEY, _onload);
    setProperty(bean, HtmlBody.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, HtmlBody.ONMOUSEDOWN_KEY, _onmousedown);
    setProperty(bean, HtmlBody.ONKEYUP_KEY, _onkeyup);
    setProperty(bean, HtmlBody.INITIAL_FOCUS_ID_KEY, _initialFocusId);
    setProperty(bean, HtmlBody.ONDBLCLICK_KEY, _ondblclick);
    setProperty(bean, HtmlBody.ONUNLOAD_KEY, _onunload);
    setProperty(bean, HtmlBody.ONKEYPRESS_KEY, _onkeypress);
    setProperty(bean, HtmlBody.SHORT_DESC_KEY, _shortDesc);
    setProperty(bean, HtmlBody.ONMOUSEUP_KEY, _onmouseup);
    setProperty(bean, HtmlBody.FIRST_CLICK_PASSED_KEY, _firstClickPassed);
    setProperty(bean, HtmlBody.ONCLICK_KEY, _onclick);
    setStringArrayProperty(bean, HtmlBody.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, HtmlBody.ONMOUSEMOVE_KEY, _onmousemove);
    setProperty(bean, HtmlBody.ONMOUSEOVER_KEY, _onmouseover);
    setProperty(bean, HtmlBody.ONKEYDOWN_KEY, _onkeydown);
    setProperty(bean, HtmlBody.ONMOUSEOUT_KEY, _onmouseout);
  }

  @Override
  public void release()
  {
    super.release();
    _inlineStyle = null;
    _onload = null;
    _styleClass = null;
    _onmousedown = null;
    _onkeyup = null;
    _initialFocusId = null;
    _ondblclick = null;
    _onunload = null;
    _onkeypress = null;
    _shortDesc = null;
    _onmouseup = null;
    _firstClickPassed = null;
    _onclick = null;
    _partialTriggers = null;
    _onmousemove = null;
    _onmouseover = null;
    _onkeydown = null;
    _onmouseout = null;
  }
}
