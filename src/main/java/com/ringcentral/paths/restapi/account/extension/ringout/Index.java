package com.ringcentral.paths.restapi.account.extension.ringout;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.GetRingOutStatusResponse;
import com.ringcentral.definitions.MakeRingOutRequest;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.extension.Index parent;
    public String ringoutId;

    public Index(com.ringcentral.paths.restapi.account.extension.Index parent, String ringoutId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.ringoutId = ringoutId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && ringoutId != null) {
            return parent.path() + "/ring-out/" + ringoutId;
        }
        return parent.path() + "/ring-out";
    }

    public String path() {
        return path(true);
    }

    /**
     * Makes a 2-leg RingOut call.
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/ring-out
     * Rate Limit Group: Heavy
     * App Permission: RingOut
     */
    public GetRingOutStatusResponse post(MakeRingOutRequest makeRingOutRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(false), makeRingOutRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), GetRingOutStatusResponse.class);
    }

    /**
     * Returns the status of a 2-leg RingOut call.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/ring-out/{ringoutId}
     * Rate Limit Group: Light
     * App Permission: RingOut
     */
    public GetRingOutStatusResponse get() throws com.ringcentral.RestException, java.io.IOException {
        if (ringoutId == null) {
            throw new IllegalArgumentException("Parameter ringoutId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), GetRingOutStatusResponse.class);
    }

    /**
     * Cancels a 2-leg RingOut call.
     * HTTP Method: delete
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/ring-out/{ringoutId}
     * Rate Limit Group: Heavy
     * App Permission: RingOut
     */
    public String delete() throws com.ringcentral.RestException, java.io.IOException {
        if (ringoutId == null) {
            throw new IllegalArgumentException("Parameter ringoutId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.delete(this.path(), null);
        return rb.string();
    }
}
