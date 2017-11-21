package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ServiceFeatureInfo
{
    // Feature name, see all available values in Service Feature List
    public String featureName;
    public ServiceFeatureInfo featureName(String featureName) {
        this.featureName = featureName;
        return this;
    }
    // Feature status, shows feature availability for the extension
    public Boolean enabled;
    public ServiceFeatureInfo enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
}
