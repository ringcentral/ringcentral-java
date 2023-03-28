package com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.wirelesspointsbulkupdate;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.UpdateMultipleWirelessPointsRequest;
import com.ringcentral.definitions.UpdateMultipleWirelessPointsResponse;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.Index parent;

    public Index(com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/wireless-points-bulk-update";
    }

    /**
     * Updates wireless points in corporate map. The maximum number of
     * wireless points per request is 10 000; limitation for account is 70 000.
     * <p>
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/emergency-address-auto-update/wireless-points-bulk-update
     * Rate Limit Group: Heavy
     * App Permission: EditAccounts
     * User Permission: ConfigureEmergencyMaps
     */
    public UpdateMultipleWirelessPointsResponse post(UpdateMultipleWirelessPointsRequest updateMultipleWirelessPointsRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), updateMultipleWirelessPointsRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), UpdateMultipleWirelessPointsResponse.class);
    }
}
