package com.ringcentral.definitions;


/**
 * Query parameters for operation listUserMessageTemplates
 */
public class ListUserMessageTemplatesParameters {
    /**
     * Site ID(s) to filter user message templates, associated with particular sites.
     * By default the value is all - templates with all sites will be returned
     */
    public String[] siteIds;
    /**
     * Specifies if a template is available on a user (Personal) or a company (Company) level
     * Enum: Company, Personal
     */
    public String scope;

    public ListUserMessageTemplatesParameters siteIds(String[] siteIds) {
        this.siteIds = siteIds;
        return this;
    }

    public ListUserMessageTemplatesParameters scope(String scope) {
        this.scope = scope;
        return this;
    }
}
