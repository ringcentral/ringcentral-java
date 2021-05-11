package com.ringcentral.paths.restapi.account.extension.meeting.usersettings;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.restapi.account.extension.meeting.Index parent;
public Index(com.ringcentral.paths.restapi.account.extension.meeting.Index parent)
      {
this.parent = parent;
this.rc = parent.rc;
    }
    public String path()
        {
            return parent.path() + "/user-settings";
        }
        /**
         * Returns user settings for meetings.
         * HTTP Method: get
         * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/meeting/user-settings
         * Rate Limit Group: Light
         * App Permission: Meetings
         * User Permission: Meetings
         */
  public MeetingUserSettingsResponse get() throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), MeetingUserSettingsResponse.class);
    }
}