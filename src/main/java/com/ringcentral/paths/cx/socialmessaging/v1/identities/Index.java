package com.ringcentral.paths.cx.socialmessaging.v1.identities;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.SocMsgListIdentitiesParameters;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.cx.socialmessaging.v1.Index parent;
    public String identityId;

    public Index(com.ringcentral.paths.cx.socialmessaging.v1.Index parent, String identityId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.identityId = identityId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && identityId != null) {
            return parent.path() + "/identities/" + identityId;
        }
        return parent.path() + "/identities";
    }

    public String path() {
        return path(true);
    }

    /**
     * List identities by creation date. The default order is descending.
     * <p>
     * The account context of this request is determined by the RC Account Id associated with the access token provided
     * in the Authorization header.
     * <p>
     * The query parameters provided shall be considered an AND operation to filter the list.
     * <p>
     * A query parameter not specified or a query parameter provided with no value is treated as not required for
     * filtering the list.
     * <p>
     * HTTP Method: get
     * Endpoint: /cx/social-messaging/v1/identities
     * Rate Limit Group: Light
     * App Permission: SocialMessaging
     */
    public String list(SocMsgListIdentitiesParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(false), queryParams);
        return rb.string();
    }

    public String list() throws com.ringcentral.RestException, java.io.IOException {
        return this.list(null);
    }

    /**
     * Renders an identity from given id.
     * <p>
     * HTTP Method: get
     * Endpoint: /cx/social-messaging/v1/identities/{identityId}
     * Rate Limit Group: Light
     * App Permission: SocialMessaging
     */
    public String get() throws com.ringcentral.RestException, java.io.IOException {
        if (identityId == null) {
            throw new IllegalArgumentException("Parameter identityId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return rb.string();
    }
}
