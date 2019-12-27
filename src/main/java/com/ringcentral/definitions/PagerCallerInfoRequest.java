package com.ringcentral.definitions;


public class PagerCallerInfoRequest {
    /**
     * Extension identifier
     */
    public String extensionId;
    /**
     * Extension number
     */
    public String extensionNumber;

    public PagerCallerInfoRequest extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }

    public PagerCallerInfoRequest extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

}
