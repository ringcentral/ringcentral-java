package com.ringcentral.paths.webinar.history.v1.webinars.sessions.invitees;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.InviteeListResource;
import com.ringcentral.definitions.InviteeModel;
import com.ringcentral.definitions.RcwHistoryListInviteesParameters;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.webinar.history.v1.webinars.sessions.Index parent;
    public String inviteeId;

    public Index(com.ringcentral.paths.webinar.history.v1.webinars.sessions.Index parent, String inviteeId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.inviteeId = inviteeId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && inviteeId != null) {
            return parent.path() + "/invitees/" + inviteeId;
        }
        return parent.path() + "/invitees";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns the list of Invitees (co-hosts and panelists) of a given Webinar Session (host interface).
     * An implicit record created for a Webinar &#039;Host&#039; is always returned.
     * <p>
     * HTTP Method: get
     * Endpoint: /webinar/history/v1/webinars/{webinarId}/sessions/{sessionId}/invitees
     * Rate Limit Group: Heavy
     * App Permission: ReadWebinars
     */
    public InviteeListResource list(RcwHistoryListInviteesParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(false), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), InviteeListResource.class);
    }

    public InviteeListResource list() throws com.ringcentral.RestException, java.io.IOException {
        return this.list(null);
    }

    /**
     * Returns a historical session invitee information by ID (host interface).
     * HTTP Method: get
     * Endpoint: /webinar/history/v1/webinars/{webinarId}/sessions/{sessionId}/invitees/{inviteeId}
     * Rate Limit Group: Heavy
     * App Permission: ReadWebinars
     */
    public InviteeModel get() throws com.ringcentral.RestException, java.io.IOException {
        if (inviteeId == null) {
            throw new IllegalArgumentException("Parameter inviteeId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), InviteeModel.class);
    }
}
