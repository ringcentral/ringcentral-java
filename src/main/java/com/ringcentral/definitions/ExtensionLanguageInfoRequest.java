package com.ringcentral.definitions;


public class ExtensionLanguageInfoRequest
{
    /**
     * Internal identifier of a language
     */
    public String id;
    public ExtensionLanguageInfoRequest id(String id)
    {
        this.id = id;
        return this;
    }
}