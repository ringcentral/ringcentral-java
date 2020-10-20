package com.ringcentral.paths.restapi.account.a2psms

class Index(val parent: com.ringcentral.paths.restapi.account.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/a2p-sms"
    }


    @JvmOverloads
    fun batch(batchId: String? = null): com.ringcentral.paths.restapi.account.a2psms.batch.Index {
        return com.ringcentral.paths.restapi.account.a2psms.batch.Index(this, batchId)
    }


    @JvmOverloads
    fun messages(messageId: String? = null): com.ringcentral.paths.restapi.account.a2psms.messages.Index {
        return com.ringcentral.paths.restapi.account.a2psms.messages.Index(this, messageId)
    }


    fun optouts(): com.ringcentral.paths.restapi.account.a2psms.optouts.Index {
        return com.ringcentral.paths.restapi.account.a2psms.optouts.Index(this)
    }

}
