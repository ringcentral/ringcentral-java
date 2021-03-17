package com.ringcentral.paths.restapi.account.extension.callqueuepresence

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/call-queue-presence"
    }

    /**
     * Operation: Get Agent’s Call Queue Presence
     * Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/call-queue-presence
     */
    @JvmOverloads
    fun get(queryParams: com.ringcentral.definitions.ReadExtensionCallQueuePresenceParameters? = null): com.ringcentral.definitions.ExtensionCallQueuePresenceList? {
        val rb: okhttp3.ResponseBody = rc.get(this.path(), queryParams)

        return com.ringcentral.Utils.gson.fromJson(
            rb.string(),
            com.ringcentral.definitions.ExtensionCallQueuePresenceList::class.java
        )

    }


    /**
     * Operation: Update Call Queue Presence
     * Http Put /restapi/v1.0/account/{accountId}/extension/{extensionId}/call-queue-presence
     */
    fun put(extensionCallQueueUpdatePresenceList: com.ringcentral.definitions.ExtensionCallQueueUpdatePresenceList): com.ringcentral.definitions.ExtensionCallQueuePresenceList? {
        val rb: okhttp3.ResponseBody = rc.put(this.path(), extensionCallQueueUpdatePresenceList)

        return com.ringcentral.Utils.gson.fromJson(
            rb.string(),
            com.ringcentral.definitions.ExtensionCallQueuePresenceList::class.java
        )

    }

}
