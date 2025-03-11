package com.ringcentral.paths.restapi.account.messagestoretemplates;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

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
            return parent.path() + "/message-store-templates/" + templateId;
        }
        return parent.path() + "/message-store-templates";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns a list of company text message templates.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/message-store-templates
     * Rate Limit Group: Light
     * App Permission: ReadAccounts
     */
    public MessageTemplatesListResponse list(ListCompanyMessageTemplatesParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(false), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), MessageTemplatesListResponse.class);
    }

    public MessageTemplatesListResponse list() throws com.ringcentral.RestException, java.io.IOException {
        return this.list(null);
    }

    /**
     * Creates a new text message template on a company level. Maximum number of company templates is 50.
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/message-store-templates
     * Rate Limit Group: Medium
     * App Permission: EditAccounts
     */
    public MessageTemplateResponse post(MessageTemplateRequest messageTemplateRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(false), messageTemplateRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), MessageTemplateResponse.class);
    }

    /**
     * Returns a company text message template by ID.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/message-store-templates/{templateId}
     * Rate Limit Group: Light
     * App Permission: ReadAccounts
     */
    public MessageTemplateResponse get() throws com.ringcentral.RestException, java.io.IOException {
        if (templateId == null) {
            throw new IllegalArgumentException("Parameter templateId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), MessageTemplateResponse.class);
    }

    /**
     * Updates a company text message template.
     * HTTP Method: put
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/message-store-templates/{templateId}
     * Rate Limit Group: Medium
     * App Permission: EditAccounts
     */
    public MessageTemplateResponse put(MessageTemplateUpdateRequest messageTemplateUpdateRequest) throws com.ringcentral.RestException, java.io.IOException {
        if (templateId == null) {
            throw new IllegalArgumentException("Parameter templateId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.put(this.path(), messageTemplateUpdateRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), MessageTemplateResponse.class);
    }

    /**
     * Deletes a company text message template.
     * HTTP Method: delete
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/message-store-templates/{templateId}
     * Rate Limit Group: Medium
     * App Permission: EditAccounts
     */
    public String delete() throws com.ringcentral.RestException, java.io.IOException {
        if (templateId == null) {
            throw new IllegalArgumentException("Parameter templateId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.delete(this.path(), null);
        return rb.string();
    }
}
