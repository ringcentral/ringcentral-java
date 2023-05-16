package com.ringcentral.paths.restapi.v2.accounts.licenses;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.LicensesStatisticsResponse;
import com.ringcentral.definitions.ListLicensesV2Parameters;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.v2.accounts.Index parent;

    public Index(com.ringcentral.paths.restapi.v2.accounts.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/licenses";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Returns the information about account licenses.
     * License blocks are grouped by &quot;skuId&quot;, &quot;assigned&quot; flag and &quot;costCenterId&quot;.
     * Only recurring licenses are returned.
     * <p>
     * HTTP Method: get
     * Endpoint: /restapi/v2/accounts/{accountId}/licenses
     * Rate Limit Group: Light
     * App Permission: ReadAccounts
     * User Permission: LicensesAndInventory
     */
    public LicensesStatisticsResponse get(ListLicensesV2Parameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), LicensesStatisticsResponse.class);
    }

    public LicensesStatisticsResponse get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }

    public com.ringcentral.paths.restapi.v2.accounts.licenses.bulkassign.Index bulkAssign() {
        return new com.ringcentral.paths.restapi.v2.accounts.licenses.bulkassign.Index(this);
    }

}
