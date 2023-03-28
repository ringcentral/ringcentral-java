package com.ringcentral.paths.restapi.account.a2psms.batches;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.BatchListResponse;
import com.ringcentral.definitions.ListA2PBatchesParameters;
import com.ringcentral.definitions.MessageBatchCreateRequest;
import com.ringcentral.definitions.MessageBatchResponse;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.a2psms.Index parent;
    public String batchId;

    public Index(com.ringcentral.paths.restapi.account.a2psms.Index parent, String batchId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.batchId = batchId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && batchId != null) {
            return parent.path() + "/batches/" + batchId;
        }
        return parent.path() + "/batches";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns the list of A2P batches sent from the current account.
     * The list can be filtered by message batch ID and/or from phone number.
     * <p>
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/a2p-sms/batches
     * Rate Limit Group: Light
     * App Permission: A2PSMS
     */
    public BatchListResponse list(ListA2PBatchesParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(false), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), BatchListResponse.class);
    }

    public BatchListResponse list() throws com.ringcentral.RestException, java.io.IOException {
        return this.list(null);
    }

    /**
     * Allows to send high volume of A2P (Application-to-Person) SMS messages
     * (in message batches). Only phone number with the `A2PSmsSender` feature can
     * be used as a sender.
     * <p>
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/a2p-sms/batches
     * Rate Limit Group: Light
     * App Permission: A2PSMS
     */
    public MessageBatchResponse post(MessageBatchCreateRequest messageBatchCreateRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(false), messageBatchCreateRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), MessageBatchResponse.class);
    }

    /**
     * Returns information on a message batch.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/a2p-sms/batches/{batchId}
     * Rate Limit Group: Light
     * App Permission: A2PSMS
     */
    public MessageBatchResponse get() throws com.ringcentral.RestException, java.io.IOException {
        if (batchId == null) {
            throw new IllegalArgumentException("Parameter batchId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), MessageBatchResponse.class);
    }
}
