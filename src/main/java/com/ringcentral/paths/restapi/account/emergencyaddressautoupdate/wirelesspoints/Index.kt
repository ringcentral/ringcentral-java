package com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.wirelesspoints

class Index(
    val parent: com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.Index,
    val pointId: String? = null
) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && pointId != null) {
            return "${parent.path()}/wireless-points/${pointId}"
        }

        return "${parent.path()}/wireless-points"
    }

    /**
     * Operation: Get Wireless Point List
     * Http Get /restapi/v1.0/account/{accountId}/emergency-address-auto-update/wireless-points
     */
    @JvmOverloads
    fun list(queryParams: com.ringcentral.definitions.ListWirelessPointsParameters? = null): com.ringcentral.definitions.WirelessPointsList? {
        val rb: okhttp3.ResponseBody = rc.get(this.path(false), queryParams)

        return com.ringcentral.Utils.gson.fromJson(
            rb.string(),
            com.ringcentral.definitions.WirelessPointsList::class.java
        )

    }


    /**
     * Operation: Create Wireless Point
     * Http Post /restapi/v1.0/account/{accountId}/emergency-address-auto-update/wireless-points
     */
    fun post(createWirelessPoint: com.ringcentral.definitions.CreateWirelessPoint): com.ringcentral.definitions.WirelessPointInfo? {
        val rb: okhttp3.ResponseBody = rc.post(this.path(false), createWirelessPoint)

        return com.ringcentral.Utils.gson.fromJson(
            rb.string(),
            com.ringcentral.definitions.WirelessPointInfo::class.java
        )

    }


    /**
     * Operation: Get Wireless Point
     * Http Get /restapi/v1.0/account/{accountId}/emergency-address-auto-update/wireless-points/{pointId}
     */
    fun get(): com.ringcentral.definitions.WirelessPointInfo? {
        if (this.pointId == null) {
            throw NullPointerException("pointId");
        }

        val rb: okhttp3.ResponseBody = rc.get(this.path())

        return com.ringcentral.Utils.gson.fromJson(
            rb.string(),
            com.ringcentral.definitions.WirelessPointInfo::class.java
        )

    }


    /**
     * Operation: Update Wireless Point
     * Http Put /restapi/v1.0/account/{accountId}/emergency-address-auto-update/wireless-points/{pointId}
     */
    fun put(updateWirelessPoint: com.ringcentral.definitions.UpdateWirelessPoint): com.ringcentral.definitions.WirelessPointInfo? {
        if (this.pointId == null) {
            throw NullPointerException("pointId");
        }

        val rb: okhttp3.ResponseBody = rc.put(this.path(), updateWirelessPoint)

        return com.ringcentral.Utils.gson.fromJson(
            rb.string(),
            com.ringcentral.definitions.WirelessPointInfo::class.java
        )

    }


    /**
     * Operation: Delete Wireless Point
     * Http Delete /restapi/v1.0/account/{accountId}/emergency-address-auto-update/wireless-points/{pointId}
     */
    fun delete(): String? {
        if (this.pointId == null) {
            throw NullPointerException("pointId");
        }

        val rb: okhttp3.ResponseBody = rc.delete(this.path())

        return rb.string()

    }

}
