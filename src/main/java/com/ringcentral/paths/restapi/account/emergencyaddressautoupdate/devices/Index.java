package com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.devices;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.ListDevicesAutomaticLocationUpdates;
import com.ringcentral.definitions.ListDevicesAutomaticLocationUpdatesParameters;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.Index parent;

    public Index(com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/devices";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Returns a list of common devices with their status of Automatic
     * Location Updates feature.
     * <p>
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/emergency-address-auto-update/devices
     * Rate Limit Group: Medium
     * App Permission: EditAccounts
     * User Permission: ConfigureEmergencyMaps
     */
    public ListDevicesAutomaticLocationUpdates get(ListDevicesAutomaticLocationUpdatesParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), ListDevicesAutomaticLocationUpdates.class);
    }

    public ListDevicesAutomaticLocationUpdates get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }

    public com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.devices.bulkassign.Index bulkAssign() {
        return new com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.devices.bulkassign.Index(this);
    }

}
