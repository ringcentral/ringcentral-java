package com.ringcentral.definitions;


public class MessageTemplateRequest
{
    /**
     * Name of a template
     * Required
     */
    public String displayName;
    public MessageTemplateRequest displayName(String displayName)
    {
        this.displayName = displayName;
        return this;
    }

    /**
     * Required
     */
    public TemplateInfo body;
    public MessageTemplateRequest body(TemplateInfo body)
    {
        this.body = body;
        return this;
    }

    /**
     */
    public Site site;
    public MessageTemplateRequest site(Site site)
    {
        this.site = site;
        return this;
    }
}