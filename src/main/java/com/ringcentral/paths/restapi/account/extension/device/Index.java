package com.ringcentral.paths.restapi.account.extension.device;

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
        return parent.path() + "/device";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Returns devices of an extension or multiple extensions by their ID(s). Batch request
     * is supported.
     * <p>
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/device
     * Rate Limit Group: Light
     * App Permission: ReadAccounts
     * User Permission: ReadUserDevices
     */
    public GetExtensionDevicesResponse get(ListExtensionDevicesParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), GetExtensionDevicesResponse.class);
    }

    public GetExtensionDevicesResponse get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }
}
