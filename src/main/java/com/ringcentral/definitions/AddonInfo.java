package com.ringcentral.definitions;

public class AddonInfo {
    // Addon identifier. For HardPhones of certain types, which are compatible with this addon identifier
    public String id;
    // Number of addons. For HardPhones of certain types, which are compatible with such addon identifier
    public Long count;

    public AddonInfo id(String id) {
        this.id = id;
        return this;
    }

    public AddonInfo count(Long count) {
        this.count = count;
        return this;
    }
}
