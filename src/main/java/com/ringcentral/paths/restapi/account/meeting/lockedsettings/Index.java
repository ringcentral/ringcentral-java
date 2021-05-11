package com.ringcentral.paths.restapi.account.meeting.lockedsettings;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.AccountLockedSettingResponse;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.meeting.Index parent;

    public Index(com.ringcentral.paths.restapi.account.meeting.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/locked-settings";
    }

    /**
     * Returns information on user meeting settings that are locked on account level and therefore cannot be changed by user.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/meeting/locked-settings
     * Rate Limit Group: Light
     * App Permission: Meetings
     * User Permission: Meetings
     */
    public AccountLockedSettingResponse get() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), AccountLockedSettingResponse.class);
    }
}
