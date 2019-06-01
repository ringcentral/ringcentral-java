package com.ringcentral.paths.restapi.account.extension

class Index(val parent: com.ringcentral.paths.restapi.account.Index, val extensionId: String? = "~") {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && extensionId != null) {
            return "${parent.path()}/extension/${extensionId}"
        }

        return "${parent.path()}/extension"
    }

    /**
     * Operation: Get Extension List
     * Http Get /restapi/v1.0/account/{accountId}/extension
     */
    @JvmOverloads
    fun list(queryParams: com.ringcentral.definitions.ListExtensionsParameters? = null): com.ringcentral.definitions.GetExtensionListResponse? {
        val rb: okhttp3.ResponseBody = rc.get(this.path(false), queryParams)

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.GetExtensionListResponse::class.java)

    }


    /**
     * Operation: Create Extension
     * Http Post /restapi/v1.0/account/{accountId}/extension
     */
    fun post(extensionCreationRequest: com.ringcentral.definitions.ExtensionCreationRequest): com.ringcentral.definitions.ExtensionCreationResponse? {
        val rb: okhttp3.ResponseBody = rc.post(this.path(false), extensionCreationRequest)

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.ExtensionCreationResponse::class.java)

    }


    /**
     * Operation: Get Extension
     * Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}
     */
    fun get(): com.ringcentral.definitions.GetExtensionInfoResponse? {
        if (this.extensionId == null) {
            throw NullPointerException("extensionId")
        }

        val rb: okhttp3.ResponseBody = rc.get(this.path())

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.GetExtensionInfoResponse::class.java)

    }


    /**
     * Operation: Update Extension
     * Http Put /restapi/v1.0/account/{accountId}/extension/{extensionId}
     */
    fun put(extensionUpdateRequest: com.ringcentral.definitions.ExtensionUpdateRequest): com.ringcentral.definitions.GetExtensionInfoResponse? {
        if (this.extensionId == null) {
            throw NullPointerException("extensionId")
        }

        val rb: okhttp3.ResponseBody = rc.put(this.path(), extensionUpdateRequest)

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.GetExtensionInfoResponse::class.java)

    }


    /**
     * Operation: Delete Extension
     * Http Delete /restapi/v1.0/account/{accountId}/extension/{extensionId}
     */
    fun delete(): String? {
        if (this.extensionId == null) {
            throw NullPointerException("extensionId")
        }

        val rb: okhttp3.ResponseBody = rc.delete(this.path())

        return rb.string()

    }


    @JvmOverloads
    fun calllog(callRecordId: String? = null): com.ringcentral.paths.restapi.account.extension.calllog.Index {
        return com.ringcentral.paths.restapi.account.extension.calllog.Index(this, callRecordId)
    }


    fun calllogsync(): com.ringcentral.paths.restapi.account.extension.calllogsync.Index {
        return com.ringcentral.paths.restapi.account.extension.calllogsync.Index(this)
    }


    fun activecalls(): com.ringcentral.paths.restapi.account.extension.activecalls.Index {
        return com.ringcentral.paths.restapi.account.extension.activecalls.Index(this)
    }


    fun sms(): com.ringcentral.paths.restapi.account.extension.sms.Index {
        return com.ringcentral.paths.restapi.account.extension.sms.Index(this)
    }


    fun companypager(): com.ringcentral.paths.restapi.account.extension.companypager.Index {
        return com.ringcentral.paths.restapi.account.extension.companypager.Index(this)
    }


    fun fax(): com.ringcentral.paths.restapi.account.extension.fax.Index {
        return com.ringcentral.paths.restapi.account.extension.fax.Index(this)
    }


    @JvmOverloads
    fun messagestore(messageId: String? = null): com.ringcentral.paths.restapi.account.extension.messagestore.Index {
        return com.ringcentral.paths.restapi.account.extension.messagestore.Index(this, messageId)
    }


    fun messagesync(): com.ringcentral.paths.restapi.account.extension.messagesync.Index {
        return com.ringcentral.paths.restapi.account.extension.messagesync.Index(this)
    }


    @JvmOverloads
    fun ringout(ringoutId: String? = null): com.ringcentral.paths.restapi.account.extension.ringout.Index {
        return com.ringcentral.paths.restapi.account.extension.ringout.Index(this, ringoutId)
    }


    fun addressbook(): com.ringcentral.paths.restapi.account.extension.addressbook.Index {
        return com.ringcentral.paths.restapi.account.extension.addressbook.Index(this)
    }


    fun addressbooksync(): com.ringcentral.paths.restapi.account.extension.addressbooksync.Index {
        return com.ringcentral.paths.restapi.account.extension.addressbooksync.Index(this)
    }


    fun favorite(): com.ringcentral.paths.restapi.account.extension.favorite.Index {
        return com.ringcentral.paths.restapi.account.extension.favorite.Index(this)
    }


    fun presence(): com.ringcentral.paths.restapi.account.extension.presence.Index {
        return com.ringcentral.paths.restapi.account.extension.presence.Index(this)
    }


    @JvmOverloads
    fun meeting(meetingId: String? = null): com.ringcentral.paths.restapi.account.extension.meeting.Index {
        return com.ringcentral.paths.restapi.account.extension.meeting.Index(this, meetingId)
    }


    fun meetingsconfiguration(): com.ringcentral.paths.restapi.account.extension.meetingsconfiguration.Index {
        return com.ringcentral.paths.restapi.account.extension.meetingsconfiguration.Index(this)
    }


    fun authzprofile(): com.ringcentral.paths.restapi.account.extension.authzprofile.Index {
        return com.ringcentral.paths.restapi.account.extension.authzprofile.Index(this)
    }


    fun businesshours(): com.ringcentral.paths.restapi.account.extension.businesshours.Index {
        return com.ringcentral.paths.restapi.account.extension.businesshours.Index(this)
    }


    fun callerblocking(): com.ringcentral.paths.restapi.account.extension.callerblocking.Index {
        return com.ringcentral.paths.restapi.account.extension.callerblocking.Index(this)
    }


    @JvmOverloads
    fun forwardingnumber(forwardingNumberId: String? = null): com.ringcentral.paths.restapi.account.extension.forwardingnumber.Index {
        return com.ringcentral.paths.restapi.account.extension.forwardingnumber.Index(this, forwardingNumberId)
    }


    @JvmOverloads
    fun answeringrule(ruleId: String? = null): com.ringcentral.paths.restapi.account.extension.answeringrule.Index {
        return com.ringcentral.paths.restapi.account.extension.answeringrule.Index(this, ruleId)
    }


    @JvmOverloads
    fun greeting(greetingId: String? = null): com.ringcentral.paths.restapi.account.extension.greeting.Index {
        return com.ringcentral.paths.restapi.account.extension.greeting.Index(this, greetingId)
    }


    fun phonenumber(): com.ringcentral.paths.restapi.account.extension.phonenumber.Index {
        return com.ringcentral.paths.restapi.account.extension.phonenumber.Index(this)
    }


    fun callerid(): com.ringcentral.paths.restapi.account.extension.callerid.Index {
        return com.ringcentral.paths.restapi.account.extension.callerid.Index(this)
    }


    fun grant(): com.ringcentral.paths.restapi.account.extension.grant.Index {
        return com.ringcentral.paths.restapi.account.extension.grant.Index(this)
    }


    fun notificationsettings(): com.ringcentral.paths.restapi.account.extension.notificationsettings.Index {
        return com.ringcentral.paths.restapi.account.extension.notificationsettings.Index(this)
    }


    @JvmOverloads
    fun profileimage(scaleSize: String? = null): com.ringcentral.paths.restapi.account.extension.profileimage.Index {
        return com.ringcentral.paths.restapi.account.extension.profileimage.Index(this, scaleSize)
    }


    fun conferencing(): com.ringcentral.paths.restapi.account.extension.conferencing.Index {
        return com.ringcentral.paths.restapi.account.extension.conferencing.Index(this)
    }


    fun device(): com.ringcentral.paths.restapi.account.extension.device.Index {
        return com.ringcentral.paths.restapi.account.extension.device.Index(this)
    }

}