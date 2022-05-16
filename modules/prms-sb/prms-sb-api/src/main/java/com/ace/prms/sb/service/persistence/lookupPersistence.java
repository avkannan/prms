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

package com.ace.prms.sb.service.persistence;

import com.ace.prms.sb.exception.NoSuchlookupException;
import com.ace.prms.sb.model.lookup;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the lookup service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see lookupUtil
 * @generated
 */
@ProviderType
public interface lookupPersistence extends BasePersistence<lookup> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link lookupUtil} to access the lookup persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the lookups where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching lookups
	 */
	public java.util.List<lookup> findByUuid(String uuid);

	/**
	 * Returns a range of all the lookups where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>lookupModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of lookups
	 * @param end the upper bound of the range of lookups (not inclusive)
	 * @return the range of matching lookups
	 */
	public java.util.List<lookup> findByUuid(String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the lookups where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>lookupModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of lookups
	 * @param end the upper bound of the range of lookups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching lookups
	 */
	public java.util.List<lookup> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<lookup>
			orderByComparator);

	/**
	 * Returns an ordered range of all the lookups where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>lookupModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of lookups
	 * @param end the upper bound of the range of lookups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching lookups
	 */
	public java.util.List<lookup> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<lookup>
			orderByComparator,
		boolean retrieveFromCache);

	/**
	 * Returns the first lookup in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lookup
	 * @throws NoSuchlookupException if a matching lookup could not be found
	 */
	public lookup findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<lookup>
				orderByComparator)
		throws NoSuchlookupException;

	/**
	 * Returns the first lookup in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lookup, or <code>null</code> if a matching lookup could not be found
	 */
	public lookup fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<lookup>
			orderByComparator);

	/**
	 * Returns the last lookup in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lookup
	 * @throws NoSuchlookupException if a matching lookup could not be found
	 */
	public lookup findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<lookup>
				orderByComparator)
		throws NoSuchlookupException;

	/**
	 * Returns the last lookup in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lookup, or <code>null</code> if a matching lookup could not be found
	 */
	public lookup fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<lookup>
			orderByComparator);

	/**
	 * Returns the lookups before and after the current lookup in the ordered set where uuid = &#63;.
	 *
	 * @param lookupId the primary key of the current lookup
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next lookup
	 * @throws NoSuchlookupException if a lookup with the primary key could not be found
	 */
	public lookup[] findByUuid_PrevAndNext(
			long lookupId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<lookup>
				orderByComparator)
		throws NoSuchlookupException;

	/**
	 * Removes all the lookups where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of lookups where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching lookups
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the lookup where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchlookupException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching lookup
	 * @throws NoSuchlookupException if a matching lookup could not be found
	 */
	public lookup findByUUID_G(String uuid, long groupId)
		throws NoSuchlookupException;

	/**
	 * Returns the lookup where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching lookup, or <code>null</code> if a matching lookup could not be found
	 */
	public lookup fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the lookup where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching lookup, or <code>null</code> if a matching lookup could not be found
	 */
	public lookup fetchByUUID_G(
		String uuid, long groupId, boolean retrieveFromCache);

	/**
	 * Removes the lookup where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the lookup that was removed
	 */
	public lookup removeByUUID_G(String uuid, long groupId)
		throws NoSuchlookupException;

	/**
	 * Returns the number of lookups where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching lookups
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the lookups where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching lookups
	 */
	public java.util.List<lookup> findByUuid_C(String uuid, long companyId);

	/**
	 * Returns a range of all the lookups where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>lookupModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of lookups
	 * @param end the upper bound of the range of lookups (not inclusive)
	 * @return the range of matching lookups
	 */
	public java.util.List<lookup> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the lookups where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>lookupModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of lookups
	 * @param end the upper bound of the range of lookups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching lookups
	 */
	public java.util.List<lookup> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<lookup>
			orderByComparator);

	/**
	 * Returns an ordered range of all the lookups where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>lookupModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of lookups
	 * @param end the upper bound of the range of lookups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching lookups
	 */
	public java.util.List<lookup> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<lookup>
			orderByComparator,
		boolean retrieveFromCache);

	/**
	 * Returns the first lookup in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lookup
	 * @throws NoSuchlookupException if a matching lookup could not be found
	 */
	public lookup findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<lookup>
				orderByComparator)
		throws NoSuchlookupException;

	/**
	 * Returns the first lookup in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lookup, or <code>null</code> if a matching lookup could not be found
	 */
	public lookup fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<lookup>
			orderByComparator);

	/**
	 * Returns the last lookup in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lookup
	 * @throws NoSuchlookupException if a matching lookup could not be found
	 */
	public lookup findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<lookup>
				orderByComparator)
		throws NoSuchlookupException;

	/**
	 * Returns the last lookup in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lookup, or <code>null</code> if a matching lookup could not be found
	 */
	public lookup fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<lookup>
			orderByComparator);

	/**
	 * Returns the lookups before and after the current lookup in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param lookupId the primary key of the current lookup
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next lookup
	 * @throws NoSuchlookupException if a lookup with the primary key could not be found
	 */
	public lookup[] findByUuid_C_PrevAndNext(
			long lookupId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<lookup>
				orderByComparator)
		throws NoSuchlookupException;

	/**
	 * Removes all the lookups where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of lookups where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching lookups
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Caches the lookup in the entity cache if it is enabled.
	 *
	 * @param lookup the lookup
	 */
	public void cacheResult(lookup lookup);

	/**
	 * Caches the lookups in the entity cache if it is enabled.
	 *
	 * @param lookups the lookups
	 */
	public void cacheResult(java.util.List<lookup> lookups);

	/**
	 * Creates a new lookup with the primary key. Does not add the lookup to the database.
	 *
	 * @param lookupId the primary key for the new lookup
	 * @return the new lookup
	 */
	public lookup create(long lookupId);

	/**
	 * Removes the lookup with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param lookupId the primary key of the lookup
	 * @return the lookup that was removed
	 * @throws NoSuchlookupException if a lookup with the primary key could not be found
	 */
	public lookup remove(long lookupId) throws NoSuchlookupException;

	public lookup updateImpl(lookup lookup);

	/**
	 * Returns the lookup with the primary key or throws a <code>NoSuchlookupException</code> if it could not be found.
	 *
	 * @param lookupId the primary key of the lookup
	 * @return the lookup
	 * @throws NoSuchlookupException if a lookup with the primary key could not be found
	 */
	public lookup findByPrimaryKey(long lookupId) throws NoSuchlookupException;

	/**
	 * Returns the lookup with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param lookupId the primary key of the lookup
	 * @return the lookup, or <code>null</code> if a lookup with the primary key could not be found
	 */
	public lookup fetchByPrimaryKey(long lookupId);

	/**
	 * Returns all the lookups.
	 *
	 * @return the lookups
	 */
	public java.util.List<lookup> findAll();

	/**
	 * Returns a range of all the lookups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>lookupModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of lookups
	 * @param end the upper bound of the range of lookups (not inclusive)
	 * @return the range of lookups
	 */
	public java.util.List<lookup> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the lookups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>lookupModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of lookups
	 * @param end the upper bound of the range of lookups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of lookups
	 */
	public java.util.List<lookup> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<lookup>
			orderByComparator);

	/**
	 * Returns an ordered range of all the lookups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>lookupModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of lookups
	 * @param end the upper bound of the range of lookups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of lookups
	 */
	public java.util.List<lookup> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<lookup>
			orderByComparator,
		boolean retrieveFromCache);

	/**
	 * Removes all the lookups from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of lookups.
	 *
	 * @return the number of lookups
	 */
	public int countAll();

}