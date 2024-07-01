package com.ringcentral.definitions;


public class MessageTemplateUpdateRequest {
    /**
     * Name of a template
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

    public MessageTemplateUpdateRequest displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    public MessageTemplateUpdateRequest body(TemplateInfo body) {
        this.body = body;
        return this;
    }

    public MessageTemplateUpdateRequest site(Site site) {
        this.site = site;
        return this;
    }
}
