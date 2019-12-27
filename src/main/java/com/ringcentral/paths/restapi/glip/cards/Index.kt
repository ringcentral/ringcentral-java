package com.ringcentral.paths.restapi.glip.cards

class Index(val parent: com.ringcentral.paths.restapi.glip.Index, val cardId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && cardId != null) {
            return "${parent.path()}/cards/${cardId}"
        }

        return "${parent.path()}/cards"
    }

    /**
     * Operation: Create Card
     * Http Post /restapi/v1.0/glip/cards
     */
    @JvmOverloads
    fun post(glipMessageAttachmentInfoRequest: com.ringcentral.definitions.GlipMessageAttachmentInfoRequest, queryParams: com.ringcentral.definitions.CreateGlipCardParameters? = null): com.ringcentral.definitions.GlipMessageAttachmentInfo? {
        val rb: okhttp3.ResponseBody = rc.post(this.path(false), glipMessageAttachmentInfoRequest, queryParams)

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.GlipMessageAttachmentInfo::class.java)

    }


    /**
     * Operation: Get Card
     * Http Get /restapi/v1.0/glip/cards/{cardId}
     */
    fun get(): com.ringcentral.definitions.GlipMessageAttachmentInfo? {
        if (this.cardId == null) {
            throw NullPointerException("cardId")
        }

        val rb: okhttp3.ResponseBody = rc.get(this.path())

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.GlipMessageAttachmentInfo::class.java)

    }


    /**
     * Operation: Update Card
     * Http Put /restapi/v1.0/glip/cards/{cardId}
     */
    fun put(glipMessageAttachmentInfoRequest: com.ringcentral.definitions.GlipMessageAttachmentInfoRequest): String? {
        if (this.cardId == null) {
            throw NullPointerException("cardId")
        }

        val rb: okhttp3.ResponseBody = rc.put(this.path(), glipMessageAttachmentInfoRequest)

        return rb.string()

    }


    /**
     * Operation: Delete Card
     * Http Delete /restapi/v1.0/glip/cards/{cardId}
     */
    fun delete(): String? {
        if (this.cardId == null) {
            throw NullPointerException("cardId")
        }

        val rb: okhttp3.ResponseBody = rc.delete(this.path())

        return rb.string()

    }

}
