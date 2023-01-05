package com.ringcentral.definitions;


public class CustomUserGreetingInfo
{
    /**
     * Link to a custom user greeting
     */
    public String uri;
    public CustomUserGreetingInfo uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * Internal identifier of a custom user greeting
     */
    public String id;
    public CustomUserGreetingInfo id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Type of a custom user greeting
     * Enum: Introductory, Announcement, InterruptPrompt, ConnectingAudio, ConnectingMessage, Voicemail, Unavailable, HoldMusic, PronouncedName, TemplateGreeting
     */
    public String type;
    public CustomUserGreetingInfo type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * Content media type
     * Enum: audio/mpeg, audio/wav
     */
    public String contentType;
    public CustomUserGreetingInfo contentType(String contentType)
    {
        this.contentType = contentType;
        return this;
    }

    /**
     * Link to a greeting content (audio file)
     */
    public String contentUri;
    public CustomUserGreetingInfo contentUri(String contentUri)
    {
        this.contentUri = contentUri;
        return this;
    }

    /**
     */
    public CustomGreetingAnsweringRuleInfo answeringRule;
    public CustomUserGreetingInfo answeringRule(CustomGreetingAnsweringRuleInfo answeringRule)
    {
        this.answeringRule = answeringRule;
        return this;
    }
}