package com.ringcentral.paths.restapi.account.audittrail.search;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.AccountHistorySearchPublicRequest;
import com.ringcentral.definitions.AccountHistorySearchPublicResponse;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.audittrail.Index parent;

    public Index(com.ringcentral.paths.restapi.account.audittrail.Index parent) {
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
     * Returns the audit trail data with specific filters applied.
     * Audit trail searching is limited to the last 10,000 records or last 180 days, whichever comes first.
     * <p>
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/audit-trail/search
     * Rate Limit Group: Heavy
     * App Permission: ReadAuditTrail
     */
    public AccountHistorySearchPublicResponse post(AccountHistorySearchPublicRequest accountHistorySearchPublicRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), accountHistorySearchPublicRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), AccountHistorySearchPublicResponse.class);
    }
}
