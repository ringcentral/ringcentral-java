package com.ringcentral.definitions;


// Phone number of the called party. This number corresponds to the 2nd leg of a CallOut call
public class MakeCallOutCallerInfoRequestTo {
    /**
     * Phone number in E.164 format
     */
    public String phoneNumber;
    /**
     * Extension number
     */
    public String extensionNumber;

    public MakeCallOutCallerInfoRequestTo phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public MakeCallOutCallerInfoRequestTo extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

}
