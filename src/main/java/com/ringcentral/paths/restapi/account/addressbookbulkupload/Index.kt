package com.ringcentral.paths.restapi.account.addressbookbulkupload

class Index(val parent: com.ringcentral.paths.restapi.account.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/address-book-bulk-upload"
    }

    /**
     * Operation: Update Multiple Contacts
     * Http Post /restapi/v1.0/account/{accountId}/address-book-bulk-upload
     */
    fun post(addressBookBulkUploadRequest: com.ringcentral.definitions.AddressBookBulkUploadRequest): com.ringcentral.definitions.AddressBookBulkUploadResponse? {
        val rb: okhttp3.ResponseBody = rc.post(this.path(), addressBookBulkUploadRequest)

        return com.ringcentral.Utils.gson.fromJson(
            rb.string(),
            com.ringcentral.definitions.AddressBookBulkUploadResponse::class.java
        )

    }


    @JvmOverloads
    fun tasks(taskId: String? = null): com.ringcentral.paths.restapi.account.addressbookbulkupload.tasks.Index {
        return com.ringcentral.paths.restapi.account.addressbookbulkupload.tasks.Index(this, taskId)
    }

}
