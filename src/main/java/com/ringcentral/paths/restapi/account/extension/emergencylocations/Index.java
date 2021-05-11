package com.ringcentral.paths.restapi.account.extension.emergencylocations;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.UserEmergencyLocationList;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.extension.Index parent;

    public Index(com.ringcentral.paths.restapi.account.extension.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/emergency-locations";
    }

    /**
     * Returns a list of emergency response locations available for the current user extension.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/emergency-locations
     * Rate Limit Group: Light
     * App Permission: ReadAccounts
     */
    public UserEmergencyLocationList get() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), UserEmergencyLocationList.class);
    }
}
