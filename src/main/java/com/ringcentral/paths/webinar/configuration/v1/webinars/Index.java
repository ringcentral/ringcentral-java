package com.ringcentral.paths.webinar.configuration.v1.webinars;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.webinar.configuration.v1.Index parent;
    public String webinarId;

    public Index(com.ringcentral.paths.webinar.configuration.v1.Index parent, String webinarId) {
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
     * Returns the list of Webinars hosted by a current authorized user sorted by &#039;scheduledStartTime&#039; or &#039;creationTime&#039; in the ascending order.
     * <p>
     * HTTP Method: get
     * Endpoint: /webinar/configuration/v1/webinars
     * Rate Limit Group: Heavy
     * App Permission: ReadWebinars
     */
    public WebinarListResource list(RcwConfigListWebinarsParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(false), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), WebinarListResource.class);
    }

    public WebinarListResource list() throws com.ringcentral.RestException, java.io.IOException {
        return this.list(null);
    }

    /**
     * Creates a new webinar.
     * <p>
     * If &quot;host&quot; parameter is NOT passed then the current authorized user will become a Host.
     * If &quot;host&quot; parameter is passed then the caller must be a company administrator and have &quot;WebinarSettings&quot; permission.
     * &quot;host.linkedUser.accountId&quot; must be the same as authorized user&#039;s account ID.
     * <p>
     * The webinar settings which are not mandated at account level or are unlocked can be
     * specified. All other settings are defaulted according to account policy.
     * <p>
     * HTTP Method: post
     * Endpoint: /webinar/configuration/v1/webinars
     * Rate Limit Group: Heavy
     * App Permission: EditWebinars
     */
    public WcsWebinarResource post(WebinarCreationRequest webinarCreationRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(false), webinarCreationRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), WcsWebinarResource.class);
    }

    /**
     * Returns a Webinar information by ID.
     * Some webinar settings are returned basing on webinar-level overrides, other - from default settings defined at account level.
     * <p>
     * HTTP Method: get
     * Endpoint: /webinar/configuration/v1/webinars/{webinarId}
     * Rate Limit Group: Heavy
     * App Permission: ReadWebinars
     */
    public WcsWebinarResource get() throws com.ringcentral.RestException, java.io.IOException {
        if (webinarId == null) {
            throw new IllegalArgumentException("Parameter webinarId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), WcsWebinarResource.class);
    }

    /**
     * Deletes a Webinar by ID. All child objects (Sessions, Participants) will be also deleted.
     * It is disallowed to delete a Webinar which has at least one Session in &#039;Active&#039; or &#039;Finished&#039; state.
     * <p>
     * HTTP Method: delete
     * Endpoint: /webinar/configuration/v1/webinars/{webinarId}
     * Rate Limit Group: Heavy
     * App Permission: EditWebinars
     */
    public String delete() throws com.ringcentral.RestException, java.io.IOException {
        if (webinarId == null) {
            throw new IllegalArgumentException("Parameter webinarId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.delete(this.path(), null);
        return rb.string();
    }

    /**
     * Updates a Webinar. The payload may contain just changed fields of a Webinar resource (it is a partial update):
     * - host cannot be changed and host user information cannot be updated;
     * - only the settings which are not mandated at account level or are unlocked can be
     * changed;
     * - in order to reset a webinar password it should be passed as an empty string;
     * - &quot;registrationStatus&quot; cannot be changed.
     * <p>
     * HTTP Method: patch
     * Endpoint: /webinar/configuration/v1/webinars/{webinarId}
     * Rate Limit Group: Heavy
     * App Permission: EditWebinars
     */
    public WcsWebinarResource patch(WebinarBaseModel webinarBaseModel) throws com.ringcentral.RestException, java.io.IOException {
        if (webinarId == null) {
            throw new IllegalArgumentException("Parameter webinarId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.patch(this.path(), webinarBaseModel, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), WcsWebinarResource.class);
    }

    public com.ringcentral.paths.webinar.configuration.v1.webinars.sessions.Index sessions() {
        return this.sessions(null);
    }

    public com.ringcentral.paths.webinar.configuration.v1.webinars.sessions.Index sessions(String sessionId) {
        return new com.ringcentral.paths.webinar.configuration.v1.webinars.sessions.Index(this, sessionId);
    }

}
