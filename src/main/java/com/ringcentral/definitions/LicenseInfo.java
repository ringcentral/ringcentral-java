package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class LicenseInfo
{
    // Canonical URI of a license
    public String uri;
    public LicenseInfo uri(String uri) {
        this.uri = uri;
        return this;
    }
    // Internal identifier of a license
    public String id;
    public LicenseInfo id(String id) {
        this.id = id;
        return this;
    }
    // License type data
    public LicenseFeatureInfo type;
    public LicenseInfo type(LicenseFeatureInfo type) {
        this.type = type;
        return this;
    }
    // Datetime when license was purchased in ISO 8601 format including timezone, for example 2017-03-10T18:07:52.534Z
    public String creationTime;
    public LicenseInfo creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    // Information on extension to which a license can be assigned
    public LicenseExtensionInfo extension;
    public LicenseInfo extension(LicenseExtensionInfo extension) {
        this.extension = extension;
        return this;
    }
}
