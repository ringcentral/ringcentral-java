package com.ringcentral.paths.restapi.account.extension.calllog

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index, val callRecordId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && callRecordId != null) {
            return "${parent.path()}/call-log/${callRecordId}"
        }

        return "${parent.path()}/call-log"
    }

    /**
     * Operation: Get User Call Log Records
     * Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/call-log
     */
    @JvmOverloads
    fun list(queryParams: com.ringcentral.definitions.ReadUserCallLogParameters? = null): com.ringcentral.definitions.UserCallLogResponse? {
        val rb: okhttp3.ResponseBody = rc.get(this.path(false), queryParams)

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.UserCallLogResponse::class.java)

    }


    /**
     * Operation: Delete User Call Log
     * Http Delete /restapi/v1.0/account/{accountId}/extension/{extensionId}/call-log
     */
    @JvmOverloads
    fun delete(queryParams: com.ringcentral.definitions.DeleteUserCallLogParameters? = null): String? {
        val rb: okhttp3.ResponseBody = rc.delete(this.path(false), queryParams)

        return rb.string()

    }


    /**
     * Operation: Get User Call Record
     * Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/call-log/{callRecordId}
     */
    @JvmOverloads
    fun get(queryParams: com.ringcentral.definitions.ReadUserCallRecordParameters? = null): com.ringcentral.definitions.UserCallLogRecord? {
        if (this.callRecordId == null) {
            throw NullPointerException("callRecordId")
        }

        val rb: okhttp3.ResponseBody = rc.get(this.path(), queryParams)

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.UserCallLogRecord::class.java)

    }

}
