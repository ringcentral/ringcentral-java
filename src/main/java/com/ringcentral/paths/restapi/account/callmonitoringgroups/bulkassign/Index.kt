package com.ringcentral.paths.restapi.account.callmonitoringgroups.bulkassign

class Index(val parent: com.ringcentral.paths.restapi.account.callmonitoringgroups.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/bulk-assign"
    }

    /**
     * Operation: Update Call Monitoring Group List
     * Http Post /restapi/v1.0/account/{accountId}/call-monitoring-groups/{groupId}/bulk-assign
     */
    fun post(callMonitoringBulkAssign: com.ringcentral.definitions.CallMonitoringBulkAssign): String? {
        val rb: okhttp3.ResponseBody = rc.post(this.path(), callMonitoringBulkAssign)

        return rb.string()

    }

}
