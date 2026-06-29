package com.ringcentral.paths.restapi.account.extension.calllog;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.extension.Index parent;
    public String callRecordId;

    public Index(
            com.ringcentral.paths.restapi.account.extension.Index parent, String callRecordId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.callRecordId = callRecordId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && callRecordId != null) {
            return parent.path() + "/call-log/" + callRecordId;
        }
        return parent.path() + "/call-log";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns call log records filtered by parameters specified. HTTP Method: get Endpoint:
     * /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/call-log Rate Limit Group:
     * Heavy App Permission: ReadCallLog User Permission: ReadCallLog
     */
    public CallLogResponse list(ReadUserCallLogParameters queryParams)
            throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(false), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), CallLogResponse.class);
    }

    public CallLogResponse list() throws com.ringcentral.RestException, java.io.IOException {
        return this.list(null);
    }

    /**
     * Deletes filtered call log records. HTTP Method: delete Endpoint:
     * /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/call-log Rate Limit Group:
     * Heavy App Permission: EditCallLog User Permission: EditCallLog
     */
    public String delete(DeleteUserCallLogParameters queryParams)
            throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.delete(this.path(false), queryParams);
        return rb.string();
    }

    public String delete() throws com.ringcentral.RestException, java.io.IOException {
        return this.delete(null);
    }

    /**
     * Returns the user&#039;s individual call log record(s) by ID(s). [Bulk
     * syntax](https://developers.ringcentral.com/guide/basics/batch-requests) is supported:
     * multiple IDs can be specified as a comma-separated list in `{callRecordId}` (up to 50 IDs). A
     * single ID returns HTTP 200 with `application/json`. Multiple IDs return HTTP 207 with
     * `multipart/mixed` (one status part, then one part per record).
     *
     * <p>HTTP Method: get Endpoint:
     * /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/call-log/{callRecordId}
     * Rate Limit Group: Heavy App Permission: ReadCallLog User Permission: ReadCallLog
     */
    public CallLogRecord get(ReadUserCallRecordParameters queryParams)
            throws com.ringcentral.RestException, java.io.IOException {
        if (callRecordId == null) {
            throw new IllegalArgumentException("Parameter callRecordId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), CallLogRecord.class);
    }

    public CallLogRecord get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }
}
