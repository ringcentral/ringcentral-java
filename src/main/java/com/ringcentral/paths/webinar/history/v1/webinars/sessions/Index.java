package com.ringcentral.paths.webinar.history.v1.webinars.sessions;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.SessionResource;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.webinar.history.v1.webinars.Index parent;
    public String sessionId;

    public Index(com.ringcentral.paths.webinar.history.v1.webinars.Index parent, String sessionId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.sessionId = sessionId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && sessionId != null) {
            return parent.path() + "/sessions/" + sessionId;
        }
        return parent.path() + "/sessions";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns a historical webinar Session by ID. Access allowed to participants with original role as CoHost.
     * HTTP Method: get
     * Endpoint: /webinar/history/v1/webinars/{webinarId}/sessions/{sessionId}
     * Rate Limit Group: Heavy
     * App Permission: ReadWebinars
     */
    public SessionResource get() throws com.ringcentral.RestException, java.io.IOException {
        if (sessionId == null) {
            throw new IllegalArgumentException("Parameter sessionId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), SessionResource.class);
    }

    public com.ringcentral.paths.webinar.history.v1.webinars.sessions.invitees.Index invitees() {
        return this.invitees(null);
    }

    public com.ringcentral.paths.webinar.history.v1.webinars.sessions.invitees.Index invitees(String inviteeId) {
        return new com.ringcentral.paths.webinar.history.v1.webinars.sessions.invitees.Index(this, inviteeId);
    }


    public com.ringcentral.paths.webinar.history.v1.webinars.sessions.participants.Index participants() {
        return new com.ringcentral.paths.webinar.history.v1.webinars.sessions.participants.Index(this);
    }

}
