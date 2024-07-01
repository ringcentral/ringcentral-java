package com.ringcentral.definitions;


/**
 * Query parameters for operation listCompanyMessageTemplates
 */
public class ListCompanyMessageTemplatesParameters {
    /**
     * Site ID(s) to filter company message templates, associated with particular sites
     * By default the value is all - templates with all sites will be returned
     */
    public String[] siteIds;

    public ListCompanyMessageTemplatesParameters siteIds(String[] siteIds) {
        this.siteIds = siteIds;
        return this;
    }
}
