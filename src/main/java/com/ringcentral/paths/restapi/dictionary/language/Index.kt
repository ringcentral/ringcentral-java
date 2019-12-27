package com.ringcentral.paths.restapi.dictionary.language

class Index(val parent: com.ringcentral.paths.restapi.dictionary.Index, val languageId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && languageId != null) {
            return "${parent.path()}/language/${languageId}"
        }

        return "${parent.path()}/language"
    }

    /**
     * Operation: Get Language List
     * Http Get /restapi/v1.0/dictionary/language
     */
    fun list(): com.ringcentral.definitions.LanguageList? {
        val rb: okhttp3.ResponseBody = rc.get(this.path(false))

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.LanguageList::class.java)

    }


    /**
     * Operation: Get Language
     * Http Get /restapi/v1.0/dictionary/language/{languageId}
     */
    fun get(): com.ringcentral.definitions.LanguageInfo? {
        if (this.languageId == null) {
            throw NullPointerException("languageId")
        }

        val rb: okhttp3.ResponseBody = rc.get(this.path())

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.LanguageInfo::class.java)

    }

}
