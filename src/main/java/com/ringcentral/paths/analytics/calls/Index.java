package com.ringcentral.paths.analytics.calls;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.analytics.Index parent;

    public Index(com.ringcentral.paths.analytics.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path(false) + "/calls";
    }

    public String path(Boolean withParameter) {
        return path();
    }


    public com.ringcentral.paths.analytics.calls.v1.Index v1() {
        return new com.ringcentral.paths.analytics.calls.v1.Index(this);
    }

}
