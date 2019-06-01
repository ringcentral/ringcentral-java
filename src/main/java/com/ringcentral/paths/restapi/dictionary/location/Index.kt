package com.ringcentral.paths.restapi.dictionary.location

class Index(val parent: com.ringcentral.paths.restapi.dictionary.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/location"
    }

    /**
     * Operation: Get Location List
     * Http Get /restapi/v1.0/dictionary/location
     */
    @JvmOverloads
    fun get(queryParams: com.ringcentral.definitions.ListLocationsParameters? = null): com.ringcentral.definitions.GetLocationListResponse? {
        val rb: okhttp3.ResponseBody = rc.get(this.path(), queryParams)

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.GetLocationListResponse::class.java)

    }

}
