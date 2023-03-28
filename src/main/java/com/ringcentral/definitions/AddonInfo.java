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
     * Format: int32
     */
    public Long count;

    public AddonInfo id(String id) {
        this.id = id;
        return this;
    }

    public AddonInfo name(String name) {
        this.name = name;
        return this;
    }

    public AddonInfo count(Long count) {
        this.count = count;
        return this;
    }
}
