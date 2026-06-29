package com.ringcentral.paths.restapi.account.messagethreads.messages.content;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.messagethreads.messages.Index parent;
    public String attachmentId;

    public Index(
            com.ringcentral.paths.restapi.account.messagethreads.messages.Index parent,
            String attachmentId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.attachmentId = attachmentId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && attachmentId != null) {
            return parent.path() + "/content/" + attachmentId;
        }
        return parent.path() + "/content";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns media content of a rich message attachment.
     *
     * <p>See [Sending MMS](https://developers.ringcentral.com/guide/messaging/sms/sending-images)
     * for the list of supported media types.
     *
     * <p>**This API must be called via media API entry point, e.g. https://media.ringcentral.com**
     *
     * <p>HTTP Method: get Endpoint:
     * /restapi/{apiVersion}/account/{accountId}/message-threads/messages/{messageId}/content/{attachmentId}
     * Rate Limit Group: Medium App Permission: SMS
     */
    public byte[] get(MthReadMessageContentParameters queryParams)
            throws com.ringcentral.RestException, java.io.IOException {
        if (attachmentId == null) {
            throw new IllegalArgumentException("Parameter attachmentId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return rb.bytes();
    }

    public byte[] get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }
}
