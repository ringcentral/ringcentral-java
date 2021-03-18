package com.ringcentral.paths.restapi.account.extension.addressbook.contact

class Index(
    val parent: com.ringcentral.paths.restapi.account.extension.addressbook.Index,
    val contactId: String? = null
) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && contactId != null) {
            return "${parent.path()}/contact/${contactId}"
        }

        return "${parent.path()}/contact"
    }

    /**
     * Operation: Get Contact List
     * Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/address-book/contact
     */
    @Throws(com.ringcentral.RestException::class, java.io.IOException::class)
    @JvmOverloads
    fun list(queryParams: com.ringcentral.definitions.ListContactsParameters? = null): com.ringcentral.definitions.ContactList? {
        val rb: okhttp3.ResponseBody = rc.get(this.path(false), queryParams)

        return com.ringcentral.Utils.gson.fromJson(rb.string(), com.ringcentral.definitions.ContactList::class.java)

    }


    /**
     * Operation: Create Contact
     * Http Post /restapi/v1.0/account/{accountId}/extension/{extensionId}/address-book/contact
     */
    @Throws(com.ringcentral.RestException::class, java.io.IOException::class)
    @JvmOverloads
    fun post(
        personalContactRequest: com.ringcentral.definitions.PersonalContactRequest,
        queryParams: com.ringcentral.definitions.CreateContactParameters? = null
    ): com.ringcentral.definitions.PersonalContactResource? {
        val rb: okhttp3.ResponseBody = rc.post(this.path(false), personalContactRequest, queryParams)

        return com.ringcentral.Utils.gson.fromJson(
            rb.string(),
            com.ringcentral.definitions.PersonalContactResource::class.java
        )

    }


    /**
     * Operation: Get Contact
     * Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/address-book/contact/{contactId}
     */
    @Throws(com.ringcentral.RestException::class, java.io.IOException::class)
    fun get(): com.ringcentral.definitions.PersonalContactResource? {
        if (this.contactId == null) {
            throw NullPointerException("contactId");
        }

        val rb: okhttp3.ResponseBody = rc.get(this.path())

        return com.ringcentral.Utils.gson.fromJson(
            rb.string(),
            com.ringcentral.definitions.PersonalContactResource::class.java
        )

    }


    /**
     * Operation: Update Contact
     * Http Put /restapi/v1.0/account/{accountId}/extension/{extensionId}/address-book/contact/{contactId}
     */
    @Throws(com.ringcentral.RestException::class, java.io.IOException::class)
    @JvmOverloads
    fun put(
        personalContactRequest: com.ringcentral.definitions.PersonalContactRequest,
        queryParams: com.ringcentral.definitions.UpdateContactParameters? = null
    ): com.ringcentral.definitions.PersonalContactResource? {
        if (this.contactId == null) {
            throw NullPointerException("contactId");
        }

        val rb: okhttp3.ResponseBody = rc.put(this.path(), personalContactRequest, queryParams)

        return com.ringcentral.Utils.gson.fromJson(
            rb.string(),
            com.ringcentral.definitions.PersonalContactResource::class.java
        )

    }


    /**
     * Operation: Delete Contact
     * Http Delete /restapi/v1.0/account/{accountId}/extension/{extensionId}/address-book/contact/{contactId}
     */
    @Throws(com.ringcentral.RestException::class, java.io.IOException::class)
    fun delete(): String? {
        if (this.contactId == null) {
            throw NullPointerException("contactId");
        }

        val rb: okhttp3.ResponseBody = rc.delete(this.path())

        return rb.string()

    }

}
