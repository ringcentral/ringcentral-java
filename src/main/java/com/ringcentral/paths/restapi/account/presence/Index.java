package com.ringcentral.paths.restapi.account.presence;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.AccountPresenceInfo;
import com.ringcentral.definitions.ReadAccountPresenceParameters;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.Index parent;

    public Index(com.ringcentral.paths.restapi.account.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/presence";
    }

    /**
     * Returns presence status of all extensions of an account. Please note: The presenceStatus is returned as Offline (the parameters telephonyStatus, message, userStatus and dndStatus are not returned at all) for the following extension types: Department, Announcement Only, Voicemail (Take Messages Only), Fax User, Paging Only Group, Shared Lines Group, IVR Menu, Application Extension.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/presence
     * Rate Limit Group: Heavy
     * App Permission: ReadPresence
     * User Permission: ReadPresenceStatus
     */
    public AccountPresenceInfo get(ReadAccountPresenceParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), AccountPresenceInfo.class);
    }

    public AccountPresenceInfo get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }
}
