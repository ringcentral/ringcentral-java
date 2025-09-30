package com.ringcentral.paths.restapi.account.extension.addressbooksync;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.AddressBookSync;
import com.ringcentral.definitions.SyncAddressBookParameters;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.extension.Index parent;

    public Index(com.ringcentral.paths.restapi.account.extension.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/address-book-sync";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Synchronizes user contacts.
     * <p>
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/address-book-sync
     * Rate Limit Group: Heavy
     * App Permission: ReadContacts
     * User Permission: ReadPersonalContacts
     */
    public AddressBookSync get(SyncAddressBookParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), AddressBookSync.class);
    }

    public AddressBookSync get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }
}
