package com.ringcentral.definitions;


public class ScimAuthenticationScheme
{
    /**
     */
    public String description;
    public ScimAuthenticationScheme description(String description)
    {
        this.description = description;
        return this;
    }

    /**
     */
    public String documentationUri;
    public ScimAuthenticationScheme documentationUri(String documentationUri)
    {
        this.documentationUri = documentationUri;
        return this;
    }

    /**
     */
    public String name;
    public ScimAuthenticationScheme name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     */
    public String specUri;
    public ScimAuthenticationScheme specUri(String specUri)
    {
        this.specUri = specUri;
        return this;
    }

    /**
     */
    public Boolean primary;
    public ScimAuthenticationScheme primary(Boolean primary)
    {
        this.primary = primary;
        return this;
    }
}