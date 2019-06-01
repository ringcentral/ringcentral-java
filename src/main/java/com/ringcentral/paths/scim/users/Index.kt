package com.ringcentral.paths.scim.users

class Index(val parent: com.ringcentral.paths.scim.Index, val id: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && id != null) {
            return "${parent.path()}/Users/${id}"
        }

        return "${parent.path()}/Users"
    }

    /**
     * Operation: Search or List Users
     * Http Get /scim/v2/Users
     */
    @JvmOverloads
    fun list(queryParams: com.ringcentral.definitions.SearchViaGet2Parameters? = null): com.ringcentral.definitions.UserSearchResponse? {
        val rb: okhttp3.ResponseBody = rc.get(this.path(false), queryParams)

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.UserSearchResponse::class.java)

    }


    /**
     * Operation: Create User
     * Http Post /scim/v2/Users
     */
    fun post(user: com.ringcentral.definitions.User): com.ringcentral.definitions.UserResponse? {
        val rb: okhttp3.ResponseBody = rc.post(this.path(false), user)

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.UserResponse::class.java)

    }


    /**
     * Operation: Get User
     * Http Get /scim/v2/Users/{id}
     */
    fun get(): com.ringcentral.definitions.UserResponse? {
        if (this.id == null) {
            throw NullPointerException("id")
        }

        val rb: okhttp3.ResponseBody = rc.get(this.path())

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.UserResponse::class.java)

    }


    /**
     * Operation: Update/Replace User
     * Http Put /scim/v2/Users/{id}
     */
    fun put(user: com.ringcentral.definitions.User): com.ringcentral.definitions.UserResponse? {
        if (this.id == null) {
            throw NullPointerException("id")
        }

        val rb: okhttp3.ResponseBody = rc.put(this.path(), user)

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.UserResponse::class.java)

    }


    /**
     * Operation: Delete User
     * Http Delete /scim/v2/Users/{id}
     */
    fun delete(): String? {
        if (this.id == null) {
            throw NullPointerException("id")
        }

        val rb: okhttp3.ResponseBody = rc.delete(this.path())

        return rb.string()

    }


    /**
     * Operation: Update/Patch User
     * Http Patch /scim/v2/Users/{id}
     */
    fun patch(userPatch: com.ringcentral.definitions.UserPatch): com.ringcentral.definitions.UserResponse? {
        if (this.id == null) {
            throw NullPointerException("id")
        }

        val rb: okhttp3.ResponseBody = rc.patch(this.path(), userPatch)

        return com.alibaba.fastjson.JSON.parseObject(rb.string(), com.ringcentral.definitions.UserResponse::class.java)

    }


    fun dotsearch(): com.ringcentral.paths.scim.users.dotsearch.Index {
        return com.ringcentral.paths.scim.users.dotsearch.Index(this)
    }

}