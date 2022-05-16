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

package com.ace.prms.sb.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <p>
 * This class is a wrapper for {@link lookup}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see lookup
 * @generated
 */
@ProviderType
public class lookupWrapper
	extends BaseModelWrapper<lookup> implements lookup, ModelWrapper<lookup> {

	public lookupWrapper(lookup lookup) {
		super(lookup);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("lookupId", getLookupId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("lookupKey", getLookupKey());
		attributes.put("lookupValue", getLookupValue());
		attributes.put("lookupName", getLookupName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long lookupId = (Long)attributes.get("lookupId");

		if (lookupId != null) {
			setLookupId(lookupId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String lookupKey = (String)attributes.get("lookupKey");

		if (lookupKey != null) {
			setLookupKey(lookupKey);
		}

		String lookupValue = (String)attributes.get("lookupValue");

		if (lookupValue != null) {
			setLookupValue(lookupValue);
		}

		Integer lookupName = (Integer)attributes.get("lookupName");

		if (lookupName != null) {
			setLookupName(lookupName);
		}
	}

	/**
	 * Returns the company ID of this lookup.
	 *
	 * @return the company ID of this lookup
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this lookup.
	 *
	 * @return the create date of this lookup
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this lookup.
	 *
	 * @return the group ID of this lookup
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the lookup ID of this lookup.
	 *
	 * @return the lookup ID of this lookup
	 */
	@Override
	public long getLookupId() {
		return model.getLookupId();
	}

	/**
	 * Returns the lookup key of this lookup.
	 *
	 * @return the lookup key of this lookup
	 */
	@Override
	public String getLookupKey() {
		return model.getLookupKey();
	}

	/**
	 * Returns the lookup name of this lookup.
	 *
	 * @return the lookup name of this lookup
	 */
	@Override
	public int getLookupName() {
		return model.getLookupName();
	}

	/**
	 * Returns the lookup value of this lookup.
	 *
	 * @return the lookup value of this lookup
	 */
	@Override
	public String getLookupValue() {
		return model.getLookupValue();
	}

	/**
	 * Returns the modified date of this lookup.
	 *
	 * @return the modified date of this lookup
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this lookup.
	 *
	 * @return the primary key of this lookup
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this lookup.
	 *
	 * @return the user ID of this lookup
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this lookup.
	 *
	 * @return the user name of this lookup
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this lookup.
	 *
	 * @return the user uuid of this lookup
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this lookup.
	 *
	 * @return the uuid of this lookup
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this lookup.
	 *
	 * @param companyId the company ID of this lookup
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this lookup.
	 *
	 * @param createDate the create date of this lookup
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this lookup.
	 *
	 * @param groupId the group ID of this lookup
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the lookup ID of this lookup.
	 *
	 * @param lookupId the lookup ID of this lookup
	 */
	@Override
	public void setLookupId(long lookupId) {
		model.setLookupId(lookupId);
	}

	/**
	 * Sets the lookup key of this lookup.
	 *
	 * @param lookupKey the lookup key of this lookup
	 */
	@Override
	public void setLookupKey(String lookupKey) {
		model.setLookupKey(lookupKey);
	}

	/**
	 * Sets the lookup name of this lookup.
	 *
	 * @param lookupName the lookup name of this lookup
	 */
	@Override
	public void setLookupName(int lookupName) {
		model.setLookupName(lookupName);
	}

	/**
	 * Sets the lookup value of this lookup.
	 *
	 * @param lookupValue the lookup value of this lookup
	 */
	@Override
	public void setLookupValue(String lookupValue) {
		model.setLookupValue(lookupValue);
	}

	/**
	 * Sets the modified date of this lookup.
	 *
	 * @param modifiedDate the modified date of this lookup
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this lookup.
	 *
	 * @param primaryKey the primary key of this lookup
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this lookup.
	 *
	 * @param userId the user ID of this lookup
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this lookup.
	 *
	 * @param userName the user name of this lookup
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this lookup.
	 *
	 * @param userUuid the user uuid of this lookup
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this lookup.
	 *
	 * @param uuid the uuid of this lookup
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected lookupWrapper wrap(lookup lookup) {
		return new lookupWrapper(lookup);
	}

}