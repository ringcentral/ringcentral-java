package com.ringcentral.paths.restapi.account.extension.callerid;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.extension.Index parent;

    public Index(com.ringcentral.paths.restapi.account.extension.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/caller-id";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Returns information on an outbound caller ID of an extension.
     * <p>
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/caller-id
     * Rate Limit Group: Light
     * App Permission: ReadAccounts
     * User Permission: ReadCallerIDSettings
     */
    public ExtensionCallerIdInfo get() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), ExtensionCallerIdInfo.class);
    }

    /**
     * Updates outbound caller ID information of an extension.
     * <p>
     * HTTP Method: put
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/caller-id
     * Rate Limit Group: Medium
     * App Permission: EditExtensions
     * User Permission: EditCallerIDSettings
     */
    public ExtensionCallerIdInfo put(ExtensionCallerIdInfoRequest extensionCallerIdInfoRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.put(this.path(), extensionCallerIdInfoRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), ExtensionCallerIdInfo.class);
    }
}
