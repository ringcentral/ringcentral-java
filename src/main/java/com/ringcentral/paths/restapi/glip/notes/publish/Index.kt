package com.ringcentral.paths.restapi.glip.notes.publish

class Index(val parent: com.ringcentral.paths.restapi.glip.notes.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/publish"
    }

    /**
     * Operation: Publish Note
     * Http Post /restapi/v1.0/glip/notes/{noteId}/publish
     */
    fun post(): String? {
        val rb: okhttp3.ResponseBody = rc.post(this.path())

        return rb.string()

    }

}
