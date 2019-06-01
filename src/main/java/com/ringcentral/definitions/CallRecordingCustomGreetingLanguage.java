package com.ringcentral.definitions;


public class CallRecordingCustomGreetingLanguage {
    /**
     * Link to a language
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

    public CallRecordingCustomGreetingLanguage uri(String uri) {
        this.uri = uri;
        return this;
    }

    public CallRecordingCustomGreetingLanguage id(String id) {
        this.id = id;
        return this;
    }

    public CallRecordingCustomGreetingLanguage name(String name) {
        this.name = name;
        return this;
    }

    public CallRecordingCustomGreetingLanguage localeCode(String localeCode) {
        this.localeCode = localeCode;
        return this;
    }

}
