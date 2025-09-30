package com.ringcentral.paths.restapi.v2.accounts.sms.consents;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.v2.accounts.sms.Index parent;

    public Index(com.ringcentral.paths.restapi.v2.accounts.sms.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/consents";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Returns a list of account-level SMS consent records for opted-out and/or opted-in phone numbers.
     * <p>
     * HTTP Method: get
     * Endpoint: /restapi/v2/accounts/{accountId}/sms/consents
     * Rate Limit Group: Light
     * App Permission: SMS
     */
    public OptRecordList get(ListSmsConsentRecordsParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), OptRecordList.class);
    }

    public OptRecordList get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }

    /**
     * Deletes SMS consent records.
     * <p>
     * HTTP Method: delete
     * Endpoint: /restapi/v2/accounts/{accountId}/sms/consents
     * Rate Limit Group: Light
     * App Permission: SMS
     */
    public OptRecordsModificationSummary delete(DeleteOptRecordList deleteOptRecordList) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.delete(this.path(), deleteOptRecordList, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), OptRecordsModificationSummary.class);
    }

    /**
     * Adds or updates SMS consent records.
     * <p>
     * HTTP Method: patch
     * Endpoint: /restapi/v2/accounts/{accountId}/sms/consents
     * Rate Limit Group: Light
     * App Permission: SMS
     */
    public OptRecordsModificationSummary patch(UpdateOptRecordList updateOptRecordList) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.patch(this.path(), updateOptRecordList, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), OptRecordsModificationSummary.class);
    }

    public com.ringcentral.paths.restapi.v2.accounts.sms.consents.export.Index export() {
        return new com.ringcentral.paths.restapi.v2.accounts.sms.consents.export.Index(this);
    }

}
