package com.ringcentral.definitions;


public class CustomCompanyGreetingLanguageInfo {
    /**
     * Internal identifier of a greeting language
     */
    public String id;
    /**
     * Link to a greeting language
     */
    public String uri;
    /**
     * Name of a greeting language
     */
    public String name;
    /**
     * Locale code of a greeting language
     */
    public String localeCode;

    public CustomCompanyGreetingLanguageInfo id(String id) {
        this.id = id;
        return this;
    }

    public CustomCompanyGreetingLanguageInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public CustomCompanyGreetingLanguageInfo name(String name) {
        this.name = name;
        return this;
    }

    public CustomCompanyGreetingLanguageInfo localeCode(String localeCode) {
        this.localeCode = localeCode;
        return this;
    }

}
