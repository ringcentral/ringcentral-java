package com.ringcentral.paths.restapi.account.extension.callqueuepresence;

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
        return parent.path() + "/call-queue-presence";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Returns a list of agent&#039;s call queues with the agent presence status (per queue).
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/call-queue-presence
     * Rate Limit Group: Light
     * App Permission: ReadPresence
     */
    public ExtensionCallQueuePresenceList get(ReadExtensionCallQueuePresenceParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), ExtensionCallQueuePresenceList.class);
    }

    public ExtensionCallQueuePresenceList get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }

    /**
     * Updates availability of the agent for the call queues.
     * HTTP Method: put
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/call-queue-presence
     * Rate Limit Group: Medium
     * App Permission: EditPresence
     */
    public ExtensionCallQueuePresenceList put(ExtensionCallQueueUpdatePresenceList extensionCallQueueUpdatePresenceList) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.put(this.path(), extensionCallQueueUpdatePresenceList, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), ExtensionCallQueuePresenceList.class);
    }
}
