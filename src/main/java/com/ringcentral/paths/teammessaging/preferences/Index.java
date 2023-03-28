package com.ringcentral.paths.teammessaging.preferences;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.TMPreferencesInfo;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.teammessaging.Index parent;

    public Index(com.ringcentral.paths.teammessaging.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/preferences";
    }

    /**
     * Returns information about user preferences.
     * HTTP Method: get
     * Endpoint: /team-messaging/{version}/preferences
     * Rate Limit Group: Medium
     * App Permission: TeamMessaging
     */
    public TMPreferencesInfo get() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), TMPreferencesInfo.class);
    }
}
