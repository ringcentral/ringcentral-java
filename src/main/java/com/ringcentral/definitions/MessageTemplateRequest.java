package com.ringcentral.definitions;

public class MessageTemplateRequest {
    /** Internal identifier of a template. Ignored on input */
    public String id;

    public MessageTemplateRequest id(String id) {
        this.id = id;
        return this;
    }

    /** Name of a template Required */
    public String displayName;

    public MessageTemplateRequest displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /** Required */
    public MessageTemplateInfo body;

    public MessageTemplateRequest body(MessageTemplateInfo body) {
        this.body = body;
        return this;
    }

    /**
     * Specifies if a template is available on a user (Personal) or a company (Company) level Enum:
     * Company, Personal
     */
    public String scope;

    public MessageTemplateRequest scope(String scope) {
        this.scope = scope;
        return this;
    }

    /** */
    public Site site;

    public MessageTemplateRequest site(Site site) {
        this.site = site;
        return this;
    }
}
