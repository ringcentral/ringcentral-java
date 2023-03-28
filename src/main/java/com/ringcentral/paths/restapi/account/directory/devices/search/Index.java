package com.ringcentral.paths.restapi.account.directory.devices.search;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.DevicesPaginationResource;
import com.ringcentral.definitions.DevicesSearch;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.directory.devices.Index parent;

    public Index(com.ringcentral.paths.restapi.account.directory.devices.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/search";
    }

    /**
     * Returns a list of devices by requested search.
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/directory/devices/search
     * Rate Limit Group: Heavy
     * App Permission: ReadAccounts
     * User Permission: ReadExtensions
     */
    public DevicesPaginationResource post(DevicesSearch devicesSearch) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), devicesSearch, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), DevicesPaginationResource.class);
    }
}
