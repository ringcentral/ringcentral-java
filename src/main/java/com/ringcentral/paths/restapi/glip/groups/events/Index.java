package com.ringcentral.paths.restapi.glip.groups.events;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.GlipEventCreate;
import com.ringcentral.definitions.GlipEventInfo;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.glip.groups.Index parent;

    public Index(com.ringcentral.paths.restapi.glip.groups.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/events";
    }

    /**
     * Returns a list of calendar events available for the current user within the specified group. Users can only see their personal tasks and public tasks.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/glip/groups/{groupId}/events
     * Rate Limit Group: Medium
     * App Permission: TeamMessaging
     * User Permission: UnifiedAppDesktop
     */
    public GlipEventInfo get() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), GlipEventInfo.class);
    }

    /**
     * Creates a new calendar event within the specified group.
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/glip/groups/{groupId}/events
     * Rate Limit Group: Medium
     * App Permission: TeamMessaging
     * User Permission: UnifiedAppDesktop
     */
    public GlipEventInfo post(GlipEventCreate glipEventCreate) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), glipEventCreate, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), GlipEventInfo.class);
    }
}
