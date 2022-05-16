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
 * This class is a wrapper for {@link plantation}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see plantation
 * @generated
 */
@ProviderType
public class plantationWrapper
	extends BaseModelWrapper<plantation>
	implements plantation, ModelWrapper<plantation> {

	public plantationWrapper(plantation plantation) {
		super(plantation);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("plantId", getPlantId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("plantType", getPlantType());
		attributes.put("name", getName());
		attributes.put("origin", getOrigin());
		attributes.put("yieldMeasure", getYieldMeasure());
		attributes.put("lifeSpan", getLifeSpan());
		attributes.put("breed", getBreed());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long plantId = (Long)attributes.get("plantId");

		if (plantId != null) {
			setPlantId(plantId);
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

		String plantType = (String)attributes.get("plantType");

		if (plantType != null) {
			setPlantType(plantType);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String origin = (String)attributes.get("origin");

		if (origin != null) {
			setOrigin(origin);
		}

		Integer yieldMeasure = (Integer)attributes.get("yieldMeasure");

		if (yieldMeasure != null) {
			setYieldMeasure(yieldMeasure);
		}

		Integer lifeSpan = (Integer)attributes.get("lifeSpan");

		if (lifeSpan != null) {
			setLifeSpan(lifeSpan);
		}

		String breed = (String)attributes.get("breed");

		if (breed != null) {
			setBreed(breed);
		}
	}

	/**
	 * Returns the breed of this plantation.
	 *
	 * @return the breed of this plantation
	 */
	@Override
	public String getBreed() {
		return model.getBreed();
	}

	/**
	 * Returns the company ID of this plantation.
	 *
	 * @return the company ID of this plantation
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this plantation.
	 *
	 * @return the create date of this plantation
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this plantation.
	 *
	 * @return the group ID of this plantation
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the life span of this plantation.
	 *
	 * @return the life span of this plantation
	 */
	@Override
	public int getLifeSpan() {
		return model.getLifeSpan();
	}

	/**
	 * Returns the modified date of this plantation.
	 *
	 * @return the modified date of this plantation
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of this plantation.
	 *
	 * @return the name of this plantation
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the origin of this plantation.
	 *
	 * @return the origin of this plantation
	 */
	@Override
	public String getOrigin() {
		return model.getOrigin();
	}

	/**
	 * Returns the plant ID of this plantation.
	 *
	 * @return the plant ID of this plantation
	 */
	@Override
	public long getPlantId() {
		return model.getPlantId();
	}

	/**
	 * Returns the plant type of this plantation.
	 *
	 * @return the plant type of this plantation
	 */
	@Override
	public String getPlantType() {
		return model.getPlantType();
	}

	/**
	 * Returns the primary key of this plantation.
	 *
	 * @return the primary key of this plantation
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this plantation.
	 *
	 * @return the user ID of this plantation
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this plantation.
	 *
	 * @return the user name of this plantation
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this plantation.
	 *
	 * @return the user uuid of this plantation
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this plantation.
	 *
	 * @return the uuid of this plantation
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns the yield measure of this plantation.
	 *
	 * @return the yield measure of this plantation
	 */
	@Override
	public int getYieldMeasure() {
		return model.getYieldMeasure();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the breed of this plantation.
	 *
	 * @param breed the breed of this plantation
	 */
	@Override
	public void setBreed(String breed) {
		model.setBreed(breed);
	}

	/**
	 * Sets the company ID of this plantation.
	 *
	 * @param companyId the company ID of this plantation
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this plantation.
	 *
	 * @param createDate the create date of this plantation
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this plantation.
	 *
	 * @param groupId the group ID of this plantation
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the life span of this plantation.
	 *
	 * @param lifeSpan the life span of this plantation
	 */
	@Override
	public void setLifeSpan(int lifeSpan) {
		model.setLifeSpan(lifeSpan);
	}

	/**
	 * Sets the modified date of this plantation.
	 *
	 * @param modifiedDate the modified date of this plantation
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this plantation.
	 *
	 * @param name the name of this plantation
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the origin of this plantation.
	 *
	 * @param origin the origin of this plantation
	 */
	@Override
	public void setOrigin(String origin) {
		model.setOrigin(origin);
	}

	/**
	 * Sets the plant ID of this plantation.
	 *
	 * @param plantId the plant ID of this plantation
	 */
	@Override
	public void setPlantId(long plantId) {
		model.setPlantId(plantId);
	}

	/**
	 * Sets the plant type of this plantation.
	 *
	 * @param plantType the plant type of this plantation
	 */
	@Override
	public void setPlantType(String plantType) {
		model.setPlantType(plantType);
	}

	/**
	 * Sets the primary key of this plantation.
	 *
	 * @param primaryKey the primary key of this plantation
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this plantation.
	 *
	 * @param userId the user ID of this plantation
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this plantation.
	 *
	 * @param userName the user name of this plantation
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this plantation.
	 *
	 * @param userUuid the user uuid of this plantation
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this plantation.
	 *
	 * @param uuid the uuid of this plantation
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	/**
	 * Sets the yield measure of this plantation.
	 *
	 * @param yieldMeasure the yield measure of this plantation
	 */
	@Override
	public void setYieldMeasure(int yieldMeasure) {
		model.setYieldMeasure(yieldMeasure);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected plantationWrapper wrap(plantation plantation) {
		return new plantationWrapper(plantation);
	}

}