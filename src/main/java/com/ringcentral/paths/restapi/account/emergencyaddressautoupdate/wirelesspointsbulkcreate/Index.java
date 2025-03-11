package com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.wirelesspointsbulkcreate;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.Index parent;

    public Index(com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/wireless-points-bulk-create";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Creates multiple wireless points in a corporate map. The maximum
     * number of wireless points per request is 10 000; limitation for account is
     * 70 000.
     * <p>
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/emergency-address-auto-update/wireless-points-bulk-create
     * Rate Limit Group: Heavy
     * App Permission: EditAccounts
     * User Permission: ConfigureEmergencyMaps
     */
    public CreateMultipleWirelessPointsResponse post(CreateMultipleWirelessPointsRequest createMultipleWirelessPointsRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), createMultipleWirelessPointsRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), CreateMultipleWirelessPointsResponse.class);
    }
}
