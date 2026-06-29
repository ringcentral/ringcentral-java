package com.ringcentral.paths.restapi.v2.accounts.sms.consents.search;

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
        return parent.path() + "/search";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Returns the list of account-level SMS consent records according to the search criteria.
     *
     * <p>HTTP Method: post Endpoint: /restapi/v2/accounts/{accountId}/sms/consents/search Rate
     * Limit Group: Light App Permission: SMS
     */
    public OptRecordList post(SearchSmsConsentRecordsRequest searchSmsConsentRecordsRequest)
            throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), searchSmsConsentRecordsRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), OptRecordList.class);
    }
}
