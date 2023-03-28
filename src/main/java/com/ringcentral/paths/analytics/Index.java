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


    public com.ringcentral.paths.analytics.calls.Index calls() {
        return this.calls("v1");
    }

    public com.ringcentral.paths.analytics.calls.Index calls(String version) {
        return new com.ringcentral.paths.analytics.calls.Index(this, version);
    }

}
