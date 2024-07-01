package com.ringcentral.definitions;


public class MessageTemplateRequest {
    /**
     * Name of a template
     * Required
     */
    public String displayName;
    /**
     * Required
     */
    public TemplateInfo body;
    /**
     *
     */
    public Site site;

    public MessageTemplateRequest displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    public MessageTemplateRequest body(TemplateInfo body) {
        this.body = body;
        return this;
    }

    public MessageTemplateRequest site(Site site) {
        this.site = site;
        return this;
    }
}
