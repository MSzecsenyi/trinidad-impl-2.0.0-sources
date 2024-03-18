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
package org.apache.myfaces.trinidadinternal.taglib.html;

import javax.el.ValueExpression;
import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.component.html.HtmlMeta;
import org.apache.myfaces.trinidad.webapp.UIXComponentELTag;

/**
 * Auto-generated tag class.
 */
public class HtmlMetaTag extends UIXComponentELTag
{

  /**
   * Construct an instance of the HtmlMetaTag.
   */
  public HtmlMetaTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.HtmlMeta";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.Meta";
  }

  private ValueExpression _name;
  final public void setName(ValueExpression name)
  {
    _name = name;
  }

  private ValueExpression _type;
  final public void setType(ValueExpression type)
  {
    _type = type;
  }

  private ValueExpression _content;
  final public void setContent(ValueExpression content)
  {
    _content = content;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setProperty(bean, HtmlMeta.CONTENT_KEY, _content);
    setProperty(bean, HtmlMeta.TYPE_KEY, _type);
    setProperty(bean, HtmlMeta.NAME_KEY, _name);
  }

  @Override
  public void release()
  {
    super.release();
    _content = null;
    _type = null;
    _name = null;
  }
}
