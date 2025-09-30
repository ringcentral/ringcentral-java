package com.ringcentral.definitions;


/**
 * Identifier of a call party the call will be transferred to. Only **one of** these parameters: `phoneNumber`, `voicemail`, `extensionNumber`, `parkOrbit` or `extensionId` must be specified, otherwise an error is returned.
 */
public class TransferTarget {
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
     * Park orbit identifier
     * Required
     */
    public String parkOrbit;
    /**
     * Extension mailbox identifier
     * Required
     */
    public String extensionId;

    public TransferTarget phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public TransferTarget voicemail(String voicemail) {
        this.voicemail = voicemail;
        return this;
    }

    public TransferTarget extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    public TransferTarget parkOrbit(String parkOrbit) {
        this.parkOrbit = parkOrbit;
        return this;
    }

    public TransferTarget extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }
}
