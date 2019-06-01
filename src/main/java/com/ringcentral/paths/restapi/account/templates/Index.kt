package com.ringcentral.paths.restapi.account.templates

class Index(val parent: com.ringcentral.paths.restapi.account.Index, val templateId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && templateId != null) {
            return "${parent.path()}/templates/${templateId}"
        }

        return "${parent.path()}/templates"
    }

    /**
     * Operation: Get User Template List
     * Http Get /restapi/v1.0/account/{accountId}/templates
     */
    @JvmOverloads
    fun list(queryParams: com.ringcentral.definitions.ListUserTemplatesParameters? = null): com.ringcentral.definitions.UserTemplates? {
        val rb: okhttp3.ResponseBody = rc.get(this.path(false), queryParams)

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.UserTemplates::class.java)

    }


    /**
     * Operation: Get User Template
     * Http Get /restapi/v1.0/account/{accountId}/templates/{templateId}
     */
    fun get(): com.ringcentral.definitions.TemplateInfo? {
        if (this.templateId == null) {
            throw NullPointerException("templateId")
        }

        val rb: okhttp3.ResponseBody = rc.get(this.path())

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.TemplateInfo::class.java)

    }

}
