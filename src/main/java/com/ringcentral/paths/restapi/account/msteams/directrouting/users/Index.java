package com.ringcentral.paths.restapi.account.msteams.directrouting.users;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.restapi.account.msteams.directrouting.Index parent;
public Index(com.ringcentral.paths.restapi.account.msteams.directrouting.Index parent)
      {
this.parent = parent;
this.rc = parent.rc;
    }
    public String path()
        {
            return parent.path() + "/users";
        }
        public String path(Boolean withParameter)
        {
            return path();
        }
        
        /**
         * Returns the list of Microsoft Teams Direct Routing users and their connection status with the integration,
 * filtered by provided RingCentral extension IDs (up to 25 users at a time).
 * 
 * Before using this API, the account-level setup for Direct Routing must be completed as described in
 * [this guide](https://support.ringcentral.com/article-v2/Enabling-direct-routing-in-RingCentral-and-Microsoft-Teams.html?brand=RingCentral&amp;product=RingEX&amp;language=en_US).
 * 
         * HTTP Method: get
         * Endpoint: /restapi/{apiVersion}/account/{accountId}/ms-teams/direct-routing/users
         * Rate Limit Group: Medium
         * App Permission: ReadAccounts
         */
  public MsTeamsUserListResponse get(ListTeamsUsersParameters queryParams) throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), MsTeamsUserListResponse.class);
    }
    public MsTeamsUserListResponse get() throws com.ringcentral.RestException, java.io.IOException
    {
      return this.get(null);
    }

        /**
         * Connects Microsoft Teams Direct Routing users in bulk asynchronously (up to 25 users at a time).
 * 
 * Before using this API, the account-level setup for Direct Routing must be completed as described in
 * [this guide](https://support.ringcentral.com/article-v2/Enabling-direct-routing-in-RingCentral-and-Microsoft-Teams.html?brand=RingCentral&amp;product=RingEX&amp;language=en_US).
 * 
         * HTTP Method: post
         * Endpoint: /restapi/{apiVersion}/account/{accountId}/ms-teams/direct-routing/users
         * Rate Limit Group: Medium
         * App Permission: EditAccounts
         */
  public MsTeamsUserListResponse post(ConnectTeamsUsersRequest connectTeamsUsersRequest) throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.post(this.path(), connectTeamsUsersRequest, null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), MsTeamsUserListResponse.class);
    }

        /**
         * Disconnects Microsoft Teams Direct Routing users in bulk asynchronously  (up to 25 users at a time).
 * 
 * Before using this API, the account-level setup for Direct Routing must be completed as described in
 * [this guide](https://support.ringcentral.com/article-v2/Enabling-direct-routing-in-RingCentral-and-Microsoft-Teams.html?brand=RingCentral&amp;product=RingEX&amp;language=en_US).
 * 
         * HTTP Method: delete
         * Endpoint: /restapi/{apiVersion}/account/{accountId}/ms-teams/direct-routing/users
         * Rate Limit Group: Medium
         * App Permission: EditAccounts
         */
  public String delete(DisconnectTeamsUsersParameters queryParams) throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.delete(this.path(), queryParams);
    return rb.string();
    }
    public String delete() throws com.ringcentral.RestException, java.io.IOException
    {
      return this.delete(null);
    }
}