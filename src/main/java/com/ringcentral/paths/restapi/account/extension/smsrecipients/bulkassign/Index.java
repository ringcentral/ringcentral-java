package com.ringcentral.paths.restapi.account.extension.smsrecipients.bulkassign;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.extension.smsrecipients.Index parent;

    public Index(com.ringcentral.paths.restapi.account.extension.smsrecipients.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/bulk-assign";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Updates the list of SMS recipients for a given extension.
     *
     * <p>HTTP Method: post Endpoint:
     * /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/sms-recipients/bulk-assign
     * Rate Limit Group: Medium App Permission: EditExtensions
     */
    public String post(BulkAssignSmsRecipientsRequest bulkAssignSmsRecipientsRequest)
            throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), bulkAssignSmsRecipientsRequest, null);
        return rb.string();
    }
}
