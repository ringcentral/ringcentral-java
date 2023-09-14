package com.ringcentral.definitions;


/**
 * Phone number of the called party. This number corresponds to the 2nd leg of a CallOut call
 */
public class MakeCallOutCallerInfoRequestTo {
    /**
     * Phone number in E.164 format, short codes (*67, *86), emergency (911, 112) or special (988) numbers
     * Example: +16502223366
     */
    public String phoneNumber;
    /**
     * Extension number
     * Example: 103
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
