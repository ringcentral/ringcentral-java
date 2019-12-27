package com.ringcentral.paths.restapi.account.extension.callerblocking.phonenumbers

class Index(val parent: com.ringcentral.paths.restapi.account.extension.callerblocking.Index, val blockedNumberId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && blockedNumberId != null) {
            return "${parent.path()}/phone-numbers/${blockedNumberId}"
        }

        return "${parent.path()}/phone-numbers"
    }

    /**
     * Operation: Get Blocked/Allowed Phone Numbers
     * Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/caller-blocking/phone-numbers
     */
    @JvmOverloads
    fun list(queryParams: com.ringcentral.definitions.ListBlockedAllowedNumbersParameters? = null): com.ringcentral.definitions.BlockedAllowedPhoneNumbersList? {
        val rb: okhttp3.ResponseBody = rc.get(this.path(false), queryParams)

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.BlockedAllowedPhoneNumbersList::class.java)

    }


    /**
     * Operation: Add Blocked/Allowed Number
     * Http Post /restapi/v1.0/account/{accountId}/extension/{extensionId}/caller-blocking/phone-numbers
     */
    fun post(addBlockedAllowedPhoneNumber: com.ringcentral.definitions.AddBlockedAllowedPhoneNumber): com.ringcentral.definitions.BlockedAllowedPhoneNumberInfo? {
        val rb: okhttp3.ResponseBody = rc.post(this.path(false), addBlockedAllowedPhoneNumber)

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.BlockedAllowedPhoneNumberInfo::class.java)

    }


    /**
     * Operation: Get Blocked/Allowed Number
     * Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/caller-blocking/phone-numbers/{blockedNumberId}
     */
    fun get(): com.ringcentral.definitions.BlockedAllowedPhoneNumberInfo? {
        if (this.blockedNumberId == null) {
            throw NullPointerException("blockedNumberId")
        }

        val rb: okhttp3.ResponseBody = rc.get(this.path())

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.BlockedAllowedPhoneNumberInfo::class.java)

    }


    /**
     * Operation: Delete Blocked/Allowed Number
     * Http Delete /restapi/v1.0/account/{accountId}/extension/{extensionId}/caller-blocking/phone-numbers/{blockedNumberId}
     */
    fun delete(): String? {
        if (this.blockedNumberId == null) {
            throw NullPointerException("blockedNumberId")
        }

        val rb: okhttp3.ResponseBody = rc.delete(this.path())

        return rb.string()

    }


    /**
     * Operation: Update Blocked/Allowed Number
     * Http Put /restapi/v1.0/account/{accountId}/extension/{extensionId}/caller-blocking/phone-numbers/{blockedNumberId}
     */
    fun put(addBlockedAllowedPhoneNumber: com.ringcentral.definitions.AddBlockedAllowedPhoneNumber): com.ringcentral.definitions.BlockedAllowedPhoneNumberInfo? {
        if (this.blockedNumberId == null) {
            throw NullPointerException("blockedNumberId")
        }

        val rb: okhttp3.ResponseBody = rc.put(this.path(), addBlockedAllowedPhoneNumber)

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.BlockedAllowedPhoneNumberInfo::class.java)

    }

}
