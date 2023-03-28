package com.ringcentral.paths.rcvideo;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;

    public Index(RestClient rc) {
        this.rc = rc;
    }

    public String path() {
        return "" + "/rcvideo";
    }


    public com.ringcentral.paths.rcvideo.v2.Index v2() {
        return new com.ringcentral.paths.rcvideo.v2.Index(this);
    }


    public com.ringcentral.paths.rcvideo.history.Index history() {
        return new com.ringcentral.paths.rcvideo.history.Index(this);
    }


    public com.ringcentral.paths.rcvideo.accounts.Index accounts() {
        return this.accounts(null);
    }

    public com.ringcentral.paths.rcvideo.accounts.Index accounts(String accountId) {
        return new com.ringcentral.paths.rcvideo.accounts.Index(this, accountId);
    }

}
