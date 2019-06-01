package com.ringcentral.definitions;


public class GreetingLanguageInfo {
    /**
     * Internal identifier of a greeting language
     */
    public String id;
    /**
     * Localization code of a greeting language
     */
    public String localeCode;
    /**
     * Official name of a greeting language
     */
    public String name;

    public GreetingLanguageInfo id(String id) {
        this.id = id;
        return this;
    }

    public GreetingLanguageInfo localeCode(String localeCode) {
        this.localeCode = localeCode;
        return this;
    }

    public GreetingLanguageInfo name(String name) {
        this.name = name;
        return this;
    }

}
