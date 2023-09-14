package com.ringcentral.paths.webinar.history.v1.webinars.sessions.participants.self;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.webinar.history.v1.webinars.sessions.participants.Index parent;

    public Index(com.ringcentral.paths.webinar.history.v1.webinars.sessions.participants.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/self";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Returns the participant information specific to a webinar session. Accessible by any authenticated participant.
     * For a non-authenticated participant, API returns error.
     * <p>
     * HTTP Method: get
     * Endpoint: /webinar/history/v1/webinars/{webinarId}/sessions/{sessionId}/participants/self
     * Rate Limit Group: Heavy
     * App Permission: ReadWebinars
     */
    public ParticipantReducedModel get() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), ParticipantReducedModel.class);
    }
}
