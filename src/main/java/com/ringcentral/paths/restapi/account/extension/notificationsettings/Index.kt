package com.ringcentral.paths.restapi.account.extension.notificationsettings

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/notification-settings"
    }

    /**
     * Operation: Get Notification Settings
     * Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/notification-settings
     */
    fun get(): com.ringcentral.definitions.NotificationSettings? {
        val rb: okhttp3.ResponseBody = rc.get(this.path())

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.NotificationSettings::class.java)

    }


    /**
     * Operation: Update Notification Settings
     * Http Put /restapi/v1.0/account/{accountId}/extension/{extensionId}/notification-settings
     */
    fun put(notificationSettingsUpdateRequest: com.ringcentral.definitions.NotificationSettingsUpdateRequest): com.ringcentral.definitions.NotificationSettings? {
        val rb: okhttp3.ResponseBody = rc.put(this.path(), notificationSettingsUpdateRequest)

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.NotificationSettings::class.java)

    }

}
