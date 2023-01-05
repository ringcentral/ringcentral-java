package com.ringcentral.paths.analytics.calls.accounts.timeline;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.analytics.calls.accounts.Index parent;
public Index(com.ringcentral.paths.analytics.calls.accounts.Index parent)
      {
this.parent = parent;
this.rc = parent.rc;
    }
    public String path()
        {
            return parent.path() + "/timeline";
        }


    public com.ringcentral.paths.analytics.calls.accounts.timeline.fetch.Index fetch()
  {
    return new com.ringcentral.paths.analytics.calls.accounts.timeline.fetch.Index(this);
  }

}