package com.ringcentral.paths.restapi.glip.notes;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.GetGlipNoteInfo;
import com.ringcentral.definitions.GlipNoteCreate;
import com.ringcentral.definitions.GlipNoteInfo;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.glip.Index parent;
    public String noteId;

    public Index(com.ringcentral.paths.restapi.glip.Index parent, String noteId) {
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
     * Returns the specified note(s). It is possible to fetch up to 50 notes per request.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/glip/notes/{noteId}
     * Rate Limit Group: Medium
     * App Permission: TeamMessaging
     * User Permission: UnifiedAppDesktop
     */
    public GetGlipNoteInfo get() throws com.ringcentral.RestException, java.io.IOException {
        if (noteId == null) {
            throw new IllegalArgumentException("Parameter noteId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), GetGlipNoteInfo.class);
    }

    /**
     * Deletes the specified note.
     * HTTP Method: delete
     * Endpoint: /restapi/{apiVersion}/glip/notes/{noteId}
     * Rate Limit Group: Medium
     * App Permission: TeamMessaging
     * User Permission: UnifiedAppDesktop
     */
    public String delete() throws com.ringcentral.RestException, java.io.IOException {
        if (noteId == null) {
            throw new IllegalArgumentException("Parameter noteId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.delete(this.path(), null);
        return rb.string();
    }

    /**
     * Edits a note. Notes can be edited by any user if posted to a chat. the user belongs to.
     * HTTP Method: patch
     * Endpoint: /restapi/{apiVersion}/glip/notes/{noteId}
     * Rate Limit Group: Medium
     * App Permission: TeamMessaging
     * User Permission: UnifiedAppDesktop
     */
    public GlipNoteInfo patch(GlipNoteCreate glipNoteCreate) throws com.ringcentral.RestException, java.io.IOException {
        if (noteId == null) {
            throw new IllegalArgumentException("Parameter noteId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.patch(this.path(), glipNoteCreate, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), GlipNoteInfo.class);
    }

    public com.ringcentral.paths.restapi.glip.notes.lock.Index lock() {
        return new com.ringcentral.paths.restapi.glip.notes.lock.Index(this);
    }


    public com.ringcentral.paths.restapi.glip.notes.unlock.Index unlock() {
        return new com.ringcentral.paths.restapi.glip.notes.unlock.Index(this);
    }


    public com.ringcentral.paths.restapi.glip.notes.publish.Index publish() {
        return new com.ringcentral.paths.restapi.glip.notes.publish.Index(this);
    }

}
