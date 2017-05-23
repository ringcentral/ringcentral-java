package com.ringcentral.definitions;

public class ExtensionServiceFeatureInfo {
    // Feature status; shows feature availability for an extension
    public Boolean enabled;
    // Feature name, see all available values in Service Feature List
    public String featureName;
    // Reason of limitation for a particular service feature. Returned only if the enabled parameter value is 'False', see Service Feature Limitations and Reasons. When retrieving service features for an extension, the reasons for the limitations, if any, are returned in response
    public String reason;

    public ExtensionServiceFeatureInfo enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public ExtensionServiceFeatureInfo featureName(String featureName) {
        this.featureName = featureName;
        return this;
    }

    public ExtensionServiceFeatureInfo reason(String reason) {
        this.reason = reason;
        return this;
    }
}
