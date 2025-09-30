package com.ringcentral.definitions;


/**
 * Identifier of a call party the call will be forwarded to. Only **one of** these parameters: `phoneNumber`, `voicemail`, `extensionNumber` or `extensionId` must be specified, otherwise an error is returned.
 */
public class ForwardTarget {
    /**
     * Phone number
     * Required
     */
    public String phoneNumber;
    /**
     * Voicemail owner extension identifier
     * Required
     */
    public String voicemail;
    /**
     * Extension short number
     * Required
     */
    public String extensionNumber;
    /**
     * Extension mailbox identifier
     * Required
     */
    public String extensionId;

    public ForwardTarget phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public ForwardTarget voicemail(String voicemail) {
        this.voicemail = voicemail;
        return this;
    }

    public ForwardTarget extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    public ForwardTarget extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }
}
