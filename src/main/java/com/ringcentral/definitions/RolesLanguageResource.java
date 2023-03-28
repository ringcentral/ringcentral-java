package com.ringcentral.definitions;


public class RolesLanguageResource {
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
    public String localeCode;

    public RolesLanguageResource id(String id) {
        this.id = id;
        return this;
    }

    public RolesLanguageResource name(String name) {
        this.name = name;
        return this;
    }

    public RolesLanguageResource localeCode(String localeCode) {
        this.localeCode = localeCode;
        return this;
    }
}
