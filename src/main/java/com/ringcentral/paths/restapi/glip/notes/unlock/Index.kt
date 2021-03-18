package com.ringcentral.paths.restapi.glip.notes.unlock

class Index(val parent: com.ringcentral.paths.restapi.glip.notes.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/unlock"
    }

    /**
     * Operation: Unlock Note
     * Http Post /restapi/v1.0/glip/notes/{noteId}/unlock
     */
    @Throws(com.ringcentral.RestException::class, java.io.IOException::class)
    fun post(): String? {
        val rb: okhttp3.ResponseBody = rc.post(this.path())

        return rb.string()

    }

}
