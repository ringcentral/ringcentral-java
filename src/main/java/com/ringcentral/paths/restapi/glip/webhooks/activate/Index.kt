package com.ringcentral.paths.restapi.glip.webhooks.activate

class Index(val parent: com.ringcentral.paths.restapi.glip.webhooks.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/activate"
    }

    /**
     * Operation: Activate Webhook
     * Http Post /restapi/v1.0/glip/webhooks/{webhookId}/activate
     */
    fun post(): String? {
        val rb: okhttp3.ResponseBody = rc.post(this.path())

        return rb.string()

    }

}
