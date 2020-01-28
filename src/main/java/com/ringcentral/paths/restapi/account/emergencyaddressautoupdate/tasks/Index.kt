package com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.tasks

class Index(val parent: com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.Index, val taskId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && taskId != null) {
            return "${parent.path()}/tasks/${taskId}"
        }

        return "${parent.path()}/tasks"
    }

    /**
     * Operation: Get Emergency Map Configuration Task
     * Http Get /restapi/v1.0/account/{accountId}/emergency-address-auto-update/tasks/{taskId}
     */
    fun get(): com.ringcentral.definitions.AutomaticLocationUpdatesTaskInfo? {
        if (this.taskId == null) {
            throw NullPointerException("taskId");
        }

        val rb: okhttp3.ResponseBody = rc.get(this.path())

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.AutomaticLocationUpdatesTaskInfo::class.java)

    }

}
