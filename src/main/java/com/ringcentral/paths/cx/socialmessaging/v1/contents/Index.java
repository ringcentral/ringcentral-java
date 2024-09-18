package com.ringcentral.paths.cx.socialmessaging.v1.contents;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.CreateSocialMessagingContentRequest;
import com.ringcentral.definitions.ListSocialMessagingContentsParameters;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.cx.socialmessaging.v1.Index parent;
    public String contentId;

    public Index(com.ringcentral.paths.cx.socialmessaging.v1.Index parent, String contentId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.contentId = contentId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && contentId != null) {
            return parent.path() + "/contents/" + contentId;
        }
        return parent.path() + "/contents";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns a list of social messaging contents ordered by creation date. The default order is descending.
     * <p>
     * The account context of this request is determined by the RC Account ID associated with
     * the access token provided in the Authorization header.
     * <p>
     * The query parameters provided in request will be considered an AND operation to filter the list.
     * <p>
     * A query parameter which is not specified or provided with the null value will be ignored.
     * <p>
     * HTTP Method: get
     * Endpoint: /cx/social-messaging/v1/contents
     * Rate Limit Group: Light
     * App Permission: SocialMessaging
     */
    public String list(ListSocialMessagingContentsParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(false), queryParams);
        return rb.string();
    }

    public String list() throws com.ringcentral.RestException, java.io.IOException {
        return this.list(null);
    }

    /**
     * Creates the new social messaging content for use in discussions.
     * <p>
     * This request is used to reply to an already posted content or to initiate a discussion. If authorized, the
     * authenticated user will be used as the content author.
     * <p>
     * Content will be created and pushed asynchronously to the channel. When the content is successfully pushed to
     * the channel, the `Content.Exported` event will be reported.
     * <p>
     * The account context of this request is determined by the RC Account ID associated with the access token provided
     * in the Authorization header.
     * <p>
     * Replying to customer content is usually possible unless the channel or conversation is read only. Composing
     * content, on the contrary, depends on the channel itself.
     * <p>
     * - The channel may not support it and be purely reactive like Instagram, Messenger, etc.
     * <p>
     * - Some channels (usually public accounts, like Twitter or Facebook pages) allow content publishing
     * without targeting specific individuals.
     * <p>
     * - Some channels (usually non-public media) require specific targeting (phone number for SMS, email address
     * for email, customer_id, etc.) to be able to create content. This is channel-specific and detailed under the
     * generic parameters.
     * <p>
     * HTTP Method: post
     * Endpoint: /cx/social-messaging/v1/contents
     * Rate Limit Group: Light
     * App Permission: SocialMessaging
     */
    public String post(CreateSocialMessagingContentRequest createSocialMessagingContentRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(false), createSocialMessagingContentRequest, null);
        return rb.string();
    }

    /**
     * Returns the social messaging content by ID specified in path.
     * HTTP Method: get
     * Endpoint: /cx/social-messaging/v1/contents/{contentId}
     * Rate Limit Group: Light
     * App Permission: SocialMessaging
     */
    public String get() throws com.ringcentral.RestException, java.io.IOException {
        if (contentId == null) {
            throw new IllegalArgumentException("Parameter contentId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return rb.string();
    }
}
