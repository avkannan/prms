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
 * Provides a wrapper for {@link lookupLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see lookupLocalService
 * @generated
 */
@ProviderType
public class lookupLocalServiceWrapper
	implements lookupLocalService, ServiceWrapper<lookupLocalService> {

	public lookupLocalServiceWrapper(lookupLocalService lookupLocalService) {
		_lookupLocalService = lookupLocalService;
	}

	/**
	 * Adds the lookup to the database. Also notifies the appropriate model listeners.
	 *
	 * @param lookup the lookup
	 * @return the lookup that was added
	 */
	@Override
	public com.ace.prms.sb.model.lookup addlookup(
		com.ace.prms.sb.model.lookup lookup) {

		return _lookupLocalService.addlookup(lookup);
	}

	/**
	 * Creates a new lookup with the primary key. Does not add the lookup to the database.
	 *
	 * @param lookupId the primary key for the new lookup
	 * @return the new lookup
	 */
	@Override
	public com.ace.prms.sb.model.lookup createlookup(long lookupId) {
		return _lookupLocalService.createlookup(lookupId);
	}

	/**
	 * Deletes the lookup with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param lookupId the primary key of the lookup
	 * @return the lookup that was removed
	 * @throws PortalException if a lookup with the primary key could not be found
	 */
	@Override
	public com.ace.prms.sb.model.lookup deletelookup(long lookupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _lookupLocalService.deletelookup(lookupId);
	}

	/**
	 * Deletes the lookup from the database. Also notifies the appropriate model listeners.
	 *
	 * @param lookup the lookup
	 * @return the lookup that was removed
	 */
	@Override
	public com.ace.prms.sb.model.lookup deletelookup(
		com.ace.prms.sb.model.lookup lookup) {

		return _lookupLocalService.deletelookup(lookup);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _lookupLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _lookupLocalService.dynamicQuery();
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

		return _lookupLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.ace.prms.sb.model.impl.lookupModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

		return _lookupLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.ace.prms.sb.model.impl.lookupModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

		return _lookupLocalService.dynamicQuery(
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

		return _lookupLocalService.dynamicQueryCount(dynamicQuery);
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

		return _lookupLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.ace.prms.sb.model.lookup fetchlookup(long lookupId) {
		return _lookupLocalService.fetchlookup(lookupId);
	}

	/**
	 * Returns the lookup matching the UUID and group.
	 *
	 * @param uuid the lookup's UUID
	 * @param groupId the primary key of the group
	 * @return the matching lookup, or <code>null</code> if a matching lookup could not be found
	 */
	@Override
	public com.ace.prms.sb.model.lookup fetchlookupByUuidAndGroupId(
		String uuid, long groupId) {

		return _lookupLocalService.fetchlookupByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _lookupLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _lookupLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _lookupLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the lookup with the primary key.
	 *
	 * @param lookupId the primary key of the lookup
	 * @return the lookup
	 * @throws PortalException if a lookup with the primary key could not be found
	 */
	@Override
	public com.ace.prms.sb.model.lookup getlookup(long lookupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _lookupLocalService.getlookup(lookupId);
	}

	/**
	 * Returns the lookup matching the UUID and group.
	 *
	 * @param uuid the lookup's UUID
	 * @param groupId the primary key of the group
	 * @return the matching lookup
	 * @throws PortalException if a matching lookup could not be found
	 */
	@Override
	public com.ace.prms.sb.model.lookup getlookupByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _lookupLocalService.getlookupByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the lookups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.ace.prms.sb.model.impl.lookupModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of lookups
	 * @param end the upper bound of the range of lookups (not inclusive)
	 * @return the range of lookups
	 */
	@Override
	public java.util.List<com.ace.prms.sb.model.lookup> getlookups(
		int start, int end) {

		return _lookupLocalService.getlookups(start, end);
	}

	/**
	 * Returns all the lookups matching the UUID and company.
	 *
	 * @param uuid the UUID of the lookups
	 * @param companyId the primary key of the company
	 * @return the matching lookups, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.ace.prms.sb.model.lookup>
		getlookupsByUuidAndCompanyId(String uuid, long companyId) {

		return _lookupLocalService.getlookupsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of lookups matching the UUID and company.
	 *
	 * @param uuid the UUID of the lookups
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of lookups
	 * @param end the upper bound of the range of lookups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching lookups, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.ace.prms.sb.model.lookup>
		getlookupsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.ace.prms.sb.model.lookup> orderByComparator) {

		return _lookupLocalService.getlookupsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of lookups.
	 *
	 * @return the number of lookups
	 */
	@Override
	public int getlookupsCount() {
		return _lookupLocalService.getlookupsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _lookupLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _lookupLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the lookup in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param lookup the lookup
	 * @return the lookup that was updated
	 */
	@Override
	public com.ace.prms.sb.model.lookup updatelookup(
		com.ace.prms.sb.model.lookup lookup) {

		return _lookupLocalService.updatelookup(lookup);
	}

	@Override
	public lookupLocalService getWrappedService() {
		return _lookupLocalService;
	}

	@Override
	public void setWrappedService(lookupLocalService lookupLocalService) {
		_lookupLocalService = lookupLocalService;
	}

	private lookupLocalService _lookupLocalService;

}