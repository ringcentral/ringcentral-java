package com.ringcentral.paths.restapi.account.analytics;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.Index parent;

    public Index(com.ringcentral.paths.restapi.account.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/analytics";
    }


    public com.ringcentral.paths.restapi.account.analytics.performance.Index performance() {
        return new com.ringcentral.paths.restapi.account.analytics.performance.Index(this);
    }

}
