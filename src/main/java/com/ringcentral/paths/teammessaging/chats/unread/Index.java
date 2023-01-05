package com.ringcentral.paths.teammessaging.chats.unread;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.teammessaging.chats.Index parent;
public Index(com.ringcentral.paths.teammessaging.chats.Index parent)
      {
this.parent = parent;
this.rc = parent.rc;
    }
    public String path()
        {
            return parent.path() + "/unread";
        }
        /**
         * Sets the specified chat status to &#039;Unread&#039; for the current user.
         * HTTP Method: post
         * Endpoint: /team-messaging/{version}/chats/{chatId}/unread
         * Rate Limit Group: Medium
         * App Permission: TeamMessagingInternal
         */
  public String post() throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.post(this.path(), null);
    return rb.string();
    }
}