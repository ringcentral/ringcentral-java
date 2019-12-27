package com.ringcentral.paths.restapi.glip.webhooks.suspend

class Index(val parent: com.ringcentral.paths.restapi.glip.webhooks.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/suspend"
    }

    /**
     * Operation: Suspend Webhook
     * Http Post /restapi/v1.0/glip/webhooks/{webhookId}/suspend
     */
    fun post(): String? {
        val rb: okhttp3.ResponseBody = rc.post(this.path())

        return rb.string()

    }

}
