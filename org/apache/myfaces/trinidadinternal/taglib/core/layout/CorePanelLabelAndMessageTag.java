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
import org.apache.myfaces.trinidad.component.core.layout.CorePanelLabelAndMessage;
import org.apache.myfaces.trinidadinternal.taglib.UIXPanelTag;
import org.apache.myfaces.trinidadinternal.taglib.util.VirtualAttributeUtils;

/**
 * Auto-generated tag class.
 */
public class CorePanelLabelAndMessageTag extends UIXPanelTag
{

  /**
   * Construct an instance of the CorePanelLabelAndMessageTag.
   */
  public CorePanelLabelAndMessageTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CorePanelLabelAndMessage";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.LabelAndMessage";
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

  private ValueExpression _showRequired;
  final public void setShowRequired(ValueExpression showRequired)
  {
    _showRequired = showRequired;
  }

  private ValueExpression _label;
  final public void setLabel(ValueExpression label)
  {
    _label = label;
  }

  private ValueExpression _labelStyle;
  final public void setLabelStyle(ValueExpression labelStyle)
  {
    _labelStyle = labelStyle;
  }

  private ValueExpression _accessKey;
  final public void setAccessKey(ValueExpression accessKey)
  {
    _accessKey = accessKey;
  }

  private ValueExpression _labelAndAccessKey;
  final public void setLabelAndAccessKey(ValueExpression labelAndAccessKey)
  {
    _labelAndAccessKey = labelAndAccessKey;
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
    if (_labelAndAccessKey != null)
    {
      if (!_labelAndAccessKey.isLiteralText())
      {
        VirtualAttributeUtils.setAccessKeyAttribute(
          bean,
          _labelAndAccessKey,
          CorePanelLabelAndMessage.LABEL_KEY,
          CorePanelLabelAndMessage.ACCESS_KEY_KEY);
      }
      else
      {
        String s = _labelAndAccessKey.getExpressionString();
        if (s != null)
          VirtualAttributeUtils.setAccessKeyAttribute(
            bean,
            s,
            CorePanelLabelAndMessage.LABEL_KEY,
            CorePanelLabelAndMessage.ACCESS_KEY_KEY);
      }
    }
    setProperty(bean, CorePanelLabelAndMessage.ONDBLCLICK_KEY, _ondblclick);
    setProperty(bean, CorePanelLabelAndMessage.LABEL_STYLE_KEY, _labelStyle);
    setProperty(bean, CorePanelLabelAndMessage.LABEL_KEY, _label);
    setProperty(bean, CorePanelLabelAndMessage.ONMOUSEUP_KEY, _onmouseup);
    setStringArrayProperty(bean, CorePanelLabelAndMessage.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, CorePanelLabelAndMessage.SHOW_REQUIRED_KEY, _showRequired);
    setProperty(bean, CorePanelLabelAndMessage.ONKEYDOWN_KEY, _onkeydown);
    setProperty(bean, CorePanelLabelAndMessage.ONMOUSEOVER_KEY, _onmouseover);
    setProperty(bean, CorePanelLabelAndMessage.ONMOUSEOUT_KEY, _onmouseout);
    setProperty(bean, CorePanelLabelAndMessage.ACCESS_KEY_KEY, _accessKey);
    setProperty(bean, CorePanelLabelAndMessage.FOR_KEY, _for);
    setProperty(bean, CorePanelLabelAndMessage.ONKEYUP_KEY, _onkeyup);
    setProperty(bean, CorePanelLabelAndMessage.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, CorePanelLabelAndMessage.SHORT_DESC_KEY, _shortDesc);
    setProperty(bean, CorePanelLabelAndMessage.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, CorePanelLabelAndMessage.ONMOUSEDOWN_KEY, _onmousedown);
    setProperty(bean, CorePanelLabelAndMessage.ONKEYPRESS_KEY, _onkeypress);
    setProperty(bean, CorePanelLabelAndMessage.ONCLICK_KEY, _onclick);
    setProperty(bean, CorePanelLabelAndMessage.ONMOUSEMOVE_KEY, _onmousemove);
  }

  @Override
  public void release()
  {
    super.release();
    _labelAndAccessKey = null;
    _ondblclick = null;
    _labelStyle = null;
    _label = null;
    _onmouseup = null;
    _partialTriggers = null;
    _showRequired = null;
    _onkeydown = null;
    _onmouseover = null;
    _onmouseout = null;
    _accessKey = null;
    _for = null;
    _onkeyup = null;
    _styleClass = null;
    _shortDesc = null;
    _inlineStyle = null;
    _onmousedown = null;
    _onkeypress = null;
    _onclick = null;
    _onmousemove = null;
  }
}
