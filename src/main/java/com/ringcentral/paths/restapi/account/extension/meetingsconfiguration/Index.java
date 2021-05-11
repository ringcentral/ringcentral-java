package com.ringcentral.paths.restapi.account.extension.meetingsconfiguration;

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
            return parent.path() + "/meetings-configuration";
        }


    public com.ringcentral.paths.restapi.account.extension.meetingsconfiguration.assisted.Index assisted()
  {
    return new com.ringcentral.paths.restapi.account.extension.meetingsconfiguration.assisted.Index(this);
  }


    public com.ringcentral.paths.restapi.account.extension.meetingsconfiguration.assistants.Index assistants()
  {
    return new com.ringcentral.paths.restapi.account.extension.meetingsconfiguration.assistants.Index(this);
  }

}