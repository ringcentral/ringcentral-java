package com.ringcentral.paths.teammessaging.v1.events;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.teammessaging.v1.Index parent;
    public String eventId;

    public Index(com.ringcentral.paths.teammessaging.v1.Index parent, String eventId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.eventId = eventId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && eventId != null) {
            return parent.path() + "/events/" + eventId;
        }
        return parent.path() + "/events";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns all calendar events created by the current user.
     * HTTP Method: get
     * Endpoint: /team-messaging/v1/events
     * Rate Limit Group: Medium
     * App Permission: TeamMessaging
     */
    public TMEventList list(ReadGlipEventsNewParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(false), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), TMEventList.class);
    }

    public TMEventList list() throws com.ringcentral.RestException, java.io.IOException {
        return this.list(null);
    }

    /**
     * Creates a new calendar event.
     * HTTP Method: post
     * Endpoint: /team-messaging/v1/events
     * Rate Limit Group: Medium
     * App Permission: TeamMessaging
     */
    public TMEventInfo post(TMCreateEventRequest tMCreateEventRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(false), tMCreateEventRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), TMEventInfo.class);
    }

    /**
     * Returns the specified calendar event(s) by ID(s).
     * HTTP Method: get
     * Endpoint: /team-messaging/v1/events/{eventId}
     * Rate Limit Group: Medium
     * App Permission: TeamMessaging
     */
    public TMEventInfo get() throws com.ringcentral.RestException, java.io.IOException {
        if (eventId == null) {
            throw new IllegalArgumentException("Parameter eventId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), TMEventInfo.class);
    }

    /**
     * Updates the specified calendar event.
     * HTTP Method: put
     * Endpoint: /team-messaging/v1/events/{eventId}
     * Rate Limit Group: Medium
     * App Permission: TeamMessaging
     */
    public TMEventInfo put(TMCreateEventRequest tMCreateEventRequest) throws com.ringcentral.RestException, java.io.IOException {
        if (eventId == null) {
            throw new IllegalArgumentException("Parameter eventId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.put(this.path(), tMCreateEventRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), TMEventInfo.class);
    }

    /**
     * Deletes the specified calendar event.
     * HTTP Method: delete
     * Endpoint: /team-messaging/v1/events/{eventId}
     * Rate Limit Group: Medium
     * App Permission: TeamMessaging
     */
    public String delete() throws com.ringcentral.RestException, java.io.IOException {
        if (eventId == null) {
            throw new IllegalArgumentException("Parameter eventId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.delete(this.path(), null);
        return rb.string();
    }
}
