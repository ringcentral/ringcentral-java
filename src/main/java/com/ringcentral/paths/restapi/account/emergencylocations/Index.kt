package com.ringcentral.paths.restapi.account.emergencylocations

class Index(val parent: com.ringcentral.paths.restapi.account.Index, val locationId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && locationId != null) {
            return "${parent.path()}/emergency-locations/${locationId}"
        }

        return "${parent.path()}/emergency-locations"
    }

    /**
     * Operation: Get Emergency Location List
     * Http Get /restapi/v1.0/account/{accountId}/emergency-locations
     */
    @Throws(com.ringcentral.RestException::class, java.io.IOException::class)
    @JvmOverloads
    fun list(queryParams: com.ringcentral.definitions.ListEmergencyLocationsParameters? = null): com.ringcentral.definitions.EmergencyLocationList? {
        val rb: okhttp3.ResponseBody = rc.get(this.path(false), queryParams)

        return com.ringcentral.Utils.gson.fromJson(
            rb.string(),
            com.ringcentral.definitions.EmergencyLocationList::class.java
        )

    }


    /**
     * Operation: Add Emergency Location
     * Http Post /restapi/v1.0/account/{accountId}/emergency-locations
     */
    @Throws(com.ringcentral.RestException::class, java.io.IOException::class)
    fun post(emergencyLocationInfoRequest: com.ringcentral.definitions.EmergencyLocationInfoRequest): String? {
        val rb: okhttp3.ResponseBody = rc.post(this.path(false), emergencyLocationInfoRequest)

        return rb.string()

    }


    /**
     * Operation: Get Emergency Location
     * Http Get /restapi/v1.0/account/{accountId}/emergency-locations/{locationId}
     */
    @Throws(com.ringcentral.RestException::class, java.io.IOException::class)
    fun get(): com.ringcentral.definitions.EmergencyLocationInfo? {
        if (this.locationId == null) {
            throw NullPointerException("locationId");
        }

        val rb: okhttp3.ResponseBody = rc.get(this.path())

        return com.ringcentral.Utils.gson.fromJson(
            rb.string(),
            com.ringcentral.definitions.EmergencyLocationInfo::class.java
        )

    }


    /**
     * Operation: Update Emergency Location
     * Http Put /restapi/v1.0/account/{accountId}/emergency-locations/{locationId}
     */
    @Throws(com.ringcentral.RestException::class, java.io.IOException::class)
    fun put(emergencyLocationInfoRequest: com.ringcentral.definitions.EmergencyLocationInfoRequest): com.ringcentral.definitions.EmergencyLocationInfo? {
        if (this.locationId == null) {
            throw NullPointerException("locationId");
        }

        val rb: okhttp3.ResponseBody = rc.put(this.path(), emergencyLocationInfoRequest)

        return com.ringcentral.Utils.gson.fromJson(
            rb.string(),
            com.ringcentral.definitions.EmergencyLocationInfo::class.java
        )

    }


    /**
     * Operation: Delete Emergency Location
     * Http Delete /restapi/v1.0/account/{accountId}/emergency-locations/{locationId}
     */
    @Throws(com.ringcentral.RestException::class, java.io.IOException::class)
    @JvmOverloads
    fun delete(queryParams: com.ringcentral.definitions.DeleteEmergencyLocationParameters? = null): String? {
        if (this.locationId == null) {
            throw NullPointerException("locationId");
        }

        val rb: okhttp3.ResponseBody = rc.delete(this.path(), queryParams)

        return rb.string()

    }

}
