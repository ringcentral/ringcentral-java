package com.ringcentral.paths.restapi.account.audittrail;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.Index parent;

    public Index(com.ringcentral.paths.restapi.account.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/audit-trail";
    }

    public String path(Boolean withParameter) {
        return path();
    }


    public com.ringcentral.paths.restapi.account.audittrail.search.Index search() {
        return new com.ringcentral.paths.restapi.account.audittrail.search.Index(this);
    }

}
