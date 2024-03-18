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
import org.apache.myfaces.trinidad.component.UIXPage;

/**
 * Auto-generated tag class.
 */
abstract public class UIXPageTag extends UIXCollectionTag
{

  /**
   * Construct an instance of the UIXPageTag.
   */
  public UIXPageTag()
  {
  }

  private MethodExpression _rowDisclosureListener;
  final public void setRowDisclosureListener(MethodExpression rowDisclosureListener)
  {
    _rowDisclosureListener = rowDisclosureListener;
  }

  private ValueExpression _disclosedRowKeys;
  final public void setDisclosedRowKeys(ValueExpression disclosedRowKeys)
  {
    _disclosedRowKeys = disclosedRowKeys;
  }

  private ValueExpression _value;
  final public void setValue(ValueExpression value)
  {
    _value = value;
  }

  private java.lang.String _varStatus;
  final public void setVarStatus(java.lang.String varStatus)
  {
    _varStatus = varStatus;
  }

  private ValueExpression _immediate;
  final public void setImmediate(ValueExpression immediate)
  {
    _immediate = immediate;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    bean.setProperty(UIXPage.VAR_STATUS_KEY, _varStatus);
    setProperty(bean, UIXPage.IMMEDIATE_KEY, _immediate);
    setProperty(bean, UIXPage.VALUE_KEY, _value);
    setProperty(bean, UIXPage.DISCLOSED_ROW_KEYS_KEY, _disclosedRowKeys);
    bean.setProperty(UIXPage.ROW_DISCLOSURE_LISTENER_KEY, _rowDisclosureListener);
  }

  @Override
  public void release()
  {
    super.release();
    _varStatus = null;
    _immediate = null;
    _value = null;
    _disclosedRowKeys = null;
    _rowDisclosureListener = null;
  }
}
