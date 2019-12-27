package com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.wirelesspointsbulkvalidate

class Index(val parent: com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/wireless-points-bulk-validate"
    }

    /**
     * Operation: Validate Multiple Wireless Points
     * Http Post /restapi/v1.0/account/{accountId}/emergency-address-auto-update/wireless-points-bulk-validate
     */
    fun post(validateMultipleWirelessPointsRequest: com.ringcentral.definitions.ValidateMultipleWirelessPointsRequest): com.ringcentral.definitions.ValidateMultipleWirelessPointsResponse? {
        val rb: okhttp3.ResponseBody = rc.post(this.path(), validateMultipleWirelessPointsRequest)

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.ValidateMultipleWirelessPointsResponse::class.java)

    }

}
