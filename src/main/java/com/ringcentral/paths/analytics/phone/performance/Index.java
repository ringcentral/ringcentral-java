package com.ringcentral.paths.analytics.phone.performance;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.analytics.phone.Index parent;

    public Index(com.ringcentral.paths.analytics.phone.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/performance";
    }


    public com.ringcentral.paths.analytics.phone.performance.v1.Index v1() {
        return new com.ringcentral.paths.analytics.phone.performance.v1.Index(this);
    }

}
