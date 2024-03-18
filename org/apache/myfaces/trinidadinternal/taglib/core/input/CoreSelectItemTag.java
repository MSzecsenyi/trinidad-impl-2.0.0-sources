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

import javax.el.ValueExpression;
import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.component.core.input.CoreSelectItem;
import org.apache.myfaces.trinidadinternal.taglib.UIXSelectItemTag;

/**
 * Auto-generated tag class.
 */
public class CoreSelectItemTag extends UIXSelectItemTag
{

  /**
   * Construct an instance of the CoreSelectItemTag.
   */
  public CoreSelectItemTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CoreSelectItem";
  }

  public String getRendererType()
  {
    return null;
  }

  private ValueExpression _label;
  final public void setLabel(ValueExpression label)
  {
    _label = label;
  }

  private ValueExpression _disabled;
  final public void setDisabled(ValueExpression disabled)
  {
    _disabled = disabled;
  }

  private ValueExpression _longDesc;
  final public void setLongDesc(ValueExpression longDesc)
  {
    _longDesc = longDesc;
  }

  private ValueExpression _shortDesc;
  final public void setShortDesc(ValueExpression shortDesc)
  {
    _shortDesc = shortDesc;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setProperty(bean, CoreSelectItem.LONG_DESC_KEY, _longDesc);
    setProperty(bean, CoreSelectItem.SHORT_DESC_KEY, _shortDesc);
    setProperty(bean, CoreSelectItem.LABEL_KEY, _label);
    setProperty(bean, CoreSelectItem.DISABLED_KEY, _disabled);
  }

  @Override
  public void release()
  {
    super.release();
    _longDesc = null;
    _shortDesc = null;
    _label = null;
    _disabled = null;
  }
}
