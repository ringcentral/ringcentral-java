package com.ringcentral.definitions;


public class LanguageResource {
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

    public LanguageResource id(String id) {
        this.id = id;
        return this;
    }

    public LanguageResource name(String name) {
        this.name = name;
        return this;
    }

    public LanguageResource localeCode(String localeCode) {
        this.localeCode = localeCode;
        return this;
    }

}
