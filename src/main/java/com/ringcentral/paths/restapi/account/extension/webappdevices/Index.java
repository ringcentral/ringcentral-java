package com.ringcentral.paths.restapi.account.extension.webappdevices;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.extension.Index parent;

    public Index(com.ringcentral.paths.restapi.account.extension.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/webapp-devices";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Returns the list of Web Phone (RC App) devices of the specified user extension, and their
     * current registration status (`Online`/`Offline`).
     *
     * <p>HTTP Method: get Endpoint:
     * /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/webapp-devices Rate Limit
     * Group: Medium App Permission: ReadAccounts
     */
    public WebAppDevicesResponse get() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), WebAppDevicesResponse.class);
    }
}
