package com.ringcentral.paths.rcvideo.v2.account.extension.bridges;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.rcvideo.v2.account.extension.Index parent;

    public Index(com.ringcentral.paths.rcvideo.v2.account.extension.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/bridges";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Creates a new bridge for the user specified by `accountId` and `extensionId` identifiers. The request body
     * should contain JSON object which describes properties of the new bridge.
     * The bridge can be created by the owner, a delegate or any user who has the **Super Admin** privilege.
     * <p>
     * HTTP Method: post
     * Endpoint: /rcvideo/v2/account/{accountId}/extension/{extensionId}/bridges
     * Rate Limit Group: Heavy
     * App Permission: Video
     */
    public BridgeResponse post(CreateBridgeRequest createBridgeRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), createBridgeRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), BridgeResponse.class);
    }

    public com.ringcentral.paths.rcvideo.v2.account.extension.bridges.default1.Index default1() {
        return new com.ringcentral.paths.rcvideo.v2.account.extension.bridges.default1.Index(this);
    }

}
