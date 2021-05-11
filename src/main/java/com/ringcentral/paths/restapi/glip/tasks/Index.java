package com.ringcentral.paths.restapi.glip.tasks;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.restapi.glip.Index parent;
public String taskId;
public Index(com.ringcentral.paths.restapi.glip.Index parent, String taskId)
      {
this.parent = parent;
this.rc = parent.rc;
this.taskId = taskId;
    }
    public String path(Boolean withParameter)
        {
            if (withParameter && taskId != null)
            {
                return parent.path() + "/tasks/" + taskId;
            }
            return parent.path() + "/tasks";
        }
        public String path()
        {
          return path(true);
        }
        /**
         * Returns information about the specified task(s) by ID(s).
         * HTTP Method: get
         * Endpoint: /restapi/{apiVersion}/glip/tasks/{taskId}
         * Rate Limit Group: Medium
         */
  public GlipTaskInfo get() throws com.ringcentral.RestException, java.io.IOException
  {
    if (taskId == null)
    {
        throw new IllegalArgumentException("Parameter taskId cannot be null");
    }
    okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), GlipTaskInfo.class);
    }

        /**
         * Deletes the specified task.
         * HTTP Method: delete
         * Endpoint: /restapi/{apiVersion}/glip/tasks/{taskId}
         * Rate Limit Group: Medium
         */
  public String delete() throws com.ringcentral.RestException, java.io.IOException
  {
    if (taskId == null)
    {
        throw new IllegalArgumentException("Parameter taskId cannot be null");
    }
    okhttp3.ResponseBody rb = this.rc.delete(this.path(), null);
    return rb.string();
    }

        /**
         * Updates the specified task by ID.
         * HTTP Method: patch
         * Endpoint: /restapi/{apiVersion}/glip/tasks/{taskId}
         * Rate Limit Group: Medium
         */
  public GlipTaskList patch(GlipUpdateTask glipUpdateTask) throws com.ringcentral.RestException, java.io.IOException
  {
    if (taskId == null)
    {
        throw new IllegalArgumentException("Parameter taskId cannot be null");
    }
    okhttp3.ResponseBody rb = this.rc.patch(this.path(), glipUpdateTask, null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), GlipTaskList.class);
    }

    public com.ringcentral.paths.restapi.glip.tasks.complete.Index complete()
  {
    return new com.ringcentral.paths.restapi.glip.tasks.complete.Index(this);
  }

}