package com.ringcentral.paths.ai.status;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.ai.Index parent;

    public Index(com.ringcentral.paths.ai.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path(false) + "/status";
    }

    public String path(Boolean withParameter) {
        return path();
    }


    public com.ringcentral.paths.ai.status.v1.Index v1() {
        return new com.ringcentral.paths.ai.status.v1.Index(this);
    }

}
