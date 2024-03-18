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
import org.apache.myfaces.trinidad.component.core.layout.CorePanelChoice;
import org.apache.myfaces.trinidadinternal.taglib.UIXShowOneTag;
import org.apache.myfaces.trinidadinternal.taglib.util.VirtualAttributeUtils;

/**
 * Auto-generated tag class.
 */
public class CorePanelChoiceTag extends UIXShowOneTag
{

  /**
   * Construct an instance of the CorePanelChoiceTag.
   */
  public CorePanelChoiceTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CorePanelChoice";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.Choice";
  }

  private ValueExpression _label;
  final public void setLabel(ValueExpression label)
  {
    _label = label;
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

  private ValueExpression _position;
  final public void setPosition(ValueExpression position)
  {
    _position = position;
  }

  private ValueExpression _alignment;
  final public void setAlignment(ValueExpression alignment)
  {
    _alignment = alignment;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setProperty(bean, CorePanelChoice.ALIGNMENT_KEY, _alignment);
    setProperty(bean, CorePanelChoice.ONKEYPRESS_KEY, _onkeypress);
    setProperty(bean, CorePanelChoice.ONCLICK_KEY, _onclick);
    setProperty(bean, CorePanelChoice.ACCESS_KEY_KEY, _accessKey);
    setProperty(bean, CorePanelChoice.ONMOUSEOUT_KEY, _onmouseout);
    setProperty(bean, CorePanelChoice.ONMOUSEUP_KEY, _onmouseup);
    setProperty(bean, CorePanelChoice.ONMOUSEMOVE_KEY, _onmousemove);
    setProperty(bean, CorePanelChoice.ONMOUSEDOWN_KEY, _onmousedown);
    setProperty(bean, CorePanelChoice.ONKEYUP_KEY, _onkeyup);
    setProperty(bean, CorePanelChoice.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, CorePanelChoice.POSITION_KEY, _position);
    setProperty(bean, CorePanelChoice.ONMOUSEOVER_KEY, _onmouseover);
    setProperty(bean, CorePanelChoice.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, CorePanelChoice.LABEL_KEY, _label);
    setStringArrayProperty(bean, CorePanelChoice.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, CorePanelChoice.SHORT_DESC_KEY, _shortDesc);
    setProperty(bean, CorePanelChoice.ONKEYDOWN_KEY, _onkeydown);
    if (_labelAndAccessKey != null)
    {
      if (!_labelAndAccessKey.isLiteralText())
      {
        VirtualAttributeUtils.setAccessKeyAttribute(
          bean,
          _labelAndAccessKey,
          CorePanelChoice.LABEL_KEY,
          CorePanelChoice.ACCESS_KEY_KEY);
      }
      else
      {
        String s = _labelAndAccessKey.getExpressionString();
        if (s != null)
          VirtualAttributeUtils.setAccessKeyAttribute(
            bean,
            s,
            CorePanelChoice.LABEL_KEY,
            CorePanelChoice.ACCESS_KEY_KEY);
      }
    }
    setProperty(bean, CorePanelChoice.ONDBLCLICK_KEY, _ondblclick);
  }

  @Override
  public void release()
  {
    super.release();
    _alignment = null;
    _onkeypress = null;
    _onclick = null;
    _accessKey = null;
    _onmouseout = null;
    _onmouseup = null;
    _onmousemove = null;
    _onmousedown = null;
    _onkeyup = null;
    _inlineStyle = null;
    _position = null;
    _onmouseover = null;
    _styleClass = null;
    _label = null;
    _partialTriggers = null;
    _shortDesc = null;
    _onkeydown = null;
    _labelAndAccessKey = null;
    _ondblclick = null;
  }
}
