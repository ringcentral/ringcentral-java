package com.ringcentral.paths.restapi.account.messagestoreconfiguration

class Index(val parent: com.ringcentral.paths.restapi.account.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/message-store-configuration"
    }

    /**
     * Operation: Get Message Store Configuration
     * Http Get /restapi/v1.0/account/{accountId}/message-store-configuration
     */
    fun get(): com.ringcentral.definitions.MessageStoreConfiguration? {
        val rb: okhttp3.ResponseBody = rc.get(this.path())

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.MessageStoreConfiguration::class.java)

    }


    /**
     * Operation: Update Message Store Configuration
     * Http Put /restapi/v1.0/account/{accountId}/message-store-configuration
     */
    fun put(messageStoreConfiguration: com.ringcentral.definitions.MessageStoreConfiguration): com.ringcentral.definitions.MessageStoreConfiguration? {
        val rb: okhttp3.ResponseBody = rc.put(this.path(), messageStoreConfiguration)

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.MessageStoreConfiguration::class.java)

    }

}
