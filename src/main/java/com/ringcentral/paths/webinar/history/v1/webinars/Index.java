package com.ringcentral.paths.webinar.history.v1.webinars;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.WebinarResource;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.webinar.history.v1.Index parent;
    public String webinarId;

    public Index(com.ringcentral.paths.webinar.history.v1.Index parent, String webinarId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.webinarId = webinarId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && webinarId != null) {
            return parent.path() + "/webinars/" + webinarId;
        }
        return parent.path() + "/webinars";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns a historical webinar information by ID (host interface)
     * HTTP Method: get
     * Endpoint: /webinar/history/v1/webinars/{webinarId}
     * Rate Limit Group: Heavy
     * App Permission: ReadWebinars
     */
    public WebinarResource get() throws com.ringcentral.RestException, java.io.IOException {
        if (webinarId == null) {
            throw new IllegalArgumentException("Parameter webinarId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), WebinarResource.class);
    }

    public com.ringcentral.paths.webinar.history.v1.webinars.sessions.Index sessions() {
        return this.sessions(null);
    }

    public com.ringcentral.paths.webinar.history.v1.webinars.sessions.Index sessions(String sessionId) {
        return new com.ringcentral.paths.webinar.history.v1.webinars.sessions.Index(this, sessionId);
    }

}
