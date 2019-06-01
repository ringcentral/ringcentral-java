package com.ringcentral.definitions;


public class ServiceFeatureValue {
    /**
     *
     */
    public String featureName;
    /**
     *
     */
    public Boolean enabled;
    /**
     * Enum: Available, AccountTypeLimitation, ExtensionTypeLimitation, AccountLimitation, ExtensionLimitation, InsufficientPermissions, ApplicationLimitation
     */
    public String reason;

    public ServiceFeatureValue featureName(String featureName) {
        this.featureName = featureName;
        return this;
    }

    public ServiceFeatureValue enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public ServiceFeatureValue reason(String reason) {
        this.reason = reason;
        return this;
    }

}
