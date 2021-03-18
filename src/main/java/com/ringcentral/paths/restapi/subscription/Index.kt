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
     * Operation: Get Subscription List
     * Http Get /restapi/v1.0/subscription
     */
    @Throws(com.ringcentral.RestException::class, java.io.IOException::class)
    fun list(): com.ringcentral.definitions.RecordsCollectionResourceSubscriptionResponse? {
        val rb: okhttp3.ResponseBody = rc.get(this.path(false))

        return com.ringcentral.Utils.gson.fromJson(
            rb.string(),
            com.ringcentral.definitions.RecordsCollectionResourceSubscriptionResponse::class.java
        )

    }


    /**
     * Operation: Create Subscription
     * Http Post /restapi/v1.0/subscription
     */
    @Throws(com.ringcentral.RestException::class, java.io.IOException::class)
    fun post(createSubscriptionRequest: com.ringcentral.definitions.CreateSubscriptionRequest): com.ringcentral.definitions.SubscriptionInfo? {
        val rb: okhttp3.ResponseBody = rc.post(this.path(false), createSubscriptionRequest)

        return com.ringcentral.Utils.gson.fromJson(
            rb.string(),
            com.ringcentral.definitions.SubscriptionInfo::class.java
        )

    }


    /**
     * Operation: Get Subscription
     * Http Get /restapi/v1.0/subscription/{subscriptionId}
     */
    @Throws(com.ringcentral.RestException::class, java.io.IOException::class)
    fun get(): com.ringcentral.definitions.SubscriptionInfo? {
        if (this.subscriptionId == null) {
            throw NullPointerException("subscriptionId");
        }

        val rb: okhttp3.ResponseBody = rc.get(this.path())

        return com.ringcentral.Utils.gson.fromJson(
            rb.string(),
            com.ringcentral.definitions.SubscriptionInfo::class.java
        )

    }


    /**
     * Operation: Update Subscription
     * Http Put /restapi/v1.0/subscription/{subscriptionId}
     */
    @Throws(com.ringcentral.RestException::class, java.io.IOException::class)
    fun put(modifySubscriptionRequest: com.ringcentral.definitions.ModifySubscriptionRequest): com.ringcentral.definitions.SubscriptionInfo? {
        if (this.subscriptionId == null) {
            throw NullPointerException("subscriptionId");
        }

        val rb: okhttp3.ResponseBody = rc.put(this.path(), modifySubscriptionRequest)

        return com.ringcentral.Utils.gson.fromJson(
            rb.string(),
            com.ringcentral.definitions.SubscriptionInfo::class.java
        )

    }


    /**
     * Operation: Cancel Subscription
     * Http Delete /restapi/v1.0/subscription/{subscriptionId}
     */
    @Throws(com.ringcentral.RestException::class, java.io.IOException::class)
    fun delete(): String? {
        if (this.subscriptionId == null) {
            throw NullPointerException("subscriptionId");
        }

        val rb: okhttp3.ResponseBody = rc.delete(this.path())

        return rb.string()

    }


    fun renew(): com.ringcentral.paths.restapi.subscription.renew.Index {
        return com.ringcentral.paths.restapi.subscription.renew.Index(this)
    }

}
