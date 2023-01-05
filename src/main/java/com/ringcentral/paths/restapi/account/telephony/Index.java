package com.ringcentral.paths.restapi.account.telephony;

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
            return parent.path() + "/telephony";
        }


  public com.ringcentral.paths.restapi.account.telephony.sessions.Index sessions()
    {
      return this.sessions(null);
    }
  public com.ringcentral.paths.restapi.account.telephony.sessions.Index sessions(String telephonySessionId)
  {
    return new com.ringcentral.paths.restapi.account.telephony.sessions.Index(this, telephonySessionId);
  }


    public com.ringcentral.paths.restapi.account.telephony.callout.Index callOut()
  {
    return new com.ringcentral.paths.restapi.account.telephony.callout.Index(this);
  }


    public com.ringcentral.paths.restapi.account.telephony.conference.Index conference()
  {
    return new com.ringcentral.paths.restapi.account.telephony.conference.Index(this);
  }

}