package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ServiceFeatureValue
{
    //
    public String featureName;
    public ServiceFeatureValue featureName(String featureName) {
        this.featureName = featureName;
        return this;
    }
    //
    public Boolean enabled;
    public ServiceFeatureValue enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    //
    public String reason;
    public ServiceFeatureValue reason(String reason) {
        this.reason = reason;
        return this;
    }
}
