package com.ringcentral.paths.restapi.account.extension.messagesync;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.GetMessageSyncResponse;
import com.ringcentral.definitions.SyncMessagesParameters;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.extension.Index parent;

    public Index(com.ringcentral.paths.restapi.account.extension.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/message-sync";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Synchronizes messages.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/message-sync
     * Rate Limit Group: Light
     * App Permission: ReadMessages
     * User Permission: ReadMessages
     */
    public GetMessageSyncResponse get(SyncMessagesParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), GetMessageSyncResponse.class);
    }

    public GetMessageSyncResponse get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }
}
