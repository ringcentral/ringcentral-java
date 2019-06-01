package com.ringcentral.paths.restapi.clientinfo.sipprovision

class Index(val parent: com.ringcentral.paths.restapi.clientinfo.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/sip-provision"
    }

    /**
     * Operation: Register SIP Device
     * Http Post /restapi/v1.0/client-info/sip-provision
     */
    fun post(createSipRegistrationRequest: com.ringcentral.definitions.CreateSipRegistrationRequest): com.ringcentral.definitions.CreateSipRegistrationResponse? {
        val rb: okhttp3.ResponseBody = rc.post(this.path(), createSipRegistrationRequest)

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.CreateSipRegistrationResponse::class.java)

    }

}
