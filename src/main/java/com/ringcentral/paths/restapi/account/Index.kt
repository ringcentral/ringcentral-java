package com.ringcentral.paths.restapi.account

class Index(val parent: com.ringcentral.paths.restapi.Index, val accountId: String? = "~") {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && accountId != null) {
            return "${parent.path()}/account/${accountId}"
        }

        return "${parent.path()}/account"
    }

    /**
     * Operation: Get Account Info
     * Http Get /restapi/v1.0/account/{accountId}
     */
    fun get(): com.ringcentral.definitions.GetAccountInfoResponse? {
        if (this.accountId == null) {
            throw NullPointerException("accountId")
        }

        val rb: okhttp3.ResponseBody = rc.get(this.path())

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.GetAccountInfoResponse::class.java)

    }


    @JvmOverloads
    fun extension(extensionId: String? = "~"): com.ringcentral.paths.restapi.account.extension.Index {
        return com.ringcentral.paths.restapi.account.extension.Index(this, extensionId)
    }


    @JvmOverloads
    fun calllog(callRecordId: String? = null): com.ringcentral.paths.restapi.account.calllog.Index {
        return com.ringcentral.paths.restapi.account.calllog.Index(this, callRecordId)
    }


    fun activecalls(): com.ringcentral.paths.restapi.account.activecalls.Index {
        return com.ringcentral.paths.restapi.account.activecalls.Index(this)
    }


    @JvmOverloads
    fun recording(recordingId: String? = null): com.ringcentral.paths.restapi.account.recording.Index {
        return com.ringcentral.paths.restapi.account.recording.Index(this, recordingId)
    }


    fun messagestoreconfiguration(): com.ringcentral.paths.restapi.account.messagestoreconfiguration.Index {
        return com.ringcentral.paths.restapi.account.messagestoreconfiguration.Index(this)
    }


    fun directory(): com.ringcentral.paths.restapi.account.directory.Index {
        return com.ringcentral.paths.restapi.account.directory.Index(this)
    }


    fun presence(): com.ringcentral.paths.restapi.account.presence.Index {
        return com.ringcentral.paths.restapi.account.presence.Index(this)
    }


    fun businesshours(): com.ringcentral.paths.restapi.account.businesshours.Index {
        return com.ringcentral.paths.restapi.account.businesshours.Index(this)
    }


    @JvmOverloads
    fun answeringrule(ruleId: String? = null): com.ringcentral.paths.restapi.account.answeringrule.Index {
        return com.ringcentral.paths.restapi.account.answeringrule.Index(this, ruleId)
    }


    fun greeting(): com.ringcentral.paths.restapi.account.greeting.Index {
        return com.ringcentral.paths.restapi.account.greeting.Index(this)
    }


    @JvmOverloads
    fun ivrprompts(promptId: String? = null): com.ringcentral.paths.restapi.account.ivrprompts.Index {
        return com.ringcentral.paths.restapi.account.ivrprompts.Index(this, promptId)
    }


    @JvmOverloads
    fun ivrmenus(ivrMenuId: String? = null): com.ringcentral.paths.restapi.account.ivrmenus.Index {
        return com.ringcentral.paths.restapi.account.ivrmenus.Index(this, ivrMenuId)
    }


    fun callrecording(): com.ringcentral.paths.restapi.account.callrecording.Index {
        return com.ringcentral.paths.restapi.account.callrecording.Index(this)
    }


    fun businessaddress(): com.ringcentral.paths.restapi.account.businessaddress.Index {
        return com.ringcentral.paths.restapi.account.businessaddress.Index(this)
    }


    fun serviceinfo(): com.ringcentral.paths.restapi.account.serviceinfo.Index {
        return com.ringcentral.paths.restapi.account.serviceinfo.Index(this)
    }


    @JvmOverloads
    fun phonenumber(phoneNumberId: String? = null): com.ringcentral.paths.restapi.account.phonenumber.Index {
        return com.ringcentral.paths.restapi.account.phonenumber.Index(this, phoneNumberId)
    }


    @JvmOverloads
    fun templates(templateId: String? = null): com.ringcentral.paths.restapi.account.templates.Index {
        return com.ringcentral.paths.restapi.account.templates.Index(this, templateId)
    }


    @JvmOverloads
    fun callqueues(groupId: String? = null): com.ringcentral.paths.restapi.account.callqueues.Index {
        return com.ringcentral.paths.restapi.account.callqueues.Index(this, groupId)
    }


    @JvmOverloads
    fun department(departmentId: String? = null): com.ringcentral.paths.restapi.account.department.Index {
        return com.ringcentral.paths.restapi.account.department.Index(this, departmentId)
    }


    @JvmOverloads
    fun pagingonlygroups(pagingOnlyGroupId: String? = null): com.ringcentral.paths.restapi.account.pagingonlygroups.Index {
        return com.ringcentral.paths.restapi.account.pagingonlygroups.Index(this, pagingOnlyGroupId)
    }


    @JvmOverloads
    fun callmonitoringgroups(groupId: String? = null): com.ringcentral.paths.restapi.account.callmonitoringgroups.Index {
        return com.ringcentral.paths.restapi.account.callmonitoringgroups.Index(this, groupId)
    }


    @JvmOverloads
    fun device(deviceId: String? = null): com.ringcentral.paths.restapi.account.device.Index {
        return com.ringcentral.paths.restapi.account.device.Index(this, deviceId)
    }


    fun telephony(): com.ringcentral.paths.restapi.account.telephony.Index {
        return com.ringcentral.paths.restapi.account.telephony.Index(this)
    }


    @JvmOverloads
    fun messagestorereport(taskId: String? = null): com.ringcentral.paths.restapi.account.messagestorereport.Index {
        return com.ringcentral.paths.restapi.account.messagestorereport.Index(this, taskId)
    }

}