package com.ringcentral.definitions;

public class BlockedNumberInfo {
    // Standard resource properties ID and canonical URI, see the section called “Resource Identification Properties”
    public String id;
    // Canonical URI of a blocked number resource
    public String uri;
    // Name assigned by a user to a blocked phone number
    public String name;
    // Phone number to be blocked
    public String phoneNumber;

    public BlockedNumberInfo id(String id) {
        this.id = id;
        return this;
    }

    public BlockedNumberInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public BlockedNumberInfo name(String name) {
        this.name = name;
        return this;
    }

    public BlockedNumberInfo phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
}
