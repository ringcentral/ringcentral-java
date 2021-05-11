package com.ringcentral.paths.restapi.account.extension.addressbook.contact;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.extension.addressbook.Index parent;
    public String contactId;

    public Index(com.ringcentral.paths.restapi.account.extension.addressbook.Index parent, String contactId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.contactId = contactId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && contactId != null) {
            return parent.path() + "/contact/" + contactId;
        }
        return parent.path() + "/contact";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns user personal contacts.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/address-book/contact
     * Rate Limit Group: Heavy
     * App Permission: ReadContacts
     * User Permission: ReadPersonalContacts
     */
    public ContactList list(ListContactsParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(false), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), ContactList.class);
    }

    public ContactList list() throws com.ringcentral.RestException, java.io.IOException {
        return this.list(null);
    }

    /**
     * Creates personal user contact.
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/address-book/contact
     * Rate Limit Group: Heavy
     * App Permission: Contacts
     * User Permission: EditPersonalContacts
     */
    public PersonalContactResource post(PersonalContactRequest personalContactRequest, CreateContactParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(false), personalContactRequest, queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), PersonalContactResource.class);
    }

    public PersonalContactResource post(PersonalContactRequest personalContactRequest) throws com.ringcentral.RestException, java.io.IOException {
        return this.post(personalContactRequest, null);
    }

    /**
     * Returns contact(s) by ID(s). Batch request is supported.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/address-book/contact/{contactId}
     * Rate Limit Group: Heavy
     * App Permission: ReadContacts
     * User Permission: ReadPersonalContacts
     */
    public PersonalContactResource get() throws com.ringcentral.RestException, java.io.IOException {
        if (contactId == null) {
            throw new IllegalArgumentException("Parameter contactId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), PersonalContactResource.class);
    }

    /**
     * Updates personal contact information by contact ID(s). Batch request is supported
     * HTTP Method: put
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/address-book/contact/{contactId}
     * Rate Limit Group: Heavy
     * App Permission: Contacts
     * User Permission: EditPersonalContacts
     */
    public PersonalContactResource put(PersonalContactRequest personalContactRequest, UpdateContactParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        if (contactId == null) {
            throw new IllegalArgumentException("Parameter contactId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.put(this.path(), personalContactRequest, queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), PersonalContactResource.class);
    }

    public PersonalContactResource put(PersonalContactRequest personalContactRequest) throws com.ringcentral.RestException, java.io.IOException {
        return this.put(personalContactRequest, null);
    }

    /**
     * Deletes contact(s) by ID(s). Batch request is supported.
     * HTTP Method: delete
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/address-book/contact/{contactId}
     * Rate Limit Group: Heavy
     * App Permission: Contacts
     * User Permission: EditPersonalContacts
     */
    public String delete() throws com.ringcentral.RestException, java.io.IOException {
        if (contactId == null) {
            throw new IllegalArgumentException("Parameter contactId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.delete(this.path(), null);
        return rb.string();
    }
}
