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
import org.apache.myfaces.trinidad.component.core.output.CoreOutputLabel;
import org.apache.myfaces.trinidadinternal.taglib.UIXOutputTag;
import org.apache.myfaces.trinidadinternal.taglib.util.VirtualAttributeUtils;

/**
 * Auto-generated tag class.
 */
public class CoreOutputLabelTag extends UIXOutputTag
{

  /**
   * Construct an instance of the CoreOutputLabelTag.
   */
  public CoreOutputLabelTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CoreOutputLabel";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.Label";
  }

  private ValueExpression _accessKey;
  final public void setAccessKey(ValueExpression accessKey)
  {
    _accessKey = accessKey;
  }

  private ValueExpression _showRequired;
  final public void setShowRequired(ValueExpression showRequired)
  {
    _showRequired = showRequired;
  }

  private ValueExpression _valueAndAccessKey;
  final public void setValueAndAccessKey(ValueExpression valueAndAccessKey)
  {
    _valueAndAccessKey = valueAndAccessKey;
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

  private ValueExpression _for;
  final public void setFor(ValueExpression forParam)
  {
    _for = forParam;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setProperty(bean, CoreOutputLabel.ONMOUSEOUT_KEY, _onmouseout);
    setStringArrayProperty(bean, CoreOutputLabel.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, CoreOutputLabel.ONCLICK_KEY, _onclick);
    setProperty(bean, CoreOutputLabel.ONMOUSEOVER_KEY, _onmouseover);
    setProperty(bean, CoreOutputLabel.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, CoreOutputLabel.ONMOUSEMOVE_KEY, _onmousemove);
    setProperty(bean, CoreOutputLabel.SHOW_REQUIRED_KEY, _showRequired);
    setProperty(bean, CoreOutputLabel.ONMOUSEDOWN_KEY, _onmousedown);
    setProperty(bean, CoreOutputLabel.ONKEYDOWN_KEY, _onkeydown);
    setProperty(bean, CoreOutputLabel.ACCESS_KEY_KEY, _accessKey);
    setProperty(bean, CoreOutputLabel.ONKEYPRESS_KEY, _onkeypress);
    setProperty(bean, CoreOutputLabel.FOR_KEY, _for);
    setProperty(bean, CoreOutputLabel.ONDBLCLICK_KEY, _ondblclick);
    setProperty(bean, CoreOutputLabel.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, CoreOutputLabel.ONKEYUP_KEY, _onkeyup);
    setProperty(bean, CoreOutputLabel.ONMOUSEUP_KEY, _onmouseup);
    if (_valueAndAccessKey != null)
    {
      if (!_valueAndAccessKey.isLiteralText())
      {
        VirtualAttributeUtils.setAccessKeyAttribute(
          bean,
          _valueAndAccessKey,
          CoreOutputLabel.VALUE_KEY,
          CoreOutputLabel.ACCESS_KEY_KEY);
      }
      else
      {
        String s = _valueAndAccessKey.getExpressionString();
        if (s != null)
          VirtualAttributeUtils.setAccessKeyAttribute(
            bean,
            s,
            CoreOutputLabel.VALUE_KEY,
            CoreOutputLabel.ACCESS_KEY_KEY);
      }
    }
    setProperty(bean, CoreOutputLabel.SHORT_DESC_KEY, _shortDesc);
  }

  @Override
  public void release()
  {
    super.release();
    _onmouseout = null;
    _partialTriggers = null;
    _onclick = null;
    _onmouseover = null;
    _inlineStyle = null;
    _onmousemove = null;
    _showRequired = null;
    _onmousedown = null;
    _onkeydown = null;
    _accessKey = null;
    _onkeypress = null;
    _for = null;
    _ondblclick = null;
    _styleClass = null;
    _onkeyup = null;
    _onmouseup = null;
    _valueAndAccessKey = null;
    _shortDesc = null;
  }
}
