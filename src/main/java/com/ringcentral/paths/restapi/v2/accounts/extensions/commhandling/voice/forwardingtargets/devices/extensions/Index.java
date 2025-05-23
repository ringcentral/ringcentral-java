package com.ringcentral.paths.restapi.v2.accounts.extensions.commhandling.voice.forwardingtargets.devices.extensions;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.v2.accounts.extensions.commhandling.voice.forwardingtargets.devices.Index parent;

    public Index(com.ringcentral.paths.restapi.v2.accounts.extensions.commhandling.voice.forwardingtargets.devices.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/extensions";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Returns a list of extensions which use the specified device as a forwarding target.
     * HTTP Method: get
     * Endpoint: /restapi/v2/accounts/{accountId}/extensions/{extensionId}/comm-handling/voice/forwarding-targets/devices/{deviceId}/extensions
     * Rate Limit Group: Medium
     * App Permission: ReadAccounts
     */
    public CommExtensionListResource get() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), CommExtensionListResource.class);
    }
}
