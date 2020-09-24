package com.ringcentral.paths.restapi.account.extension.videoconfiguration

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/video-configuration"
    }

    /**
     * Operation: Get User Video Configuration
     * Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/video-configuration
     */
    fun get(): com.ringcentral.definitions.UserVideoConfiguration? {
        val rb: okhttp3.ResponseBody = rc.get(this.path())

        return com.ringcentral.Utils.gson.fromJson(rb.string(), com.ringcentral.definitions.UserVideoConfiguration::class.java)

    }


    /**
     * Operation: Update User Video Configuration
     * Http Put /restapi/v1.0/account/{accountId}/extension/{extensionId}/video-configuration
     */
    fun put(userVideoConfiguration: com.ringcentral.definitions.UserVideoConfiguration): com.ringcentral.definitions.UserVideoConfiguration? {
        val rb: okhttp3.ResponseBody = rc.put(this.path(), userVideoConfiguration)

        return com.ringcentral.Utils.gson.fromJson(rb.string(), com.ringcentral.definitions.UserVideoConfiguration::class.java)

    }

}
