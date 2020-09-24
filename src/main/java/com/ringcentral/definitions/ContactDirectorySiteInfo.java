package com.ringcentral.definitions;


public class ContactDirectorySiteInfo {
    /**
     * Internal Identifier of a site
     */
    public String id;
    /**
     * Custom name of a site
     */
    public String name;

    public ContactDirectorySiteInfo id(String id) {
        this.id = id;
        return this;
    }

    public ContactDirectorySiteInfo name(String name) {
        this.name = name;
        return this;
    }

}
