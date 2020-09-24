package com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.devices.bulkassign

class Index(val parent: com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.devices.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/bulk-assign"
    }

    /**
     * Operation: Enable Automatic Location Updates for Devices
     * Http Post /restapi/v1.0/account/{accountId}/emergency-address-auto-update/devices/bulk-assign
     */
    fun post(assignMultipleDevicesAutomaticLocationUpdates: com.ringcentral.definitions.AssignMultipleDevicesAutomaticLocationUpdates): String? {
        val rb: okhttp3.ResponseBody = rc.post(this.path(), assignMultipleDevicesAutomaticLocationUpdates)

        return rb.string()

    }

}
