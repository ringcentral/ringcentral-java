package com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.users;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.AutomaticLocationUpdatesUserList;
import com.ringcentral.definitions.ListAutomaticLocationUpdatesUsersParameters;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.Index parent;

    public Index(com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/users";
    }

    /**
     * Returns the list of users with their status of Automatic Location Updates feature.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/emergency-address-auto-update/users
     * Rate Limit Group: Medium
     * App Permission: EditAccounts
     * User Permission: ConfigureEmergencyMaps
     */
    public AutomaticLocationUpdatesUserList get(ListAutomaticLocationUpdatesUsersParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), AutomaticLocationUpdatesUserList.class);
    }

    public AutomaticLocationUpdatesUserList get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }

    public com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.users.bulkassign.Index bulkAssign() {
        return new com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.users.bulkassign.Index(this);
    }

}
