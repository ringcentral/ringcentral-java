package com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.wirelesspoints;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.Index parent;
    public String pointId;

    public Index(com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.Index parent, String pointId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.pointId = pointId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && pointId != null) {
            return parent.path() + "/wireless-points/" + pointId;
        }
        return parent.path() + "/wireless-points";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns account wireless points configured and used for Automatic Location Updates feature.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/emergency-address-auto-update/wireless-points
     * Rate Limit Group: Medium
     * App Permission: EditAccounts
     * User Permission: ConfigureEmergencyMaps
     */
    public WirelessPointsList list(ListWirelessPointsParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(false), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), WirelessPointsList.class);
    }

    public WirelessPointsList list() throws com.ringcentral.RestException, java.io.IOException {
        return this.list(null);
    }

    /**
     * Creates a new wireless point in network configuration with the emergency address assigned.
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/emergency-address-auto-update/wireless-points
     * Rate Limit Group: Heavy
     * App Permission: EditAccounts
     * User Permission: ConfigureEmergencyMaps
     */
    public WirelessPointInfo post(CreateWirelessPoint createWirelessPoint) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(false), createWirelessPoint, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), WirelessPointInfo.class);
    }

    /**
     * Returns the specified wireless access point of a corporate map with the emergency address assigned.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/emergency-address-auto-update/wireless-points/{pointId}
     * Rate Limit Group: Medium
     * App Permission: EditAccounts
     * User Permission: ConfigureEmergencyMaps
     */
    public WirelessPointInfo get() throws com.ringcentral.RestException, java.io.IOException {
        if (pointId == null) {
            throw new IllegalArgumentException("Parameter pointId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), WirelessPointInfo.class);
    }

    /**
     * Updates the specified wireless access point of a corporate map by ID.
     * HTTP Method: put
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/emergency-address-auto-update/wireless-points/{pointId}
     * Rate Limit Group: Heavy
     * App Permission: EditAccounts
     * User Permission: ConfigureEmergencyMaps
     */
    public WirelessPointInfo put(UpdateWirelessPoint updateWirelessPoint) throws com.ringcentral.RestException, java.io.IOException {
        if (pointId == null) {
            throw new IllegalArgumentException("Parameter pointId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.put(this.path(), updateWirelessPoint, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), WirelessPointInfo.class);
    }

    /**
     * Deletes wireless point(s) of a corporate map by ID(s).
     * HTTP Method: delete
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/emergency-address-auto-update/wireless-points/{pointId}
     * Rate Limit Group: Heavy
     * App Permission: EditAccounts
     * User Permission: ConfigureEmergencyMaps
     */
    public String delete() throws com.ringcentral.RestException, java.io.IOException {
        if (pointId == null) {
            throw new IllegalArgumentException("Parameter pointId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.delete(this.path(), null);
        return rb.string();
    }
}
