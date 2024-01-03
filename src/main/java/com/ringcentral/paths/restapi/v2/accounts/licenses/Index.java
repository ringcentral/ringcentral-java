package com.ringcentral.paths.restapi.v2.accounts.licenses;

import com.ringcentral.RestClient;

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


    public com.ringcentral.paths.restapi.v2.accounts.licenses.bulkassign.Index bulkAssign() {
        return new com.ringcentral.paths.restapi.v2.accounts.licenses.bulkassign.Index(this);
    }

}
