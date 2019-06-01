package com.ringcentral.paths.restapi.status

class Index(val parent: com.ringcentral.paths.restapi.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/status"
    }

    /**
     * Operation: Get Service Status
     * Http Get /restapi/v1.0/status
     */
    fun get(): String? {
        val rb: okhttp3.ResponseBody = rc.get(this.path())

        return rb.string()

    }

}
