package com.ringcentral.paths.restapi.account.a2psms.batch;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.CreateMessageBatchResponse;
import com.ringcentral.definitions.CreateSMSMessageBatchRequest;
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
            return parent.path() + "/batch/" + batchId;
        }
        return parent.path() + "/batch";
    }

    public String path() {
        return path(true);
    }

    /**
     * Allows to send high volume of A2P (Application-to-Person) SMS messages (in message batches). Only phone number with the `A2PSmsSender` feature can be used as a sender.
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/a2p-sms/batch
     * Rate Limit Group: Light
     * App Permission: A2PSMS
     */
    public CreateMessageBatchResponse post(CreateSMSMessageBatchRequest createSMSMessageBatchRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(false), createSMSMessageBatchRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), CreateMessageBatchResponse.class);
    }

    /**
     * Returns information on a message batch.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/a2p-sms/batch/{batchId}
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
