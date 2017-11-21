package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class LicenseTypeInfo
{
    // Internal identifier of a type
    public String id;
    public LicenseTypeInfo id(String id) {
        this.id = id;
        return this;
    }
    // Canonical URI of a license type resource
    public String uri;
    public LicenseTypeInfo uri(String uri) {
        this.uri = uri;
        return this;
    }
    // Short name of a license type
    public String sku;
    public LicenseTypeInfo sku(String sku) {
        this.sku = sku;
        return this;
    }
    // Full name of a license type
    public String name;
    public LicenseTypeInfo name(String name) {
        this.name = name;
        return this;
    }
    // State of a license. Webinars and Large Meetings are assignable
    public String assignable;
    public LicenseTypeInfo assignable(String assignable) {
        this.assignable = assignable;
        return this;
    }
    // License feature info
    public LicenseFeatureInfo feature;
    public LicenseTypeInfo feature(LicenseFeatureInfo feature) {
        this.feature = feature;
        return this;
    }
}
