package com.ringcentral.paths.restapi.glip.groups.webhooks

class Index(val parent: com.ringcentral.paths.restapi.glip.groups.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/webhooks"
    }

    /**
     * Operation: Get Webhooks in Group
     * Http Get /restapi/v1.0/glip/groups/{groupId}/webhooks
     */
    @Throws(com.ringcentral.RestException::class, java.io.IOException::class)
    fun get(): com.ringcentral.definitions.GlipWebhookList? {
        val rb: okhttp3.ResponseBody = rc.get(this.path())

        return com.ringcentral.Utils.gson.fromJson(rb.string(), com.ringcentral.definitions.GlipWebhookList::class.java)

    }


    /**
     * Operation: Create Webhook in Group
     * Http Post /restapi/v1.0/glip/groups/{groupId}/webhooks
     */
    @Throws(com.ringcentral.RestException::class, java.io.IOException::class)
    fun post(): com.ringcentral.definitions.GlipWebhookInfo? {
        val rb: okhttp3.ResponseBody = rc.post(this.path())

        return com.ringcentral.Utils.gson.fromJson(rb.string(), com.ringcentral.definitions.GlipWebhookInfo::class.java)

    }

}
