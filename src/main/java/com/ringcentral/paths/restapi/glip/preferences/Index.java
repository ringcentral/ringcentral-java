package com.ringcentral.paths.restapi.glip.preferences;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.GlipPreferencesInfo;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.glip.Index parent;

    public Index(com.ringcentral.paths.restapi.glip.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/preferences";
    }

    /**
     * Returns information about user preferences.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/glip/preferences
     * Rate Limit Group: Medium
     * App Permission: TeamMessaging
     * User Permission: UnifiedAppDesktop
     */
    public GlipPreferencesInfo get() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), GlipPreferencesInfo.class);
    }
}
