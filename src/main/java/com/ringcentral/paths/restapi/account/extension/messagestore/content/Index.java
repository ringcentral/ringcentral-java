package com.ringcentral.paths.restapi.account.extension.messagestore.content;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.extension.messagestore.Index parent;
    public String attachmentId;

    public Index(com.ringcentral.paths.restapi.account.extension.messagestore.Index parent, String attachmentId) {
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
     * Returns media content of a message attachment.
     * The content is typically an audio file (`audio/mpeg` or `audio/wav`) for voicemails,
     * TIFF or PDF for faxes and image/audio/video for MMS.
     * <p>
     * **This API must be called via media API entry point, e.g. https://media.ringcentral.com**
     * <p>
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/message-store/{messageId}/content/{attachmentId}
     * Rate Limit Group: Medium
     * App Permission: ReadMessages
     */
    public byte[] get(ReadMessageContentParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
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
