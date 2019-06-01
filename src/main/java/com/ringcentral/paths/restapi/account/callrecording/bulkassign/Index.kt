package com.ringcentral.paths.restapi.account.callrecording.bulkassign

class Index(val parent: com.ringcentral.paths.restapi.account.callrecording.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/bulk-assign"
    }

    /**
     * Operation: Update Call Recording Extension List
     * Http Post /restapi/v1.0/account/{accountId}/call-recording/bulk-assign
     */
    fun post(bulkAccountCallRecordingsResource: com.ringcentral.definitions.BulkAccountCallRecordingsResource): String? {
        val rb: okhttp3.ResponseBody = rc.post(this.path(), bulkAccountCallRecordingsResource)

        return rb.string()

    }

}
