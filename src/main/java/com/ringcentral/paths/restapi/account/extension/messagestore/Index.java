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
     * Returns the list of messages from an extension mailbox.
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
     * Deletes conversation(s) by conversation ID(s). Batch request is supported, max number of IDs passed as query/path parameters is 50. Alternative syntax is supported - user conversations can be deleted by passing multiple IDs in request body as an array of string, max number of conversation IDs passed in request body is 100. In this case asterisk is used in the path instead of IDs
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
     * Returns individual message record(s) by the given message ID(s). The length of inbound messages is unlimited. Batch request is supported.
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
     * Updates message(s) by ID(s). Currently only message read status can be updated. Batch request is supported, max number of IDs passed as query/path parameters is 50. Alternative syntax is supported - user messages can be updated by passing multiple IDs in request body as an array of string, max number of IDs passed in request body is 1000. In this case asterisk is used in the path instead of IDs.
     * HTTP Method: put
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/message-store/{messageId}
     * Rate Limit Group: Medium
     * App Permission: EditMessages
     * User Permission: EditMessages
     */
    public GetMessageInfoResponse put(UpdateMessageRequest updateMessageRequest, UpdateMessageParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        if (messageId == null) {
            throw new IllegalArgumentException("Parameter messageId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.put(this.path(), updateMessageRequest, queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), GetMessageInfoResponse.class);
    }

    public GetMessageInfoResponse put(UpdateMessageRequest updateMessageRequest) throws com.ringcentral.RestException, java.io.IOException {
        return this.put(updateMessageRequest, null);
    }

    /**
     * Deletes message(s) by the given message ID(s). The first call of this method transfers the message to the &#039;Delete&#039; status. The second call transfers the deleted message to the &#039;Purged&#039; status. If it is required to make the message &#039;Purged&#039; immediately (from the first call), then set the query parameter purge to &#039;True&#039;.
     * HTTP Method: delete
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/message-store/{messageId}
     * Rate Limit Group: Medium
     * App Permission: EditMessages
     * User Permission: EditMessages
     */
    public String delete(DeleteMessageParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        if (messageId == null) {
            throw new IllegalArgumentException("Parameter messageId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.delete(this.path(), queryParams);
        return rb.string();
    }

    public String delete() throws com.ringcentral.RestException, java.io.IOException {
        return this.delete(null);
    }

    public com.ringcentral.paths.restapi.account.extension.messagestore.content.Index content() {
        return this.content(null);
    }

    public com.ringcentral.paths.restapi.account.extension.messagestore.content.Index content(String attachmentId) {
        return new com.ringcentral.paths.restapi.account.extension.messagestore.content.Index(this, attachmentId);
    }

}
