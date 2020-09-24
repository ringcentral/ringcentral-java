package com.ringcentral.paths.restapi.glip.groups

class Index(val parent: com.ringcentral.paths.restapi.glip.Index, val groupId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && groupId != null) {
            return "${parent.path()}/groups/${groupId}"
        }

        return "${parent.path()}/groups"
    }


    fun posts(): com.ringcentral.paths.restapi.glip.groups.posts.Index {
        return com.ringcentral.paths.restapi.glip.groups.posts.Index(this)
    }


    fun events(): com.ringcentral.paths.restapi.glip.groups.events.Index {
        return com.ringcentral.paths.restapi.glip.groups.events.Index(this)
    }


    fun webhooks(): com.ringcentral.paths.restapi.glip.groups.webhooks.Index {
        return com.ringcentral.paths.restapi.glip.groups.webhooks.Index(this)
    }

}
