package com.ringcentral.definitions;


public class ContactCenterProvider {
    /**
     * Internal identifier of the provider
     */
    public String id;
    /**
     * Provider's name
     */
    public String name;

    public ContactCenterProvider id(String id) {
        this.id = id;
        return this;
    }

    public ContactCenterProvider name(String name) {
        this.name = name;
        return this;
    }

}
