package com.ringcentral.definitions;

public class MessageTemplateUpdateRequest {
    /** Name of a template */
    public String displayName;

    public MessageTemplateUpdateRequest displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /** Required */
    public MessageTemplateInfo body;

    public MessageTemplateUpdateRequest body(MessageTemplateInfo body) {
        this.body = body;
        return this;
    }

    /** */
    public Site site;

    public MessageTemplateUpdateRequest site(Site site) {
        this.site = site;
        return this;
    }
}
