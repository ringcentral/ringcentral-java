package com.ringcentral.paths.restapi.account.meeting;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.restapi.account.Index parent;
public String meetingId;
public Index(com.ringcentral.paths.restapi.account.Index parent, String meetingId)
      {
this.parent = parent;
this.rc = parent.rc;
this.meetingId = meetingId;
    }
    public String path(Boolean withParameter)
        {
            if (withParameter && meetingId != null)
            {
                return parent.path() + "/meeting/" + meetingId;
            }
            return parent.path() + "/meeting";
        }
        public String path()
        {
          return path(true);
        }
        /**
         * Returns a particular account-level meeting details by ID.
         * HTTP Method: get
         * Endpoint: /restapi/{apiVersion}/account/{accountId}/meeting/{meetingId}
         * Rate Limit Group: Light
         * App Permission: Meetings
         * User Permission: Meetings
         */
  public MeetingResponseResource get() throws com.ringcentral.RestException, java.io.IOException
  {
    if (meetingId == null)
    {
        throw new IllegalArgumentException("Parameter meetingId cannot be null");
    }
    okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), MeetingResponseResource.class);
    }

    public com.ringcentral.paths.restapi.account.meeting.lockedsettings.Index lockedSettings()
  {
    return new com.ringcentral.paths.restapi.account.meeting.lockedsettings.Index(this);
  }

}