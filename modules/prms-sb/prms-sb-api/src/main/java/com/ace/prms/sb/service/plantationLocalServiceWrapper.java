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
 * Provides a wrapper for {@link plantationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see plantationLocalService
 * @generated
 */
@ProviderType
public class plantationLocalServiceWrapper
	implements plantationLocalService, ServiceWrapper<plantationLocalService> {

	public plantationLocalServiceWrapper(
		plantationLocalService plantationLocalService) {

		_plantationLocalService = plantationLocalService;
	}

	/**
	 * Adds the plantation to the database. Also notifies the appropriate model listeners.
	 *
	 * @param plantation the plantation
	 * @return the plantation that was added
	 */
	@Override
	public com.ace.prms.sb.model.plantation addplantation(
		com.ace.prms.sb.model.plantation plantation) {

		return _plantationLocalService.addplantation(plantation);
	}

	/**
	 * Creates a new plantation with the primary key. Does not add the plantation to the database.
	 *
	 * @param plantId the primary key for the new plantation
	 * @return the new plantation
	 */
	@Override
	public com.ace.prms.sb.model.plantation createplantation(long plantId) {
		return _plantationLocalService.createplantation(plantId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _plantationLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the plantation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param plantId the primary key of the plantation
	 * @return the plantation that was removed
	 * @throws PortalException if a plantation with the primary key could not be found
	 */
	@Override
	public com.ace.prms.sb.model.plantation deleteplantation(long plantId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _plantationLocalService.deleteplantation(plantId);
	}

	/**
	 * Deletes the plantation from the database. Also notifies the appropriate model listeners.
	 *
	 * @param plantation the plantation
	 * @return the plantation that was removed
	 */
	@Override
	public com.ace.prms.sb.model.plantation deleteplantation(
		com.ace.prms.sb.model.plantation plantation) {

		return _plantationLocalService.deleteplantation(plantation);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _plantationLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _plantationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.ace.prms.sb.model.impl.plantationModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _plantationLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.ace.prms.sb.model.impl.plantationModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _plantationLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _plantationLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _plantationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.ace.prms.sb.model.plantation fetchplantation(long plantId) {
		return _plantationLocalService.fetchplantation(plantId);
	}

	/**
	 * Returns the plantation matching the UUID and group.
	 *
	 * @param uuid the plantation's UUID
	 * @param groupId the primary key of the group
	 * @return the matching plantation, or <code>null</code> if a matching plantation could not be found
	 */
	@Override
	public com.ace.prms.sb.model.plantation fetchplantationByUuidAndGroupId(
		String uuid, long groupId) {

		return _plantationLocalService.fetchplantationByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _plantationLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _plantationLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _plantationLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _plantationLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _plantationLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the plantation with the primary key.
	 *
	 * @param plantId the primary key of the plantation
	 * @return the plantation
	 * @throws PortalException if a plantation with the primary key could not be found
	 */
	@Override
	public com.ace.prms.sb.model.plantation getplantation(long plantId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _plantationLocalService.getplantation(plantId);
	}

	/**
	 * Returns the plantation matching the UUID and group.
	 *
	 * @param uuid the plantation's UUID
	 * @param groupId the primary key of the group
	 * @return the matching plantation
	 * @throws PortalException if a matching plantation could not be found
	 */
	@Override
	public com.ace.prms.sb.model.plantation getplantationByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _plantationLocalService.getplantationByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the plantations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.ace.prms.sb.model.impl.plantationModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of plantations
	 * @param end the upper bound of the range of plantations (not inclusive)
	 * @return the range of plantations
	 */
	@Override
	public java.util.List<com.ace.prms.sb.model.plantation> getplantations(
		int start, int end) {

		return _plantationLocalService.getplantations(start, end);
	}

	/**
	 * Returns all the plantations matching the UUID and company.
	 *
	 * @param uuid the UUID of the plantations
	 * @param companyId the primary key of the company
	 * @return the matching plantations, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.ace.prms.sb.model.plantation>
		getplantationsByUuidAndCompanyId(String uuid, long companyId) {

		return _plantationLocalService.getplantationsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of plantations matching the UUID and company.
	 *
	 * @param uuid the UUID of the plantations
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of plantations
	 * @param end the upper bound of the range of plantations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching plantations, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.ace.prms.sb.model.plantation>
		getplantationsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.ace.prms.sb.model.plantation> orderByComparator) {

		return _plantationLocalService.getplantationsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of plantations.
	 *
	 * @return the number of plantations
	 */
	@Override
	public int getplantationsCount() {
		return _plantationLocalService.getplantationsCount();
	}

	/**
	 * Updates the plantation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param plantation the plantation
	 * @return the plantation that was updated
	 */
	@Override
	public com.ace.prms.sb.model.plantation updateplantation(
		com.ace.prms.sb.model.plantation plantation) {

		return _plantationLocalService.updateplantation(plantation);
	}

	@Override
	public plantationLocalService getWrappedService() {
		return _plantationLocalService;
	}

	@Override
	public void setWrappedService(
		plantationLocalService plantationLocalService) {

		_plantationLocalService = plantationLocalService;
	}

	private plantationLocalService _plantationLocalService;

}