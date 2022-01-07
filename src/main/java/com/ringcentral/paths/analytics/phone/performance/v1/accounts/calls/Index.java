package com.ringcentral.paths.analytics.phone.performance.v1.accounts.calls;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.analytics.phone.performance.v1.accounts.Index parent;

    public Index(com.ringcentral.paths.analytics.phone.performance.v1.accounts.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/calls";
    }


    public com.ringcentral.paths.analytics.phone.performance.v1.accounts.calls.timeline.Index timeline() {
        return new com.ringcentral.paths.analytics.phone.performance.v1.accounts.calls.timeline.Index(this);
    }


    public com.ringcentral.paths.analytics.phone.performance.v1.accounts.calls.aggregate.Index aggregate() {
        return new com.ringcentral.paths.analytics.phone.performance.v1.accounts.calls.aggregate.Index(this);
    }

}
