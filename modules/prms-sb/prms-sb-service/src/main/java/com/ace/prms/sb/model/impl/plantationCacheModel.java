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

package com.ace.prms.sb.model.impl;

import com.ace.prms.sb.model.plantation;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The cache model class for representing plantation in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class plantationCacheModel
	implements CacheModel<plantation>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof plantationCacheModel)) {
			return false;
		}

		plantationCacheModel plantationCacheModel = (plantationCacheModel)obj;

		if (plantId == plantationCacheModel.plantId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, plantId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", plantId=");
		sb.append(plantId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", plantType=");
		sb.append(plantType);
		sb.append(", name=");
		sb.append(name);
		sb.append(", origin=");
		sb.append(origin);
		sb.append(", yieldMeasure=");
		sb.append(yieldMeasure);
		sb.append(", lifeSpan=");
		sb.append(lifeSpan);
		sb.append(", breed=");
		sb.append(breed);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public plantation toEntityModel() {
		plantationImpl plantationImpl = new plantationImpl();

		if (uuid == null) {
			plantationImpl.setUuid("");
		}
		else {
			plantationImpl.setUuid(uuid);
		}

		plantationImpl.setPlantId(plantId);
		plantationImpl.setGroupId(groupId);
		plantationImpl.setCompanyId(companyId);
		plantationImpl.setUserId(userId);

		if (userName == null) {
			plantationImpl.setUserName("");
		}
		else {
			plantationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			plantationImpl.setCreateDate(null);
		}
		else {
			plantationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			plantationImpl.setModifiedDate(null);
		}
		else {
			plantationImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (plantType == null) {
			plantationImpl.setPlantType("");
		}
		else {
			plantationImpl.setPlantType(plantType);
		}

		if (name == null) {
			plantationImpl.setName("");
		}
		else {
			plantationImpl.setName(name);
		}

		if (origin == null) {
			plantationImpl.setOrigin("");
		}
		else {
			plantationImpl.setOrigin(origin);
		}

		plantationImpl.setYieldMeasure(yieldMeasure);
		plantationImpl.setLifeSpan(lifeSpan);

		if (breed == null) {
			plantationImpl.setBreed("");
		}
		else {
			plantationImpl.setBreed(breed);
		}

		plantationImpl.resetOriginalValues();

		return plantationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		plantId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		plantType = objectInput.readUTF();
		name = objectInput.readUTF();
		origin = objectInput.readUTF();

		yieldMeasure = objectInput.readInt();

		lifeSpan = objectInput.readInt();
		breed = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(plantId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (plantType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(plantType);
		}

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (origin == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(origin);
		}

		objectOutput.writeInt(yieldMeasure);

		objectOutput.writeInt(lifeSpan);

		if (breed == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(breed);
		}
	}

	public String uuid;
	public long plantId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String plantType;
	public String name;
	public String origin;
	public int yieldMeasure;
	public int lifeSpan;
	public String breed;

}