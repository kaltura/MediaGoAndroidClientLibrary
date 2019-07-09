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
import com.kaltura.client.utils.request.RequestBuilder;

import java.util.List;
import java.util.Map;

/**
 * This class was generated using clients-generator\exec.php
 * against an XML schema provided by Kaltura.
 * <p>
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Asset info
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(Asset.Tokenizer.class)
public abstract class Asset extends ObjectBase {

    public interface Tokenizer extends ObjectBase.Tokenizer {
        String id();

        String type();

        String typeDescription();

        String name();

        RequestBuilder.ListTokenizer<TranslationToken.Tokenizer> multilingualName();

        String description();

        RequestBuilder.ListTokenizer<TranslationToken.Tokenizer> multilingualDescription();

        RequestBuilder.ListTokenizer<MediaImage.Tokenizer> images();

        RequestBuilder.ListTokenizer<MediaFile.Tokenizer> mediaFiles();

        RequestBuilder.MapTokenizer<Value.Tokenizer> metas();

        RequestBuilder.MapTokenizer<MultilingualStringValueArray.Tokenizer> tags();

        String startDate();

        String endDate();

        String createDate();

        String updateDate();

        String externalId();
    }

    /**
     * Unique identifier for the asset
     */
    private Long id = 0L;
    /**
     * Identifies the asset type (EPG, Recording, Movie, TV Series, etc).
     * Possible values: 0 – EPG linear programs, 1 - Recording; or any asset type ID
     * according to the asset types IDs defined in the system.
     */
    private Integer type;

    private String typeDescription;
    /**
     * Asset name
     */
    private String name;
    /**
     * Asset name
     */
    private List<TranslationToken> multilingualName;
    /**
     * Asset description
     */
    private String description;
    /**
     * Asset description
     */
    private List<TranslationToken> multilingualDescription;
    /**
     * Collection of images details that can be used to represent this asset
     */
    private List<MediaImage> images;
    /**
     * Files
     */
    private List<MediaFile> mediaFiles;
    /**
     * Dynamic collection of key-value pairs according to the String Meta defined in
     * the system
     */
    private Map<String, Value> metas;
    /**
     * Dynamic collection of key-value pairs according to the Tag Types defined in the
     * system
     */
    private Map<String, MultilingualStringValueArray> tags;
    /**
     * Date and time represented as epoch. For VOD – since when the asset is
     * available in the catalog. For EPG/Linear – when the program is aired (can be
     * in the future).
     */
    private Long startDate;
    /**
     * Date and time represented as epoch. For VOD – till when the asset be available
     * in the catalog. For EPG/Linear – program end time and date
     */
    private Long endDate;
    /**
     * Specifies when was the Asset was created. Date and time represented as epoch.
     */
    private Long createDate;
    /**
     * Specifies when was the Asset last updated. Date and time represented as epoch.
     */
    private Long updateDate;
    /**
     * External identifier for the asset
     */
    private String externalId;

    protected Asset relatedAsset;

    private long watchPosition = 0;

    private long likeCount = 0;

    private boolean parental = false;
    private boolean watched = false;
    private long duration = 0;
    private int viewCount = 0;
    private Boolean isAvailableStatus;
    private int totalItems = 0;

    // id:
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // type:
    public Integer getType() {
        return this.type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    // typeDescription:
    public String getTypeDescription() {
        return this.typeDescription;
    }

    public void setTypeDescription(String typeDescription) {
        this.typeDescription = typeDescription;
    }

    public void type(String multirequestToken) {
        setToken("type", multirequestToken);
    }

    // name:
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // multilingualName:
    public List<TranslationToken> getMultilingualName() {
        return this.multilingualName;
    }

    public void setMultilingualName(List<TranslationToken> multilingualName) {
        this.multilingualName = multilingualName;
    }

    // description:
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // multilingualDescription:
    public List<TranslationToken> getMultilingualDescription() {
        return this.multilingualDescription;
    }

    public void setMultilingualDescription(List<TranslationToken> multilingualDescription) {
        this.multilingualDescription = multilingualDescription;
    }

    // images:
    public List<MediaImage> getImages() {
        return this.images;
    }

    public void setImages(List<MediaImage> images) {
        this.images = images;
    }

    // mediaFiles:
    public List<MediaFile> getMediaFiles() {
        return this.mediaFiles;
    }

    // metas:
    public Map<String, Value> getMetas() {
        return this.metas;
    }

    public void setMetas(Map<String, Value> metas) {
        this.metas = metas;
    }

    // tags:
    public Map<String, MultilingualStringValueArray> getTags() {
        return this.tags;
    }

    public void setTags(Map<String, MultilingualStringValueArray> tags) {
        this.tags = tags;
    }

    // startDate:
    public Long getStartDate() {
        return this.startDate * 1000;
    }

    public void setStartDate(Long startDate) {
        this.startDate = startDate;
    }

    public void startDate(String multirequestToken) {
        setToken("startDate", multirequestToken);
    }

    // endDate:
    public Long getEndDate() {
        return this.endDate * 1000;
    }

    public void setEndDate(Long endDate) {
        this.endDate = endDate;
    }

    public void endDate(String multirequestToken) {
        setToken("endDate", multirequestToken);
    }

    // createDate:
    public Long getCreateDate() {
        return this.createDate;
    }

    // updateDate:
    public Long getUpdateDate() {
        return this.updateDate;
    }

    // externalId:
    public String getExternalId() {
        return this.externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public void externalId(String multirequestToken) {
        setToken("externalId", multirequestToken);
    }

    public long getWatchPosition() {
        return watchPosition;
    }

    public void setWatchPosition(long watchPosition) {
        this.watchPosition = watchPosition;
    }

    public long getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(long likeCount) {
        this.likeCount = likeCount;
    }

    public boolean isParental() {
        return parental;
    }

    public void setParental(boolean parental) {
        this.parental = parental;
    }

    public Boolean getWatched() {
        return watched;
    }

    public void setWatched(Boolean watched) {
        this.watched = watched;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public Boolean isAvailableStatus() {
        return isAvailableStatus;
    }

    public void setAvailableStatus(boolean availableStatus) {
        isAvailableStatus = availableStatus;
    }

    public int getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(int totalItems) {
        this.totalItems = totalItems;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    public Asset() {
        super();
    }

    public Asset(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if (jsonObject == null) return;

        // set members values:
        id = GsonParser.parseLong(jsonObject.get("id"));
        type = GsonParser.parseInt(jsonObject.get("type"));
        typeDescription = GsonParser.parseString(jsonObject.get("typeDescription"));
        name = GsonParser.parseString(jsonObject.get("name"));
        multilingualName = GsonParser.parseArray(jsonObject.getAsJsonArray("multilingualName"), TranslationToken.class);
        description = GsonParser.parseString(jsonObject.get("description"));
        multilingualDescription = GsonParser.parseArray(jsonObject.getAsJsonArray("multilingualDescription"), TranslationToken.class);
        images = GsonParser.parseArray(jsonObject.getAsJsonArray("images"), MediaImage.class);
        mediaFiles = GsonParser.parseArray(jsonObject.getAsJsonArray("mediaFiles"), MediaFile.class);
        metas = GsonParser.parseMap(jsonObject.getAsJsonObject("metas"), Value.class);
        tags = GsonParser.parseMap(jsonObject.getAsJsonObject("tags"), MultilingualStringValueArray.class);
        startDate = GsonParser.parseLong(jsonObject.get("startDate"));
        endDate = GsonParser.parseLong(jsonObject.get("endDate"));
        createDate = GsonParser.parseLong(jsonObject.get("createDate"));
        updateDate = GsonParser.parseLong(jsonObject.get("updateDate"));
        externalId = GsonParser.parseString(jsonObject.get("externalId"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaAsset");
        kparams.add("type", this.type);
        kparams.add("typeDescription", this.typeDescription);
        kparams.add("multilingualName", this.multilingualName);
        kparams.add("multilingualDescription", this.multilingualDescription);
        kparams.add("metas", this.metas);
        kparams.add("tags", this.tags);
        kparams.add("startDate", this.startDate);
        kparams.add("endDate", this.endDate);
        kparams.add("externalId", this.externalId);
        return kparams;
    }

    public Asset(Asset asset) {

        this.id = asset.id;
        this.type = asset.getType();
        this.typeDescription = asset.getTypeDescription();
        this.name = asset.getName();
        this.multilingualName.addAll(asset.getMultilingualName());
        this.description = asset.getDescription();
        this.multilingualDescription.addAll(asset.getMultilingualDescription());
        this.images.addAll(asset.getImages());
        this.mediaFiles.addAll(asset.getMediaFiles());
        this.metas.putAll(asset.getMetas());
        this.tags.putAll(asset.getTags());
        this.startDate = asset.getStartDate();
        this.endDate = asset.getEndDate();
        this.createDate = asset.getCreateDate();
        this.updateDate = asset.getUpdateDate();
        this.externalId = asset.getExternalId();
        this.relatedAsset = asset.getRelatedAsset();
        this.watchPosition = asset.getWatchPosition();
        this.likeCount = asset.getLikeCount();
        this.parental = asset.isParental();
        this.watched = asset.getWatched();
        this.duration = asset.getDuration();
        this.isAvailableStatus = asset.isAvailableStatus();
    }

    public <AI extends Asset> AI getRelatedAsset() {
        AI asset = null;
        try {
            asset = (AI) relatedAsset;
        } catch (ClassCastException ce) {
        }
        return asset;
    }

    public void setRelated(Asset related) {
        this.relatedAsset = related;
    }

    public void addMeta(String key, String value) {
        StringValue stringValue = new StringValue();
        stringValue.setValue(value);
        metas.put(key, stringValue);
    }

    public MediaFile getMediaFile(String fileType) {
        List<MediaFile> mediaFiles = getMediaFiles();
        if (mediaFiles == null || fileType == null) {
            return null;
        }

        for (MediaFile mediaFile : mediaFiles) {
            if (fileType.equals(mediaFile.getType())) {
                return mediaFile;
            }
        }

        return null;
    }

    public String getImageUrl(String ratio) {
        String url = "";
        for (MediaImage mediaImage : images) {
            if (mediaImage.getRatio().equals(ratio))
                url = mediaImage.getUrl();
        }
        return url;
    }
}

