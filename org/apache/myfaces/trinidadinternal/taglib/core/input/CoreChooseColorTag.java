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

import java.text.ParseException;
import javax.el.ValueExpression;
import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.component.core.input.CoreChooseColor;
import org.apache.myfaces.trinidadinternal.taglib.UIXChooseTag;
import org.apache.myfaces.trinidadinternal.taglib.util.TagUtils;

/**
 * Auto-generated tag class.
 */
public class CoreChooseColorTag extends UIXChooseTag
{

  /**
   * Construct an instance of the CoreChooseColorTag.
   */
  public CoreChooseColorTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CoreChooseColor";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.Color";
  }

  private ValueExpression _colorData;
  final public void setColorData(ValueExpression colorData)
  {
    _colorData = colorData;
  }

  private ValueExpression _customColorData;
  final public void setCustomColorData(ValueExpression customColorData)
  {
    _customColorData = customColorData;
  }

  private ValueExpression _width;
  final public void setWidth(ValueExpression width)
  {
    _width = width;
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
    setProperty(bean, CoreChooseColor.ONKEYUP_KEY, _onkeyup);
    setStringArrayProperty(bean, CoreChooseColor.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, CoreChooseColor.WIDTH_KEY, _width);
    setProperty(bean, CoreChooseColor.ONMOUSEMOVE_KEY, _onmousemove);
    setProperty(bean, CoreChooseColor.ONMOUSEOVER_KEY, _onmouseover);
    setProperty(bean, CoreChooseColor.ONCLICK_KEY, _onclick);
    setProperty(bean, CoreChooseColor.ONKEYPRESS_KEY, _onkeypress);
    if (_customColorData != null)
    {
      if (!_customColorData.isLiteralText())
      {
        bean.setValueExpression(CoreChooseColor.CUSTOM_COLOR_DATA_KEY, _customColorData);
      }
      else
      {
        String s = _customColorData.getExpressionString();
        if (s != null)
          {
          try
          {
            bean.setProperty(CoreChooseColor.CUSTOM_COLOR_DATA_KEY,
                             TagUtils.getColorList(s));
          }
          catch (ParseException pe)
          {
            setValidationError(
              pe.getMessage() + ": " + "Position " + pe.getErrorOffset());
          }
        }
      }
    }
    if (_colorData != null)
    {
      if (!_colorData.isLiteralText())
      {
        bean.setValueExpression(CoreChooseColor.COLOR_DATA_KEY, _colorData);
      }
      else
      {
        String s = _colorData.getExpressionString();
        if (s != null)
          {
          try
          {
            bean.setProperty(CoreChooseColor.COLOR_DATA_KEY,
                             TagUtils.getColorList(s));
          }
          catch (ParseException pe)
          {
            setValidationError(
              pe.getMessage() + ": " + "Position " + pe.getErrorOffset());
          }
        }
      }
    }
    setProperty(bean, CoreChooseColor.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, CoreChooseColor.ONDBLCLICK_KEY, _ondblclick);
    setProperty(bean, CoreChooseColor.ONMOUSEDOWN_KEY, _onmousedown);
    setProperty(bean, CoreChooseColor.ONKEYDOWN_KEY, _onkeydown);
    setProperty(bean, CoreChooseColor.SHORT_DESC_KEY, _shortDesc);
    setProperty(bean, CoreChooseColor.ONMOUSEUP_KEY, _onmouseup);
    setProperty(bean, CoreChooseColor.ONMOUSEOUT_KEY, _onmouseout);
    setProperty(bean, CoreChooseColor.INLINE_STYLE_KEY, _inlineStyle);
  }

  @Override
  public void release()
  {
    super.release();
    _onkeyup = null;
    _partialTriggers = null;
    _width = null;
    _onmousemove = null;
    _onmouseover = null;
    _onclick = null;
    _onkeypress = null;
    _customColorData = null;
    _colorData = null;
    _styleClass = null;
    _ondblclick = null;
    _onmousedown = null;
    _onkeydown = null;
    _shortDesc = null;
    _onmouseup = null;
    _onmouseout = null;
    _inlineStyle = null;
  }
}
