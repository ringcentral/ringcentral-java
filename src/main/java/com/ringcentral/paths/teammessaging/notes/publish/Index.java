package com.ringcentral.paths.teammessaging.notes.publish;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.teammessaging.notes.Index parent;
public Index(com.ringcentral.paths.teammessaging.notes.Index parent)
      {
this.parent = parent;
this.rc = parent.rc;
    }
    public String path()
        {
            return parent.path() + "/publish";
        }
        /**
         * Publishes a note making it visible to other users.
         * HTTP Method: post
         * Endpoint: /team-messaging/{version}/notes/{noteId}/publish
         * Rate Limit Group: Medium
         * App Permission: TeamMessaging
         */
  public TMNoteInfo post() throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.post(this.path(), null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), TMNoteInfo.class);
    }
}