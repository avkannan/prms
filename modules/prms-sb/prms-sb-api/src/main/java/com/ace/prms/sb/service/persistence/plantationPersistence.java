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

import com.ace.prms.sb.exception.NoSuchplantationException;
import com.ace.prms.sb.model.plantation;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the plantation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see plantationUtil
 * @generated
 */
@ProviderType
public interface plantationPersistence extends BasePersistence<plantation> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link plantationUtil} to access the plantation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the plantations where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching plantations
	 */
	public java.util.List<plantation> findByUuid(String uuid);

	/**
	 * Returns a range of all the plantations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>plantationModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of plantations
	 * @param end the upper bound of the range of plantations (not inclusive)
	 * @return the range of matching plantations
	 */
	public java.util.List<plantation> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the plantations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>plantationModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of plantations
	 * @param end the upper bound of the range of plantations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching plantations
	 */
	public java.util.List<plantation> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<plantation>
			orderByComparator);

	/**
	 * Returns an ordered range of all the plantations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>plantationModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of plantations
	 * @param end the upper bound of the range of plantations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching plantations
	 */
	public java.util.List<plantation> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<plantation>
			orderByComparator,
		boolean retrieveFromCache);

	/**
	 * Returns the first plantation in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plantation
	 * @throws NoSuchplantationException if a matching plantation could not be found
	 */
	public plantation findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<plantation>
				orderByComparator)
		throws NoSuchplantationException;

	/**
	 * Returns the first plantation in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plantation, or <code>null</code> if a matching plantation could not be found
	 */
	public plantation fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<plantation>
			orderByComparator);

	/**
	 * Returns the last plantation in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plantation
	 * @throws NoSuchplantationException if a matching plantation could not be found
	 */
	public plantation findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<plantation>
				orderByComparator)
		throws NoSuchplantationException;

	/**
	 * Returns the last plantation in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plantation, or <code>null</code> if a matching plantation could not be found
	 */
	public plantation fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<plantation>
			orderByComparator);

	/**
	 * Returns the plantations before and after the current plantation in the ordered set where uuid = &#63;.
	 *
	 * @param plantId the primary key of the current plantation
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next plantation
	 * @throws NoSuchplantationException if a plantation with the primary key could not be found
	 */
	public plantation[] findByUuid_PrevAndNext(
			long plantId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<plantation>
				orderByComparator)
		throws NoSuchplantationException;

	/**
	 * Removes all the plantations where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of plantations where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching plantations
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the plantation where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchplantationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching plantation
	 * @throws NoSuchplantationException if a matching plantation could not be found
	 */
	public plantation findByUUID_G(String uuid, long groupId)
		throws NoSuchplantationException;

	/**
	 * Returns the plantation where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching plantation, or <code>null</code> if a matching plantation could not be found
	 */
	public plantation fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the plantation where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching plantation, or <code>null</code> if a matching plantation could not be found
	 */
	public plantation fetchByUUID_G(
		String uuid, long groupId, boolean retrieveFromCache);

	/**
	 * Removes the plantation where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the plantation that was removed
	 */
	public plantation removeByUUID_G(String uuid, long groupId)
		throws NoSuchplantationException;

	/**
	 * Returns the number of plantations where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching plantations
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the plantations where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching plantations
	 */
	public java.util.List<plantation> findByUuid_C(String uuid, long companyId);

	/**
	 * Returns a range of all the plantations where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>plantationModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of plantations
	 * @param end the upper bound of the range of plantations (not inclusive)
	 * @return the range of matching plantations
	 */
	public java.util.List<plantation> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the plantations where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>plantationModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of plantations
	 * @param end the upper bound of the range of plantations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching plantations
	 */
	public java.util.List<plantation> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<plantation>
			orderByComparator);

	/**
	 * Returns an ordered range of all the plantations where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>plantationModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of plantations
	 * @param end the upper bound of the range of plantations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching plantations
	 */
	public java.util.List<plantation> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<plantation>
			orderByComparator,
		boolean retrieveFromCache);

	/**
	 * Returns the first plantation in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plantation
	 * @throws NoSuchplantationException if a matching plantation could not be found
	 */
	public plantation findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<plantation>
				orderByComparator)
		throws NoSuchplantationException;

	/**
	 * Returns the first plantation in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plantation, or <code>null</code> if a matching plantation could not be found
	 */
	public plantation fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<plantation>
			orderByComparator);

	/**
	 * Returns the last plantation in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plantation
	 * @throws NoSuchplantationException if a matching plantation could not be found
	 */
	public plantation findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<plantation>
				orderByComparator)
		throws NoSuchplantationException;

	/**
	 * Returns the last plantation in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plantation, or <code>null</code> if a matching plantation could not be found
	 */
	public plantation fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<plantation>
			orderByComparator);

	/**
	 * Returns the plantations before and after the current plantation in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param plantId the primary key of the current plantation
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next plantation
	 * @throws NoSuchplantationException if a plantation with the primary key could not be found
	 */
	public plantation[] findByUuid_C_PrevAndNext(
			long plantId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<plantation>
				orderByComparator)
		throws NoSuchplantationException;

	/**
	 * Removes all the plantations where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of plantations where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching plantations
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Caches the plantation in the entity cache if it is enabled.
	 *
	 * @param plantation the plantation
	 */
	public void cacheResult(plantation plantation);

	/**
	 * Caches the plantations in the entity cache if it is enabled.
	 *
	 * @param plantations the plantations
	 */
	public void cacheResult(java.util.List<plantation> plantations);

	/**
	 * Creates a new plantation with the primary key. Does not add the plantation to the database.
	 *
	 * @param plantId the primary key for the new plantation
	 * @return the new plantation
	 */
	public plantation create(long plantId);

	/**
	 * Removes the plantation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param plantId the primary key of the plantation
	 * @return the plantation that was removed
	 * @throws NoSuchplantationException if a plantation with the primary key could not be found
	 */
	public plantation remove(long plantId) throws NoSuchplantationException;

	public plantation updateImpl(plantation plantation);

	/**
	 * Returns the plantation with the primary key or throws a <code>NoSuchplantationException</code> if it could not be found.
	 *
	 * @param plantId the primary key of the plantation
	 * @return the plantation
	 * @throws NoSuchplantationException if a plantation with the primary key could not be found
	 */
	public plantation findByPrimaryKey(long plantId)
		throws NoSuchplantationException;

	/**
	 * Returns the plantation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param plantId the primary key of the plantation
	 * @return the plantation, or <code>null</code> if a plantation with the primary key could not be found
	 */
	public plantation fetchByPrimaryKey(long plantId);

	/**
	 * Returns all the plantations.
	 *
	 * @return the plantations
	 */
	public java.util.List<plantation> findAll();

	/**
	 * Returns a range of all the plantations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>plantationModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of plantations
	 * @param end the upper bound of the range of plantations (not inclusive)
	 * @return the range of plantations
	 */
	public java.util.List<plantation> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the plantations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>plantationModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of plantations
	 * @param end the upper bound of the range of plantations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of plantations
	 */
	public java.util.List<plantation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<plantation>
			orderByComparator);

	/**
	 * Returns an ordered range of all the plantations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>plantationModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of plantations
	 * @param end the upper bound of the range of plantations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of plantations
	 */
	public java.util.List<plantation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<plantation>
			orderByComparator,
		boolean retrieveFromCache);

	/**
	 * Removes all the plantations from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of plantations.
	 *
	 * @return the number of plantations
	 */
	public int countAll();

}