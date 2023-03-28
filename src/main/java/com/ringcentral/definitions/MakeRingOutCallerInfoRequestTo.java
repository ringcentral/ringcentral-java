package com.ringcentral.definitions;


/**
 * Phone number of a called party. This number corresponds to the
 * 2nd leg of a RingOut call
 */
public class MakeRingOutCallerInfoRequestTo {
    /**
     * Phone number in E.164 format
     */
    public String phoneNumber;

    public MakeRingOutCallerInfoRequestTo phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
}
