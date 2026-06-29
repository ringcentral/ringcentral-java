package com.ringcentral.paths.restapi.account.messagethreads;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.Index parent;
    public String threadId;

    public Index(com.ringcentral.paths.restapi.account.Index parent, String threadId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.threadId = threadId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && threadId != null) {
            return parent.path() + "/message-threads/" + threadId;
        }
        return parent.path() + "/message-threads";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns a paginated list of message threads for the specified account according to the
     * specified criteria.
     *
     * <p>Different filters are combined with logical &quot;AND&quot;, different values for the same
     * filter (if supported) are combined with logical &quot;OR&quot;.
     *
     * <p>Only threads that accessible for a current authorized user are returned. The records are
     * sorted by `creationTime` in ascending order.
     *
     * <p>HTTP Method: get Endpoint: /restapi/{apiVersion}/account/{accountId}/message-threads Rate
     * Limit Group: Medium App Permission: SMS
     */
    public MessageThreadList list(MthListThreadsParameters queryParams)
            throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(false), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), MessageThreadList.class);
    }

    public MessageThreadList list() throws com.ringcentral.RestException, java.io.IOException {
        return this.list(null);
    }

    /**
     * Returns a message thread by ID.
     *
     * <p>API returns a 403 error if the current user does not have access to the given thread.
     *
     * <p>HTTP Method: get Endpoint:
     * /restapi/{apiVersion}/account/{accountId}/message-threads/{threadId} Rate Limit Group: Medium
     * App Permission: SMS
     */
    public MessageThread get() throws com.ringcentral.RestException, java.io.IOException {
        if (threadId == null) {
            throw new IllegalArgumentException("Parameter threadId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), MessageThread.class);
    }

    /**
     * Deletes a message thread by IDs.
     *
     * <p>Technically this operation just sets thread&#039;s `availability` to `Deleted`. API
     * returns a 403 error if the current user does not have access to the given thread.
     *
     * <p>Once the thread is deleted its `assignee` attribute is cleared automatically.
     *
     * <p>HTTP Method: delete Endpoint:
     * /restapi/{apiVersion}/account/{accountId}/message-threads/{threadId} Rate Limit Group: Medium
     * App Permission: SMS
     */
    public String delete() throws com.ringcentral.RestException, java.io.IOException {
        if (threadId == null) {
            throw new IllegalArgumentException("Parameter threadId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.delete(this.path(), null);
        return rb.string();
    }

    public com.ringcentral.paths.restapi.account.messagethreads.sync.Index sync() {
        return new com.ringcentral.paths.restapi.account.messagethreads.sync.Index(this);
    }

    public com.ringcentral.paths.restapi.account.messagethreads.notes.Index notes() {
        return this.notes(null);
    }

    public com.ringcentral.paths.restapi.account.messagethreads.notes.Index notes(String noteId) {
        return new com.ringcentral.paths.restapi.account.messagethreads.notes.Index(this, noteId);
    }

    public com.ringcentral.paths.restapi.account.messagethreads.assign.Index assign() {
        return new com.ringcentral.paths.restapi.account.messagethreads.assign.Index(this);
    }

    public com.ringcentral.paths.restapi.account.messagethreads.entries.Index entries() {
        return new com.ringcentral.paths.restapi.account.messagethreads.entries.Index(this);
    }

    public com.ringcentral.paths.restapi.account.messagethreads.resolve.Index resolve() {
        return new com.ringcentral.paths.restapi.account.messagethreads.resolve.Index(this);
    }

    public com.ringcentral.paths.restapi.account.messagethreads.messages.Index messages() {
        return new com.ringcentral.paths.restapi.account.messagethreads.messages.Index(this);
    }
}
