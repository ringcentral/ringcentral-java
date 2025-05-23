package com.ringcentral.paths.restapi.v2.accounts.extensions.commhandling.voice.forwardingtargets;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.v2.accounts.extensions.commhandling.voice.Index parent;

    public Index(com.ringcentral.paths.restapi.v2.accounts.extensions.commhandling.voice.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/forwarding-targets";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Returns the extension&#039;s forwarding targets.
     * HTTP Method: get
     * Endpoint: /restapi/v2/accounts/{accountId}/extensions/{extensionId}/comm-handling/voice/forwarding-targets
     * Rate Limit Group: Medium
     * App Permission: ReadAccounts
     */
    public CommForwardingTargetsResource get(ReadForwardingTargetsParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), CommForwardingTargetsResource.class);
    }

    public CommForwardingTargetsResource get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }

    /**
     * Removes the specified forwarding targets from the extension&#039;s communication handling rules.
     * HTTP Method: delete
     * Endpoint: /restapi/v2/accounts/{accountId}/extensions/{extensionId}/comm-handling/voice/forwarding-targets
     * Rate Limit Group: Medium
     * App Permission: EditExtensions
     */
    public CommRemoveForwardingTargetsResponse delete(CommRemoveForwardingTargetsRequest commRemoveForwardingTargetsRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.delete(this.path(), commRemoveForwardingTargetsRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), CommRemoveForwardingTargetsResponse.class);
    }

    public com.ringcentral.paths.restapi.v2.accounts.extensions.commhandling.voice.forwardingtargets.devices.Index devices() {
        return this.devices(null);
    }

    public com.ringcentral.paths.restapi.v2.accounts.extensions.commhandling.voice.forwardingtargets.devices.Index devices(String deviceId) {
        return new com.ringcentral.paths.restapi.v2.accounts.extensions.commhandling.voice.forwardingtargets.devices.Index(this, deviceId);
    }

}
