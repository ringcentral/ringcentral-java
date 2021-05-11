package com.ringcentral.paths.restapi.glip.chats.unread;

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
            return parent.path() + "/unread";
        }
        /**
         * Sets the specified chat status to {@literal '}Unread{@literal '} for the current user. **Note** {@literal '}Chat{@literal '} is a general name for all types of threads icluding *Personal* (user{@literal '}s own me-chat), *Direct* (one on one chat), *Group* (chat of 3-15 participants without specific name), *Team* (chat of 2 and more participants, with a specific name), *Everyone* (company chat including all employees, with a specific name).{@literal "}
         * HTTP Method: post
         * Endpoint: /restapi/{apiVersion}/glip/chats/{chatId}/unread
         * Rate Limit Group: Medium
         * App Permission: GlipInternal
         */
  public String post() throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.post(this.path(), null);
    return rb.string();
    }
}