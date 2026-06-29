package com.ringcentral.paths.restapi.account.extension.smsrecipients;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.extension.Index parent;

    public Index(com.ringcentral.paths.restapi.account.extension.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/sms-recipients";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Returns a list of Extension&#039;s SMS recipients.
     *
     * <p>HTTP Method: get Endpoint:
     * /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/sms-recipients Rate Limit
     * Group: Light App Permission: ReadAccounts
     */
    public SmsRecipientsResource get() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), SmsRecipientsResource.class);
    }

    public com.ringcentral.paths.restapi.account.extension.smsrecipients.bulkassign.Index
            bulkAssign() {
        return new com.ringcentral.paths.restapi.account.extension.smsrecipients.bulkassign.Index(
                this);
    }
}
