package com.ringcentral.definitions;


public class PagerCallerInfoRequest {
    /**
     * Extension identifier
     * Required
     */
    public String extensionId;

    public PagerCallerInfoRequest extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }

}
