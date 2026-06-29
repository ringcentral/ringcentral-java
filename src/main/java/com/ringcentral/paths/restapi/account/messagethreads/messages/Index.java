package com.ringcentral.paths.restapi.account.messagethreads.messages;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.messagethreads.Index parent;

    public Index(com.ringcentral.paths.restapi.account.messagethreads.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/messages";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Returns a list of messages across one or more threads. All filters are applied as
     * &quot;AND&quot; conditions.
     *
     * <p>The records are sorted by `creationTime` in ascending order.
     *
     * <p>HTTP Method: get Endpoint:
     * /restapi/{apiVersion}/account/{accountId}/message-threads/messages Rate Limit Group: Medium
     * App Permission: SMS
     */
    public ThreadMessageList get(MthListMessagesParameters queryParams)
            throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), ThreadMessageList.class);
    }

    public ThreadMessageList get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }

    /**
     * Creates and sends a new message to one or more recipients.
     *
     * <p>The message is automatically attached to the thread specified in the `threadId` parameter.
     * If `threadId` is omitted, it is routed to the matching thread based on the `from` and `to`
     * phone numbers; a new thread is created automatically when no matching thread exists.
     *
     * <p>The endpoint accepts two request formats: - `application/json` - for text-only messages. -
     * `multipart/form-data` - to send a message together with one or more binary attachments (for
     * MMS / rich messages). Put the message fields in the `metadata` part and each file in an
     * `attachments` part, as shown in the example below.
     *
     * <p>Note: a suggested attachment filename is optional; when needed, provide it via the
     * `filename` field in the `Content-Disposition` header.
     *
     * <p>HTTP Method: post Endpoint:
     * /restapi/{apiVersion}/account/{accountId}/message-threads/messages Rate Limit Group: Medium
     * App Permission: SMS
     */
    public ThreadMessageModel post(MthSendMessageRequest mthSendMessageRequest)
            throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb =
                this.rc.post(
                        this.path(),
                        mthSendMessageRequest,
                        null,
                        com.ringcentral.ContentType.MULTIPART);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), ThreadMessageModel.class);
    }

    /**
     * Deletes thread message(s).
     *
     * <p>HTTP Method: delete Endpoint:
     * /restapi/{apiVersion}/account/{accountId}/message-threads/messages Rate Limit Group: Medium
     * App Permission: SMS
     */
    public String delete(ThreadMessagesDeleteRequest threadMessagesDeleteRequest)
            throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.delete(this.path(), threadMessagesDeleteRequest, null);
        return rb.string();
    }

    public com.ringcentral.paths.restapi.account.messagethreads.messages.content.Index content() {
        return this.content(null);
    }

    public com.ringcentral.paths.restapi.account.messagethreads.messages.content.Index content(
            String attachmentId) {
        return new com.ringcentral.paths.restapi.account.messagethreads.messages.content.Index(
                this, attachmentId);
    }
}
