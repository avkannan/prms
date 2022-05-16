/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.ace.prms.sb.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides a wrapper for {@link plantationService}.
 *
 * @author Brian Wing Shun Chan
 * @see plantationService
 * @generated
 */
@ProviderType
public class plantationServiceWrapper
	implements plantationService, ServiceWrapper<plantationService> {

	public plantationServiceWrapper(plantationService plantationService) {
		_plantationService = plantationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _plantationService.getOSGiServiceIdentifier();
	}

	@Override
	public plantationService getWrappedService() {
		return _plantationService;
	}

	@Override
	public void setWrappedService(plantationService plantationService) {
		_plantationService = plantationService;
	}

	private plantationService _plantationService;

}