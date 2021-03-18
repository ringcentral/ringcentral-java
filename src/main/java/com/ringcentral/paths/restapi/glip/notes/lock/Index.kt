package com.ringcentral.paths.restapi.glip.notes.lock

class Index(val parent: com.ringcentral.paths.restapi.glip.notes.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/lock"
    }

    /**
     * Operation: Lock Note
     * Http Post /restapi/v1.0/glip/notes/{noteId}/lock
     */
    @Throws(com.ringcentral.RestException::class, java.io.IOException::class)
    fun post(): String? {
        val rb: okhttp3.ResponseBody = rc.post(this.path())

        return rb.string()

    }

}
