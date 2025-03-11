package com.ringcentral.paths.restapi.v2.accounts.costcenters;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.v2.accounts.Index parent;

    public Index(com.ringcentral.paths.restapi.v2.accounts.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/cost-centers";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Returns the list of cost centers of the account specified in path.
     * HTTP Method: get
     * Endpoint: /restapi/v2/accounts/{accountId}/cost-centers
     * Rate Limit Group: Light
     * App Permission: ReadAccounts
     * User Permission: CostCenterManagement
     */
    public CostCenterList get() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), CostCenterList.class);
    }
}
