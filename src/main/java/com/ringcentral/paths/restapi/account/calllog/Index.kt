package com.ringcentral.paths.restapi.account.calllog

class Index(val parent: com.ringcentral.paths.restapi.account.Index, val callRecordId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && callRecordId != null) {
            return "${parent.path()}/call-log/${callRecordId}"
        }

        return "${parent.path()}/call-log"
    }

    /**
     * Operation: Get Company Call Log Records
     * Http Get /restapi/v1.0/account/{accountId}/call-log
     */
    @JvmOverloads
    fun list(queryParams: com.ringcentral.definitions.ReadCompanyCallLogParameters? = null): com.ringcentral.definitions.AccountCallLogResponse? {
        val rb: okhttp3.ResponseBody = rc.get(this.path(false), queryParams)

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.AccountCallLogResponse::class.java)

    }


    /**
     * Operation: Get Company Call Log Record(s)
     * Http Get /restapi/v1.0/account/{accountId}/call-log/{callRecordId}
     */
    fun get(): com.ringcentral.definitions.CompanyCallLogRecord? {
        if (this.callRecordId == null) {
            throw NullPointerException("callRecordId")
        }

        val rb: okhttp3.ResponseBody = rc.get(this.path())

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.CompanyCallLogRecord::class.java)

    }

}
