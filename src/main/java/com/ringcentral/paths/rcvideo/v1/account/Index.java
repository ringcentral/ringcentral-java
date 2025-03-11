package com.ringcentral.paths.rcvideo.v1.account;

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
            return parent.path() + "/account/" + accountId;
        }
        return parent.path() + "/account";
    }

    public String path() {
        return path(true);
    }


    public com.ringcentral.paths.rcvideo.v1.account.extension.Index extension() {
        return this.extension(null);
    }

    public com.ringcentral.paths.rcvideo.v1.account.extension.Index extension(String extensionId) {
        return new com.ringcentral.paths.rcvideo.v1.account.extension.Index(this, extensionId);
    }


    public com.ringcentral.paths.rcvideo.v1.account.recordings.Index recordings() {
        return new com.ringcentral.paths.rcvideo.v1.account.recordings.Index(this);
    }

}
