package com.ringcentral.paths.restapi.dictionary.greeting

class Index(val parent: com.ringcentral.paths.restapi.dictionary.Index, val greetingId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && greetingId != null) {
            return "${parent.path()}/greeting/${greetingId}"
        }

        return "${parent.path()}/greeting"
    }

    /**
     * Operation: Get Standard Greeting List
     * Http Get /restapi/v1.0/dictionary/greeting
     */
    @JvmOverloads
    fun list(queryParams: com.ringcentral.definitions.ListStandardGreetingsParameters? = null): com.ringcentral.definitions.DictionaryGreetingList? {
        val rb: okhttp3.ResponseBody = rc.get(this.path(false), queryParams)

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.DictionaryGreetingList::class.java)

    }


    /**
     * Operation: Get Standard Greeting
     * Http Get /restapi/v1.0/dictionary/greeting/{greetingId}
     */
    fun get(): com.ringcentral.definitions.DictionaryGreetingInfo? {
        if (this.greetingId == null) {
            throw NullPointerException("greetingId")
        }

        val rb: okhttp3.ResponseBody = rc.get(this.path())

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.DictionaryGreetingInfo::class.java)

    }

}
