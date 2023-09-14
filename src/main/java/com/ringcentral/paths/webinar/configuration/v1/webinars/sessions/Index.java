package com.ringcentral.paths.webinar.configuration.v1.webinars.sessions;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.webinar.configuration.v1.webinars.Index parent;
    public String sessionId;

    public Index(com.ringcentral.paths.webinar.configuration.v1.webinars.Index parent, String sessionId) {
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
     * Creates a new Session for a given Webinar
     * HTTP Method: post
     * Endpoint: /webinar/configuration/v1/webinars/{webinarId}/sessions
     * Rate Limit Group: Heavy
     * App Permission: EditWebinars
     */
    public WcsSessionResource post(WcsSessionWithLocaleCodeModel wcsSessionWithLocaleCodeModel) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(false), wcsSessionWithLocaleCodeModel, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), WcsSessionResource.class);
    }

    /**
     * Returns a Webinar Session by ID.
     * HTTP Method: get
     * Endpoint: /webinar/configuration/v1/webinars/{webinarId}/sessions/{sessionId}
     * Rate Limit Group: Heavy
     * App Permission: ReadWebinars
     */
    public WcsSessionResource get() throws com.ringcentral.RestException, java.io.IOException {
        if (sessionId == null) {
            throw new IllegalArgumentException("Parameter sessionId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), WcsSessionResource.class);
    }

    /**
     * Deletes a Webinar Session. All child objects (Invitees) will be also deleted.
     * It is disallowed to delete a Session which is in &#039;Active&#039; or &#039;Finished&#039; state
     * <p>
     * HTTP Method: delete
     * Endpoint: /webinar/configuration/v1/webinars/{webinarId}/sessions/{sessionId}
     * Rate Limit Group: Heavy
     * App Permission: EditWebinars
     */
    public String delete() throws com.ringcentral.RestException, java.io.IOException {
        if (sessionId == null) {
            throw new IllegalArgumentException("Parameter sessionId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.delete(this.path(), null);
        return rb.string();
    }

    /**
     * Updates a Webinar Session. The payload may contain certain attributes from the Session resource
     * (it is a partial update). Changing the &#039;status&#039; field usually invokes certain workflow actions.
     * Updating a Session in &#039;Active&#039; or &#039;Finished&#039; status is prohibited.
     * Some status transitions (for example, to &#039;Active&quot; or &#039;Finished&#039;) may be prohibited.
     * <p>
     * HTTP Method: patch
     * Endpoint: /webinar/configuration/v1/webinars/{webinarId}/sessions/{sessionId}
     * Rate Limit Group: Heavy
     * App Permission: EditWebinars
     */
    public WcsSessionResource patch(WcsSessionWithLocaleCodeModel wcsSessionWithLocaleCodeModel) throws com.ringcentral.RestException, java.io.IOException {
        if (sessionId == null) {
            throw new IllegalArgumentException("Parameter sessionId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.patch(this.path(), wcsSessionWithLocaleCodeModel, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), WcsSessionResource.class);
    }

    public com.ringcentral.paths.webinar.configuration.v1.webinars.sessions.invitees.Index invitees() {
        return this.invitees(null);
    }

    public com.ringcentral.paths.webinar.configuration.v1.webinars.sessions.invitees.Index invitees(String inviteeId) {
        return new com.ringcentral.paths.webinar.configuration.v1.webinars.sessions.invitees.Index(this, inviteeId);
    }

}
