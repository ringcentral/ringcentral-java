package com.ringcentral.paths.restapi.subscription.renew

class Index(val parent: com.ringcentral.paths.restapi.subscription.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/renew"
    }

    /**
     * Operation: Renew Subscription
     * Http Post /restapi/v1.0/subscription/{subscriptionId}/renew
     */
    fun post(): com.ringcentral.definitions.SubscriptionInfo? {
        val rb: okhttp3.ResponseBody = rc.post(this.path())

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.SubscriptionInfo::class.java)

    }

}
