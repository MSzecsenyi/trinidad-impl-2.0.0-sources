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
import org.apache.myfaces.trinidad.component.core.layout.CorePanelPage;
import org.apache.myfaces.trinidadinternal.taglib.UIXPanelTag;

/**
 * Auto-generated tag class.
 */
public class CorePanelPageTag extends UIXPanelTag
{

  /**
   * Construct an instance of the CorePanelPageTag.
   */
  public CorePanelPageTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CorePanelPage";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.Page";
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

  private ValueExpression _auxiliary1Size;
  final public void setAuxiliary1Size(ValueExpression auxiliary1Size)
  {
    _auxiliary1Size = auxiliary1Size;
  }

  private ValueExpression _auxiliary2Size;
  final public void setAuxiliary2Size(ValueExpression auxiliary2Size)
  {
    _auxiliary2Size = auxiliary2Size;
  }

  private ValueExpression _auxiliaryGlobalSize;
  final public void setAuxiliaryGlobalSize(ValueExpression auxiliaryGlobalSize)
  {
    _auxiliaryGlobalSize = auxiliaryGlobalSize;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setStringArrayProperty(bean, CorePanelPage.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, CorePanelPage.ONMOUSEUP_KEY, _onmouseup);
    setProperty(bean, CorePanelPage.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, CorePanelPage.SHORT_DESC_KEY, _shortDesc);
    setProperty(bean, CorePanelPage.ONMOUSEMOVE_KEY, _onmousemove);
    setProperty(bean, CorePanelPage.ONMOUSEOUT_KEY, _onmouseout);
    setProperty(bean, CorePanelPage.AUXILIARY_GLOBAL_SIZE_KEY, _auxiliaryGlobalSize);
    setProperty(bean, CorePanelPage.ONKEYUP_KEY, _onkeyup);
    setProperty(bean, CorePanelPage.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, CorePanelPage.ONMOUSEOVER_KEY, _onmouseover);
    setProperty(bean, CorePanelPage.ONKEYPRESS_KEY, _onkeypress);
    setProperty(bean, CorePanelPage.ONMOUSEDOWN_KEY, _onmousedown);
    setProperty(bean, CorePanelPage.ONCLICK_KEY, _onclick);
    setProperty(bean, CorePanelPage.ONDBLCLICK_KEY, _ondblclick);
    setProperty(bean, CorePanelPage.AUXILIARY1SIZE_KEY, _auxiliary1Size);
    setProperty(bean, CorePanelPage.ONKEYDOWN_KEY, _onkeydown);
    setProperty(bean, CorePanelPage.AUXILIARY2SIZE_KEY, _auxiliary2Size);
  }

  @Override
  public void release()
  {
    super.release();
    _partialTriggers = null;
    _onmouseup = null;
    _styleClass = null;
    _shortDesc = null;
    _onmousemove = null;
    _onmouseout = null;
    _auxiliaryGlobalSize = null;
    _onkeyup = null;
    _inlineStyle = null;
    _onmouseover = null;
    _onkeypress = null;
    _onmousedown = null;
    _onclick = null;
    _ondblclick = null;
    _auxiliary1Size = null;
    _onkeydown = null;
    _auxiliary2Size = null;
  }
}
