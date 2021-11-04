package com.ringcentral.paths.restapi.account.analytics.performance;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.analytics.Index parent;

    public Index(com.ringcentral.paths.restapi.account.analytics.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/performance";
    }


    public com.ringcentral.paths.restapi.account.analytics.performance.calls.Index calls() {
        return new com.ringcentral.paths.restapi.account.analytics.performance.calls.Index(this);
    }

}
