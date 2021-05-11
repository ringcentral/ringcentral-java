package com.ringcentral.paths.restapi.glip.events;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.GlipEventCreate;
import com.ringcentral.definitions.GlipEventInfo;
import com.ringcentral.definitions.GlipEventsInfo;
import com.ringcentral.definitions.ReadGlipEventsParameters;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.glip.Index parent;
    public String eventId;

    public Index(com.ringcentral.paths.restapi.glip.Index parent, String eventId) {
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
     * Endpoint: /restapi/{apiVersion}/glip/events
     * Rate Limit Group: Medium
     * App Permission: Glip
     * User Permission: Glip
     */
    public GlipEventsInfo list(ReadGlipEventsParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(false), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), GlipEventsInfo.class);
    }

    public GlipEventsInfo list() throws com.ringcentral.RestException, java.io.IOException {
        return this.list(null);
    }

    /**
     * Creates a new calendar event.
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/glip/events
     * Rate Limit Group: Medium
     * App Permission: Glip
     * User Permission: Glip
     */
    public GlipEventInfo post(GlipEventCreate glipEventCreate) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(false), glipEventCreate, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), GlipEventInfo.class);
    }

    /**
     * Returns the specified calendar event(s) by ID(s).
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/glip/events/{eventId}
     * Rate Limit Group: Medium
     * App Permission: Glip
     * User Permission: Glip
     */
    public GlipEventInfo get() throws com.ringcentral.RestException, java.io.IOException {
        if (eventId == null) {
            throw new IllegalArgumentException("Parameter eventId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), GlipEventInfo.class);
    }

    /**
     * Updates the specified calendar event.
     * HTTP Method: put
     * Endpoint: /restapi/{apiVersion}/glip/events/{eventId}
     * Rate Limit Group: Medium
     * App Permission: Glip
     * User Permission: Glip
     */
    public GlipEventInfo put(GlipEventCreate glipEventCreate) throws com.ringcentral.RestException, java.io.IOException {
        if (eventId == null) {
            throw new IllegalArgumentException("Parameter eventId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.put(this.path(), glipEventCreate, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), GlipEventInfo.class);
    }

    /**
     * Deletes the specified calendar event.
     * HTTP Method: delete
     * Endpoint: /restapi/{apiVersion}/glip/events/{eventId}
     * Rate Limit Group: Medium
     * App Permission: Glip
     * User Permission: Glip
     */
    public String delete() throws com.ringcentral.RestException, java.io.IOException {
        if (eventId == null) {
            throw new IllegalArgumentException("Parameter eventId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.delete(this.path(), null);
        return rb.string();
    }
}
