package com.ringcentral.definitions;

/** Caller ID information */
public class CommFromResource {
    /** Phone number in [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I) format Required */
    public String phoneNumber;

    public CommFromResource phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /** Caller name Required */
    public String name;

    public CommFromResource name(String name) {
        this.name = name;
        return this;
    }
}
