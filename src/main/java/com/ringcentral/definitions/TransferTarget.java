package com.ringcentral.definitions;


/**
 * Identifier of a call party the call will be transferred to. Only **one of** these parameters: `phoneNumber`, `voicemail`, `extensionNumber` or `parkOrbit` must be specified, otherwise an error is returned.
 */
public class TransferTarget {
    /**
     * Phone number
     */
    public String phoneNumber;
    /**
     * Voicemail owner extension identifier
     */
    public String voicemail;
    /**
     * Park orbit identifier
     */
    public String parkOrbit;
    /**
     * Extension short number
     */
    public String extensionNumber;

    public TransferTarget phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public TransferTarget voicemail(String voicemail) {
        this.voicemail = voicemail;
        return this;
    }

    public TransferTarget parkOrbit(String parkOrbit) {
        this.parkOrbit = parkOrbit;
        return this;
    }

    public TransferTarget extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }
}
