package com.ringcentral.paths.restapi.v2.accounts.sms.consents;

import com.ringcentral.*;
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
     * Adds or updates SMS consent records.
     *
     * <p>HTTP Method: patch Endpoint: /restapi/v2/accounts/{accountId}/sms/consents Rate Limit
     * Group: Light App Permission: SMS
     */
    public OptRecordsModificationSummary patch(UpdateOptRecordList updateOptRecordList)
            throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.patch(this.path(), updateOptRecordList, null);
        return com.ringcentral.Utils.gson.fromJson(
                rb.string(), OptRecordsModificationSummary.class);
    }

    public com.ringcentral.paths.restapi.v2.accounts.sms.consents.export.Index export() {
        return new com.ringcentral.paths.restapi.v2.accounts.sms.consents.export.Index(this);
    }

    public com.ringcentral.paths.restapi.v2.accounts.sms.consents.search.Index search() {
        return new com.ringcentral.paths.restapi.v2.accounts.sms.consents.search.Index(this);
    }

    public com.ringcentral.paths.restapi.v2.accounts.sms.consents.history.Index history() {
        return new com.ringcentral.paths.restapi.v2.accounts.sms.consents.history.Index(this);
    }
}
