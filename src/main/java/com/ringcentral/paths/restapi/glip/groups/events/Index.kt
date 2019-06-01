package com.ringcentral.paths.restapi.glip.groups.events

class Index(val parent: com.ringcentral.paths.restapi.glip.groups.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/events"
    }

    /**
     * Operation: Create Event by Group ID
     * Http Post /restapi/v1.0/glip/groups/{groupId}/events
     */
    fun post(glipEventCreate: com.ringcentral.definitions.GlipEventCreate): com.ringcentral.definitions.GlipEventInfo? {
        val rb: okhttp3.ResponseBody = rc.post(this.path(), glipEventCreate)

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.GlipEventInfo::class.java)

    }


    /**
     * Operation: Get Group Events
     * Http Get /restapi/v1.0/glip/groups/{groupId}/events
     */
    fun get(): com.ringcentral.definitions.GlipEventInfo? {
        val rb: okhttp3.ResponseBody = rc.get(this.path())

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.GlipEventInfo::class.java)

    }

}
