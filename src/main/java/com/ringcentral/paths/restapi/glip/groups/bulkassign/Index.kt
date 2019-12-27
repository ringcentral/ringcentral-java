package com.ringcentral.paths.restapi.glip.groups.bulkassign

class Index(val parent: com.ringcentral.paths.restapi.glip.groups.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/bulk-assign"
    }

    /**
     * Operation: Edit Group Members
     * Http Post /restapi/v1.0/glip/groups/{groupId}/bulk-assign
     */
    fun post(editGroupRequest: com.ringcentral.definitions.EditGroupRequest): com.ringcentral.definitions.GlipGroupInfo? {
        val rb: okhttp3.ResponseBody = rc.post(this.path(), editGroupRequest)

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.GlipGroupInfo::class.java)

    }

}
