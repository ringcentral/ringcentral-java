package com.ringcentral.paths.restapi.account.extension.sms;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.restapi.account.extension.Index parent;
public Index(com.ringcentral.paths.restapi.account.extension.Index parent)
      {
this.parent = parent;
this.rc = parent.rc;
    }
    public String path()
        {
            return parent.path() + "/sms";
        }
        /**
         * Creates and sends a new text message. You can send SMS messages simultaneously to different recipients up to 40 requests per minute; this limitation is relevant for all client applications. Sending and receiving SMS is available for Toll-Free Numbers within the USA. You can send up to 10 attachments in one MMS message; the size of all attachments linked is limited to 1500000 bytes.
         * HTTP Method: post
         * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/sms
         * Rate Limit Group: Medium
         * App Permission: SMS
         * User Permission: OutboundSMS
         */
  public GetSMSMessageInfoResponse post(CreateSMSMessage CreateSMSMessage) throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.post(this.path(), CreateSMSMessage, null, com.ringcentral.ContentType.MULTIPART);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), GetSMSMessageInfoResponse.class);
    }
}