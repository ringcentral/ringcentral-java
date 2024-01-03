package com.ringcentral.paths.restapi.v2.accounts.extensions.devices;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.v2.accounts.extensions.Index parent;
    public String deviceId;

    public Index(com.ringcentral.paths.restapi.v2.accounts.extensions.Index parent, String deviceId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.deviceId = deviceId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && deviceId != null) {
            return parent.path() + "/devices/" + deviceId;
        }
        return parent.path() + "/devices";
    }

    public String path() {
        return path(true);
    }


    public com.ringcentral.paths.restapi.v2.accounts.extensions.devices.replace.Index replace() {
        return new com.ringcentral.paths.restapi.v2.accounts.extensions.devices.replace.Index(this);
    }

}
