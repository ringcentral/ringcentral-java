package com.ringcentral.paths.restapi.v2.accounts.extensions.commhandling.states;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.CommStateResource;
import com.ringcentral.definitions.CommStateUpdateRequest;
import com.ringcentral.definitions.CommStatesResource;
import com.ringcentral.definitions.ListCicStatesParameters;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.v2.accounts.extensions.commhandling.Index parent;
    public String stateId;

    public Index(com.ringcentral.paths.restapi.v2.accounts.extensions.commhandling.Index parent, String stateId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.stateId = stateId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && stateId != null) {
            return parent.path() + "/states/" + stateId;
        }
        return parent.path() + "/states";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns a list of communication handling states.
     * HTTP Method: get
     * Endpoint: /restapi/v2/accounts/{accountId}/extensions/{extensionId}/comm-handling/states
     * Rate Limit Group: Medium
     * App Permission: ReadAccounts
     */
    public CommStatesResource list(ListCicStatesParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(false), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), CommStatesResource.class);
    }

    public CommStatesResource list() throws com.ringcentral.RestException, java.io.IOException {
        return this.list(null);
    }

    /**
     * Returns a communication handling state.
     * HTTP Method: get
     * Endpoint: /restapi/v2/accounts/{accountId}/extensions/{extensionId}/comm-handling/states/{stateId}
     * Rate Limit Group: Medium
     * App Permission: ReadAccounts
     */
    public CommStateResource get() throws com.ringcentral.RestException, java.io.IOException {
        if (stateId == null) {
            throw new IllegalArgumentException("Parameter stateId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), CommStateResource.class);
    }

    /**
     * Updates a communication handling state condition.
     * HTTP Method: patch
     * Endpoint: /restapi/v2/accounts/{accountId}/extensions/{extensionId}/comm-handling/states/{stateId}
     * Rate Limit Group: Medium
     * App Permission: ReadAccounts
     */
    public CommStateResource patch(CommStateUpdateRequest commStateUpdateRequest) throws com.ringcentral.RestException, java.io.IOException {
        if (stateId == null) {
            throw new IllegalArgumentException("Parameter stateId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.patch(this.path(), commStateUpdateRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), CommStateResource.class);
    }
}
