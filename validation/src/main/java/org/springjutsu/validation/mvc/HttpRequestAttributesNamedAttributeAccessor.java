/*
 * Copyright 2010-2013 Duplichien, Wicksell, Springjutsu.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springjutsu.validation.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springjutsu.validation.spel.AbstractNamedAttributeAccessor;

/**
 * Provides Map-like SPEL access semantics for Request Attributes.
 * @author Clark Duplichien
 *
 */
public class HttpRequestAttributesNamedAttributeAccessor extends AbstractNamedAttributeAccessor {
	
	private HttpServletRequest request;
	
	/**
	 * Default constructor
	 * @param request The current request
	 */
	public HttpRequestAttributesNamedAttributeAccessor(HttpServletRequest request) {
		this.request = request;
	}

	/**
	 * Retreives a request attribute
	 */
	@Override
	public Object get(String key) {
		return request.getAttribute(key);
	}

	/**
	 * Sets a request attribute
	 */
	@Override
	public void set(String key, Object value) {
		request.setAttribute(key, value);
	}

}
