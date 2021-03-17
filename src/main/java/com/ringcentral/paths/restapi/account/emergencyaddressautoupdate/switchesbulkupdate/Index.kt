package com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.switchesbulkupdate

class Index(val parent: com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/switches-bulk-update"
    }

    /**
     * Operation: Update Multiple Switches
     * Http Post /restapi/v1.0/account/{accountId}/emergency-address-auto-update/switches-bulk-update
     */
    fun post(updateMultipleSwitchesRequest: com.ringcentral.definitions.UpdateMultipleSwitchesRequest): com.ringcentral.definitions.UpdateMultipleSwitchesResponse? {
        val rb: okhttp3.ResponseBody = rc.post(this.path(), updateMultipleSwitchesRequest)

        return com.ringcentral.Utils.gson.fromJson(
            rb.string(),
            com.ringcentral.definitions.UpdateMultipleSwitchesResponse::class.java
        )

    }

}
