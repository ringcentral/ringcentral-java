package com.ringcentral.paths.rcvideo.v2.bridges;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.BridgeResponse;
import com.ringcentral.definitions.GetBridgeParameters;
import com.ringcentral.definitions.UpdateBridgeRequest;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.rcvideo.v2.Index parent;
    public String bridgeId;

    public Index(com.ringcentral.paths.rcvideo.v2.Index parent, String bridgeId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.bridgeId = bridgeId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && bridgeId != null) {
            return parent.path() + "/bridges/" + bridgeId;
        }
        return parent.path() + "/bridges";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns a bridge by `bridgeId` identifier.
     * HTTP Method: get
     * Endpoint: /rcvideo/v2/bridges/{bridgeId}
     * Rate Limit Group: Medium
     * App Permission: Video
     */
    public BridgeResponse get(GetBridgeParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        if (bridgeId == null) {
            throw new IllegalArgumentException("Parameter bridgeId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), BridgeResponse.class);
    }

    public BridgeResponse get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }

    /**
     * Deletes a bridge by `bridgeId` identifier.
     * Deletion can only be done by the bridge owner, an owner&#039;s delegate or any user who has the **Super Admin** privilege.
     * <p>
     * HTTP Method: delete
     * Endpoint: /rcvideo/v2/bridges/{bridgeId}
     * Rate Limit Group: Medium
     * App Permission: Video
     */
    public String delete() throws com.ringcentral.RestException, java.io.IOException {
        if (bridgeId == null) {
            throw new IllegalArgumentException("Parameter bridgeId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.delete(this.path(), null);
        return rb.string();
    }

    /**
     * Updates a bridge by `bridgeId` identifier. The request body should contain JSON object with updating properties.
     * Update can only be done by the bridge owner, an owner&#039;s delegate or any user who has the **Super Admin** privilege.
     * <p>
     * HTTP Method: patch
     * Endpoint: /rcvideo/v2/bridges/{bridgeId}
     * Rate Limit Group: Medium
     * App Permission: Video
     */
    public BridgeResponse patch(UpdateBridgeRequest updateBridgeRequest) throws com.ringcentral.RestException, java.io.IOException {
        if (bridgeId == null) {
            throw new IllegalArgumentException("Parameter bridgeId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.patch(this.path(), updateBridgeRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), BridgeResponse.class);
    }

    public com.ringcentral.paths.rcvideo.v2.bridges.pin.Index pin() {
        return new com.ringcentral.paths.rcvideo.v2.bridges.pin.Index(this);
    }

}
