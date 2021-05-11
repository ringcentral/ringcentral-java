package com.ringcentral.paths.restapi.account.messagestorereport.archive;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.restapi.account.messagestorereport.Index parent;
public String archiveId;
public Index(com.ringcentral.paths.restapi.account.messagestorereport.Index parent, String archiveId)
      {
this.parent = parent;
this.rc = parent.rc;
this.archiveId = archiveId;
    }
    public String path(Boolean withParameter)
        {
            if (withParameter && archiveId != null)
            {
                return parent.path() + "/archive/" + archiveId;
            }
            return parent.path() + "/archive";
        }
        public String path()
        {
          return path(true);
        }
        /**
         * Returns the created report with message data not including attachments.
         * HTTP Method: get
         * Endpoint: /restapi/{apiVersion}/account/{accountId}/message-store-report/{taskId}/archive
         * Rate Limit Group: Heavy
         * App Permission: ReadMessages
         * User Permission: Users
         */
  public MessageStoreReportArchive list() throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.get(this.path(false), null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), MessageStoreReportArchive.class);
    }

        /**
         * Returns one of the report archives with message contents in application/zip format.
         * HTTP Method: get
         * Endpoint: /restapi/{apiVersion}/account/{accountId}/message-store-report/{taskId}/archive/{archiveId}
         * Rate Limit Group: Heavy
         * App Permission: ReadMessages
         * User Permission: Users
         */
  public byte[] get() throws com.ringcentral.RestException, java.io.IOException
  {
    if (archiveId == null)
    {
        throw new IllegalArgumentException("Parameter archiveId cannot be null");
    }
    okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
    return rb.bytes();
    }
}