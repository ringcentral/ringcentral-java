package com.ringcentral.paths.restapi.dictionary.state;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.GetStateInfoResponse;
import com.ringcentral.definitions.GetStateListResponse;
import com.ringcentral.definitions.ListStatesParameters;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.dictionary.Index parent;
    public String stateId;

    public Index(com.ringcentral.paths.restapi.dictionary.Index parent, String stateId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.stateId = stateId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && stateId != null) {
            return parent.path() + "/state/" + stateId;
        }
        return parent.path() + "/state";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns all the states of a certain country
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/dictionary/state
     * Rate Limit Group: Light
     */
    public GetStateListResponse list(ListStatesParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(false), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), GetStateListResponse.class);
    }

    public GetStateListResponse list() throws com.ringcentral.RestException, java.io.IOException {
        return this.list(null);
    }

    /**
     * Returns the information on a specific state.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/dictionary/state/{stateId}
     * Rate Limit Group: Light
     */
    public GetStateInfoResponse get() throws com.ringcentral.RestException, java.io.IOException {
        if (stateId == null) {
            throw new IllegalArgumentException("Parameter stateId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), GetStateInfoResponse.class);
    }
}
