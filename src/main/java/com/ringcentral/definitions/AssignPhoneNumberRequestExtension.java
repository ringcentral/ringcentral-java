package com.ringcentral.definitions;


public class AssignPhoneNumberRequestExtension {
    /**
     * Internal identifier of an extension
     */
    public String id;

    public AssignPhoneNumberRequestExtension id(String id) {
        this.id = id;
        return this;
    }
}
