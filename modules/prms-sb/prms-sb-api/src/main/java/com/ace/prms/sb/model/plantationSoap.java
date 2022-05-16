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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * This class is used by SOAP remote services, specifically {@link com.ace.prms.sb.service.http.plantationServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class plantationSoap implements Serializable {

	public static plantationSoap toSoapModel(plantation model) {
		plantationSoap soapModel = new plantationSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setPlantId(model.getPlantId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setPlantType(model.getPlantType());
		soapModel.setName(model.getName());
		soapModel.setOrigin(model.getOrigin());
		soapModel.setYieldMeasure(model.getYieldMeasure());
		soapModel.setLifeSpan(model.getLifeSpan());
		soapModel.setBreed(model.getBreed());

		return soapModel;
	}

	public static plantationSoap[] toSoapModels(plantation[] models) {
		plantationSoap[] soapModels = new plantationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static plantationSoap[][] toSoapModels(plantation[][] models) {
		plantationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new plantationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new plantationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static plantationSoap[] toSoapModels(List<plantation> models) {
		List<plantationSoap> soapModels = new ArrayList<plantationSoap>(
			models.size());

		for (plantation model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new plantationSoap[soapModels.size()]);
	}

	public plantationSoap() {
	}

	public long getPrimaryKey() {
		return _plantId;
	}

	public void setPrimaryKey(long pk) {
		setPlantId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getPlantId() {
		return _plantId;
	}

	public void setPlantId(long plantId) {
		_plantId = plantId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getPlantType() {
		return _plantType;
	}

	public void setPlantType(String plantType) {
		_plantType = plantType;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getOrigin() {
		return _origin;
	}

	public void setOrigin(String origin) {
		_origin = origin;
	}

	public int getYieldMeasure() {
		return _yieldMeasure;
	}

	public void setYieldMeasure(int yieldMeasure) {
		_yieldMeasure = yieldMeasure;
	}

	public int getLifeSpan() {
		return _lifeSpan;
	}

	public void setLifeSpan(int lifeSpan) {
		_lifeSpan = lifeSpan;
	}

	public String getBreed() {
		return _breed;
	}

	public void setBreed(String breed) {
		_breed = breed;
	}

	private String _uuid;
	private long _plantId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _plantType;
	private String _name;
	private String _origin;
	private int _yieldMeasure;
	private int _lifeSpan;
	private String _breed;

}