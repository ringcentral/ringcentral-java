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
     * Enum: Introductory, Announcement, ConnectingAudio, ConnectingMessage, Voicemail, Unavailable, HoldMusic
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
