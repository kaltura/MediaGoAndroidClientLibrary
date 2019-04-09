// ===================================================================================================
//                           _  __     _ _
//                          | |/ /__ _| | |_ _  _ _ _ __ _
//                          | ' </ _` | |  _| || | '_/ _` |
//                          |_|\_\__,_|_|\__|\_,_|_| \__,_|
//
// This file is part of the Kaltura Collaborative Media Suite which allows users
// to do with audio, video, and animation what Wiki platfroms allow them to do with
// text.
//
// Copyright (C) 2006-2018  Kaltura Inc.
//
// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU Affero General Public License as
// published by the Free Software Foundation, either version 3 of the
// License, or (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU Affero General Public License for more details.
//
// You should have received a copy of the GNU Affero General Public License
// along with this program.  If not, see <http://www.gnu.org/licenses/>.
//
// @ignore
// ===================================================================================================
package com.kaltura.client.types;

import com.google.gson.JsonObject;
import com.kaltura.client.Params;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

import java.util.List;

/**
 * This class was generated using clients-generator\exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Device family details
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(DeviceFamily.Tokenizer.class)
public class DeviceFamily extends DeviceFamilyBase {
	
	public interface Tokenizer extends DeviceFamilyBase.Tokenizer {
		String deviceLimit();
		String concurrentLimit();
	}

	/**
	 * Max number of devices allowed for this family
	 */
	private Integer deviceLimit;
	/**
	 * Max number of streams allowed for this family
	 */
	private Integer concurrentLimit;
	/**
	 * devices
	 */
	private List<HouseholdDevice> devices;

	// deviceLimit:
	public Integer getDeviceLimit(){
		return this.deviceLimit;
	}
	public void deviceLimit(String multirequestToken){
		setToken("deviceLimit", multirequestToken);
	}

	// concurrentLimit:
	public void setConcurrentLimit(Integer concurrentLimit){
		this.concurrentLimit = concurrentLimit;
	}

	public void concurrentLimit(String multirequestToken){
		setToken("concurrentLimit", multirequestToken);
	}

	// devices:
	public List<HouseholdDevice> getDevices(){
		return this.devices;
	}

	public DeviceFamily() {
		super();
	}

	public DeviceFamily(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		deviceLimit = GsonParser.parseInt(jsonObject.get("deviceLimit"));
		concurrentLimit = GsonParser.parseInt(jsonObject.get("concurrentLimit"));
		devices = GsonParser.parseArray(jsonObject.getAsJsonArray("devices"), HouseholdDevice.class);
	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaDeviceFamily");
		kparams.add("deviceLimit", this.deviceLimit);
		kparams.add("concurrentLimit", this.concurrentLimit);
		return kparams;
	}

}

