package com.ringcentral.definitions;


public class ForwardTarget {
    /**
     * Phone number
     */
    public String phoneNumber;
    /**
     * Voicemail owner extension identifier
     */
    public String voicemail;

    public ForwardTarget phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public ForwardTarget voicemail(String voicemail) {
        this.voicemail = voicemail;
        return this;
    }

}
