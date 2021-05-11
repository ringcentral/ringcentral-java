package com.ringcentral.paths.restapi.glip.chats.tasks;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.GlipCreateTask;
import com.ringcentral.definitions.GlipTaskInfo;
import com.ringcentral.definitions.GlipTaskList;
import com.ringcentral.definitions.ListChatTasksParameters;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.glip.chats.Index parent;

    public Index(com.ringcentral.paths.restapi.glip.chats.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/tasks";
    }

    /**
     * Returns the list of tasks of the specified chat.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/glip/chats/{chatId}/tasks
     * Rate Limit Group: Heavy
     */
    public GlipTaskList get(ListChatTasksParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), GlipTaskList.class);
    }

    public GlipTaskList get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }

    /**
     * Creates a task in the specified chat.
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/glip/chats/{chatId}/tasks
     * Rate Limit Group: Medium
     */
    public GlipTaskInfo post(GlipCreateTask glipCreateTask) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), glipCreateTask, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), GlipTaskInfo.class);
    }
}
