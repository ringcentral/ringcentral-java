package com.ringcentral.definitions;


public class CustomUserGreetingInfo {
    /**
     * Link to a custom user greeting
     */
    public String uri;
    /**
     * Internal identifier of a custom user greeting
     */
    public String id;
    /**
     * Type of a custom user greeting
     * Enum: Introductory, Announcement, InterruptPrompt, ConnectingAudio, ConnectingMessage, Voicemail, Unavailable, HoldMusic, PronouncedName, TemplateGreeting
     */
    public String type;
    /**
     * Content media type
     * Enum: audio/mpeg, audio/wav
     */
    public String contentType;
    /**
     * Link to a greeting content (audio file)
     */
    public String contentUri;
    /**
     *
     */
    public CustomGreetingAnsweringRuleInfo answeringRule;

    public CustomUserGreetingInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public CustomUserGreetingInfo id(String id) {
        this.id = id;
        return this;
    }

    public CustomUserGreetingInfo type(String type) {
        this.type = type;
        return this;
    }

    public CustomUserGreetingInfo contentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    public CustomUserGreetingInfo contentUri(String contentUri) {
        this.contentUri = contentUri;
        return this;
    }

    public CustomUserGreetingInfo answeringRule(CustomGreetingAnsweringRuleInfo answeringRule) {
        this.answeringRule = answeringRule;
        return this;
    }
}
