package com.ringcentral.paths.restapi.account.directory.devices;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.directory.Index parent;

    public Index(com.ringcentral.paths.restapi.account.directory.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/devices";
    }


    public com.ringcentral.paths.restapi.account.directory.devices.search.Index search() {
        return new com.ringcentral.paths.restapi.account.directory.devices.search.Index(this);
    }

}
