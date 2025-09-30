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
     * Returns the user personal contacts.
     * <p>
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
     * Creates the user personal contact.
     * <p>
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
     * Returns the user personal contact(s).
     * [Batch request syntax](https://developers.ringcentral.com/guide/basics/batch-requests) is supported.
     * <p>
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
     * Updates the user personal contact(s) (full resource update).
     * [Batch request syntax](https://developers.ringcentral.com/guide/basics/batch-requests) is supported.
     * <p>
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
     * Deletes the user personal contact(s).
     * [Batch request syntax](https://developers.ringcentral.com/guide/basics/batch-requests) is supported.
     * <p>
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

    /**
     * Updates particular values of a personal contact attributes specified in request (partial resource update). Omitted attributes will remain unchanged.
     * If any attribute is passed in request body with the null value, then this attribute value will be removed.
     * <p>
     * HTTP Method: patch
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/address-book/contact/{contactId}
     * Rate Limit Group: Heavy
     * App Permission: Contacts
     * User Permission: EditPersonalContacts
     */
    public PersonalContactResource patch(PersonalContactRequest personalContactRequest, PatchContactParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        if (contactId == null) {
            throw new IllegalArgumentException("Parameter contactId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.patch(this.path(), personalContactRequest, queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), PersonalContactResource.class);
    }

    public PersonalContactResource patch(PersonalContactRequest personalContactRequest) throws com.ringcentral.RestException, java.io.IOException {
        return this.patch(personalContactRequest, null);
    }
}
