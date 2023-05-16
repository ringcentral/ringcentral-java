package com.ringcentral.paths.analytics;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;

    public Index(RestClient rc) {
        this.rc = rc;
    }

    public String path() {
        return "" + "/analytics";
    }

    public String path(Boolean withParameter) {
        return path();
    }


    public com.ringcentral.paths.analytics.calls.Index calls() {
        return new com.ringcentral.paths.analytics.calls.Index(this);
    }

}
