package com.ringcentral.paths.restapi.account.callrecording.customgreetings

class Index(val parent: com.ringcentral.paths.restapi.account.callrecording.Index, val greetingId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && greetingId != null) {
            return "${parent.path()}/custom-greetings/${greetingId}"
        }

        return "${parent.path()}/custom-greetings"
    }

    /**
     * Operation: Get Call Recording Custom Greeting List
     * Http Get /restapi/v1.0/account/{accountId}/call-recording/custom-greetings
     */
    @JvmOverloads
    fun get(queryParams: com.ringcentral.definitions.ListCallRecordingCustomGreetingsParameters? = null): com.ringcentral.definitions.CallRecordingCustomGreetings? {
        val rb: okhttp3.ResponseBody = rc.get(this.path(false), queryParams)

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.CallRecordingCustomGreetings::class.java)

    }


    /**
     * Operation: Delete Call Recording Custom Greeting
     * Http Delete /restapi/v1.0/account/{accountId}/call-recording/custom-greetings/{greetingId}
     */
    fun delete(): String? {
        if (this.greetingId == null) {
            throw NullPointerException("greetingId")
        }

        val rb: okhttp3.ResponseBody = rc.delete(this.path())

        return rb.string()

    }

}
