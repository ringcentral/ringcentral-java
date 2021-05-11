package com.ringcentral.paths.restapi.account.a2psms.messages;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.ListA2PSMSParameters;
import com.ringcentral.definitions.MessageDetailsResponse;
import com.ringcentral.definitions.MessageListResponse;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.a2psms.Index parent;
    public String messageId;

    public Index(com.ringcentral.paths.restapi.account.a2psms.Index parent, String messageId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.messageId = messageId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && messageId != null) {
            return parent.path() + "/messages/" + messageId;
        }
        return parent.path() + "/messages";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns the list of outbound/inbound A2P messages sent from/to A2P phone numbers of the current account. The list can be filtered by message batch ID and/or phone number.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/a2p-sms/messages
     * Rate Limit Group: Light
     * App Permission: A2PSMS
     */
    public MessageListResponse list(ListA2PSMSParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(false), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), MessageListResponse.class);
    }

    public MessageListResponse list() throws com.ringcentral.RestException, java.io.IOException {
        return this.list(null);
    }

    /**
     * Returns the details of an A2P SMS message by ID.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/a2p-sms/messages/{messageId}
     * Rate Limit Group: Light
     * App Permission: A2PSMS
     */
    public MessageDetailsResponse get() throws com.ringcentral.RestException, java.io.IOException {
        if (messageId == null) {
            throw new IllegalArgumentException("Parameter messageId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), MessageDetailsResponse.class);
    }
}
