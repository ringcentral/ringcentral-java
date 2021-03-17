package com.ringcentral.paths.restapi.account.device

class Index(val parent: com.ringcentral.paths.restapi.account.Index, val deviceId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && deviceId != null) {
            return "${parent.path()}/device/${deviceId}"
        }

        return "${parent.path()}/device"
    }

    /**
     * Operation: Get Device
     * Http Get /restapi/v1.0/account/{accountId}/device/{deviceId}
     */
    @JvmOverloads
    fun get(queryParams: com.ringcentral.definitions.ReadDeviceParameters? = null): com.ringcentral.definitions.GetDeviceInfoResponse? {
        if (this.deviceId == null) {
            throw NullPointerException("deviceId");
        }

        val rb: okhttp3.ResponseBody = rc.get(this.path(), queryParams)

        return com.ringcentral.Utils.gson.fromJson(
            rb.string(),
            com.ringcentral.definitions.GetDeviceInfoResponse::class.java
        )

    }


    /**
     * Operation: Update Device
     * Http Put /restapi/v1.0/account/{accountId}/device/{deviceId}
     */
    @JvmOverloads
    fun put(
        accountDeviceUpdate: com.ringcentral.definitions.AccountDeviceUpdate,
        queryParams: com.ringcentral.definitions.UpdateDeviceParameters? = null
    ): com.ringcentral.definitions.GetDeviceInfoResponse? {
        if (this.deviceId == null) {
            throw NullPointerException("deviceId");
        }

        val rb: okhttp3.ResponseBody = rc.put(this.path(), accountDeviceUpdate, queryParams)

        return com.ringcentral.Utils.gson.fromJson(
            rb.string(),
            com.ringcentral.definitions.GetDeviceInfoResponse::class.java
        )

    }

}
