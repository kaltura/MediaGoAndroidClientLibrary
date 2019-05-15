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

import android.text.TextUtils;
import android.util.Log;

import com.google.gson.JsonObject;
import com.kaltura.client.Params;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

/**
 * This class was generated using clients-generator\exec.php
 * against an XML schema provided by Kaltura.
 * <p>
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Category details
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(OTTCategory.Tokenizer.class)
public class OTTCategory extends ObjectBase {

    public static final int TYPE_STATIC_ITEM = -1;
    public static final int TYPE_TITLE = -2;
    public static final int TYPE_MENU_ITEM = -3;
    public static final int TYPE_HIDDEN_MENU_ITEM = -4;

    public interface Tokenizer extends ObjectBase.Tokenizer {
        String id();

        String name();

        String parentCategoryId();

        RequestBuilder.ListTokenizer<Tokenizer> childCategories();

        RequestBuilder.ListTokenizer<Channel.Tokenizer> channels();

        RequestBuilder.ListTokenizer<MediaImage.Tokenizer> images();
    }

    /**
     * Unique identifier for the category
     */
    private Long id;
    /**
     * Category name
     */
    private String name;
    /**
     * Category original name
     */
    private String originalName;
    /**
     * Category parent identifier
     */
    private Long parentCategoryId;
    /**
     * Child categories
     */
    private List<OTTCategory> childCategories;
    /**
     * Category channels
     */
    private List<Channel> channels;
    /**
     * Category images
     */
    private List<MediaImage> images;

    private String stringType;

    private int menuType;

    private int resIcon;

    private boolean itemSelected;

    public static OTTCategory getDummyMenuItem(String type){
        OTTCategory menuItem = new OTTCategory();
        menuItem.setStringType(type);
        return menuItem;
    }

    // id:
    public Long getId() {
        return this.id;
    }

    // name:
    public String getOriginalName() {
        return this.originalName;
    }

    public void setOriginalName(String name) {
        this.originalName = name;
    }

    public void name(String multirequestToken) {
        setToken("name", multirequestToken);
    }

    // name:
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // parentCategoryId:
    public Long getParentCategoryId() {
        return this.parentCategoryId;
    }

    public void setParentCategoryId(Long parentCategoryId) {
        this.parentCategoryId = parentCategoryId;
    }

    public void parentCategoryId(String multirequestToken) {
        setToken("parentCategoryId", multirequestToken);
    }

    // childCategories:
    public List<OTTCategory> getChildCategories() {
        return this.childCategories;
    }

    public void setChildCategories(List<OTTCategory> childCategories) {
        this.childCategories = childCategories;
    }

    // channels:
    public List<Channel> getChannels() {
        return this.channels;
    }

    public void setChannels(List<Channel> channels) {
        this.channels = channels;
    }

    // images:
    public List<MediaImage> getImages() {
        return this.images;
    }

    public void setImages(List<MediaImage> images) {
        this.images = images;
    }

    // mType:
    public String getStringType() {
        return this.stringType;
    }

    public void setStringType(String stringType) {
        this.stringType = stringType;
    }

    public void setType(int type) {
        menuType = type;
    }

    public int getType() {
        return menuType;
    }


    public int getResIcon() {
        return resIcon;
    }

    public void setResIcon(int resIcon) {
        this.resIcon = resIcon;
    }


    public boolean isItemSelected() {
        return itemSelected;
    }

    public void setItemSelected(boolean itemSelected) {
        this.itemSelected = itemSelected;
    }

    public OTTCategory() {
        super();
    }

    public OTTCategory(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if (jsonObject == null) return;

        // set members values:
        id = GsonParser.parseLong(jsonObject.get("id"));
        originalName = GsonParser.parseString(jsonObject.get("name"));
        parentCategoryId = GsonParser.parseLong(jsonObject.get("parentCategoryId"));
        childCategories = GsonParser.parseArray(jsonObject.getAsJsonArray("childCategories"), OTTCategory.class);
        channels = GsonParser.parseArray(jsonObject.getAsJsonArray("channels"), Channel.class);
        images = GsonParser.parseArray(jsonObject.getAsJsonArray("images"), MediaImage.class);

        if (!TextUtils.isEmpty(originalName)) {
            name = originalName.split("\\|")[0];
        }
    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaOTTCategory");
        kparams.add("name", this.originalName);
        kparams.add("parentCategoryId", this.parentCategoryId);
        kparams.add("childCategories", this.childCategories);
        kparams.add("channels", this.channels);
        kparams.add("images", this.images);
        return kparams;
    }

    public JSONObject getFilteredJSONObjectFromName() {
        JSONObject retVal = new JSONObject();

        try {
            if (!TextUtils.isEmpty(originalName)) {
                String[] items = originalName.split("\\|");
                if (items.length > 0) {
                    retVal.put("Name", items[0]);
                    for (int i = 1; i < items.length; i++) {
                        String[] keyValue = items[i].split(":");
                        retVal.put(keyValue[0], keyValue[1]);
                    }
                }
            } else {
                Log.w(this.getClass().getName(), "Empty menu url. returning empty json object for safety reasons");
            }
        } catch (JSONException e) {
            Log.e(this.getClass().getName(), "JSONObject creation failed", e);
        }
        return retVal;
    }

    public String getMenuItemValue(String key){
        try {
            return this.getFilteredJSONObjectFromName().getString(key);
        } catch (JSONException e) {
            e.printStackTrace();
            return "";
        }
    }
}

