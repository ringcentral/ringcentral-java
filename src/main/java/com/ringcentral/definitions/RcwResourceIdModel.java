package com.ringcentral.definitions;


public class RcwResourceIdModel {
    /**
     * Internal object ID
     * Example: 78654321
     */
    public String id;

    public RcwResourceIdModel id(String id) {
        this.id = id;
        return this;
    }
}
