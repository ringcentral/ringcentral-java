package com.ringcentral.definitions;


public class CustomCompanyGreetingInfo
{
    /**
     * Link to an extension custom greeting
     */
    public String uri;
    public CustomCompanyGreetingInfo uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * Internal identifier of an answering rule
     */
    public String id;
    public CustomCompanyGreetingInfo id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Type of a company greeting
     * Enum: Company, StartRecording, StopRecording, AutomaticRecording, TemplateGreeting
     */
    public String type;
    public CustomCompanyGreetingInfo type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * Content media type
     * Enum: audio/mpeg, audio/wav
     */
    public String contentType;
    public CustomCompanyGreetingInfo contentType(String contentType)
    {
        this.contentType = contentType;
        return this;
    }

    /**
     * Link to a greeting content (audio file)
     */
    public String contentUri;
    public CustomCompanyGreetingInfo contentUri(String contentUri)
    {
        this.contentUri = contentUri;
        return this;
    }

    /**
     */
    public CustomGreetingAnsweringRuleInfo answeringRule;
    public CustomCompanyGreetingInfo answeringRule(CustomGreetingAnsweringRuleInfo answeringRule)
    {
        this.answeringRule = answeringRule;
        return this;
    }

    /**
     */
    public CustomCompanyGreetingLanguageInfo language;
    public CustomCompanyGreetingInfo language(CustomCompanyGreetingLanguageInfo language)
    {
        this.language = language;
        return this;
    }
}