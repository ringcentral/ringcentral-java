package com.ringcentral.paths.restapi.account.extension.meetingconfiguration.profileimage;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.restapi.account.extension.meetingconfiguration.Index parent;
public Index(com.ringcentral.paths.restapi.account.extension.meetingconfiguration.Index parent)
      {
this.parent = parent;
this.rc = parent.rc;
    }
    public String path()
        {
            return parent.path() + "/profile-image";
        }
        /**
         * Uploads profile picture for user meetings
         * HTTP Method: post
         * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/meeting-configuration/profile-image
         * Rate Limit Group: Light
         * App Permission: Meetings
         * User Permission: Meetings
         */
  public String post(CreateUserMeetingProfileImageRequest createUserMeetingProfileImageRequest) throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.post(this.path(), createUserMeetingProfileImageRequest, null, com.ringcentral.ContentType.MULTIPART);
    return rb.string();
    }
}