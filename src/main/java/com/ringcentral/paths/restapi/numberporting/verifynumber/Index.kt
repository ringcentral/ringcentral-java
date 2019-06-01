package com.ringcentral.paths.restapi.numberporting.verifynumber

class Index(val parent: com.ringcentral.paths.restapi.numberporting.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/verify-number"
    }

    /**
     * Operation: Verify Number
     * Http Post /restapi/v1.0/number-porting/verify-number
     */
    fun post(numberPortingVerifyNumberRequest: com.ringcentral.definitions.NumberPortingVerifyNumberRequest): com.ringcentral.definitions.NumberPortingVerifyNumberResponse? {
        val rb: okhttp3.ResponseBody = rc.post(this.path(), numberPortingVerifyNumberRequest)

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.NumberPortingVerifyNumberResponse::class.java)

    }

}
