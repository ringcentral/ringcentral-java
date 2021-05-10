package com.ringcentral.definitions;


// Sender of a pager message.
public class PagerCallerInfoRequest {
    /**
     * Extension identifier
     * Example: 123456789
     */
    public String extensionId;
    /**
     * Extension number
     * Example: 105
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
