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
import org.apache.myfaces.trinidad.component.html.HtmlScript;
import org.apache.myfaces.trinidad.webapp.UIXComponentELTag;

/**
 * Auto-generated tag class.
 */
public class HtmlScriptTag extends UIXComponentELTag
{

  /**
   * Construct an instance of the HtmlScriptTag.
   */
  public HtmlScriptTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.HtmlScript";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.Script";
  }

  private ValueExpression _text;
  final public void setText(ValueExpression text)
  {
    _text = text;
  }

  private ValueExpression _source;
  final public void setSource(ValueExpression source)
  {
    _source = source;
  }

  private ValueExpression _generatesContent;
  final public void setGeneratesContent(ValueExpression generatesContent)
  {
    _generatesContent = generatesContent;
  }

  private ValueExpression _partialTriggers;
  final public void setPartialTriggers(ValueExpression partialTriggers)
  {
    _partialTriggers = partialTriggers;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setStringArrayProperty(bean, HtmlScript.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, HtmlScript.GENERATES_CONTENT_KEY, _generatesContent);
    setProperty(bean, HtmlScript.TEXT_KEY, _text);
    setProperty(bean, HtmlScript.SOURCE_KEY, _source);
  }

  @Override
  public void release()
  {
    super.release();
    _partialTriggers = null;
    _generatesContent = null;
    _text = null;
    _source = null;
  }
}
