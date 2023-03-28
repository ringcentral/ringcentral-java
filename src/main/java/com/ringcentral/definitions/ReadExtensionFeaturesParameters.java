package com.ringcentral.definitions;


/**
 * Query parameters for operation readExtensionFeatures
 */
public class ReadExtensionFeaturesParameters {
    /**
     * Allows to filter features by availability for an extension
     */
    public Boolean availableOnly;
    /**
     * Internal identifier(s) of the feature(s)
     */
    public String[] featureId;

    public ReadExtensionFeaturesParameters availableOnly(Boolean availableOnly) {
        this.availableOnly = availableOnly;
        return this;
    }

    public ReadExtensionFeaturesParameters featureId(String[] featureId) {
        this.featureId = featureId;
        return this;
    }
}
