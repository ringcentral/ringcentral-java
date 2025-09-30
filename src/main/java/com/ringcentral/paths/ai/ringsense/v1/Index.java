package com.ringcentral.paths.ai.ringsense.v1;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.ai.ringsense.Index parent;

    public Index(com.ringcentral.paths.ai.ringsense.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path(false) + "/v1";
    }

    public String path(Boolean withParameter) {
        return path();
    }


    public com.ringcentral.paths.ai.ringsense.v1.public1.Index public1() {
        return new com.ringcentral.paths.ai.ringsense.v1.public1.Index(this);
    }

}
