package com.ringcentral.definitions;


public class CallerInfoFrom {
    /**
     *
     */
    public String phoneNumber;
    /**
     *
     */
    public String name;
    /**
     *
     */
    public String location;

    public CallerInfoFrom phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public CallerInfoFrom name(String name) {
        this.name = name;
        return this;
    }

    public CallerInfoFrom location(String location) {
        this.location = location;
        return this;
    }

}
