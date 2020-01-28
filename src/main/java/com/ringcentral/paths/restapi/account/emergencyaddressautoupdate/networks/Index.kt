package com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.networks

class Index(val parent: com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.Index, val networkId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && networkId != null) {
            return "${parent.path()}/networks/${networkId}"
        }

        return "${parent.path()}/networks"
    }

    /**
     * Operation: Get Network Map
     * Http Get /restapi/v1.0/account/{accountId}/emergency-address-auto-update/networks
     */
    fun list(): com.ringcentral.definitions.NetworksList? {
        val rb: okhttp3.ResponseBody = rc.get(this.path(false))

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.NetworksList::class.java)

    }


    /**
     * Operation: Create Network
     * Http Post /restapi/v1.0/account/{accountId}/emergency-address-auto-update/networks
     */
    fun post(createNetworkRequest: com.ringcentral.definitions.CreateNetworkRequest): com.ringcentral.definitions.NetworkInfo? {
        val rb: okhttp3.ResponseBody = rc.post(this.path(false), createNetworkRequest)

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.NetworkInfo::class.java)

    }


    /**
     * Operation: Get Network
     * Http Get /restapi/v1.0/account/{accountId}/emergency-address-auto-update/networks/{networkId}
     */
    fun get(): com.ringcentral.definitions.NetworkInfo? {
        if (this.networkId == null) {
            throw NullPointerException("networkId");
        }

        val rb: okhttp3.ResponseBody = rc.get(this.path())

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.NetworkInfo::class.java)

    }


    /**
     * Operation: Update Network
     * Http Put /restapi/v1.0/account/{accountId}/emergency-address-auto-update/networks/{networkId}
     */
    fun put(updateNetworkRequest: com.ringcentral.definitions.UpdateNetworkRequest): String? {
        if (this.networkId == null) {
            throw NullPointerException("networkId");
        }

        val rb: okhttp3.ResponseBody = rc.put(this.path(), updateNetworkRequest)

        return rb.string()

    }


    /**
     * Operation: Delete Network
     * Http Delete /restapi/v1.0/account/{accountId}/emergency-address-auto-update/networks/{networkId}
     */
    fun delete(): String? {
        if (this.networkId == null) {
            throw NullPointerException("networkId");
        }

        val rb: okhttp3.ResponseBody = rc.delete(this.path())

        return rb.string()

    }

}
