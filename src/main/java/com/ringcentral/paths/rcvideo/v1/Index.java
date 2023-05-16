package com.ringcentral.paths.rcvideo.v1;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.rcvideo.Index parent;

    public Index(com.ringcentral.paths.rcvideo.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path(false) + "/v1";
    }

    public String path(Boolean withParameter) {
        return path();
    }


    public com.ringcentral.paths.rcvideo.v1.account.Index account() {
        return this.account(null);
    }

    public com.ringcentral.paths.rcvideo.v1.account.Index account(String accountId) {
        return new com.ringcentral.paths.rcvideo.v1.account.Index(this, accountId);
    }


    public com.ringcentral.paths.rcvideo.v1.history.Index history() {
        return new com.ringcentral.paths.rcvideo.v1.history.Index(this);
    }


    public com.ringcentral.paths.rcvideo.v1.accounts.Index accounts() {
        return this.accounts(null);
    }

    public com.ringcentral.paths.rcvideo.v1.accounts.Index accounts(String accountId) {
        return new com.ringcentral.paths.rcvideo.v1.accounts.Index(this, accountId);
    }

}
