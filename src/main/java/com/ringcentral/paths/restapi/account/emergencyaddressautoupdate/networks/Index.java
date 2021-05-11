package com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.networks;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.CreateNetworkRequest;
import com.ringcentral.definitions.NetworkInfo;
import com.ringcentral.definitions.NetworksList;
import com.ringcentral.definitions.UpdateNetworkRequest;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.Index parent;
    public String networkId;

    public Index(com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.Index parent, String networkId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.networkId = networkId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && networkId != null) {
            return parent.path() + "/networks/" + networkId;
        }
        return parent.path() + "/networks";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns corporate networks map with emergency addresses assigned to the current account.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/emergency-address-auto-update/networks
     * Rate Limit Group: Heavy
     * App Permission: EditAccounts
     * User Permission: ConfigureEmergencyMaps
     */
    public NetworksList list() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(false), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), NetworksList.class);
    }

    /**
     * Creates a new network in corporate ethernet map for assignment of emergency addresses to network access points.
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/emergency-address-auto-update/networks
     * Rate Limit Group: Heavy
     * App Permission: EditAccounts
     * User Permission: ConfigureEmergencyMaps
     */
    public NetworkInfo post(CreateNetworkRequest createNetworkRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(false), createNetworkRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), NetworkInfo.class);
    }

    /**
     * Returns the specified network with emergency addresses assigned to the current account.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/emergency-address-auto-update/networks/{networkId}
     * Rate Limit Group: Medium
     * App Permission: EditAccounts
     * User Permission: ConfigureEmergencyMaps
     */
    public NetworkInfo get() throws com.ringcentral.RestException, java.io.IOException {
        if (networkId == null) {
            throw new IllegalArgumentException("Parameter networkId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), NetworkInfo.class);
    }

    /**
     * Updates network in corporate ethernet map for assignment of emergency addresses to network access points.
     * HTTP Method: put
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/emergency-address-auto-update/networks/{networkId}
     * Rate Limit Group: Heavy
     * App Permission: EditAccounts
     * User Permission: ConfigureEmergencyMaps
     */
    public String put(UpdateNetworkRequest updateNetworkRequest) throws com.ringcentral.RestException, java.io.IOException {
        if (networkId == null) {
            throw new IllegalArgumentException("Parameter networkId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.put(this.path(), updateNetworkRequest, null);
        return rb.string();
    }

    /**
     * Deletes network(s) in corporate ethernet map for Automatic Location Updates feature.
     * HTTP Method: delete
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/emergency-address-auto-update/networks/{networkId}
     * Rate Limit Group: Heavy
     * App Permission: EditAccounts
     * User Permission: ConfigureEmergencyMaps
     */
    public String delete() throws com.ringcentral.RestException, java.io.IOException {
        if (networkId == null) {
            throw new IllegalArgumentException("Parameter networkId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.delete(this.path(), null);
        return rb.string();
    }
}
