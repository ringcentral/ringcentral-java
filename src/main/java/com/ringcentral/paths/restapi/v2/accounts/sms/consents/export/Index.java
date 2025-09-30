package com.ringcentral.paths.restapi.v2.accounts.sms.consents.export;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.v2.accounts.sms.consents.Index parent;

    public Index(com.ringcentral.paths.restapi.v2.accounts.sms.consents.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/export";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Returns a list of account-level SMS consent records for opted-out and/or opted-in phone numbers in CSV format.
     * The following columns will be included in the resulted CSV file:
     * <p>
     * | Column name | Data type | Description |
     * | ----------- | --------- | ----------- |
     * | From        | string    | The sender&#039;s phone number in E.164 format |
     * | To          | string    | The recipient&#039;s phone number in E.164 format |
     * | Status      | string    | The consent status, either &quot;OptOut&quot; or &quot;OptIn&quot; |
     * | Source      | string    | The source of the consent record |
     * <p>
     * HTTP Method: get
     * Endpoint: /restapi/v2/accounts/{accountId}/sms/consents/export
     * Rate Limit Group: Light
     * App Permission: SMS
     */
    public String get() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return rb.string();
    }
}
