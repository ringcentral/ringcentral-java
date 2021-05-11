package com.ringcentral.paths.restapi.account.pagingonlygroups;

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
            return parent.path() + "/paging-only-groups";
        }


    public com.ringcentral.paths.restapi.account.pagingonlygroups.users.Index users()
  {
    return new com.ringcentral.paths.restapi.account.pagingonlygroups.users.Index(this);
  }


    public com.ringcentral.paths.restapi.account.pagingonlygroups.devices.Index devices()
  {
    return new com.ringcentral.paths.restapi.account.pagingonlygroups.devices.Index(this);
  }


    public com.ringcentral.paths.restapi.account.pagingonlygroups.bulkassign.Index bulkAssign()
  {
    return new com.ringcentral.paths.restapi.account.pagingonlygroups.bulkassign.Index(this);
  }

}