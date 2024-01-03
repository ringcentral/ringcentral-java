package com.ringcentral.paths.restapi.account.extension.messagestore;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.extension.Index parent;
    public String messageId;

    public Index(com.ringcentral.paths.restapi.account.extension.Index parent, String messageId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.messageId = messageId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && messageId != null) {
            return parent.path() + "/message-store/" + messageId;
        }
        return parent.path() + "/message-store";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns a list of messages from an extension mailbox.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/message-store
     * Rate Limit Group: Light
     * App Permission: ReadMessages
     * User Permission: ReadMessages
     */
    public GetMessageList list(ListMessagesParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(false), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), GetMessageList.class);
    }

    public GetMessageList list() throws com.ringcentral.RestException, java.io.IOException {
        return this.list(null);
    }

    /**
     * Deletes conversation(s) by conversation ID(s). Batch request is
     * supported, max number of IDs passed as query/path parameters is 50. Alternative
     * syntax is supported - user conversations can be deleted by passing multiple
     * IDs in request body as an array of string, max number of conversation IDs
     * passed in request body is 100. In this case asterisk is used in the path instead
     * of IDs
     * <p>
     * HTTP Method: delete
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/message-store
     * Rate Limit Group: Medium
     * App Permission: EditMessages
     * User Permission: EditMessages
     */
    public String deleteAll(DeleteMessageByFilterParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.delete(this.path(false), queryParams);
        return rb.string();
    }

    public String deleteAll() throws com.ringcentral.RestException, java.io.IOException {
        return this.deleteAll(null);
    }

    /**
     * Returns an individual message record or multiple records by the given message ID(s).
     * The length of inbound messages is unlimited. Bulk syntax is supported.
     * <p>
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/message-store/{messageId}
     * Rate Limit Group: Light
     * App Permission: ReadMessages
     * User Permission: ReadMessages
     */
    public GetMessageInfoResponse get() throws com.ringcentral.RestException, java.io.IOException {
        if (messageId == null) {
            throw new IllegalArgumentException("Parameter messageId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), GetMessageInfoResponse.class);
    }

    /**
     * Updates message(s) by their ID(s). Currently only message read status
     * can be updated through this method.
     * <p>
     * Bulk syntax is supported, max number of IDs passed as query/path
     * parameters is 50. Alternative bulk syntax is also supported - user messages can be updated
     * by passing multiple IDs in request body as an array of string, max number
     * of IDs passed in the body is 1000. In this case asterisk is used in the
     * path instead of IDs.
     * <p>
     * HTTP Method: put
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/message-store/{messageId}
     * Rate Limit Group: Medium
     * App Permission: EditMessages
     * User Permission: EditMessages
     */
    public GetMessageInfoResponse put(UpdateMessageRequest updateMessageRequest) throws com.ringcentral.RestException, java.io.IOException {
        if (messageId == null) {
            throw new IllegalArgumentException("Parameter messageId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.put(this.path(), updateMessageRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), GetMessageInfoResponse.class);
    }

    /**
     * Deletes message(s) by the given message ID(s). The first call of
     * this method transfers the message to the &#039;Delete&#039; status. The second call
     * transfers the deleted message to the &#039;Purged&#039; status. If it is required to
     * make the message &#039;Purged&#039; immediately (from the first call), then set the
     * query parameter purge to `true`.
     * <p>
     * HTTP Method: delete
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/message-store/{messageId}
     * Rate Limit Group: Medium
     * App Permission: EditMessages
     * User Permission: EditMessages
     */
    public String delete(String[] deleteMessageBulkRequest, DeleteMessageParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        if (messageId == null) {
            throw new IllegalArgumentException("Parameter messageId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.delete(this.path(), deleteMessageBulkRequest, queryParams);
        return rb.string();
    }

    public String delete(String[] deleteMessageBulkRequest) throws com.ringcentral.RestException, java.io.IOException {
        return this.delete(deleteMessageBulkRequest, null);
    }

    /**
     * Patches message(s) by ID(s). Currently only message read status update and
     * restoring deleted messages are supported through this method.
     * <p>
     * For changing status of a message send `readStatus` set to either &#039;Read&#039; or &#039;Unread&#039; in request.
     * It is possible to restore a message and its attachments (if message status is &#039;Deleted&#039;) by sending
     * `availability` attribute set to &#039;Alive&#039; in request body. If a message is already in &#039;Purged&#039; state
     * then its attachments cannot be restored and the message itself is about to be physically deleted.
     * <p>
     * Bulk syntax (both traditional and alternative one) is supported.
     * <p>
     * HTTP Method: patch
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/message-store/{messageId}
     * Rate Limit Group: Medium
     * App Permission: EditMessages
     * User Permission: EditMessages
     */
    public GetMessageInfoResponse patch(PatchMessageRequest patchMessageRequest) throws com.ringcentral.RestException, java.io.IOException {
        if (messageId == null) {
            throw new IllegalArgumentException("Parameter messageId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.patch(this.path(), patchMessageRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), GetMessageInfoResponse.class);
    }

    public com.ringcentral.paths.restapi.account.extension.messagestore.content.Index content() {
        return this.content(null);
    }

    public com.ringcentral.paths.restapi.account.extension.messagestore.content.Index content(String attachmentId) {
        return new com.ringcentral.paths.restapi.account.extension.messagestore.content.Index(this, attachmentId);
    }

}
