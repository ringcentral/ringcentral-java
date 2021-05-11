package com.ringcentral.paths.restapi.glip.chats.notes;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.restapi.glip.chats.Index parent;
public Index(com.ringcentral.paths.restapi.glip.chats.Index parent)
      {
this.parent = parent;
this.rc = parent.rc;
    }
    public String path()
        {
            return parent.path() + "/notes";
        }
        /**
         * Returns the list of notes created in the specified chat.
         * HTTP Method: get
         * Endpoint: /restapi/{apiVersion}/glip/chats/{chatId}/notes
         * Rate Limit Group: Heavy
         * App Permission: Glip
         * User Permission: Glip
         */
  public GlipNotesInfo get(ListChatNotesParameters queryParams) throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), GlipNotesInfo.class);
    }
    public GlipNotesInfo get() throws com.ringcentral.RestException, java.io.IOException
    {
      return this.get(null);
    }

        /**
         * Creates a new note in the specified chat.
         * HTTP Method: post
         * Endpoint: /restapi/{apiVersion}/glip/chats/{chatId}/notes
         * Rate Limit Group: Medium
         * App Permission: Glip
         * User Permission: Glip
         */
  public GlipNoteInfo post(GlipNoteCreate glipNoteCreate) throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.post(this.path(), glipNoteCreate, null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), GlipNoteInfo.class);
    }
}