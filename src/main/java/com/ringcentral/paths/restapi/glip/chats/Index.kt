package com.ringcentral.paths.restapi.glip.chats

class Index(val parent: com.ringcentral.paths.restapi.glip.Index, val chatId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && chatId != null) {
            return "${parent.path()}/chats/${chatId}"
        }

        return "${parent.path()}/chats"
    }

    /**
     * Operation: Get Chats
     * Http Get /restapi/v1.0/glip/chats
     */
    @JvmOverloads
    fun list(queryParams: com.ringcentral.definitions.ListGlipChatsParameters? = null): com.ringcentral.definitions.GlipChatsList? {
        val rb: okhttp3.ResponseBody = rc.get(this.path(false), queryParams)

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.GlipChatsList::class.java)

    }


    /**
     * Operation: Get Chat
     * Http Get /restapi/v1.0/glip/chats/{chatId}
     */
    fun get(): com.ringcentral.definitions.GlipChatInfo? {
        if (this.chatId == null) {
            throw NullPointerException("chatId")
        }

        val rb: okhttp3.ResponseBody = rc.get(this.path())

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.GlipChatInfo::class.java)

    }


    fun favorite(): com.ringcentral.paths.restapi.glip.chats.favorite.Index {
        return com.ringcentral.paths.restapi.glip.chats.favorite.Index(this)
    }


    fun unfavorite(): com.ringcentral.paths.restapi.glip.chats.unfavorite.Index {
        return com.ringcentral.paths.restapi.glip.chats.unfavorite.Index(this)
    }


    fun read(): com.ringcentral.paths.restapi.glip.chats.read.Index {
        return com.ringcentral.paths.restapi.glip.chats.read.Index(this)
    }


    fun unread(): com.ringcentral.paths.restapi.glip.chats.unread.Index {
        return com.ringcentral.paths.restapi.glip.chats.unread.Index(this)
    }


    @JvmOverloads
    fun posts(postId: String? = null): com.ringcentral.paths.restapi.glip.chats.posts.Index {
        return com.ringcentral.paths.restapi.glip.chats.posts.Index(this, postId)
    }

}