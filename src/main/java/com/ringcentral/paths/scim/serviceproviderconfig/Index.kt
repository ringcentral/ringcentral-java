package com.ringcentral.paths.scim.serviceproviderconfig

class Index(val parent: com.ringcentral.paths.scim.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/ServiceProviderConfig"
    }

    /**
     * Operation: Get Service Provider Config
     * Http Get /scim/v2/ServiceProviderConfig
     */
    fun get(): com.ringcentral.definitions.ServiceProviderConfig? {
        val rb: okhttp3.ResponseBody = rc.get(this.path())

        return com.ringcentral.Utils.gson.fromJson(
            rb.string(),
            com.ringcentral.definitions.ServiceProviderConfig::class.java
        )

    }

}
