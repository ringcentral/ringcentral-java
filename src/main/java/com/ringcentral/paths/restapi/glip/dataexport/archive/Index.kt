package com.ringcentral.paths.restapi.glip.dataexport.archive

class Index(val parent: com.ringcentral.paths.restapi.glip.dataexport.Index, val archiveId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && archiveId != null) {
            return "${parent.path()}/archive/${archiveId}"
        }

        return "${parent.path()}/archive"
    }

    /**
     * Operation: Get Glip Data Archive
     * Http Get /restapi/v1.0/glip/data-export/{taskId}/archive/{archiveId}
     */
    fun get(): String? {
        if (this.archiveId == null) {
            throw NullPointerException("archiveId")
        }

        val rb: okhttp3.ResponseBody = rc.get(this.path())

        return rb.string()

    }

}
