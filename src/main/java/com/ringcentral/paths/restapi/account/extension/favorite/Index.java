package com.ringcentral.paths.restapi.account.extension.favorite;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.FavoriteCollection;
import com.ringcentral.definitions.FavoriteContactList;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.extension.Index parent;

    public Index(com.ringcentral.paths.restapi.account.extension.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/favorite";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Returns the list of favorite contacts of the current extension.
     * Favorite contacts include both company contacts (extensions) and personal
     * contacts (address book records).
     * <p>
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/favorite
     * Rate Limit Group: Light
     * App Permission: ReadContacts
     * User Permission: ReadPersonalContacts
     */
    public FavoriteContactList get() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), FavoriteContactList.class);
    }

    /**
     * Updates the list of favorite contacts of the current extension.
     * Favorite contacts include both company contacts (extensions) and personal
     * contacts (address book records).**Please note**: Currently personal address
     * book size is limited to 10 000 contacts.
     * <p>
     * HTTP Method: put
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/favorite
     * Rate Limit Group: Medium
     * App Permission: Contacts
     * User Permission: EditPersonalContacts
     */
    public FavoriteContactList put(FavoriteCollection favoriteCollection) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.put(this.path(), favoriteCollection, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), FavoriteContactList.class);
    }
}
