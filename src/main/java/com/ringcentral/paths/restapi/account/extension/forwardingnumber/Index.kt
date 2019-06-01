package com.ringcentral.paths.restapi.account.extension.forwardingnumber

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index, val forwardingNumberId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && forwardingNumberId != null) {
            return "${parent.path()}/forwarding-number/${forwardingNumberId}"
        }

        return "${parent.path()}/forwarding-number"
    }

    /**
     * Operation: Get Forwarding Number List
     * Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/forwarding-number
     */
    @JvmOverloads
    fun list(queryParams: com.ringcentral.definitions.ListForwardingNumbersParameters? = null): com.ringcentral.definitions.GetExtensionForwardingNumberListResponse? {
        val rb: okhttp3.ResponseBody = rc.get(this.path(false), queryParams)

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.GetExtensionForwardingNumberListResponse::class.java)

    }


    /**
     * Operation: Create Forwarding Number
     * Http Post /restapi/v1.0/account/{accountId}/extension/{extensionId}/forwarding-number
     */
    fun post(createForwardingNumberRequest: com.ringcentral.definitions.CreateForwardingNumberRequest): com.ringcentral.definitions.ForwardingNumberInfo? {
        val rb: okhttp3.ResponseBody = rc.post(this.path(false), createForwardingNumberRequest)

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.ForwardingNumberInfo::class.java)

    }


    /**
     * Operation: Get Forwarding Number
     * Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/forwarding-number/{forwardingNumberId}
     */
    fun get(): com.ringcentral.definitions.ForwardingNumberResource? {
        if (this.forwardingNumberId == null) {
            throw NullPointerException("forwardingNumberId")
        }

        val rb: okhttp3.ResponseBody = rc.get(this.path())

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.ForwardingNumberResource::class.java)

    }


    /**
     * Operation: Update Forwarding Number
     * Http Put /restapi/v1.0/account/{accountId}/extension/{extensionId}/forwarding-number/{forwardingNumberId}
     */
    fun put(updateForwardingNumberRequest: com.ringcentral.definitions.UpdateForwardingNumberRequest): com.ringcentral.definitions.ForwardingNumberInfo? {
        if (this.forwardingNumberId == null) {
            throw NullPointerException("forwardingNumberId")
        }

        val rb: okhttp3.ResponseBody = rc.put(this.path(), updateForwardingNumberRequest)

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.ForwardingNumberInfo::class.java)

    }


    /**
     * Operation: Delete Forwarding Number
     * Http Delete /restapi/v1.0/account/{accountId}/extension/{extensionId}/forwarding-number/{forwardingNumberId}
     */
    fun delete(): String? {
        if (this.forwardingNumberId == null) {
            throw NullPointerException("forwardingNumberId")
        }

        val rb: okhttp3.ResponseBody = rc.delete(this.path())

        return rb.string()

    }

}
