package com.ringcentral.paths.restapi.account.callmonitoringgroups.members;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.restapi.account.callmonitoringgroups.Index parent;
public Index(com.ringcentral.paths.restapi.account.callmonitoringgroups.Index parent)
      {
this.parent = parent;
this.rc = parent.rc;
    }
    public String path()
        {
            return parent.path() + "/members";
        }
        /**
         * Returns call monitoring group members.
         * HTTP Method: get
         * Endpoint: /restapi/{apiVersion}/account/{accountId}/call-monitoring-groups/{groupId}/members
         * Rate Limit Group: Medium
         * App Permission: ReadAccounts
         * User Permission: ReadExtensions
         */
  public CallMonitoringGroupMemberList get(ListCallMonitoringGroupMembersParameters queryParams) throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), CallMonitoringGroupMemberList.class);
    }
    public CallMonitoringGroupMemberList get() throws com.ringcentral.RestException, java.io.IOException
    {
      return this.get(null);
    }
}