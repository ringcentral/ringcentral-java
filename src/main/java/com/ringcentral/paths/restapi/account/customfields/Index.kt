package com.ringcentral.paths.restapi.account.customfields

class Index(val parent: com.ringcentral.paths.restapi.account.Index, val fieldId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && fieldId != null) {
            return "${parent.path()}/custom-fields/${fieldId}"
        }

        return "${parent.path()}/custom-fields"
    }

    /**
     * Operation: Get Custom Field List
     * Http Get /restapi/v1.0/account/{accountId}/custom-fields
     */
    fun get(): com.ringcentral.definitions.CustomFieldsResource? {
        val rb: okhttp3.ResponseBody = rc.get(this.path(false))

        return com.ringcentral.Utils.gson.fromJson(
            rb.string(),
            com.ringcentral.definitions.CustomFieldsResource::class.java
        )

    }


    /**
     * Operation: Create Custom Field
     * Http Post /restapi/v1.0/account/{accountId}/custom-fields
     */
    fun post(customFieldCreateRequest: com.ringcentral.definitions.CustomFieldCreateRequest): com.ringcentral.definitions.CustomFieldResource? {
        val rb: okhttp3.ResponseBody = rc.post(this.path(false), customFieldCreateRequest)

        return com.ringcentral.Utils.gson.fromJson(
            rb.string(),
            com.ringcentral.definitions.CustomFieldResource::class.java
        )

    }


    /**
     * Operation: Update Сustom Field
     * Http Put /restapi/v1.0/account/{accountId}/custom-fields/{fieldId}
     */
    fun put(customFieldUpdateRequest: com.ringcentral.definitions.CustomFieldUpdateRequest): com.ringcentral.definitions.CustomFieldResource? {
        if (this.fieldId == null) {
            throw NullPointerException("fieldId");
        }

        val rb: okhttp3.ResponseBody = rc.put(this.path(), customFieldUpdateRequest)

        return com.ringcentral.Utils.gson.fromJson(
            rb.string(),
            com.ringcentral.definitions.CustomFieldResource::class.java
        )

    }


    /**
     * Operation: Delete Custom Field
     * Http Delete /restapi/v1.0/account/{accountId}/custom-fields/{fieldId}
     */
    fun delete(): String? {
        if (this.fieldId == null) {
            throw NullPointerException("fieldId");
        }

        val rb: okhttp3.ResponseBody = rc.delete(this.path())

        return rb.string()

    }

}
