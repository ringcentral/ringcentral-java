package com.ringcentral.paths.restapi.v2.accounts.extensions.commhandling;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.v2.accounts.extensions.Index parent;

    public Index(com.ringcentral.paths.restapi.v2.accounts.extensions.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/comm-handling";
    }

    public String path(Boolean withParameter) {
        return path();
    }


    public com.ringcentral.paths.restapi.v2.accounts.extensions.commhandling.voice.Index voice() {
        return new com.ringcentral.paths.restapi.v2.accounts.extensions.commhandling.voice.Index(this);
    }


    public com.ringcentral.paths.restapi.v2.accounts.extensions.commhandling.states.Index states() {
        return this.states(null);
    }

    public com.ringcentral.paths.restapi.v2.accounts.extensions.commhandling.states.Index states(String stateId) {
        return new com.ringcentral.paths.restapi.v2.accounts.extensions.commhandling.states.Index(this, stateId);
    }

}
