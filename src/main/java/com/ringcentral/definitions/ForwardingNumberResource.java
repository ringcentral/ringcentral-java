package com.ringcentral.definitions;


public class ForwardingNumberResource {
    /**
     *
     */
    public String uri;
    /**
     *
     */
    public String id;
    /**
     *
     */
    public String phoneNumber;
    /**
     *
     */
    public String label;
    /**
     *
     */
    public String[] features;
    /**
     *
     */
    public String flipNumber;
    /**
     * Forwarding phone number type
     * Enum: Home, Mobile, Work, PhoneLine, Outage, Other
     */
    public String type;

    public ForwardingNumberResource uri(String uri) {
        this.uri = uri;
        return this;
    }

    public ForwardingNumberResource id(String id) {
        this.id = id;
        return this;
    }

    public ForwardingNumberResource phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public ForwardingNumberResource label(String label) {
        this.label = label;
        return this;
    }

    public ForwardingNumberResource features(String[] features) {
        this.features = features;
        return this;
    }

    public ForwardingNumberResource flipNumber(String flipNumber) {
        this.flipNumber = flipNumber;
        return this;
    }

    public ForwardingNumberResource type(String type) {
        this.type = type;
        return this;
    }

}
