package com.ringcentral.paths.webinar.registration.v1.sessions;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.RegSessionModel;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.webinar.registration.v1.Index parent;
    public String sessionId;

    public Index(com.ringcentral.paths.webinar.registration.v1.Index parent, String sessionId) {
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
     * Returns a registration Session information by ID.
     * <p>
     * A caller must be an authorized user: either a host of the webinar or an IT Admin:
     * a user from host&#039;s account with &quot;WebinarSettings&quot; permission.
     * <p>
     * HTTP Method: get
     * Endpoint: /webinar/registration/v1/sessions/{sessionId}
     * Rate Limit Group: Heavy
     * App Permission: ReadWebinars
     */
    public RegSessionModel get() throws com.ringcentral.RestException, java.io.IOException {
        if (sessionId == null) {
            throw new IllegalArgumentException("Parameter sessionId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), RegSessionModel.class);
    }

    /**
     * Updates a Session by ID.
     * <p>
     * This is a PARTIAL update (PATCH), client may call it providing only attributes which are to be changed.
     * <p>
     * A caller must be an authorized user: either a host of the webinar or an IT Admin:
     * a user from host&#039;s account with &quot;WebinarSettings&quot; permission.
     * <p>
     * If a session record with given ID doesn&#039;t exist on Registration Service side the API should return HTTP 404.
     * <p>
     * HTTP Method: patch
     * Endpoint: /webinar/registration/v1/sessions/{sessionId}
     * Rate Limit Group: Heavy
     * App Permission: EditWebinars
     */
    public RegSessionModel patch(RegSessionModel regSessionModel) throws com.ringcentral.RestException, java.io.IOException {
        if (sessionId == null) {
            throw new IllegalArgumentException("Parameter sessionId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.patch(this.path(), regSessionModel, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), RegSessionModel.class);
    }

    public com.ringcentral.paths.webinar.registration.v1.sessions.registrants.Index registrants() {
        return this.registrants(null);
    }

    public com.ringcentral.paths.webinar.registration.v1.sessions.registrants.Index registrants(String registrantId) {
        return new com.ringcentral.paths.webinar.registration.v1.sessions.registrants.Index(this, registrantId);
    }

}
