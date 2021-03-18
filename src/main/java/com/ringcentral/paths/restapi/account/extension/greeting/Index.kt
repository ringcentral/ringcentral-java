package com.ringcentral.paths.restapi.account.extension.greeting

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index, val greetingId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && greetingId != null) {
            return "${parent.path()}/greeting/${greetingId}"
        }

        return "${parent.path()}/greeting"
    }

    /**
     * Operation: Create Custom User Greeting
     * Http Post /restapi/v1.0/account/{accountId}/extension/{extensionId}/greeting
     */
    @Throws(com.ringcentral.RestException::class, java.io.IOException::class)
    @JvmOverloads
    fun post(
        createCustomUserGreetingRequest: com.ringcentral.definitions.CreateCustomUserGreetingRequest,
        queryParams: com.ringcentral.definitions.CreateCustomUserGreetingParameters? = null
    ): com.ringcentral.definitions.CustomUserGreetingInfo? {
        val rb: okhttp3.ResponseBody = rc.post(
            this.path(false),
            createCustomUserGreetingRequest,
            queryParams,
            com.ringcentral.ContentType.MULTIPART
        )

        return com.ringcentral.Utils.gson.fromJson(
            rb.string(),
            com.ringcentral.definitions.CustomUserGreetingInfo::class.java
        )

    }


    /**
     * Operation: Get Custom Greeting
     * Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/greeting/{greetingId}
     */
    @Throws(com.ringcentral.RestException::class, java.io.IOException::class)
    fun get(): com.ringcentral.definitions.CustomUserGreetingInfo? {
        if (this.greetingId == null) {
            throw NullPointerException("greetingId");
        }

        val rb: okhttp3.ResponseBody = rc.get(this.path())

        return com.ringcentral.Utils.gson.fromJson(
            rb.string(),
            com.ringcentral.definitions.CustomUserGreetingInfo::class.java
        )

    }

}
