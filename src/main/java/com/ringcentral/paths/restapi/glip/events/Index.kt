package com.ringcentral.paths.restapi.glip.events

class Index(val parent: com.ringcentral.paths.restapi.glip.Index, val eventId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && eventId != null) {
            return "${parent.path()}/events/${eventId}"
        }

        return "${parent.path()}/events"
    }

    /**
     * Operation: Get User Events List
     * Http Get /restapi/v1.0/glip/events
     */
    @JvmOverloads
    fun list(queryParams: com.ringcentral.definitions.ReadGlipEventsParameters? = null): com.ringcentral.definitions.GlipEventsInfo? {
        val rb: okhttp3.ResponseBody = rc.get(this.path(false), queryParams)

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.GlipEventsInfo::class.java)

    }


    /**
     * Operation: Create Event
     * Http Post /restapi/v1.0/glip/events
     */
    fun post(glipEventCreate: com.ringcentral.definitions.GlipEventCreate): com.ringcentral.definitions.GlipEventInfo? {
        val rb: okhttp3.ResponseBody = rc.post(this.path(false), glipEventCreate)

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.GlipEventInfo::class.java)

    }


    /**
     * Operation: Get Event
     * Http Get /restapi/v1.0/glip/events/{eventId}
     */
    fun get(): com.ringcentral.definitions.GlipEventInfo? {
        if (this.eventId == null) {
            throw NullPointerException("eventId")
        }

        val rb: okhttp3.ResponseBody = rc.get(this.path())

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.GlipEventInfo::class.java)

    }


    /**
     * Operation: Update Event
     * Http Put /restapi/v1.0/glip/events/{eventId}
     */
    fun put(glipEventCreate: com.ringcentral.definitions.GlipEventCreate): com.ringcentral.definitions.GlipEventInfo? {
        if (this.eventId == null) {
            throw NullPointerException("eventId")
        }

        val rb: okhttp3.ResponseBody = rc.put(this.path(), glipEventCreate)

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.GlipEventInfo::class.java)

    }


    /**
     * Operation: Delete Event
     * Http Delete /restapi/v1.0/glip/events/{eventId}
     */
    fun delete(): String? {
        if (this.eventId == null) {
            throw NullPointerException("eventId")
        }

        val rb: okhttp3.ResponseBody = rc.delete(this.path())

        return rb.string()

    }

}
