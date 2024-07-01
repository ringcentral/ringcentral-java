package com.ringcentral.definitions;


public class MessageTemplateResponse {
    /**
     * Internal identifier of a template
     */
    public String id;
    /**
     * Name of a template
     */
    public String displayName;
    /**
     *
     */
    public TemplateInfo body;
    /**
     * Specifies if a template is available on a user (Personal) or a company (Company) level
     * Enum: Company, Personal
     */
    public String scope;
    /**
     *
     */
    public Site site;

    public MessageTemplateResponse id(String id) {
        this.id = id;
        return this;
    }

    public MessageTemplateResponse displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    public MessageTemplateResponse body(TemplateInfo body) {
        this.body = body;
        return this;
    }

    public MessageTemplateResponse scope(String scope) {
        this.scope = scope;
        return this;
    }

    public MessageTemplateResponse site(Site site) {
        this.site = site;
        return this;
    }
}
