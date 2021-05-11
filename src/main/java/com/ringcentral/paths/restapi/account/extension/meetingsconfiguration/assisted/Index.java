package com.ringcentral.paths.restapi.account.extension.meetingsconfiguration.assisted;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.AssistedUsersResource;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.extension.meetingsconfiguration.Index parent;

    public Index(com.ringcentral.paths.restapi.account.extension.meetingsconfiguration.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/assisted";
    }

    /**
     * Returns assisted users information.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/meetings-configuration/assisted
     * Rate Limit Group: Light
     * App Permission: Meetings
     * User Permission: Meetings
     */
    public AssistedUsersResource get() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), AssistedUsersResource.class);
    }
}
