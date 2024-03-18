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
package org.apache.myfaces.trinidadinternal.taglib.core.output;

import javax.el.ValueExpression;
import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.component.core.output.CoreMessage;
import org.apache.myfaces.trinidadinternal.taglib.UIXMessageTag;

/**
 * Auto-generated tag class.
 */
public class CoreMessageTag extends UIXMessageTag
{

  /**
   * Construct an instance of the CoreMessageTag.
   */
  public CoreMessageTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CoreMessage";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.Message";
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

  private ValueExpression _message;
  final public void setMessage(ValueExpression message)
  {
    _message = message;
  }

  private ValueExpression _messageType;
  final public void setMessageType(ValueExpression messageType)
  {
    _messageType = messageType;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setProperty(bean, CoreMessage.ONMOUSEDOWN_KEY, _onmousedown);
    setProperty(bean, CoreMessage.ONDBLCLICK_KEY, _ondblclick);
    setProperty(bean, CoreMessage.ONMOUSEMOVE_KEY, _onmousemove);
    setProperty(bean, CoreMessage.ONKEYUP_KEY, _onkeyup);
    setProperty(bean, CoreMessage.ONKEYDOWN_KEY, _onkeydown);
    setProperty(bean, CoreMessage.ONKEYPRESS_KEY, _onkeypress);
    setProperty(bean, CoreMessage.ONMOUSEOUT_KEY, _onmouseout);
    setProperty(bean, CoreMessage.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, CoreMessage.MESSAGE_KEY, _message);
    setStringArrayProperty(bean, CoreMessage.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, CoreMessage.MESSAGE_TYPE_KEY, _messageType);
    setProperty(bean, CoreMessage.SHORT_DESC_KEY, _shortDesc);
    setProperty(bean, CoreMessage.ONMOUSEOVER_KEY, _onmouseover);
    setProperty(bean, CoreMessage.ONCLICK_KEY, _onclick);
    setProperty(bean, CoreMessage.ONMOUSEUP_KEY, _onmouseup);
    setProperty(bean, CoreMessage.STYLE_CLASS_KEY, _styleClass);
  }

  @Override
  public void release()
  {
    super.release();
    _onmousedown = null;
    _ondblclick = null;
    _onmousemove = null;
    _onkeyup = null;
    _onkeydown = null;
    _onkeypress = null;
    _onmouseout = null;
    _inlineStyle = null;
    _message = null;
    _partialTriggers = null;
    _messageType = null;
    _shortDesc = null;
    _onmouseover = null;
    _onclick = null;
    _onmouseup = null;
    _styleClass = null;
  }
}
