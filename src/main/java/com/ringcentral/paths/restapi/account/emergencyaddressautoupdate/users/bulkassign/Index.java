package com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.users.bulkassign;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.BulkAssignAutomaticLocationUpdatesUsers;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.users.Index parent;

    public Index(com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.users.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/bulk-assign";
    }

    /**
     * Enables or disables Automatic Location Updates feature for multiple account users.
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/emergency-address-auto-update/users/bulk-assign
     * Rate Limit Group: Heavy
     * App Permission: EditAccounts
     * User Permission: ConfigureEmergencyMaps
     */
    public String post(BulkAssignAutomaticLocationUpdatesUsers bulkAssignAutomaticLocationUpdatesUsers) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), bulkAssignAutomaticLocationUpdatesUsers, null);
        return rb.string();
    }
}
