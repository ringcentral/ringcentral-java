package com.ringcentral.paths.webinar.history.v1.webinars.sessions.participants;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.ParticipantListResource;
import com.ringcentral.definitions.RcwHistoryListParticipantsParameters;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.webinar.history.v1.webinars.sessions.Index parent;

    public Index(com.ringcentral.paths.webinar.history.v1.webinars.sessions.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/participants";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Returns the list of participants of a given Webinar Session (host interface).
     * <p>
     * HTTP Method: get
     * Endpoint: /webinar/history/v1/webinars/{webinarId}/sessions/{sessionId}/participants
     * Rate Limit Group: Heavy
     * App Permission: ReadWebinars
     */
    public ParticipantListResource get(RcwHistoryListParticipantsParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), ParticipantListResource.class);
    }

    public ParticipantListResource get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }

    public com.ringcentral.paths.webinar.history.v1.webinars.sessions.participants.self.Index self() {
        return new com.ringcentral.paths.webinar.history.v1.webinars.sessions.participants.self.Index(this);
    }

}
