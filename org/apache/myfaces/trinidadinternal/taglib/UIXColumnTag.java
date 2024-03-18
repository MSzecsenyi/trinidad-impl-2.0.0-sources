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
import org.apache.myfaces.trinidad.component.UIXColumn;
import org.apache.myfaces.trinidad.webapp.UIXComponentELTag;

/**
 * Auto-generated tag class.
 */
abstract public class UIXColumnTag extends UIXComponentELTag
{

  /**
   * Construct an instance of the UIXColumnTag.
   */
  public UIXColumnTag()
  {
  }

  private ValueExpression _sortProperty;
  final public void setSortProperty(ValueExpression sortProperty)
  {
    _sortProperty = sortProperty;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setProperty(bean, UIXColumn.SORT_PROPERTY_KEY, _sortProperty);
  }

  @Override
  public void release()
  {
    super.release();
    _sortProperty = null;
  }
}
