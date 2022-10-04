package com.ringcentral.paths.analytics.calls;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.analytics.Index parent;

    public Index(com.ringcentral.paths.analytics.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/calls";
    }


    public com.ringcentral.paths.analytics.calls.v1.Index v1() {
        return new com.ringcentral.paths.analytics.calls.v1.Index(this);
    }

}
