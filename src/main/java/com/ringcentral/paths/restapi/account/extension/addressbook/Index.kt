package com.ringcentral.paths.restapi.account.extension.addressbook

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/address-book"
    }


    @JvmOverloads
    fun contact(contactId: String? = null): com.ringcentral.paths.restapi.account.extension.addressbook.contact.Index {
        return com.ringcentral.paths.restapi.account.extension.addressbook.contact.Index(this, contactId)
    }

}