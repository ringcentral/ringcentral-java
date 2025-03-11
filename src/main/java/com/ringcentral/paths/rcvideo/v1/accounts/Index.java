package com.ringcentral.paths.rcvideo.v1.accounts;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.rcvideo.v1.Index parent;
    public String accountId;

    public Index(com.ringcentral.paths.rcvideo.v1.Index parent, String accountId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.accountId = accountId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && accountId != null) {
            return parent.path() + "/accounts/" + accountId;
        }
        return parent.path() + "/accounts";
    }

    public String path() {
        return path(true);
    }


    public com.ringcentral.paths.rcvideo.v1.accounts.extensions.Index extensions() {
        return this.extensions(null);
    }

    public com.ringcentral.paths.rcvideo.v1.accounts.extensions.Index extensions(String extensionId) {
        return new com.ringcentral.paths.rcvideo.v1.accounts.extensions.Index(this, extensionId);
    }

}
