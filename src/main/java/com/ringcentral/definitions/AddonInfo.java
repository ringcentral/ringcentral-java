package com.ringcentral.definitions;


public class AddonInfo {
    /**
     *
     */
    public String id;
    /**
     *
     */
    public String name;
    /**
     *
     */
    public String count;

    public AddonInfo id(String id) {
        this.id = id;
        return this;
    }

    public AddonInfo name(String name) {
        this.name = name;
        return this;
    }

    public AddonInfo count(String count) {
        this.count = count;
        return this;
    }

}
