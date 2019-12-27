package com.ringcentral.definitions;


public class FeatureInfo {
    /**
     * Internal identifier of a feature
     */
    public String id;
    /**
     * Specifies if the feature is available for the current user according to services enabled for the account, type, entitlements and permissions of the extension. If the authorized user gets features of the other extension, only features that can be delegated are returned (such as configuration by administrators).
     */
    public Boolean available;
    /**
     *
     */
    public ParamsInfo params;
    /**
     * Reason of the feature unavailability. Returned only if `available` is set to 'false'
     */
    public ReasonInfo reason;

    public FeatureInfo id(String id) {
        this.id = id;
        return this;
    }

    public FeatureInfo available(Boolean available) {
        this.available = available;
        return this;
    }

    public FeatureInfo params(ParamsInfo params) {
        this.params = params;
        return this;
    }

    public FeatureInfo reason(ReasonInfo reason) {
        this.reason = reason;
        return this;
    }

}
