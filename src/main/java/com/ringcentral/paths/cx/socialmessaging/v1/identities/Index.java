package com.ringcentral.paths.cx.socialmessaging.v1.identities;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.ListSocialMessagingIdentitiesParameters;

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
     * Returns a list of identities ordered by creation date. The default order is descending.
     * <p>
     * The account context of this request is determined by the RC Account ID associated with
     * the access token provided in the Authorization header.
     * <p>
     * The query parameters provided will be considered an AND operation to filter the list.
     * <p>
     * A query parameter which is not specified or provided with the null value will be ignored.
     * <p>
     * HTTP Method: get
     * Endpoint: /cx/social-messaging/v1/identities
     * Rate Limit Group: Light
     * App Permission: SocialMessaging
     */
    public String list(ListSocialMessagingIdentitiesParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(false), queryParams);
        return rb.string();
    }

    public String list() throws com.ringcentral.RestException, java.io.IOException {
        return this.list(null);
    }

    /**
     * Returns an identity by ID specified in path.
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
