package com.ringcentral.paths.restapi.account.analytics.performance.calls;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.analytics.performance.Index parent;

    public Index(com.ringcentral.paths.restapi.account.analytics.performance.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/calls";
    }


    public com.ringcentral.paths.restapi.account.analytics.performance.calls.aggregate.Index aggregate() {
        return new com.ringcentral.paths.restapi.account.analytics.performance.calls.aggregate.Index(this);
    }

}
