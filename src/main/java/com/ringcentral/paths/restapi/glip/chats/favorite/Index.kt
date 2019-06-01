package com.ringcentral.paths.restapi.glip.chats.favorite

class Index(val parent: com.ringcentral.paths.restapi.glip.chats.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/favorite"
    }

    /**
     * Operation: Add Chat to Favorites
     * Http Post /restapi/v1.0/glip/chats/{chatId}/favorite
     */
    fun post(): String? {
        val rb: okhttp3.ResponseBody = rc.post(this.path())

        return rb.string()

    }

}
