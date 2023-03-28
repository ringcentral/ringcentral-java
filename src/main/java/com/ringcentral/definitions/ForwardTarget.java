package com.ringcentral.definitions;


/**
 * Identifier of a call party the call will be forwarded to. Only **one of** these parameters:
 * `phoneNumber`, `voicemail` or `extensionNumber` must be specified, otherwise an error is returned.
 */
public class ForwardTarget {
    /**
     * Phone number
     */
    public String phoneNumber;
    /**
     * Voicemail owner extension identifier
     */
    public String voicemail;
    /**
     * Extension short number
     */
    public String extensionNumber;

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
}
