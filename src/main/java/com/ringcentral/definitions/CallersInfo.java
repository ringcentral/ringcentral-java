package com.ringcentral.definitions;


public class CallersInfo {
    /**
     * Phone number of a caller
     */
    public String callerId;
    /**
     * Contact name of a caller
     */
    public String name;

    public CallersInfo callerId(String callerId) {
        this.callerId = callerId;
        return this;
    }

    public CallersInfo name(String name) {
        this.name = name;
        return this;
    }

}
