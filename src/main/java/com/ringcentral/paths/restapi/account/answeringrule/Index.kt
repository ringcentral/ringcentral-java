package com.ringcentral.paths.restapi.account.answeringrule

class Index(val parent: com.ringcentral.paths.restapi.account.Index, val ruleId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && ruleId != null) {
            return "${parent.path()}/answering-rule/${ruleId}"
        }

        return "${parent.path()}/answering-rule"
    }

    /**
     * Operation: Create Company Call Handling Rule
     * Http Post /restapi/v1.0/account/{accountId}/answering-rule
     */
    fun post(companyAnsweringRuleRequest: com.ringcentral.definitions.CompanyAnsweringRuleRequest): com.ringcentral.definitions.CompanyAnsweringRuleInfo? {
        val rb: okhttp3.ResponseBody = rc.post(this.path(false), companyAnsweringRuleRequest)

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.CompanyAnsweringRuleInfo::class.java)

    }


    /**
     * Operation: Get Company Call Handling Rule List
     * Http Get /restapi/v1.0/account/{accountId}/answering-rule
     */
    fun list(): com.ringcentral.definitions.CompanyAnsweringRuleList? {
        val rb: okhttp3.ResponseBody = rc.get(this.path(false))

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.CompanyAnsweringRuleList::class.java)

    }


    /**
     * Operation: Get Company Call Handling Rule
     * Http Get /restapi/v1.0/account/{accountId}/answering-rule/{ruleId}
     */
    fun get(): com.ringcentral.definitions.CompanyAnsweringRuleInfo? {
        if (this.ruleId == null) {
            throw NullPointerException("ruleId")
        }

        val rb: okhttp3.ResponseBody = rc.get(this.path())

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.CompanyAnsweringRuleInfo::class.java)

    }


    /**
     * Operation: Update Company Call Handling Rule
     * Http Put /restapi/v1.0/account/{accountId}/answering-rule/{ruleId}
     */
    fun put(companyAnsweringRuleUpdate: com.ringcentral.definitions.CompanyAnsweringRuleUpdate): com.ringcentral.definitions.CompanyAnsweringRuleInfo? {
        if (this.ruleId == null) {
            throw NullPointerException("ruleId")
        }

        val rb: okhttp3.ResponseBody = rc.put(this.path(), companyAnsweringRuleUpdate)

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.CompanyAnsweringRuleInfo::class.java)

    }


    /**
     * Operation: Delete Company Call Handling Rule
     * Http Delete /restapi/v1.0/account/{accountId}/answering-rule/{ruleId}
     */
    fun delete(): String? {
        if (this.ruleId == null) {
            throw NullPointerException("ruleId")
        }

        val rb: okhttp3.ResponseBody = rc.delete(this.path())

        return rb.string()

    }

}
