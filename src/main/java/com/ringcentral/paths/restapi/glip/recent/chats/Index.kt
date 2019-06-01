package com.ringcentral.paths.restapi.glip.recent.chats

class Index(val parent: com.ringcentral.paths.restapi.glip.recent.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/chats"
    }

    /**
     * Operation: Get Recent Chats
     * Http Get /restapi/v1.0/glip/recent/chats
     */
    @JvmOverloads
    fun get(queryParams: com.ringcentral.definitions.ListRecentChatsParameters? = null): com.ringcentral.definitions.GlipChatsListWithoutNavigation? {
        val rb: okhttp3.ResponseBody = rc.get(this.path(), queryParams)

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.GlipChatsListWithoutNavigation::class.java)

    }

}
