package com.ringcentral.paths.restapi.v2.accounts.sms.consents.history;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.v2.accounts.sms.consents.Index parent;

    public Index(com.ringcentral.paths.restapi.v2.accounts.sms.consents.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/history";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Returns the history of SMS consent records for opted-out and/or opted-in phone numbers.
     *
     * <p>HTTP Method: get Endpoint: /restapi/v2/accounts/{accountId}/sms/consents/history Rate
     * Limit Group: Light App Permission: SMS
     */
    public ConsentHistoryRecordList get(ListSmsConsentHistoryRecordsParameters queryParams)
            throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), ConsentHistoryRecordList.class);
    }

    public ConsentHistoryRecordList get()
            throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }
}
