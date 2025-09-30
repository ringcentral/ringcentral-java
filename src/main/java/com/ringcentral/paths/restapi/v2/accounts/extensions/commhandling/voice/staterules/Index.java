package com.ringcentral.paths.restapi.v2.accounts.extensions.commhandling.voice.staterules;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.CommStateBasedRuleResource;
import com.ringcentral.definitions.CommStateBasedRuleUpdateRequest;
import com.ringcentral.definitions.CommStateBasedRulesResource;
import com.ringcentral.definitions.ListVoiceStateBasedRulesParameters;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.v2.accounts.extensions.commhandling.voice.Index parent;
    public String stateId;

    public Index(com.ringcentral.paths.restapi.v2.accounts.extensions.commhandling.voice.Index parent, String stateId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.stateId = stateId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && stateId != null) {
            return parent.path() + "/state-rules/" + stateId;
        }
        return parent.path() + "/state-rules";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns a list of extension&#039;s voice state-based rules.
     * <p>
     * *State-base rule* is a call handling rule, managing voice calls on the basis of the user&#039;s **state (status)**:
     * *Forward all calls (FAC), Do not disturb (DND), Work Hours (WH), After Hours (AH), Agent*.
     * <p>
     * **Please note:** State-based rules are applicable to the User extension types only: User, DigitalUser, FaxUser,
     * VirtualUser.
     * <p>
     * HTTP Method: get
     * Endpoint: /restapi/v2/accounts/{accountId}/extensions/{extensionId}/comm-handling/voice/state-rules
     * Rate Limit Group: Medium
     * App Permission: ReadAccounts
     */
    public CommStateBasedRulesResource list(ListVoiceStateBasedRulesParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(false), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), CommStateBasedRulesResource.class);
    }

    public CommStateBasedRulesResource list() throws com.ringcentral.RestException, java.io.IOException {
        return this.list(null);
    }

    /**
     * Returns the extension&#039;s voice state-based rule by ID specified in URL. Each state is assigned
     * with the predefined ID.
     * <p>
     * *State-base rule* is a call handling rule, managing voice calls on the basis of the user&#039;s **state (status)**:
     * <p>
     * *Forward all calls (FAC), Do not disturb (DND), Work Hours (WH), After Hours (AH), Agent*.
     * <p>
     * HTTP Method: get
     * Endpoint: /restapi/v2/accounts/{accountId}/extensions/{extensionId}/comm-handling/voice/state-rules/{stateId}
     * Rate Limit Group: Medium
     * App Permission: ReadAccounts
     */
    public CommStateBasedRuleResource get() throws com.ringcentral.RestException, java.io.IOException {
        if (stateId == null) {
            throw new IllegalArgumentException("Parameter stateId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), CommStateBasedRuleResource.class);
    }

    /**
     * Updates the extension&#039;s voice state-based rule.
     * <p>
     * **Please note:**  When updating any of objects: `enabled`, `displayName`, `dispatching`, `condition`, etc.
     * all of object parameters should be passed (as in PUT method) - if a parameter is not specified,
     * its value will be set back to default, if any, or deleted.
     * <p>
     * HTTP Method: patch
     * Endpoint: /restapi/v2/accounts/{accountId}/extensions/{extensionId}/comm-handling/voice/state-rules/{stateId}
     * Rate Limit Group: Medium
     * App Permission: EditExtensions
     */
    public CommStateBasedRuleResource patch(CommStateBasedRuleUpdateRequest commStateBasedRuleUpdateRequest) throws com.ringcentral.RestException, java.io.IOException {
        if (stateId == null) {
            throw new IllegalArgumentException("Parameter stateId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.patch(this.path(), commStateBasedRuleUpdateRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), CommStateBasedRuleResource.class);
    }
}
