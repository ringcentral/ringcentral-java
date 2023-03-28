package com.ringcentral.paths.restapi.account.directory.devicetypes;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.DeviceTypesResource;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.directory.Index parent;

    public Index(com.ringcentral.paths.restapi.account.directory.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/device-types";
    }

    /**
     * Returns all the (distinct) type IDs of devices for particular account
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/directory/device-types
     * Rate Limit Group: Heavy
     * App Permission: ReadAccounts
     * User Permission: ReadExtensions
     */
    public DeviceTypesResource get() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), DeviceTypesResource.class);
    }
}
