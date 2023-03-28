package com.ringcentral.definitions;


public class CustomCompanyGreetingInfo {
    /**
     * Link to an extension custom greeting
     * Format: uri
     */
    public String uri;
    /**
     * Internal identifier of an answering rule
     */
    public String id;
    /**
     * Type of a company greeting
     * Enum: Company, StartRecording, StopRecording, AutomaticRecording, TemplateGreeting
     */
    public String type;
    /**
     * Content media type
     * Enum: audio/mpeg, audio/wav
     */
    public String contentType;
    /**
     * Link to a greeting content (audio file)
     * Format: uri
     */
    public String contentUri;
    /**
     *
     */
    public CustomGreetingAnsweringRuleInfo answeringRule;
    /**
     *
     */
    public CustomCompanyGreetingLanguageInfo language;

    public CustomCompanyGreetingInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public CustomCompanyGreetingInfo id(String id) {
        this.id = id;
        return this;
    }

    public CustomCompanyGreetingInfo type(String type) {
        this.type = type;
        return this;
    }

    public CustomCompanyGreetingInfo contentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    public CustomCompanyGreetingInfo contentUri(String contentUri) {
        this.contentUri = contentUri;
        return this;
    }

    public CustomCompanyGreetingInfo answeringRule(CustomGreetingAnsweringRuleInfo answeringRule) {
        this.answeringRule = answeringRule;
        return this;
    }

    public CustomCompanyGreetingInfo language(CustomCompanyGreetingLanguageInfo language) {
        this.language = language;
        return this;
    }
}
