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
package org.apache.myfaces.trinidadinternal.taglib;

import javax.el.ValueExpression;
import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.component.UIXGroup;
import org.apache.myfaces.trinidad.webapp.UIXComponentELTag;

/**
 * Auto-generated tag class.
 */
public class UIXGroupTag extends UIXComponentELTag
{

  /**
   * Construct an instance of the UIXGroupTag.
   */
  public UIXGroupTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.Group";
  }

  public String getRendererType()
  {
    return null;
  }

  private ValueExpression _startBoundary;
  final public void setStartBoundary(ValueExpression startBoundary)
  {
    _startBoundary = startBoundary;
  }

  private ValueExpression _endBoundary;
  final public void setEndBoundary(ValueExpression endBoundary)
  {
    _endBoundary = endBoundary;
  }

  private ValueExpression _title;
  final public void setTitle(ValueExpression title)
  {
    _title = title;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setProperty(bean, UIXGroup.TITLE_KEY, _title);
    setProperty(bean, UIXGroup.START_BOUNDARY_KEY, _startBoundary);
    setProperty(bean, UIXGroup.END_BOUNDARY_KEY, _endBoundary);
  }

  @Override
  public void release()
  {
    super.release();
    _title = null;
    _startBoundary = null;
    _endBoundary = null;
  }
}
