package com.ringcentral.paths.restapi.account.extension.messagestoretemplates;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.extension.Index parent;
    public String templateId;

    public Index(com.ringcentral.paths.restapi.account.extension.Index parent, String templateId) {
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
     * Returns a list of user&#039;s personal text message templates.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/message-store-templates
     * Rate Limit Group: Light
     * App Permission: ReadAccounts
     */
    public MessageTemplatesListResponse list(ListUserMessageTemplatesParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(false), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), MessageTemplatesListResponse.class);
    }

    public MessageTemplatesListResponse list() throws com.ringcentral.RestException, java.io.IOException {
        return this.list(null);
    }

    /**
     * Creates a user personal text message template.
     * Maximum number of personal templates is 25 per user.
     * Max length of the `body` property is 1000 symbols (2-byte UTF-16 encoded).
     * <p>
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/message-store-templates
     * Rate Limit Group: Medium
     * App Permission: EditExtensions
     */
    public MessageTemplateResponse post(MessageTemplateRequest messageTemplateRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(false), messageTemplateRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), MessageTemplateResponse.class);
    }

    /**
     * Returns a user personal text message template by ID.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/message-store-templates/{templateId}
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
     * Updates a user personal text message template.
     * HTTP Method: put
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/message-store-templates/{templateId}
     * Rate Limit Group: Medium
     * App Permission: EditExtensions
     */
    public MessageTemplateResponse put(MessageTemplateUpdateRequest messageTemplateUpdateRequest) throws com.ringcentral.RestException, java.io.IOException {
        if (templateId == null) {
            throw new IllegalArgumentException("Parameter templateId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.put(this.path(), messageTemplateUpdateRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), MessageTemplateResponse.class);
    }

    /**
     * Deletes a user personal text message template.
     * HTTP Method: delete
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/message-store-templates/{templateId}
     * Rate Limit Group: Medium
     * App Permission: EditExtensions
     */
    public String delete() throws com.ringcentral.RestException, java.io.IOException {
        if (templateId == null) {
            throw new IllegalArgumentException("Parameter templateId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.delete(this.path(), null);
        return rb.string();
    }
}
