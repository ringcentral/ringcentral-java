package com.ringcentral.paths.restapi.glip.groups;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.restapi.glip.Index parent;
public Index(com.ringcentral.paths.restapi.glip.Index parent)
      {
this.parent = parent;
this.rc = parent.rc;
    }
    public String path()
        {
            return parent.path() + "/groups";
        }


    public com.ringcentral.paths.restapi.glip.groups.events.Index events()
  {
    return new com.ringcentral.paths.restapi.glip.groups.events.Index(this);
  }


    public com.ringcentral.paths.restapi.glip.groups.webhooks.Index webhooks()
  {
    return new com.ringcentral.paths.restapi.glip.groups.webhooks.Index(this);
  }

}