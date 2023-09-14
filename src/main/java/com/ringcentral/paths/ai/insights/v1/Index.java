package com.ringcentral.paths.ai.insights.v1;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.ai.insights.Index parent;

    public Index(com.ringcentral.paths.ai.insights.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path(false) + "/v1";
    }

    public String path(Boolean withParameter) {
        return path();
    }


    public com.ringcentral.paths.ai.insights.v1.async.Index async() {
        return new com.ringcentral.paths.ai.insights.v1.async.Index(this);
    }

}
