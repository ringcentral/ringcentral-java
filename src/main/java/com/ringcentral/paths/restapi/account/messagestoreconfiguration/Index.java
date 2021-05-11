package com.ringcentral.paths.restapi.account.messagestoreconfiguration;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.MessageStoreConfiguration;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.Index parent;

    public Index(com.ringcentral.paths.restapi.account.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/message-store-configuration";
    }

    /**
     * Returns message store settings.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/message-store-configuration
     * Rate Limit Group: Light
     * App Permission: EditAccounts
     * User Permission: AccountAdministration
     */
    public MessageStoreConfiguration get() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), MessageStoreConfiguration.class);
    }

    /**
     * Updates message store settings.
     * HTTP Method: put
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/message-store-configuration
     * Rate Limit Group: Light
     * App Permission: EditAccounts
     * User Permission: AccountAdministration
     */
    public MessageStoreConfiguration put(MessageStoreConfiguration messageStoreConfiguration) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.put(this.path(), messageStoreConfiguration, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), MessageStoreConfiguration.class);
    }
}
