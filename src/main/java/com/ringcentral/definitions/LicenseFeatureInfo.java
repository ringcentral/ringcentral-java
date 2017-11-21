package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class LicenseFeatureInfo
{
    // Internal identifier of an feature
    public String id;
    public LicenseFeatureInfo id(String id) {
        this.id = id;
        return this;
    }
    // Full name of a feature
    public String name;
    public LicenseFeatureInfo name(String name) {
        this.name = name;
        return this;
    }
    // Maximum count of licenses of specific type per account
    public Long limit;
    public LicenseFeatureInfo limit(Long limit) {
        this.limit = limit;
        return this;
    }
}
