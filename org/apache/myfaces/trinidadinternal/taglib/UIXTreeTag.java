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
import org.apache.myfaces.trinidad.component.UIXTree;

/**
 * Auto-generated tag class.
 */
abstract public class UIXTreeTag extends UIXCollectionTag
{

  /**
   * Construct an instance of the UIXTreeTag.
   */
  public UIXTreeTag()
  {
  }

  private ValueExpression _selectedRowKeys;
  final public void setSelectedRowKeys(ValueExpression selectedRowKeys)
  {
    _selectedRowKeys = selectedRowKeys;
  }

  private ValueExpression _immediate;
  final public void setImmediate(ValueExpression immediate)
  {
    _immediate = immediate;
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

  private MethodExpression _selectionListener;
  final public void setSelectionListener(MethodExpression selectionListener)
  {
    _selectionListener = selectionListener;
  }

  private java.lang.String _varStatus;
  final public void setVarStatus(java.lang.String varStatus)
  {
    _varStatus = varStatus;
  }

  private ValueExpression _value;
  final public void setValue(ValueExpression value)
  {
    _value = value;
  }

  private ValueExpression _focusRowKey;
  final public void setFocusRowKey(ValueExpression focusRowKey)
  {
    _focusRowKey = focusRowKey;
  }

  private MethodExpression _focusListener;
  final public void setFocusListener(MethodExpression focusListener)
  {
    _focusListener = focusListener;
  }

  private ValueExpression _initiallyExpanded;
  final public void setInitiallyExpanded(ValueExpression initiallyExpanded)
  {
    _initiallyExpanded = initiallyExpanded;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    bean.setProperty(UIXTree.SELECTION_LISTENER_KEY, _selectionListener);
    setProperty(bean, UIXTree.DISCLOSED_ROW_KEYS_KEY, _disclosedRowKeys);
    bean.setProperty(UIXTree.VAR_STATUS_KEY, _varStatus);
    setProperty(bean, UIXTree.IMMEDIATE_KEY, _immediate);
    setProperty(bean, UIXTree.INITIALLY_EXPANDED_KEY, _initiallyExpanded);
    setProperty(bean, UIXTree.SELECTED_ROW_KEYS_KEY, _selectedRowKeys);
    setProperty(bean, UIXTree.VALUE_KEY, _value);
    bean.setProperty(UIXTree.FOCUS_LISTENER_KEY, _focusListener);
    setProperty(bean, UIXTree.FOCUS_ROW_KEY_KEY, _focusRowKey);
    bean.setProperty(UIXTree.ROW_DISCLOSURE_LISTENER_KEY, _rowDisclosureListener);
  }

  @Override
  public void release()
  {
    super.release();
    _selectionListener = null;
    _disclosedRowKeys = null;
    _varStatus = null;
    _immediate = null;
    _initiallyExpanded = null;
    _selectedRowKeys = null;
    _value = null;
    _focusListener = null;
    _focusRowKey = null;
    _rowDisclosureListener = null;
  }
}
