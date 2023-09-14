package com.ringcentral.paths.analytics.calls.v1.accounts.aggregation;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.analytics.calls.v1.accounts.Index parent;

    public Index(com.ringcentral.paths.analytics.calls.v1.accounts.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/aggregation";
    }

    public String path(Boolean withParameter) {
        return path();
    }


    public com.ringcentral.paths.analytics.calls.v1.accounts.aggregation.fetch.Index fetch() {
        return new com.ringcentral.paths.analytics.calls.v1.accounts.aggregation.fetch.Index(this);
    }

}
