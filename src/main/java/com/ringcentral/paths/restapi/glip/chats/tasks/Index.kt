package com.ringcentral.paths.restapi.glip.chats.tasks

class Index(val parent: com.ringcentral.paths.restapi.glip.chats.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/tasks"
    }

    /**
     * Operation: Get Chat Tasks
     * Http Get /restapi/v1.0/glip/chats/{chatId}/tasks
     */
    @JvmOverloads
    fun get(queryParams: com.ringcentral.definitions.ListChatTasksParameters? = null): com.ringcentral.definitions.GlipTaskList? {
        val rb: okhttp3.ResponseBody = rc.get(this.path(), queryParams)

        return com.ringcentral.Utils.gson.fromJson(rb.string(), com.ringcentral.definitions.GlipTaskList::class.java)

    }


    /**
     * Operation: Create Task
     * Http Post /restapi/v1.0/glip/chats/{chatId}/tasks
     */
    fun post(glipCreateTask: com.ringcentral.definitions.GlipCreateTask): com.ringcentral.definitions.GlipTaskInfo? {
        val rb: okhttp3.ResponseBody = rc.post(this.path(), glipCreateTask)

        return com.ringcentral.Utils.gson.fromJson(rb.string(), com.ringcentral.definitions.GlipTaskInfo::class.java)

    }

}
