package com.ringcentral.paths.restapi.glip.chats.unread

class Index(val parent: com.ringcentral.paths.restapi.glip.chats.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/unread"
    }

    /**
     * Operation: Mark Chat as Unread
     * Http Post /restapi/v1.0/glip/chats/{chatId}/unread
     */
    fun post(): String? {
        val rb: okhttp3.ResponseBody = rc.post(this.path())

        return rb.string()

    }

}
