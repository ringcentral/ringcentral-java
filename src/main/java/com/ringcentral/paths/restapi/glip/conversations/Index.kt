package com.ringcentral.paths.restapi.glip.conversations

class Index(val parent: com.ringcentral.paths.restapi.glip.Index, val chatId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && chatId != null) {
            return "${parent.path()}/conversations/${chatId}"
        }

        return "${parent.path()}/conversations"
    }

    /**
     * Operation: Get Conversations
     * Http Get /restapi/v1.0/glip/conversations
     */
    @JvmOverloads
    fun list(queryParams: com.ringcentral.definitions.ListGlipConversationsParameters? = null): com.ringcentral.definitions.GlipConversationsList? {
        val rb: okhttp3.ResponseBody = rc.get(this.path(false), queryParams)

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.GlipConversationsList::class.java)

    }


    /**
     * Operation: Create/Open Conversation
     * Http Post /restapi/v1.0/glip/conversations
     */
    fun post(createGlipConversationRequest: com.ringcentral.definitions.CreateGlipConversationRequest): com.ringcentral.definitions.GlipConversationInfo? {
        val rb: okhttp3.ResponseBody = rc.post(this.path(false), createGlipConversationRequest)

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.GlipConversationInfo::class.java)

    }


    /**
     * Operation: Get Conversation
     * Http Get /restapi/v1.0/glip/conversations/{chatId}
     */
    fun get(): com.ringcentral.definitions.GlipConversationInfo? {
        if (this.chatId == null) {
            throw NullPointerException("chatId")
        }

        val rb: okhttp3.ResponseBody = rc.get(this.path())

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.GlipConversationInfo::class.java)

    }

}
