package com.ringcentral.paths.restapi.subscription

class Index(val parent: com.ringcentral.paths.restapi.Index, val subscriptionId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && subscriptionId != null) {
            return "${parent.path()}/subscription/${subscriptionId}"
        }

        return "${parent.path()}/subscription"
    }

    /**
     * Operation: Get Subscriptions
     * Http Get /restapi/v1.0/subscription
     */
    fun list(): com.ringcentral.definitions.RecordsCollectionResourceSubscriptionResponse? {
        val rb: okhttp3.ResponseBody = rc.get(this.path(false))

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.RecordsCollectionResourceSubscriptionResponse::class.java)

    }


    /**
     * Operation: Create Subscription
     * Http Post /restapi/v1.0/subscription
     */
    fun post(createSubscriptionRequest: com.ringcentral.definitions.CreateSubscriptionRequest): com.ringcentral.definitions.SubscriptionInfo? {
        val rb: okhttp3.ResponseBody = rc.post(this.path(false), createSubscriptionRequest)

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.SubscriptionInfo::class.java)

    }


    /**
     * Operation: Get Subscription
     * Http Get /restapi/v1.0/subscription/{subscriptionId}
     */
    fun get(): com.ringcentral.definitions.SubscriptionInfo? {
        if (this.subscriptionId == null) {
            throw NullPointerException("subscriptionId")
        }

        val rb: okhttp3.ResponseBody = rc.get(this.path())

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.SubscriptionInfo::class.java)

    }


    /**
     * Operation: Renew Subscription / Update Event Filters
     * Http Put /restapi/v1.0/subscription/{subscriptionId}
     */
    @JvmOverloads
    fun put(modifySubscriptionRequest: com.ringcentral.definitions.ModifySubscriptionRequest, queryParams: com.ringcentral.definitions.UpdateSubscriptionParameters? = null): com.ringcentral.definitions.SubscriptionInfo? {
        if (this.subscriptionId == null) {
            throw NullPointerException("subscriptionId")
        }

        val rb: okhttp3.ResponseBody = rc.put(this.path(), modifySubscriptionRequest, queryParams)

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.SubscriptionInfo::class.java)

    }


    /**
     * Operation: Cancel Subscription
     * Http Delete /restapi/v1.0/subscription/{subscriptionId}
     */
    fun delete(): String? {
        if (this.subscriptionId == null) {
            throw NullPointerException("subscriptionId")
        }

        val rb: okhttp3.ResponseBody = rc.delete(this.path())

        return rb.string()

    }


    fun renew(): com.ringcentral.paths.restapi.subscription.renew.Index {
        return com.ringcentral.paths.restapi.subscription.renew.Index(this)
    }

}