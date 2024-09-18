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
    public MessageTemplateInfo body;
    /**
     *
     */
    public Site site;

    public MessageTemplateRequest displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    public MessageTemplateRequest body(MessageTemplateInfo body) {
        this.body = body;
        return this;
    }

    public MessageTemplateRequest site(Site site) {
        this.site = site;
        return this;
    }
}
