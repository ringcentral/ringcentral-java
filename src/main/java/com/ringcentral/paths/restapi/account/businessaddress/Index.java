package com.ringcentral.paths.restapi.account.businessaddress;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.AccountBusinessAddressResource;
import com.ringcentral.definitions.ModifyAccountBusinessAddressRequest;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.Index parent;

    public Index(com.ringcentral.paths.restapi.account.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/business-address";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Returns business address of a company.
     * <p>
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/business-address
     * Rate Limit Group: Light
     * App Permission: ReadAccounts
     * User Permission: ReadCompanyInfo
     */
    public AccountBusinessAddressResource get() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), AccountBusinessAddressResource.class);
    }

    /**
     * Updates the business address of a company that account is linked
     * to. Batch request is supported.
     * <p>
     * HTTP Method: put
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/business-address
     * Rate Limit Group: Medium
     * App Permission: EditAccounts
     * User Permission: EditCompanyInfo
     */
    public AccountBusinessAddressResource put(ModifyAccountBusinessAddressRequest modifyAccountBusinessAddressRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.put(this.path(), modifyAccountBusinessAddressRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), AccountBusinessAddressResource.class);
    }
}
