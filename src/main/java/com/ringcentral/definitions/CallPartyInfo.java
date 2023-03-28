package com.ringcentral.definitions;


public class CallPartyInfo {
    /**
     * Call party phone number in [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I)(with &#039;+&#039; sign) format
     */
    public String phoneNumber;
    /**
     * Call party name
     */
    public String name;
    /**
     * Internal identifier of a call party extensionId
     */
    public String extensionId;

    public CallPartyInfo phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public CallPartyInfo name(String name) {
        this.name = name;
        return this;
    }

    public CallPartyInfo extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }
}
