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
import org.apache.myfaces.trinidad.component.UIXTable;

/**
 * Auto-generated tag class.
 */
abstract public class UIXTableTag extends UIXIteratorTag
{

  /**
   * Construct an instance of the UIXTableTag.
   */
  public UIXTableTag()
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

  private MethodExpression _selectionListener;
  final public void setSelectionListener(MethodExpression selectionListener)
  {
    _selectionListener = selectionListener;
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

  private MethodExpression _sortListener;
  final public void setSortListener(MethodExpression sortListener)
  {
    _sortListener = sortListener;
  }

  private MethodExpression _rangeChangeListener;
  final public void setRangeChangeListener(MethodExpression rangeChangeListener)
  {
    _rangeChangeListener = rangeChangeListener;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    bean.setProperty(UIXTable.SORT_LISTENER_KEY, _sortListener);
    bean.setProperty(UIXTable.ROW_DISCLOSURE_LISTENER_KEY, _rowDisclosureListener);
    setProperty(bean, UIXTable.DISCLOSED_ROW_KEYS_KEY, _disclosedRowKeys);
    bean.setProperty(UIXTable.RANGE_CHANGE_LISTENER_KEY, _rangeChangeListener);
    setProperty(bean, UIXTable.SELECTED_ROW_KEYS_KEY, _selectedRowKeys);
    bean.setProperty(UIXTable.SELECTION_LISTENER_KEY, _selectionListener);
    setProperty(bean, UIXTable.IMMEDIATE_KEY, _immediate);
  }

  @Override
  public void release()
  {
    super.release();
    _sortListener = null;
    _rowDisclosureListener = null;
    _disclosedRowKeys = null;
    _rangeChangeListener = null;
    _selectedRowKeys = null;
    _selectionListener = null;
    _immediate = null;
  }
}
