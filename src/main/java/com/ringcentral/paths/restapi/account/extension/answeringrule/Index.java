package com.ringcentral.paths.restapi.account.extension.answeringrule;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.extension.Index parent;
    public String ruleId;

    public Index(com.ringcentral.paths.restapi.account.extension.Index parent, String ruleId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.ruleId = ruleId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && ruleId != null) {
            return parent.path() + "/answering-rule/" + ruleId;
        }
        return parent.path() + "/answering-rule";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns call handling rules of an extension.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/answering-rule
     * Rate Limit Group: Medium
     * App Permission: ReadAccounts
     * User Permission: ReadUserAnsweringRules
     */
    public UserAnsweringRuleList list(ListAnsweringRulesParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(false), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), UserAnsweringRuleList.class);
    }

    public UserAnsweringRuleList list() throws com.ringcentral.RestException, java.io.IOException {
        return this.list(null);
    }

    /**
     * Creates a custom call handling rule for a particular caller ID.
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/answering-rule
     * Rate Limit Group: Medium
     * App Permission: EditExtensions
     * User Permission: EditUserAnsweringRules
     */
    public CustomAnsweringRuleInfo post(CreateAnsweringRuleRequest createAnsweringRuleRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(false), createAnsweringRuleRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), CustomAnsweringRuleInfo.class);
    }

    /**
     * Returns a call handling rule by ID.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/answering-rule/{ruleId}
     * Rate Limit Group: Light
     * App Permission: ReadAccounts
     * User Permission: ReadUserAnsweringRules
     */
    public AnsweringRuleInfo get(ReadAnsweringRuleParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        if (ruleId == null) {
            throw new IllegalArgumentException("Parameter ruleId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), AnsweringRuleInfo.class);
    }

    public AnsweringRuleInfo get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }

    /**
     * Updates a custom call handling rule for a particular caller ID.
     * HTTP Method: put
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/answering-rule/{ruleId}
     * Rate Limit Group: Medium
     * App Permission: EditExtensions
     * User Permission: EditUserAnsweringRules
     */
    public AnsweringRuleInfo put(UpdateAnsweringRuleRequest updateAnsweringRuleRequest) throws com.ringcentral.RestException, java.io.IOException {
        if (ruleId == null) {
            throw new IllegalArgumentException("Parameter ruleId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.put(this.path(), updateAnsweringRuleRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), AnsweringRuleInfo.class);
    }

    /**
     * Deletes a custom call handling rule by a particular ID.
     * HTTP Method: delete
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/answering-rule/{ruleId}
     * Rate Limit Group: Medium
     * App Permission: EditExtensions
     * User Permission: EditUserAnsweringRules
     */
    public String delete() throws com.ringcentral.RestException, java.io.IOException {
        if (ruleId == null) {
            throw new IllegalArgumentException("Parameter ruleId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.delete(this.path(), null);
        return rb.string();
    }
}
