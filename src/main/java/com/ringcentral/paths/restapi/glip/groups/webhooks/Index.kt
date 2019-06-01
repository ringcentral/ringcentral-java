package com.ringcentral.paths.restapi.glip.groups.webhooks

class Index(val parent: com.ringcentral.paths.restapi.glip.groups.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/webhooks"
    }

    /**
     * Operation: Create Webhook in Group
     * Http Post /restapi/v1.0/glip/groups/{groupId}/webhooks
     */
    fun post(): com.ringcentral.definitions.GlipWebhookInfo? {
        val rb: okhttp3.ResponseBody = rc.post(this.path())

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.GlipWebhookInfo::class.java)

    }


    /**
     * Operation: Get Webhooks in Group
     * Http Get /restapi/v1.0/glip/groups/{groupId}/webhooks
     */
    fun get(): com.ringcentral.definitions.GlipWebhookList? {
        val rb: okhttp3.ResponseBody = rc.get(this.path())

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.GlipWebhookList::class.java)

    }

}
