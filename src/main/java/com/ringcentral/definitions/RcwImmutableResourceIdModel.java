package com.ringcentral.definitions;


public class RcwImmutableResourceIdModel {
    /**
     * Internal object ID
     * Example: 78654321
     */
    public String id;

    public RcwImmutableResourceIdModel id(String id) {
        this.id = id;
        return this;
    }
}
