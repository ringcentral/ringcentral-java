package com.ringcentral.paths.restapi.account.callrecording.extensions

class Index(val parent: com.ringcentral.paths.restapi.account.callrecording.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/extensions"
    }

    /**
     * Operation: Get Call Recording Extension List
     * Http Get /restapi/v1.0/account/{accountId}/call-recording/extensions
     */
    fun get(): com.ringcentral.definitions.CallRecordingExtensions? {
        val rb: okhttp3.ResponseBody = rc.get(this.path())

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.CallRecordingExtensions::class.java)

    }

}
