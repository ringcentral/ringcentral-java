package com.ringcentral.paths.restapi.glip.tasks.complete

class Index(val parent: com.ringcentral.paths.restapi.glip.tasks.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/complete"
    }

    /**
     * Operation: Complete Task
     * Http Post /restapi/v1.0/glip/tasks/{taskId}/complete
     */
    @Throws(com.ringcentral.RestException::class, java.io.IOException::class)
    fun post(glipCompleteTask: com.ringcentral.definitions.GlipCompleteTask): String? {
        val rb: okhttp3.ResponseBody = rc.post(this.path(), glipCompleteTask)

        return rb.string()

    }

}
