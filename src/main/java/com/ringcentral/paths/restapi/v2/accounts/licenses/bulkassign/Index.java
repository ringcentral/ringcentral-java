package com.ringcentral.paths.restapi.v2.accounts.licenses.bulkassign;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.BulkManageLicensesRequest;
import com.ringcentral.definitions.BulkManageLicensesResponse;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.v2.accounts.licenses.Index parent;

    public Index(com.ringcentral.paths.restapi.v2.accounts.licenses.Index parent) {
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
     * Assigns/unassigns multiple account licenses in bulk
     * HTTP Method: post
     * Endpoint: /restapi/v2/accounts/{accountId}/licenses/bulk-assign
     * Rate Limit Group: Heavy
     * App Permission: EditAccounts
     */
    public BulkManageLicensesResponse post(BulkManageLicensesRequest bulkManageLicensesRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), bulkManageLicensesRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), BulkManageLicensesResponse.class);
    }
}
