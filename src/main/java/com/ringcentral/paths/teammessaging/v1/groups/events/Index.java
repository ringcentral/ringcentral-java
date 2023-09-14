package com.ringcentral.paths.teammessaging.v1.groups.events;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.teammessaging.v1.groups.Index parent;

    public Index(com.ringcentral.paths.teammessaging.v1.groups.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/events";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Returns a list of calendar events available for the current user within the specified group. Users can only see their personal tasks and public tasks.
     * HTTP Method: get
     * Endpoint: /team-messaging/v1/groups/{groupId}/events
     * Rate Limit Group: Medium
     * App Permission: TeamMessaging
     */
    public TMEventInfo get() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), TMEventInfo.class);
    }

    /**
     * Creates a new calendar event within the specified group.
     * HTTP Method: post
     * Endpoint: /team-messaging/v1/groups/{groupId}/events
     * Rate Limit Group: Medium
     * App Permission: TeamMessaging
     */
    public TMEventInfo post(TMCreateEventRequest tMCreateEventRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), tMCreateEventRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), TMEventInfo.class);
    }
}
