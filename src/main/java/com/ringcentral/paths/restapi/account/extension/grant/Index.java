package com.ringcentral.paths.restapi.account.extension.grant;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.GetExtensionGrantListResponse;
import com.ringcentral.definitions.ListExtensionGrantsParameters;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.extension.Index parent;

    public Index(com.ringcentral.paths.restapi.account.extension.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/grant";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Returns a list of extensions including information on grants given to the current extension towards them.
     * Currently the list of grants includes: picking up a call, call monitoring, calling or receiving a call on behalf
     * of somebody, call delegation and calling paging groups.
     * <p>
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/grant
     * Rate Limit Group: Light
     * App Permission: ReadAccounts
     * User Permission: ReadExtensions
     */
    public GetExtensionGrantListResponse get(ListExtensionGrantsParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), GetExtensionGrantListResponse.class);
    }

    public GetExtensionGrantListResponse get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }
}
