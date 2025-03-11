package com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.devices.bulkassign;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.devices.Index parent;

    public Index(com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.devices.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/bulk-assign";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Enables or disables Automatic Location Updates feature for the
     * specified common phones.
     * <p>
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/emergency-address-auto-update/devices/bulk-assign
     * Rate Limit Group: Heavy
     * App Permission: EditAccounts
     * User Permission: ConfigureEmergencyMaps
     */
    public String post(AssignMultipleDevicesAutomaticLocationUpdates assignMultipleDevicesAutomaticLocationUpdates) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), assignMultipleDevicesAutomaticLocationUpdates, null);
        return rb.string();
    }
}
