package com.ringcentral.paths.restapi.account.extensionbulkupdate.tasks;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.restapi.account.extensionbulkupdate.Index parent;
public String taskId;
public Index(com.ringcentral.paths.restapi.account.extensionbulkupdate.Index parent, String taskId)
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
         * Returns a status of a task to update multiple extensions.
 * 
         * HTTP Method: get
         * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension-bulk-update/tasks/{taskId}
         * Rate Limit Group: Light
         * App Permission: EditExtensions
         * User Permission: EditExtensionInfo
         */
  public ExtensionBulkUpdateTaskResource get() throws com.ringcentral.RestException, java.io.IOException
  {
    if (taskId == null)
    {
        throw new IllegalArgumentException("Parameter taskId cannot be null");
    }
    okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), ExtensionBulkUpdateTaskResource.class);
    }
}