package com.ringcentral.paths.restapi.account.pagingonlygroups.devices;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.restapi.account.pagingonlygroups.Index parent;
public Index(com.ringcentral.paths.restapi.account.pagingonlygroups.Index parent)
      {
this.parent = parent;
this.rc = parent.rc;
    }
    public String path()
        {
            return parent.path() + "/devices";
        }
        /**
         * Returns a list of paging devices assigned to this group.
 * 
         * HTTP Method: get
         * Endpoint: /restapi/{apiVersion}/account/{accountId}/paging-only-groups/{pagingOnlyGroupId}/devices
         * Rate Limit Group: Light
         * App Permission: ReadAccounts
         * User Permission: ReadCompanyDevices
         */
  public PagingOnlyGroupDevices get(ListPagingGroupDevicesParameters queryParams) throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), PagingOnlyGroupDevices.class);
    }
    public PagingOnlyGroupDevices get() throws com.ringcentral.RestException, java.io.IOException
    {
      return this.get(null);
    }
}