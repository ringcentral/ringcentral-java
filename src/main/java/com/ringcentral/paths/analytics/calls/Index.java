package com.ringcentral.paths.analytics.calls;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.analytics.Index parent;
public String version;
public Index(com.ringcentral.paths.analytics.Index parent)
      {
        this(parent, "v1");
      }
public Index(com.ringcentral.paths.analytics.Index parent, String version)
      {
this.parent = parent;
this.rc = parent.rc;
this.version = version;
    }
    public String path(Boolean withParameter)
        {
            if (withParameter && version != null)
            {
                return parent.path() + "/calls/" + version;
            }
            return parent.path() + "/calls";
        }
        public String path()
        {
          return path(true);
        }


  public com.ringcentral.paths.analytics.calls.accounts.Index accounts()
    {
      return this.accounts(null);
    }
  public com.ringcentral.paths.analytics.calls.accounts.Index accounts(String accountId)
  {
    return new com.ringcentral.paths.analytics.calls.accounts.Index(this, accountId);
  }

}