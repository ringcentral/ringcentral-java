package com.ringcentral.paths.restapi.v2.accounts.extensions.commhandling.voice.interactionrules;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.v2.accounts.extensions.commhandling.voice.Index parent;
    public String ruleId;

    public Index(com.ringcentral.paths.restapi.v2.accounts.extensions.commhandling.voice.Index parent, String ruleId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.ruleId = ruleId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && ruleId != null) {
            return parent.path() + "/interaction-rules/" + ruleId;
        }
        return parent.path() + "/interaction-rules";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns a list of extension&#039;s interaction rules with the detailed information on each rule.
     * <p>
     * *Interaction* rule is a call handling rule, managing voice call on the basis
     * of the user&#039;s **contact** or a **phone number** which is calling and/or being called.
     * <p>
     * **Please note:** Interaction rules are applicable to the User extension types only: User, DigitalUser,
     * FaxUser, VirtualUser.
     * <p>
     * HTTP Method: get
     * Endpoint: /restapi/v2/accounts/{accountId}/extensions/{extensionId}/comm-handling/voice/interaction-rules
     * Rate Limit Group: Medium
     * App Permission: ReadAccounts
     */
    public CommInteractionRulesResource list(ListVoiceInteractionRulesParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(false), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), CommInteractionRulesResource.class);
    }

    public CommInteractionRulesResource list() throws com.ringcentral.RestException, java.io.IOException {
        return this.list(null);
    }

    /**
     * Creates the extension&#039;s interaction rule.
     * <p>
     * *Interaction* rule is a call handling rule, managing voice call on the basis
     * of the user&#039;s **contact** or a **phone number** which is calling and/or being called.
     * <p>
     * **Please note:** Interaction rules are applicable to the User extension types only: User, DigitalUser,
     * FaxUser, VirtualUser.
     * <p>
     * HTTP Method: post
     * Endpoint: /restapi/v2/accounts/{accountId}/extensions/{extensionId}/comm-handling/voice/interaction-rules
     * Rate Limit Group: Medium
     * App Permission: EditExtensions
     */
    public CommInteractionRuleResource post(CommInteractionRuleCreateRequest commInteractionRuleCreateRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(false), commInteractionRuleCreateRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), CommInteractionRuleResource.class);
    }

    /**
     * Returns the extension&#039;s interaction rule by ID specified in URL.
     * <p>
     * *Interaction* rule is a call handling rule, managing voice call on the basis
     * of the user&#039;s **contact** or a **phone number** which is calling and/or being called.
     * <p>
     * HTTP Method: get
     * Endpoint: /restapi/v2/accounts/{accountId}/extensions/{extensionId}/comm-handling/voice/interaction-rules/{ruleId}
     * Rate Limit Group: Medium
     * App Permission: ReadAccounts
     */
    public CommInteractionRuleResource get() throws com.ringcentral.RestException, java.io.IOException {
        if (ruleId == null) {
            throw new IllegalArgumentException("Parameter ruleId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), CommInteractionRuleResource.class);
    }

    /**
     * Deletes the extension&#039;s interaction rule by ID specified in URL.
     * HTTP Method: delete
     * Endpoint: /restapi/v2/accounts/{accountId}/extensions/{extensionId}/comm-handling/voice/interaction-rules/{ruleId}
     * Rate Limit Group: Medium
     * App Permission: EditExtensions
     */
    public String delete() throws com.ringcentral.RestException, java.io.IOException {
        if (ruleId == null) {
            throw new IllegalArgumentException("Parameter ruleId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.delete(this.path(), null);
        return rb.string();
    }

    /**
     * Updates the extension&#039;s interaction rule by ID specified in URL.
     * HTTP Method: patch
     * Endpoint: /restapi/v2/accounts/{accountId}/extensions/{extensionId}/comm-handling/voice/interaction-rules/{ruleId}
     * Rate Limit Group: Medium
     * App Permission: EditExtensions
     */
    public CommInteractionRuleResource patch(CommInteractionRuleUpdateRequest commInteractionRuleUpdateRequest) throws com.ringcentral.RestException, java.io.IOException {
        if (ruleId == null) {
            throw new IllegalArgumentException("Parameter ruleId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.patch(this.path(), commInteractionRuleUpdateRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), CommInteractionRuleResource.class);
    }
}
