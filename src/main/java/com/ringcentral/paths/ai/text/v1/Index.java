package com.ringcentral.paths.ai.text.v1;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.ai.text.Index parent;

    public Index(com.ringcentral.paths.ai.text.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path(false) + "/v1";
    }

    public String path(Boolean withParameter) {
        return path();
    }


    public com.ringcentral.paths.ai.text.v1.async.Index async() {
        return new com.ringcentral.paths.ai.text.v1.async.Index(this);
    }

}
