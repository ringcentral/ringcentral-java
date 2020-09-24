package com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.switchesbulkvalidate

class Index(val parent: com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/switches-bulk-validate"
    }

    /**
     * Operation: Validate Multiple Switches
     * Http Post /restapi/v1.0/account/{accountId}/emergency-address-auto-update/switches-bulk-validate
     */
    fun post(validateMultipleSwitchesRequest: com.ringcentral.definitions.ValidateMultipleSwitchesRequest): com.ringcentral.definitions.ValidateMultipleSwitchesResponse? {
        val rb: okhttp3.ResponseBody = rc.post(this.path(), validateMultipleSwitchesRequest)

        return com.ringcentral.Utils.gson.fromJson(rb.string(), com.ringcentral.definitions.ValidateMultipleSwitchesResponse::class.java)

    }

}
