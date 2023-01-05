package com.ringcentral.paths.restapi.account.meetingrecordings;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.restapi.account.Index parent;
public Index(com.ringcentral.paths.restapi.account.Index parent)
      {
this.parent = parent;
this.rc = parent.rc;
    }
    public String path()
        {
            return parent.path() + "/meeting-recordings";
        }
        /**
         * Returns the list of meeting recordings for the current account.
         * HTTP Method: get
         * Endpoint: /restapi/{apiVersion}/account/{accountId}/meeting-recordings
         * Rate Limit Group: Medium
         * App Permission: Meetings
         */
  public ListMeetingRecordingsResponse get(ListAccountMeetingRecordingsParameters queryParams) throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), ListMeetingRecordingsResponse.class);
    }
    public ListMeetingRecordingsResponse get() throws com.ringcentral.RestException, java.io.IOException
    {
      return this.get(null);
    }
}