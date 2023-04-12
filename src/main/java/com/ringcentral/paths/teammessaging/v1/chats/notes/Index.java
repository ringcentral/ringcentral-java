package com.ringcentral.paths.teammessaging.v1.chats.notes;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.ListChatNotesNewParameters;
import com.ringcentral.definitions.TMCreateNoteRequest;
import com.ringcentral.definitions.TMNoteInfo;
import com.ringcentral.definitions.TMNoteList;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.teammessaging.v1.chats.Index parent;

    public Index(com.ringcentral.paths.teammessaging.v1.chats.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/notes";
    }

    /**
     * Returns the list of chat notes.
     * HTTP Method: get
     * Endpoint: /team-messaging/v1/chats/{chatId}/notes
     * Rate Limit Group: Heavy
     * App Permission: TeamMessaging
     */
    public TMNoteList get(ListChatNotesNewParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), TMNoteList.class);
    }

    public TMNoteList get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }

    /**
     * Creates a new note in the specified chat.
     * HTTP Method: post
     * Endpoint: /team-messaging/v1/chats/{chatId}/notes
     * Rate Limit Group: Medium
     * App Permission: TeamMessaging
     */
    public TMNoteInfo post(TMCreateNoteRequest tMCreateNoteRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), tMCreateNoteRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), TMNoteInfo.class);
    }
}
