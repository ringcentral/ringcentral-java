package com.ringcentral.definitions;


public class CustomCompanyGreetingInfo {
    /**
     * Link to an extension custom greeting
     */
    public String uri;
    /**
     * Internal identifier of an answering rule
     */
    public String id;
    /**
     * Type of a company greeting
     * Enum: Company, StartRecording, StopRecording, AutomaticRecording
     */
    public String type;
    /**
     * Content media type in WAV/MP3 format
     * Enum: WAV, MP3
     */
    public String contentType;
    /**
     * Link to a greeting content (audio file)
     */
    public String contentUri;
    /**
     * Information on an answering rule that the greeting is applied to
     */
    public CustomGreetingAnsweringRuleInfo answeringRule;
    /**
     * Information on a greeting language. Supported for types 'StopRecording', 'StartRecording', 'AutomaticRecording'
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
