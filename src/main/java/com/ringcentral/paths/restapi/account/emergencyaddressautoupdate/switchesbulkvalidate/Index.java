package com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.switchesbulkvalidate;

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
        return parent.path() + "/switches-bulk-validate";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Validates switches before creation or update. The maximum number
     * of switches per request is 10 000.
     * <p>
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/emergency-address-auto-update/switches-bulk-validate
     * Rate Limit Group: Heavy
     * App Permission: EditAccounts
     * User Permission: ConfigureEmergencyMaps
     */
    public ValidateMultipleSwitchesResponse post(ValidateMultipleSwitchesRequest validateMultipleSwitchesRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), validateMultipleSwitchesRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), ValidateMultipleSwitchesResponse.class);
    }
}
