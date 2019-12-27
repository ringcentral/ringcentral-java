package com.ringcentral.paths.restapi.account.greeting

class Index(val parent: com.ringcentral.paths.restapi.account.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/greeting"
    }

    /**
     * Operation: Create Company Greeting
     * Http Post /restapi/v1.0/account/{accountId}/greeting
     */
    fun post(createCompanyGreetingRequest: com.ringcentral.definitions.CreateCompanyGreetingRequest): com.ringcentral.definitions.CustomCompanyGreetingInfo? {
        val rb: okhttp3.ResponseBody = rc.post(this.path(), createCompanyGreetingRequest, null, com.ringcentral.ContentType.MULTIPART)

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.CustomCompanyGreetingInfo::class.java)

    }

}
