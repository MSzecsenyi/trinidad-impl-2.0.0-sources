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

import javax.el.MethodExpression;
import javax.el.ValueExpression;
import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.component.UIXShowDetail;
import org.apache.myfaces.trinidad.webapp.UIXComponentELTag;

/**
 * Auto-generated tag class.
 */
abstract public class UIXShowDetailTag extends UIXComponentELTag
{

  /**
   * Construct an instance of the UIXShowDetailTag.
   */
  public UIXShowDetailTag()
  {
  }

  private ValueExpression _disclosed;
  final public void setDisclosed(ValueExpression disclosed)
  {
    _disclosed = disclosed;
  }

  private ValueExpression _disclosedTransient;
  final public void setDisclosedTransient(ValueExpression disclosedTransient)
  {
    _disclosedTransient = disclosedTransient;
  }

  private ValueExpression _immediate;
  final public void setImmediate(ValueExpression immediate)
  {
    _immediate = immediate;
  }

  private MethodExpression _disclosureListener;
  final public void setDisclosureListener(MethodExpression disclosureListener)
  {
    _disclosureListener = disclosureListener;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    bean.setProperty(UIXShowDetail.DISCLOSURE_LISTENER_KEY, _disclosureListener);
    setProperty(bean, UIXShowDetail.DISCLOSED_KEY, _disclosed);
    setProperty(bean, UIXShowDetail.IMMEDIATE_KEY, _immediate);
    setProperty(bean, UIXShowDetail.DISCLOSED_TRANSIENT_KEY, _disclosedTransient);
  }

  @Override
  public void release()
  {
    super.release();
    _disclosureListener = null;
    _disclosed = null;
    _immediate = null;
    _disclosedTransient = null;
  }
}
