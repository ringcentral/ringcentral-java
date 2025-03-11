package com.ringcentral.paths.restapi.account.calllog;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.Index parent;
    public String callRecordId;

    public Index(com.ringcentral.paths.restapi.account.Index parent, String callRecordId) {
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
     * Returns call log records filtered by parameters specified.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/call-log
     * Rate Limit Group: Heavy
     * App Permission: ReadCallLog
     * User Permission: FullCompanyCallLog
     */
    public CallLogResponse list(ReadCompanyCallLogParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(false), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), CallLogResponse.class);
    }

    public CallLogResponse list() throws com.ringcentral.RestException, java.io.IOException {
        return this.list(null);
    }

    /**
     * Returns individual call log record(s) by ID.
     * [Batch syntax](https://developers.ringcentral.com/guide/basics/batch-requests) is supported.
     * <p>
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/call-log/{callRecordId}
     * Rate Limit Group: Heavy
     * App Permission: ReadCallLog
     * User Permission: FullCompanyCallLog
     */
    public CallLogRecord get(ReadCompanyCallRecordParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
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
