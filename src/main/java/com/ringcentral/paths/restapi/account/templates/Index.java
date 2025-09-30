package com.ringcentral.paths.restapi.account.templates;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.ListUserTemplatesParameters;
import com.ringcentral.definitions.TemplateInfo;
import com.ringcentral.definitions.UserTemplates;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.Index parent;
    public String templateId;

    public Index(com.ringcentral.paths.restapi.account.Index parent, String templateId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.templateId = templateId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && templateId != null) {
            return parent.path() + "/templates/" + templateId;
        }
        return parent.path() + "/templates";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns the list of user templates for the current account.
     * <p>
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/templates
     * Rate Limit Group: Medium
     * App Permission: ReadAccounts
     * User Permission: ReadCompanyInfo
     */
    public UserTemplates list(ListUserTemplatesParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(false), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), UserTemplates.class);
    }

    public UserTemplates list() throws com.ringcentral.RestException, java.io.IOException {
        return this.list(null);
    }

    /**
     * Returns the user template by ID.
     * <p>
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/templates/{templateId}
     * Rate Limit Group: Light
     * App Permission: ReadAccounts
     * User Permission: ReadCompanyInfo
     */
    public TemplateInfo get() throws com.ringcentral.RestException, java.io.IOException {
        if (templateId == null) {
            throw new IllegalArgumentException("Parameter templateId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), TemplateInfo.class);
    }
}
