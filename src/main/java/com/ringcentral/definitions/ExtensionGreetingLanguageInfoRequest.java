package com.ringcentral.definitions;


public class ExtensionGreetingLanguageInfoRequest
{
    /**
     * Internal identifier of a greeting language
     */
    public String id;
    public ExtensionGreetingLanguageInfoRequest id(String id)
    {
        this.id = id;
        return this;
    }
}