package com.ringcentral.definitions;


/**
 * Query parameters for operation readUserFeatures
 */
public class ReadUserFeaturesParameters {
    /**
     *
     */
    public Boolean availableOnly;
    /**
     *
     */
    public String[] featureId;

    public ReadUserFeaturesParameters availableOnly(Boolean availableOnly) {
        this.availableOnly = availableOnly;
        return this;
    }

    public ReadUserFeaturesParameters featureId(String[] featureId) {
        this.featureId = featureId;
        return this;
    }
}
