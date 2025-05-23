package com.ringcentral.paths.restapi.v2.accounts.sms.optouts.export;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.v2.accounts.sms.optouts.Index parent;

    public Index(com.ringcentral.paths.restapi.v2.accounts.sms.optouts.Index parent) {
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
     * Returns a list of numbers that are opted out and/or opted in at the account level in CSV format.
     * Header row will define the following columns.
     * <p>
     * | Column name | Data type | Description |
     * | ----------- | --------- | ----------- |
     * | From        | string    | Sender phone number in E.164 or the wildcard |
     * | To          | string    | Recipient phone number in E.164 |
     * | Status      | string    | Either &quot;OptOut&quot; or &quot;OptIn&quot; |
     * | Source      | string    | Source of the opt record   |
     * <p>
     * HTTP Method: get
     * Endpoint: /restapi/v2/accounts/{accountId}/sms/opt-outs/export
     * Rate Limit Group: Light
     * App Permission: SMS
     */
    public String get() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return rb.string();
    }
}
