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
    @Throws(com.ringcentral.RestException::class, java.io.IOException::class)
    @JvmOverloads
    fun list(queryParams: com.ringcentral.definitions.ReadCompanyCallLogParameters? = null): com.ringcentral.definitions.AccountCallLogResponse? {
        val rb: okhttp3.ResponseBody = rc.get(this.path(false), queryParams)

        return com.ringcentral.Utils.gson.fromJson(
            rb.string(),
            com.ringcentral.definitions.AccountCallLogResponse::class.java
        )

    }


    /**
     * Operation: Get Company Call Log Record(s)
     * Http Get /restapi/v1.0/account/{accountId}/call-log/{callRecordId}
     */
    @Throws(com.ringcentral.RestException::class, java.io.IOException::class)
    @JvmOverloads
    fun get(queryParams: com.ringcentral.definitions.ReadCompanyCallRecordParameters? = null): com.ringcentral.definitions.CompanyCallLogRecord? {
        if (this.callRecordId == null) {
            throw NullPointerException("callRecordId");
        }

        val rb: okhttp3.ResponseBody = rc.get(this.path(), queryParams)

        return com.ringcentral.Utils.gson.fromJson(
            rb.string(),
            com.ringcentral.definitions.CompanyCallLogRecord::class.java
        )

    }

}
