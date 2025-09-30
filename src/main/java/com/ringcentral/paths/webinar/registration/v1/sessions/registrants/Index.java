package com.ringcentral.paths.webinar.registration.v1.sessions.registrants;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.webinar.registration.v1.sessions.Index parent;
    public String registrantId;

    public Index(com.ringcentral.paths.webinar.registration.v1.sessions.Index parent, String registrantId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.registrantId = registrantId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && registrantId != null) {
            return parent.path() + "/registrants/" + registrantId;
        }
        return parent.path() + "/registrants";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns the list of Registrants ordered by &quot;id&quot; ascending.
     * <p>
     * A caller must be an authorized user: either a host of the webinar or an IT Admin:
     * a user from host&#039;s account with &quot;WebinarSettings&quot; permission.
     * <p>
     * HTTP Method: get
     * Endpoint: /webinar/registration/v1/sessions/{sessionId}/registrants
     * Rate Limit Group: Heavy
     * App Permission: ReadWebinars
     */
    public RegistrantListResource list(RcwRegListRegistrantsParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(false), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), RegistrantListResource.class);
    }

    public RegistrantListResource list() throws com.ringcentral.RestException, java.io.IOException {
        return this.list(null);
    }

    /**
     * Creates a new Registrant for a given session.
     * <p>
     * Registration MUST be open for the session for this call to succeed (otherwise it should return HTTP 403).
     * <p>
     * A caller must be an authorized user: either a host of the webinar or an IT Admin:
     * a user from host&#039;s account with &quot;WebinarSettings&quot; permission.
     * <p>
     * HTTP Method: post
     * Endpoint: /webinar/registration/v1/sessions/{sessionId}/registrants
     * Rate Limit Group: Heavy
     * App Permission: EditWebinars
     */
    public RegistrantModelResponsePostWithQuestionnaire post(RegistrantBaseModelWithQuestionnaire registrantBaseModelWithQuestionnaire) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(false), registrantBaseModelWithQuestionnaire, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), RegistrantModelResponsePostWithQuestionnaire.class);
    }

    /**
     * Returns a Registrant by ID.
     * <p>
     * A caller must be an authorized user: either a host of the webinar or an IT Admin:
     * a user from host&#039;s account with &quot;WebinarSettings&quot; permission.
     * <p>
     * HTTP Method: get
     * Endpoint: /webinar/registration/v1/sessions/{sessionId}/registrants/{registrantId}
     * Rate Limit Group: Heavy
     * App Permission: ReadWebinars
     */
    public RegistrantModelWithQuestionnaire get(RcwRegGetRegistrantParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        if (registrantId == null) {
            throw new IllegalArgumentException("Parameter registrantId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), RegistrantModelWithQuestionnaire.class);
    }

    public RegistrantModelWithQuestionnaire get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }

    /**
     * Deletes a Registrant by ID.
     * <p>
     * Session must not be in finished state (otherwise it should return HTTP 403).
     * <p>
     * A caller must be an authorized user: either a host of the webinar or an IT Admin:
     * a user from host&#039;s account with &quot;WebinarSettings&quot; permission.
     * <p>
     * HTTP Method: delete
     * Endpoint: /webinar/registration/v1/sessions/{sessionId}/registrants/{registrantId}
     * Rate Limit Group: Heavy
     * App Permission: EditWebinars
     */
    public String delete() throws com.ringcentral.RestException, java.io.IOException {
        if (registrantId == null) {
            throw new IllegalArgumentException("Parameter registrantId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.delete(this.path(), null);
        return rb.string();
    }
}
