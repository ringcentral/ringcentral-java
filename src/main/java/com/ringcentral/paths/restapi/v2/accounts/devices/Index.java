package com.ringcentral.paths.restapi.v2.accounts.devices;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.v2.accounts.Index parent;

    public Index(com.ringcentral.paths.restapi.v2.accounts.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/devices";
    }

    public String path(Boolean withParameter) {
        return path();
    }


    public com.ringcentral.paths.restapi.v2.accounts.devices.bulkadd.Index bulkAdd() {
        return new com.ringcentral.paths.restapi.v2.accounts.devices.bulkadd.Index(this);
    }

}
