package com.ringcentral.definitions;

public class ServiceFeatureInfo {
    // Feature name, see all available values in Service Feature List
    public String featureName;
    // Feature status, shows feature availability for the extension
    public Boolean enabled;

    public ServiceFeatureInfo featureName(String featureName) {
        this.featureName = featureName;
        return this;
    }

    public ServiceFeatureInfo enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
}
