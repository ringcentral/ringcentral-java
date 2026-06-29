package com.ringcentral.paths.restapi.account.messagethreads.notes;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.messagethreads.Index parent;
    public String noteId;

    public Index(com.ringcentral.paths.restapi.account.messagethreads.Index parent, String noteId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.noteId = noteId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && noteId != null) {
            return parent.path() + "/notes/" + noteId;
        }
        return parent.path() + "/notes";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns a list of notes from one or more threads. All filters are applied as &quot;AND&quot;
     * conditions.
     *
     * <p>The records are sorted by `creationTime` in ascending order.
     *
     * <p>HTTP Method: get Endpoint: /restapi/{apiVersion}/account/{accountId}/message-threads/notes
     * Rate Limit Group: Medium App Permission: SMS
     */
    public ThreadNoteList get(MthListNotesParameters queryParams)
            throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(false), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), ThreadNoteList.class);
    }

    public ThreadNoteList get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }

    /**
     * Creates a new note in the thread.
     *
     * <p>The thread must be in `Open` status and the current user must be in the list of thread
     * monitors for this operation to succeed.
     *
     * <p>HTTP Method: post Endpoint:
     * /restapi/{apiVersion}/account/{accountId}/message-threads/notes Rate Limit Group: Medium App
     * Permission: SMS
     */
    public ThreadNoteModel post(ThreadNoteCreateRequest threadNoteCreateRequest)
            throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(false), threadNoteCreateRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), ThreadNoteModel.class);
    }

    /**
     * Deletes thread note(s).
     *
     * <p>The corresponding threads must be in `Open` status and the calling user must be the
     * notes&#039; author for this operation to succeed.
     *
     * <p>HTTP Method: delete Endpoint:
     * /restapi/{apiVersion}/account/{accountId}/message-threads/notes Rate Limit Group: Medium App
     * Permission: SMS
     */
    public String delete(ThreadNotesDeleteRequest threadNotesDeleteRequest)
            throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.delete(this.path(false), threadNotesDeleteRequest, null);
        return rb.string();
    }

    /**
     * Updates the text of a note.
     *
     * <p>The thread must be in `Open` status and the calling user must be the note&#039;s author
     * for this operation to succeed.
     *
     * <p>HTTP Method: patch Endpoint:
     * /restapi/{apiVersion}/account/{accountId}/message-threads/notes/{noteId} Rate Limit Group:
     * Medium App Permission: SMS
     */
    public ThreadNoteModel patch(ThreadNoteUpdateRequest threadNoteUpdateRequest)
            throws com.ringcentral.RestException, java.io.IOException {
        if (noteId == null) {
            throw new IllegalArgumentException("Parameter noteId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.patch(this.path(), threadNoteUpdateRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), ThreadNoteModel.class);
    }
}
