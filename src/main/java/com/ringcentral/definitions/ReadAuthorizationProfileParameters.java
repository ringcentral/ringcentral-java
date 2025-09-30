package com.ringcentral.definitions;


/**
 * Query parameters for operation readAuthorizationProfile
 */
public class ReadAuthorizationProfileParameters {
    /**
     * The target extension ID (that can be an &quot;object&quot; of certain permissions)
     */
    public String targetExtensionId;

    public ReadAuthorizationProfileParameters targetExtensionId(String targetExtensionId) {
        this.targetExtensionId = targetExtensionId;
        return this;
    }
}
