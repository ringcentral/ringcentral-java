package com.ringcentral.paths.restapi.v2.accounts.batchprovisioning;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.v2.accounts.Index parent;

    public Index(com.ringcentral.paths.restapi.v2.accounts.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/batch-provisioning";
    }

    public String path(Boolean withParameter) {
        return path();
    }


    public com.ringcentral.paths.restapi.v2.accounts.batchprovisioning.users.Index users() {
        return new com.ringcentral.paths.restapi.v2.accounts.batchprovisioning.users.Index(this);
    }

}
