package com.ringcentral.paths.restapi.v2.numberparser;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.v2.Index parent;

    public Index(com.ringcentral.paths.restapi.v2.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path(false) + "/number-parser";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    public com.ringcentral.paths.restapi.v2.numberparser.parse.Index parse() {
        return new com.ringcentral.paths.restapi.v2.numberparser.parse.Index(this);
    }
}
