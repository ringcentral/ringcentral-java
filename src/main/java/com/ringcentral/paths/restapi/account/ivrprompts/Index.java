package com.ringcentral.paths.restapi.account.ivrprompts;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.Index parent;
    public String promptId;

    public Index(com.ringcentral.paths.restapi.account.Index parent, String promptId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.promptId = promptId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && promptId != null) {
            return parent.path() + "/ivr-prompts/" + promptId;
        }
        return parent.path() + "/ivr-prompts";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns the list of IVR prompts.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/ivr-prompts
     * Rate Limit Group: Medium
     * App Permission: ReadAccounts
     * User Permission: ReadCompanyGreetings
     */
    public IvrPrompts list() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(false), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), IvrPrompts.class);
    }

    /**
     * Creates an IVR prompt.
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/ivr-prompts
     * Rate Limit Group: Heavy
     * App Permission: EditAccounts
     * User Permission: EditCompanyGreetings
     */
    public PromptInfo post(CreateIVRPromptRequest createIVRPromptRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(false), createIVRPromptRequest, null, com.ringcentral.ContentType.MULTIPART);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), PromptInfo.class);
    }

    /**
     * Returns an IVR prompt by ID.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/ivr-prompts/{promptId}
     * Rate Limit Group: Medium
     * App Permission: ReadAccounts
     * User Permission: ReadCompanyGreetings
     */
    public PromptInfo get() throws com.ringcentral.RestException, java.io.IOException {
        if (promptId == null) {
            throw new IllegalArgumentException("Parameter promptId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), PromptInfo.class);
    }

    /**
     * Updates an IVR prompt by ID
     * HTTP Method: put
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/ivr-prompts/{promptId}
     * Rate Limit Group: Medium
     * App Permission: EditAccounts
     * User Permission: EditCompanyGreetings
     */
    public PromptInfo put(UpdateIVRPromptRequest updateIVRPromptRequest) throws com.ringcentral.RestException, java.io.IOException {
        if (promptId == null) {
            throw new IllegalArgumentException("Parameter promptId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.put(this.path(), updateIVRPromptRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), PromptInfo.class);
    }

    /**
     * Deletes an IVR prompt by ID.
     * HTTP Method: delete
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/ivr-prompts/{promptId}
     * Rate Limit Group: Heavy
     * App Permission: EditAccounts
     * User Permission: EditCompanyGreetings
     */
    public String delete() throws com.ringcentral.RestException, java.io.IOException {
        if (promptId == null) {
            throw new IllegalArgumentException("Parameter promptId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.delete(this.path(), null);
        return rb.string();
    }

    public com.ringcentral.paths.restapi.account.ivrprompts.content.Index content() {
        return new com.ringcentral.paths.restapi.account.ivrprompts.content.Index(this);
    }

}
