package com.ringcentral.paths.restapi.account.extension.unifiedpresence;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.UnifiedPresence;
import com.ringcentral.definitions.UpdateUnifiedPresence;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.extension.Index parent;

    public Index(com.ringcentral.paths.restapi.account.extension.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/unified-presence";
    }

    /**
     * Returns the unified presence status of the requested user(s). The set of parameters returned by this method differs whether you return the requester&#039;s presence or any other user presence.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/unified-presence
     * Rate Limit Group: Medium
     * App Permission: ReadPresence
     * User Permission: ReadPresenceStatus
     */
    public UnifiedPresence get() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), UnifiedPresence.class);
    }

    /**
     * Updates the unified presence for the current user specified in path.
     * HTTP Method: patch
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/unified-presence
     * Rate Limit Group: Medium
     * App Permission: EditPresence
     * User Permission: EditPresenceStatus
     */
    public UnifiedPresence patch(UpdateUnifiedPresence updateUnifiedPresence) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.patch(this.path(), updateUnifiedPresence, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), UnifiedPresence.class);
    }
}
