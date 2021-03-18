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
    @Throws(com.ringcentral.RestException::class, java.io.IOException::class)
    @JvmOverloads
    fun list(queryParams: com.ringcentral.definitions.ListExtensionsParameters? = null): com.ringcentral.definitions.GetExtensionListResponse? {
        val rb: okhttp3.ResponseBody = rc.get(this.path(false), queryParams)

        return com.ringcentral.Utils.gson.fromJson(
            rb.string(),
            com.ringcentral.definitions.GetExtensionListResponse::class.java
        )

    }


    /**
     * Operation: Create Extension
     * Http Post /restapi/v1.0/account/{accountId}/extension
     */
    @Throws(com.ringcentral.RestException::class, java.io.IOException::class)
    fun post(extensionCreationRequest: com.ringcentral.definitions.ExtensionCreationRequest): com.ringcentral.definitions.ExtensionCreationResponse? {
        val rb: okhttp3.ResponseBody = rc.post(this.path(false), extensionCreationRequest)

        return com.ringcentral.Utils.gson.fromJson(
            rb.string(),
            com.ringcentral.definitions.ExtensionCreationResponse::class.java
        )

    }


    /**
     * Operation: Get Extension
     * Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}
     */
    @Throws(com.ringcentral.RestException::class, java.io.IOException::class)
    fun get(): com.ringcentral.definitions.GetExtensionInfoResponse? {
        if (this.extensionId == null) {
            throw NullPointerException("extensionId");
        }

        val rb: okhttp3.ResponseBody = rc.get(this.path())

        return com.ringcentral.Utils.gson.fromJson(
            rb.string(),
            com.ringcentral.definitions.GetExtensionInfoResponse::class.java
        )

    }


    /**
     * Operation: Update Extension
     * Http Put /restapi/v1.0/account/{accountId}/extension/{extensionId}
     */
    @Throws(com.ringcentral.RestException::class, java.io.IOException::class)
    fun put(extensionUpdateRequest: com.ringcentral.definitions.ExtensionUpdateRequest): com.ringcentral.definitions.GetExtensionInfoResponse? {
        if (this.extensionId == null) {
            throw NullPointerException("extensionId");
        }

        val rb: okhttp3.ResponseBody = rc.put(this.path(), extensionUpdateRequest)

        return com.ringcentral.Utils.gson.fromJson(
            rb.string(),
            com.ringcentral.definitions.GetExtensionInfoResponse::class.java
        )

    }


    /**
     * Operation: Delete Extension
     * Http Delete /restapi/v1.0/account/{accountId}/extension/{extensionId}
     */
    @Throws(com.ringcentral.RestException::class, java.io.IOException::class)
    @JvmOverloads
    fun delete(queryParams: com.ringcentral.definitions.DeleteExtensionParameters? = null): String? {
        if (this.extensionId == null) {
            throw NullPointerException("extensionId");
        }

        val rb: okhttp3.ResponseBody = rc.delete(this.path(), queryParams)

        return rb.string()

    }


    fun presence(): com.ringcentral.paths.restapi.account.extension.presence.Index {
        return com.ringcentral.paths.restapi.account.extension.presence.Index(this)
    }


    fun callqueuepresence(): com.ringcentral.paths.restapi.account.extension.callqueuepresence.Index {
        return com.ringcentral.paths.restapi.account.extension.callqueuepresence.Index(this)
    }


    fun unifiedpresence(): com.ringcentral.paths.restapi.account.extension.unifiedpresence.Index {
        return com.ringcentral.paths.restapi.account.extension.unifiedpresence.Index(this)
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


    fun device(): com.ringcentral.paths.restapi.account.extension.device.Index {
        return com.ringcentral.paths.restapi.account.extension.device.Index(this)
    }


    fun meetingrecordings(): com.ringcentral.paths.restapi.account.extension.meetingrecordings.Index {
        return com.ringcentral.paths.restapi.account.extension.meetingrecordings.Index(this)
    }


    @JvmOverloads
    fun meeting(meetingId: String? = null): com.ringcentral.paths.restapi.account.extension.meeting.Index {
        return com.ringcentral.paths.restapi.account.extension.meeting.Index(this, meetingId)
    }


    fun meetingconfiguration(): com.ringcentral.paths.restapi.account.extension.meetingconfiguration.Index {
        return com.ringcentral.paths.restapi.account.extension.meetingconfiguration.Index(this)
    }


    fun meetingsconfiguration(): com.ringcentral.paths.restapi.account.extension.meetingsconfiguration.Index {
        return com.ringcentral.paths.restapi.account.extension.meetingsconfiguration.Index(this)
    }


    fun sms(): com.ringcentral.paths.restapi.account.extension.sms.Index {
        return com.ringcentral.paths.restapi.account.extension.sms.Index(this)
    }


    fun mms(): com.ringcentral.paths.restapi.account.extension.mms.Index {
        return com.ringcentral.paths.restapi.account.extension.mms.Index(this)
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


    fun phonenumber(): com.ringcentral.paths.restapi.account.extension.phonenumber.Index {
        return com.ringcentral.paths.restapi.account.extension.phonenumber.Index(this)
    }


    fun callerid(): com.ringcentral.paths.restapi.account.extension.callerid.Index {
        return com.ringcentral.paths.restapi.account.extension.callerid.Index(this)
    }


    fun grant(): com.ringcentral.paths.restapi.account.extension.grant.Index {
        return com.ringcentral.paths.restapi.account.extension.grant.Index(this)
    }


    fun emergencylocations(): com.ringcentral.paths.restapi.account.extension.emergencylocations.Index {
        return com.ringcentral.paths.restapi.account.extension.emergencylocations.Index(this)
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


    fun videoconfiguration(): com.ringcentral.paths.restapi.account.extension.videoconfiguration.Index {
        return com.ringcentral.paths.restapi.account.extension.videoconfiguration.Index(this)
    }


    fun callqueues(): com.ringcentral.paths.restapi.account.extension.callqueues.Index {
        return com.ringcentral.paths.restapi.account.extension.callqueues.Index(this)
    }


    fun features(): com.ringcentral.paths.restapi.account.extension.features.Index {
        return com.ringcentral.paths.restapi.account.extension.features.Index(this)
    }


    fun authzprofile(): com.ringcentral.paths.restapi.account.extension.authzprofile.Index {
        return com.ringcentral.paths.restapi.account.extension.authzprofile.Index(this)
    }


    @JvmOverloads
    fun ringout(ringoutId: String? = null): com.ringcentral.paths.restapi.account.extension.ringout.Index {
        return com.ringcentral.paths.restapi.account.extension.ringout.Index(this, ringoutId)
    }

}
