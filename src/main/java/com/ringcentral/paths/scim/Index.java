package com.ringcentral.paths.scim;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public String version;
public Index(RestClient rc)
      {
        this(rc, "v2");
      }
public Index(RestClient rc, String version)
      {
this.rc = rc;
this.version = version;
    }
    public String path(Boolean withParameter)
        {
            if (withParameter && version != null)
            {
                return "" + "/scim/" + version;
            }
            return "" + "/scim";
        }
        public String path()
        {
          return path(true);
        }


  public com.ringcentral.paths.scim.users.Index users()
    {
      return this.users(null);
    }
  public com.ringcentral.paths.scim.users.Index users(String scimUserId)
  {
    return new com.ringcentral.paths.scim.users.Index(this, scimUserId);
  }


  public com.ringcentral.paths.scim.schemas.Index schemas()
    {
      return this.schemas(null);
    }
  public com.ringcentral.paths.scim.schemas.Index schemas(String uri)
  {
    return new com.ringcentral.paths.scim.schemas.Index(this, uri);
  }


  public com.ringcentral.paths.scim.resourcetypes.Index resourceTypes()
    {
      return this.resourceTypes(null);
    }
  public com.ringcentral.paths.scim.resourcetypes.Index resourceTypes(String type)
  {
    return new com.ringcentral.paths.scim.resourcetypes.Index(this, type);
  }


    public com.ringcentral.paths.scim.serviceproviderconfig.Index serviceProviderConfig()
  {
    return new com.ringcentral.paths.scim.serviceproviderconfig.Index(this);
  }

}