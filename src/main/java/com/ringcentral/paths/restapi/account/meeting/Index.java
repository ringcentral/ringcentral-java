package com.ringcentral.paths.restapi.account.meeting;

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
            return parent.path() + "/meeting";
        }


    public com.ringcentral.paths.restapi.account.meeting.lockedsettings.Index lockedSettings()
  {
    return new com.ringcentral.paths.restapi.account.meeting.lockedsettings.Index(this);
  }

}