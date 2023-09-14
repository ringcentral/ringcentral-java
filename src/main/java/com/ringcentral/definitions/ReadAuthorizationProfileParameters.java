package com.ringcentral.definitions;


/**
 * Query parameters for operation readAuthorizationProfile
 */
public class ReadAuthorizationProfileParameters {
    /**
     *
     */
    public String targetExtensionId;

    public ReadAuthorizationProfileParameters targetExtensionId(String targetExtensionId) {
        this.targetExtensionId = targetExtensionId;
        return this;
    }
}
