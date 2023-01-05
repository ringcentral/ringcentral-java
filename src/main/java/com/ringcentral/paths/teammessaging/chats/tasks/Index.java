package com.ringcentral.paths.teammessaging.chats.tasks;

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
            return parent.path() + "/tasks";
        }
        /**
         * Returns the list of tasks of the specified chat.
         * HTTP Method: get
         * Endpoint: /team-messaging/{version}/chats/{chatId}/tasks
         * Rate Limit Group: Heavy
         * App Permission: TeamMessaging
         */
  public TMTaskList get(ListChatTasksNewParameters queryParams) throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), TMTaskList.class);
    }
    public TMTaskList get() throws com.ringcentral.RestException, java.io.IOException
    {
      return this.get(null);
    }

        /**
         * Creates a task in the specified chat.
         * HTTP Method: post
         * Endpoint: /team-messaging/{version}/chats/{chatId}/tasks
         * Rate Limit Group: Medium
         * App Permission: TeamMessaging
         */
  public TMTaskInfo post(TMCreateTaskRequest tMCreateTaskRequest) throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.post(this.path(), tMCreateTaskRequest, null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), TMTaskInfo.class);
    }
}