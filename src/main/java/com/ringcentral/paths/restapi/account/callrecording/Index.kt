package com.ringcentral.paths.restapi.account.callrecording

class Index(val parent: com.ringcentral.paths.restapi.account.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/call-recording"
    }

    /**
     * Operation: Get Call Recording Settings
     * Http Get /restapi/v1.0/account/{accountId}/call-recording
     */
    fun get(): com.ringcentral.definitions.CallRecordingSettingsResource? {
        val rb: okhttp3.ResponseBody = rc.get(this.path())

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.CallRecordingSettingsResource::class.java)

    }


    /**
     * Operation: Update Call Recording Settings
     * Http Put /restapi/v1.0/account/{accountId}/call-recording
     */
    fun put(callRecordingSettingsResource: com.ringcentral.definitions.CallRecordingSettingsResource): com.ringcentral.definitions.CallRecordingSettingsResource? {
        val rb: okhttp3.ResponseBody = rc.put(this.path(), callRecordingSettingsResource)

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.CallRecordingSettingsResource::class.java)

    }


    fun extensions(): com.ringcentral.paths.restapi.account.callrecording.extensions.Index {
        return com.ringcentral.paths.restapi.account.callrecording.extensions.Index(this)
    }


    fun bulkassign(): com.ringcentral.paths.restapi.account.callrecording.bulkassign.Index {
        return com.ringcentral.paths.restapi.account.callrecording.bulkassign.Index(this)
    }


    @JvmOverloads
    fun customgreetings(greetingId: String? = null): com.ringcentral.paths.restapi.account.callrecording.customgreetings.Index {
        return com.ringcentral.paths.restapi.account.callrecording.customgreetings.Index(this, greetingId)
    }

}