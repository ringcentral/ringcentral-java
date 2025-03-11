package com.ringcentral.paths.restapi.v2.accounts.batchprovisioning.users;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.v2.accounts.batchprovisioning.Index parent;

    public Index(com.ringcentral.paths.restapi.v2.accounts.batchprovisioning.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/users";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Creates multiple user extensions with BYOD (customer provided) devices.
     * If &quot;extensionNumber&quot; is not specified, the next available extension number will be assigned.
     * <p>
     * HTTP Method: post
     * Endpoint: /restapi/v2/accounts/{accountId}/batch-provisioning/users
     * Rate Limit Group: Heavy
     * App Permission: EditAccounts
     */
    public BatchProvisionUsersResponse post(BatchProvisionUsersRequest batchProvisionUsersRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), batchProvisionUsersRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), BatchProvisionUsersResponse.class);
    }
}
