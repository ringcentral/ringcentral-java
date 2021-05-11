package com.ringcentral.paths.restapi.glip.notes.publish;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.restapi.glip.notes.Index parent;
public Index(com.ringcentral.paths.restapi.glip.notes.Index parent)
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
         * Endpoint: /restapi/{apiVersion}/glip/notes/{noteId}/publish
         * Rate Limit Group: Medium
         * App Permission: Glip
         * User Permission: Glip
         */
  public String post() throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.post(this.path(), null);
    return rb.string();
    }
}