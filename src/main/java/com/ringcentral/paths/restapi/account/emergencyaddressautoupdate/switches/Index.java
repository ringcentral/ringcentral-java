package com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.switches;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.Index parent;
public String switchId;
public Index(com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.Index parent, String switchId)
      {
this.parent = parent;
this.rc = parent.rc;
this.switchId = switchId;
    }
    public String path(Boolean withParameter)
        {
            if (withParameter && switchId != null)
            {
                return parent.path() + "/switches/" + switchId;
            }
            return parent.path() + "/switches";
        }
        public String path()
        {
          return path(true);
        }
        /**
         * Returns a corporate map of configured network switches with the assigned
 * emergency addresses for the logged-in account.
 * 
         * HTTP Method: get
         * Endpoint: /restapi/{apiVersion}/account/{accountId}/emergency-address-auto-update/switches
         * Rate Limit Group: Heavy
         * App Permission: EditAccounts
         * User Permission: ConfigureEmergencyMaps
         */
  public SwitchesList list(ListAccountSwitchesParameters queryParams) throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.get(this.path(false), queryParams);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), SwitchesList.class);
    }
    public SwitchesList list() throws com.ringcentral.RestException, java.io.IOException
    {
      return this.list(null);
    }

        /**
         * Creates a new switch in corporate map based on chassis ID and used
 * for Automatic Locations Update feature.
 * 
         * HTTP Method: post
         * Endpoint: /restapi/{apiVersion}/account/{accountId}/emergency-address-auto-update/switches
         * Rate Limit Group: Heavy
         * App Permission: EditAccounts
         * User Permission: ConfigureEmergencyMaps
         */
  public SwitchInfo post(CreateSwitchInfo createSwitchInfo) throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.post(this.path(false), createSwitchInfo, null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), SwitchInfo.class);
    }

        /**
         * Returns the specified switch with the assigned emergency address.
         * HTTP Method: get
         * Endpoint: /restapi/{apiVersion}/account/{accountId}/emergency-address-auto-update/switches/{switchId}
         * Rate Limit Group: Medium
         * App Permission: EditAccounts
         * User Permission: ConfigureEmergencyMaps
         */
  public SwitchInfo get() throws com.ringcentral.RestException, java.io.IOException
  {
    if (switchId == null)
    {
        throw new IllegalArgumentException("Parameter switchId cannot be null");
    }
    okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), SwitchInfo.class);
    }

        /**
         * Updates switch. Partial update is not supported, all switch parameters
 * should be specified. If null value is received or parameter is missing, its
 * value is removed.
 * 
         * HTTP Method: put
         * Endpoint: /restapi/{apiVersion}/account/{accountId}/emergency-address-auto-update/switches/{switchId}
         * Rate Limit Group: Heavy
         * App Permission: EditAccounts
         * User Permission: ConfigureEmergencyMaps
         */
  public SwitchInfo put(UpdateSwitchInfo updateSwitchInfo) throws com.ringcentral.RestException, java.io.IOException
  {
    if (switchId == null)
    {
        throw new IllegalArgumentException("Parameter switchId cannot be null");
    }
    okhttp3.ResponseBody rb = this.rc.put(this.path(), updateSwitchInfo, null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), SwitchInfo.class);
    }

        /**
         * Deletes wireless switch(es) in a network configuration for Automatic
 * Location Updates feature.
 * 
         * HTTP Method: delete
         * Endpoint: /restapi/{apiVersion}/account/{accountId}/emergency-address-auto-update/switches/{switchId}
         * Rate Limit Group: Heavy
         * App Permission: EditAccounts
         * User Permission: ConfigureEmergencyMaps
         */
  public String delete() throws com.ringcentral.RestException, java.io.IOException
  {
    if (switchId == null)
    {
        throw new IllegalArgumentException("Parameter switchId cannot be null");
    }
    okhttp3.ResponseBody rb = this.rc.delete(this.path(), null);
    return rb.string();
    }
}