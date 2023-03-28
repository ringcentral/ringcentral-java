package com.ringcentral.paths.restapi.account.messagestorereport;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.CreateMessageStoreReportRequest;
import com.ringcentral.definitions.MessageStoreReport;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.Index parent;
    public String taskId;

    public Index(com.ringcentral.paths.restapi.account.Index parent, String taskId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.taskId = taskId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && taskId != null) {
            return parent.path() + "/message-store-report/" + taskId;
        }
        return parent.path() + "/message-store-report";
    }

    public String path() {
        return path(true);
    }

    /**
     * Creates a task to collect all account messages within the specified
     * time interval. Maximum number of simultaneous tasks per account is 2.
     * <p>
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/message-store-report
     * Rate Limit Group: Heavy
     * App Permission: ReadMessages
     * User Permission: Users
     */
    public MessageStoreReport post(CreateMessageStoreReportRequest createMessageStoreReportRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(false), createMessageStoreReportRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), MessageStoreReport.class);
    }

    /**
     * Returns the current status of a task on report creation.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/message-store-report/{taskId}
     * Rate Limit Group: Heavy
     * App Permission: ReadMessages
     * User Permission: Users
     */
    public MessageStoreReport get() throws com.ringcentral.RestException, java.io.IOException {
        if (taskId == null) {
            throw new IllegalArgumentException("Parameter taskId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), MessageStoreReport.class);
    }

    public com.ringcentral.paths.restapi.account.messagestorereport.archive.Index archive() {
        return this.archive(null);
    }

    public com.ringcentral.paths.restapi.account.messagestorereport.archive.Index archive(String archiveId) {
        return new com.ringcentral.paths.restapi.account.messagestorereport.archive.Index(this, archiveId);
    }

}
