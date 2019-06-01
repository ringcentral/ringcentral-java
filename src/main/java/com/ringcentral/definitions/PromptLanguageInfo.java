package com.ringcentral.definitions;


public class PromptLanguageInfo {
    /**
     * Link to a prompt language
     */
    public String uri;
    /**
     * Internal identifier of a language
     */
    public String id;
    /**
     * Language name
     */
    public String name;
    /**
     * Language locale code
     */
    public String localeCode;

    public PromptLanguageInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public PromptLanguageInfo id(String id) {
        this.id = id;
        return this;
    }

    public PromptLanguageInfo name(String name) {
        this.name = name;
        return this;
    }

    public PromptLanguageInfo localeCode(String localeCode) {
        this.localeCode = localeCode;
        return this;
    }

}
