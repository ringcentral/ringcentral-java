package com.ringcentral.paths.restapi.numberparser;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.Index parent;

    public Index(com.ringcentral.paths.restapi.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/number-parser";
    }

    public String path(Boolean withParameter) {
        return path();
    }


    public com.ringcentral.paths.restapi.numberparser.parse.Index parse() {
        return new com.ringcentral.paths.restapi.numberparser.parse.Index(this);
    }

}
