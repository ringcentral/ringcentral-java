package com.ringcentral.definitions;

/**
 * Identifier of a call party the call will be forwarded to. Only **one of** these parameters:
 * `phoneNumber`, `voicemail`, `extensionNumber` or `extensionId` must be specified, otherwise an
 * error is returned.
 */
public class ForwardTarget {
    /** Phone number Required */
    public String phoneNumber;

    public ForwardTarget phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /** Voicemail owner extension identifier Required */
    public String voicemail;

    public ForwardTarget voicemail(String voicemail) {
        this.voicemail = voicemail;
        return this;
    }

    /** Extension short number Required */
    public String extensionNumber;

    public ForwardTarget extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    /** Extension mailbox identifier Required */
    public String extensionId;

    public ForwardTarget extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }
}
