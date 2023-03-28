package com.ringcentral.paths.restapi.account.calllog;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.AccountCallLogResponse;
import com.ringcentral.definitions.CompanyCallLogRecord;
import com.ringcentral.definitions.ReadCompanyCallLogParameters;
import com.ringcentral.definitions.ReadCompanyCallRecordParameters;

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
    public AccountCallLogResponse list(ReadCompanyCallLogParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(false), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), AccountCallLogResponse.class);
    }

    public AccountCallLogResponse list() throws com.ringcentral.RestException, java.io.IOException {
        return this.list(null);
    }

    /**
     * Returns individual call log record(s) by ID. Batch syntax is supported.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/call-log/{callRecordId}
     * Rate Limit Group: Heavy
     * App Permission: ReadCallLog
     * User Permission: FullCompanyCallLog
     */
    public CompanyCallLogRecord get(ReadCompanyCallRecordParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        if (callRecordId == null) {
            throw new IllegalArgumentException("Parameter callRecordId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), CompanyCallLogRecord.class);
    }

    public CompanyCallLogRecord get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }
}
