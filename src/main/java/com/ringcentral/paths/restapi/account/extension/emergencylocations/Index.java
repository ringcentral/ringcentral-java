package com.ringcentral.paths.restapi.account.extension.emergencylocations;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.extension.Index parent;
    public String locationId;

    public Index(com.ringcentral.paths.restapi.account.extension.Index parent, String locationId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.locationId = locationId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && locationId != null) {
            return parent.path() + "/emergency-locations/" + locationId;
        }
        return parent.path() + "/emergency-locations";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns a list of emergency response locations available for the current user extension.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/emergency-locations
     * Rate Limit Group: Light
     * App Permission: ReadAccounts
     */
    public EmergencyLocationsResource list(GetExtensionEmergencyLocationsParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(false), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), EmergencyLocationsResource.class);
    }

    public EmergencyLocationsResource list() throws com.ringcentral.RestException, java.io.IOException {
        return this.list(null);
    }

    /**
     * Creates a personal emergency response location for the current user.
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/emergency-locations
     * Rate Limit Group: Heavy
     * App Permission: EditAccounts
     * User Permission: EmergencyFramework
     */
    public EmergencyLocationInfo post(CreateUserEmergencyLocationRequest createUserEmergencyLocationRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(false), createUserEmergencyLocationRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), EmergencyLocationInfo.class);
    }

    /**
     * Returns personal emergency response location for the current user.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/emergency-locations/{locationId}
     * Rate Limit Group: Light
     * App Permission: ReadAccounts
     */
    public EmergencyLocationInfo get() throws com.ringcentral.RestException, java.io.IOException {
        if (locationId == null) {
            throw new IllegalArgumentException("Parameter locationId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), EmergencyLocationInfo.class);
    }

    /**
     * Updates a personal emergency response location by the current user or admin.
     * HTTP Method: put
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/emergency-locations/{locationId}
     * Rate Limit Group: Light
     * App Permission: EditAccounts
     * User Permission: EmergencyFramework
     */
    public EmergencyLocationInfo put(EmergencyLocationInfo emergencyLocationInfo) throws com.ringcentral.RestException, java.io.IOException {
        if (locationId == null) {
            throw new IllegalArgumentException("Parameter locationId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.put(this.path(), emergencyLocationInfo, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), EmergencyLocationInfo.class);
    }

    /**
     * Deletes a personal emergency response location by ID by the current user or admin. Multiple personal emergency response locations can be deleted by one API call
     * HTTP Method: delete
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/emergency-locations/{locationId}
     * Rate Limit Group: Heavy
     * App Permission: EditAccounts
     * User Permission: EmergencyFramework
     */
    public String delete(DeleteExtensionEmergencyLocationParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        if (locationId == null) {
            throw new IllegalArgumentException("Parameter locationId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.delete(this.path(), queryParams);
        return rb.string();
    }

    public String delete() throws com.ringcentral.RestException, java.io.IOException {
        return this.delete(null);
    }
}
