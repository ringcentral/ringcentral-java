package com.ringcentral.paths.teammessaging.recent.chats;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.teammessaging.recent.Index parent;
public Index(com.ringcentral.paths.teammessaging.recent.Index parent)
      {
this.parent = parent;
this.rc = parent.rc;
    }
    public String path()
        {
            return parent.path() + "/chats";
        }
        /**
         * Returns recent chats where the user is a member. All records in response are sorted by the `lastModifiedTime` in descending order (the latest changed chat is displayed first on page)
         * HTTP Method: get
         * Endpoint: /team-messaging/{version}/recent/chats
         * Rate Limit Group: Light
         * App Permission: TeamMessaging
         */
  public TMChatListWithoutNavigation get(ListRecentChatsNewParameters queryParams) throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), TMChatListWithoutNavigation.class);
    }
    public TMChatListWithoutNavigation get() throws com.ringcentral.RestException, java.io.IOException
    {
      return this.get(null);
    }
}