package com.ringcentral.definitions;


public class FaxRequestTo {
    /**
     * Phone number in E.164 (with &#039;+&#039; sign) format
     * Example: +18661234567
     */
    public String phoneNumber;
    /**
     * Name of a fax recipient that will be listed on a fax cover page
     */
    public String name;

    public FaxRequestTo phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public FaxRequestTo name(String name) {
        this.name = name;
        return this;
    }
}
