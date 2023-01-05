package com.ringcentral.paths.scim.serviceproviderconfig;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.scim.Index parent;
public Index(com.ringcentral.paths.scim.Index parent)
      {
this.parent = parent;
this.rc = parent.rc;
    }
    public String path()
        {
            return parent.path() + "/ServiceProviderConfig";
        }
        /**
         * Returns SCIM service provider configuration
         * HTTP Method: get
         * Endpoint: /scim/{version}/ServiceProviderConfig
         * Rate Limit Group: Light
         * App Permission: ReadAccounts
         */
  public ScimProviderConfig get() throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), ScimProviderConfig.class);
    }
}