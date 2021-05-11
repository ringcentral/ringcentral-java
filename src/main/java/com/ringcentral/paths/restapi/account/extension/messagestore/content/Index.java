package com.ringcentral.paths.restapi.account.extension.messagestore.content;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.restapi.account.extension.messagestore.Index parent;
public String attachmentId;
public Index(com.ringcentral.paths.restapi.account.extension.messagestore.Index parent, String attachmentId)
      {
this.parent = parent;
this.rc = parent.rc;
this.attachmentId = attachmentId;
    }
    public String path(Boolean withParameter)
        {
            if (withParameter && attachmentId != null)
            {
                return parent.path() + "/content/" + attachmentId;
            }
            return parent.path() + "/content";
        }
        public String path()
        {
          return path(true);
        }
        /**
         * Returns a specific message attachment data as media stream.
         * HTTP Method: get
         * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/message-store/{messageId}/content/{attachmentId}
         * Rate Limit Group: Medium
         * App Permission: ReadMessages
         * User Permission: ReadMessageContent
         */
  public byte[] get(ReadMessageContentParameters queryParams) throws com.ringcentral.RestException, java.io.IOException
  {
    if (attachmentId == null)
    {
        throw new IllegalArgumentException("Parameter attachmentId cannot be null");
    }
    okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
    return rb.bytes();
    }
    public byte[] get() throws com.ringcentral.RestException, java.io.IOException
    {
      return this.get(null);
    }
}