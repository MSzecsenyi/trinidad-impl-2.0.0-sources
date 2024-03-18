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
import org.apache.myfaces.trinidad.component.core.CoreForm;
import org.apache.myfaces.trinidadinternal.taglib.UIXFormTag;

/**
 * Auto-generated tag class.
 */
public class CoreFormTag extends UIXFormTag
{

  /**
   * Construct an instance of the CoreFormTag.
   */
  public CoreFormTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CoreForm";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.Form";
  }

  private ValueExpression _targetFrame;
  final public void setTargetFrame(ValueExpression targetFrame)
  {
    _targetFrame = targetFrame;
  }

  private ValueExpression _usesUpload;
  final public void setUsesUpload(ValueExpression usesUpload)
  {
    _usesUpload = usesUpload;
  }

  private ValueExpression _autoComplete;
  final public void setAutoComplete(ValueExpression autoComplete)
  {
    _autoComplete = autoComplete;
  }

  private ValueExpression _defaultCommand;
  final public void setDefaultCommand(ValueExpression defaultCommand)
  {
    _defaultCommand = defaultCommand;
  }

  private ValueExpression _onsubmit;
  final public void setOnsubmit(ValueExpression onsubmit)
  {
    _onsubmit = onsubmit;
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
    setProperty(bean, CoreForm.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, CoreForm.AUTO_COMPLETE_KEY, _autoComplete);
    setProperty(bean, CoreForm.ONKEYUP_KEY, _onkeyup);
    setProperty(bean, CoreForm.ONMOUSEUP_KEY, _onmouseup);
    setProperty(bean, CoreForm.ONKEYPRESS_KEY, _onkeypress);
    setProperty(bean, CoreForm.TARGET_FRAME_KEY, _targetFrame);
    setProperty(bean, CoreForm.ONMOUSEDOWN_KEY, _onmousedown);
    setProperty(bean, CoreForm.DEFAULT_COMMAND_KEY, _defaultCommand);
    setProperty(bean, CoreForm.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, CoreForm.ONCLICK_KEY, _onclick);
    setProperty(bean, CoreForm.SHORT_DESC_KEY, _shortDesc);
    setStringArrayProperty(bean, CoreForm.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, CoreForm.USES_UPLOAD_KEY, _usesUpload);
    setProperty(bean, CoreForm.ONMOUSEOUT_KEY, _onmouseout);
    setProperty(bean, CoreForm.ONSUBMIT_KEY, _onsubmit);
    setProperty(bean, CoreForm.ONMOUSEOVER_KEY, _onmouseover);
    setProperty(bean, CoreForm.ONKEYDOWN_KEY, _onkeydown);
    setProperty(bean, CoreForm.ONDBLCLICK_KEY, _ondblclick);
    setProperty(bean, CoreForm.ONMOUSEMOVE_KEY, _onmousemove);
  }

  @Override
  public void release()
  {
    super.release();
    _styleClass = null;
    _autoComplete = null;
    _onkeyup = null;
    _onmouseup = null;
    _onkeypress = null;
    _targetFrame = null;
    _onmousedown = null;
    _defaultCommand = null;
    _inlineStyle = null;
    _onclick = null;
    _shortDesc = null;
    _partialTriggers = null;
    _usesUpload = null;
    _onmouseout = null;
    _onsubmit = null;
    _onmouseover = null;
    _onkeydown = null;
    _ondblclick = null;
    _onmousemove = null;
  }
}
