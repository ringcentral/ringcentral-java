package com.ringcentral.paths.scim.health

class Index(val parent: com.ringcentral.paths.scim.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/health"
    }

    /**
     * Operation: check health
     * Http Get /scim/v2/health
     */
    fun get(): String? {
        val rb: okhttp3.ResponseBody = rc.get(this.path())

        return rb.string()

    }

}
