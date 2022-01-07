package com.ringcentral.paths.analytics.phone;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.analytics.Index parent;

    public Index(com.ringcentral.paths.analytics.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/phone";
    }


    public com.ringcentral.paths.analytics.phone.performance.Index performance() {
        return new com.ringcentral.paths.analytics.phone.performance.Index(this);
    }

}
