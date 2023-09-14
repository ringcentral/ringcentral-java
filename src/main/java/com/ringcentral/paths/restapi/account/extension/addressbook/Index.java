package com.ringcentral.paths.restapi.account.extension.addressbook;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.extension.Index parent;

    public Index(com.ringcentral.paths.restapi.account.extension.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/address-book";
    }

    public String path(Boolean withParameter) {
        return path();
    }


    public com.ringcentral.paths.restapi.account.extension.addressbook.contact.Index contact() {
        return this.contact(null);
    }

    public com.ringcentral.paths.restapi.account.extension.addressbook.contact.Index contact(String contactId) {
        return new com.ringcentral.paths.restapi.account.extension.addressbook.contact.Index(this, contactId);
    }

}
