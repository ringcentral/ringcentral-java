package com.ringcentral.definitions;


public class DelegateInfo {
    /**
     * Internal identifier of a Secretary extension
     */
    public String id;
    /**
     * Custom name of a Secretary extension
     */
    public String name;

    public DelegateInfo id(String id) {
        this.id = id;
        return this;
    }

    public DelegateInfo name(String name) {
        this.name = name;
        return this;
    }

}
