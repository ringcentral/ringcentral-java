package com.ringcentral.paths.restapi.glip.webhooks

class Index(val parent: com.ringcentral.paths.restapi.glip.Index, val webhookId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && webhookId != null) {
            return "${parent.path()}/webhooks/${webhookId}"
        }

        return "${parent.path()}/webhooks"
    }

    /**
     * Operation: Get Webhooks
     * Http Get /restapi/v1.0/glip/webhooks
     */
    fun list(): com.ringcentral.definitions.GlipWebhookList? {
        val rb: okhttp3.ResponseBody = rc.get(this.path(false))

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.GlipWebhookList::class.java)

    }


    /**
     * Operation: Get Webhook
     * Http Get /restapi/v1.0/glip/webhooks/{webhookId}
     */
    fun get(): com.ringcentral.definitions.GlipWebhookList? {
        if (this.webhookId == null) {
            throw NullPointerException("webhookId")
        }

        val rb: okhttp3.ResponseBody = rc.get(this.path())

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.GlipWebhookList::class.java)

    }


    /**
     * Operation: Delete Webhook
     * Http Delete /restapi/v1.0/glip/webhooks/{webhookId}
     */
    fun delete(): String? {
        if (this.webhookId == null) {
            throw NullPointerException("webhookId")
        }

        val rb: okhttp3.ResponseBody = rc.delete(this.path())

        return rb.string()

    }


    fun activate(): com.ringcentral.paths.restapi.glip.webhooks.activate.Index {
        return com.ringcentral.paths.restapi.glip.webhooks.activate.Index(this)
    }


    fun suspend(): com.ringcentral.paths.restapi.glip.webhooks.suspend.Index {
        return com.ringcentral.paths.restapi.glip.webhooks.suspend.Index(this)
    }

}