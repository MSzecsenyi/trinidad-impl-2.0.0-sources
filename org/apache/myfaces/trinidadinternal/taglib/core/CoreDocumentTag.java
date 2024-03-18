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
package org.apache.myfaces.trinidadinternal.taglib.core;

import javax.el.ValueExpression;
import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.component.core.CoreDocument;
import org.apache.myfaces.trinidadinternal.taglib.UIXDocumentTag;

/**
 * Auto-generated tag class.
 */
public class CoreDocumentTag extends UIXDocumentTag
{

  /**
   * Construct an instance of the CoreDocumentTag.
   */
  public CoreDocumentTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CoreDocument";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.Document";
  }

  private ValueExpression _title;
  final public void setTitle(ValueExpression title)
  {
    _title = title;
  }

  private ValueExpression _stateSaving;
  final public void setStateSaving(ValueExpression stateSaving)
  {
    _stateSaving = stateSaving;
  }

  private ValueExpression _mode;
  final public void setMode(ValueExpression mode)
  {
    _mode = mode;
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
    setProperty(bean, CoreDocument.TITLE_KEY, _title);
    setProperty(bean, CoreDocument.ONCLICK_KEY, _onclick);
    setProperty(bean, CoreDocument.ONMOUSEDOWN_KEY, _onmousedown);
    setProperty(bean, CoreDocument.ONLOAD_KEY, _onload);
    setProperty(bean, CoreDocument.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, CoreDocument.ONMOUSEOVER_KEY, _onmouseover);
    setStringArrayProperty(bean, CoreDocument.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, CoreDocument.ONUNLOAD_KEY, _onunload);
    setProperty(bean, CoreDocument.SHORT_DESC_KEY, _shortDesc);
    setProperty(bean, CoreDocument.ONMOUSEOUT_KEY, _onmouseout);
    setProperty(bean, CoreDocument.ONMOUSEMOVE_KEY, _onmousemove);
    setProperty(bean, CoreDocument.ONDBLCLICK_KEY, _ondblclick);
    setProperty(bean, CoreDocument.STATE_SAVING_KEY, _stateSaving);
    setProperty(bean, CoreDocument.MODE_KEY, _mode);
    setProperty(bean, CoreDocument.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, CoreDocument.ONKEYUP_KEY, _onkeyup);
    setProperty(bean, CoreDocument.ONKEYPRESS_KEY, _onkeypress);
    setProperty(bean, CoreDocument.INITIAL_FOCUS_ID_KEY, _initialFocusId);
    setProperty(bean, CoreDocument.ONMOUSEUP_KEY, _onmouseup);
    setProperty(bean, CoreDocument.ONKEYDOWN_KEY, _onkeydown);
  }

  @Override
  public void release()
  {
    super.release();
    _title = null;
    _onclick = null;
    _onmousedown = null;
    _onload = null;
    _inlineStyle = null;
    _onmouseover = null;
    _partialTriggers = null;
    _onunload = null;
    _shortDesc = null;
    _onmouseout = null;
    _onmousemove = null;
    _ondblclick = null;
    _stateSaving = null;
    _mode = null;
    _styleClass = null;
    _onkeyup = null;
    _onkeypress = null;
    _initialFocusId = null;
    _onmouseup = null;
    _onkeydown = null;
  }
}
