package com.ringcentral.paths.webinar.configuration.v1.webinars.sessions.invitees;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.webinar.configuration.v1.webinars.sessions.Index parent;
    public String inviteeId;

    public Index(com.ringcentral.paths.webinar.configuration.v1.webinars.sessions.Index parent, String inviteeId) {
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
     * Returns the list of Invitees (co-hosts and panelists in phase 1
     * and also invited attendees in subsequent phases) of a given Webinar Session.
     * An implicit record created for a Webinar &#039;Host&#039; is always returned.
     * <p>
     * HTTP Method: get
     * Endpoint: /webinar/configuration/v1/webinars/{webinarId}/sessions/{sessionId}/invitees
     * Rate Limit Group: Heavy
     * App Permission: ReadWebinars
     */
    public WcsInviteeListResource list(RcwConfigListInviteesParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(false), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), WcsInviteeListResource.class);
    }

    public WcsInviteeListResource list() throws com.ringcentral.RestException, java.io.IOException {
        return this.list(null);
    }

    /**
     * Adds, updates and deletes Webinar Session invitees in bulk (co-hosts and panelists in phase 1
     * and also invited attendees in subsequent phases).
     * The payload may contain multiple added, updated or deleted invitees.
     * For each added record &#039;role&#039; and either &#039;firstName&#039;/&#039;lastName&#039;/&#039;email&#039; (for non-authenticated users)
     * or &#039;linkedUser.*&#039; (for authenticated users) must be specified, but not both.
     * For updated invitees &#039;id&#039;  and &#039;role&#039; must be specified, &#039;linkedUser&#039; change is not supported.
     * For deleted invitees only there ids should be specified.
     * The response contains added/updated records (full) and deleted records (ids only).
     * <p>
     * Deleting an invitee for a Session in &#039;Active&#039; or &#039;Finished&#039; status is prohibited.
     * <p>
     * HTTP Method: patch
     * Endpoint: /webinar/configuration/v1/webinars/{webinarId}/sessions/{sessionId}/invitees
     * Rate Limit Group: Heavy
     * App Permission: EditWebinars
     */
    public BulkUpdateInviteesResponse patch(BulkUpdateInviteesRequest bulkUpdateInviteesRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.patch(this.path(false), bulkUpdateInviteesRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), BulkUpdateInviteesResponse.class);
    }

    /**
     * Returns a Session Invitee information by ID
     * HTTP Method: get
     * Endpoint: /webinar/configuration/v1/webinars/{webinarId}/sessions/{sessionId}/invitees/{inviteeId}
     * Rate Limit Group: Heavy
     * App Permission: ReadWebinars
     */
    public InviteeResource get() throws com.ringcentral.RestException, java.io.IOException {
        if (inviteeId == null) {
            throw new IllegalArgumentException("Parameter inviteeId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), InviteeResource.class);
    }

    /**
     * Updates a Session Invitee. &#039;role&#039; is required (it can be changed from &#039;Panelist&#039; to &#039;CoHost&#039; or vise versa).
     * It is disallowed to update &#039;linkedUser&#039;: it should be done by deleting then adding an invitee.
     * For non-authenticated users &#039;firstName&#039;/&#039;lastName&#039;/&#039;email&#039; can be specified, but not both.
     * Implicit record created for a Webinar &#039;Host&#039; cannot be modified.
     * Also it is disallowed to change any other role to &#039;Host&#039;.
     * <p>
     * HTTP Method: put
     * Endpoint: /webinar/configuration/v1/webinars/{webinarId}/sessions/{sessionId}/invitees/{inviteeId}
     * Rate Limit Group: Heavy
     * App Permission: EditWebinars
     */
    public InviteeResource put(UpdateInviteeRequest updateInviteeRequest) throws com.ringcentral.RestException, java.io.IOException {
        if (inviteeId == null) {
            throw new IllegalArgumentException("Parameter inviteeId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.put(this.path(), updateInviteeRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), InviteeResource.class);
    }

    /**
     * Deletes a Session Invitee. Implicit record created for a Webinar &#039;Host&#039; cannot be deleted.
     * Deleting an invitee for a Session in &#039;Active&#039; or &#039;Finished&#039; status is prohibited (HTTP 403).
     * <p>
     * HTTP Method: delete
     * Endpoint: /webinar/configuration/v1/webinars/{webinarId}/sessions/{sessionId}/invitees/{inviteeId}
     * Rate Limit Group: Heavy
     * App Permission: EditWebinars
     */
    public String delete() throws com.ringcentral.RestException, java.io.IOException {
        if (inviteeId == null) {
            throw new IllegalArgumentException("Parameter inviteeId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.delete(this.path(), null);
        return rb.string();
    }
}
