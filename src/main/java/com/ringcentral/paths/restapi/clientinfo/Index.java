package com.ringcentral.paths.restapi.clientinfo;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.restapi.Index parent;
public Index(com.ringcentral.paths.restapi.Index parent)
      {
this.parent = parent;
this.rc = parent.rc;
    }
    public String path()
        {
            return parent.path() + "/client-info";
        }


    public com.ringcentral.paths.restapi.clientinfo.sipprovision.Index sipProvision()
  {
    return new com.ringcentral.paths.restapi.clientinfo.sipprovision.Index(this);
  }

}