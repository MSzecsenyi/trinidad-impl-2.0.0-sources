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
import org.apache.myfaces.trinidad.component.UIXTreeTable;

/**
 * Auto-generated tag class.
 */
abstract public class UIXTreeTableTag extends UIXTreeTag
{

  /**
   * Construct an instance of the UIXTreeTableTag.
   */
  public UIXTreeTableTag()
  {
  }

  private ValueExpression _rootNodeRendered;
  final public void setRootNodeRendered(ValueExpression rootNodeRendered)
  {
    _rootNodeRendered = rootNodeRendered;
  }

  private ValueExpression _rowsByDepth;
  final public void setRowsByDepth(ValueExpression rowsByDepth)
  {
    _rowsByDepth = rowsByDepth;
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
    setProperty(bean, UIXTreeTable.ROOT_NODE_RENDERED_KEY, _rootNodeRendered);
    setIntArrayProperty(bean, UIXTreeTable.ROWS_BY_DEPTH_KEY, _rowsByDepth);
    bean.setProperty(UIXTreeTable.RANGE_CHANGE_LISTENER_KEY, _rangeChangeListener);
  }

  @Override
  public void release()
  {
    super.release();
    _rootNodeRendered = null;
    _rowsByDepth = null;
    _rangeChangeListener = null;
  }
}
