package com.ringcentral.definitions;


public class TransferTarget {
    /**
     * Phone number
     */
    public String phoneNumber;
    /**
     * VM owner's extension id
     */
    public String voicemail;
    /**
     * Park orbit id
     */
    public String parkOrbit;

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

}
