package com.ringcentral.paths.rcvideo.v2;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.rcvideo.Index parent;

    public Index(com.ringcentral.paths.rcvideo.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/v2";
    }


    public com.ringcentral.paths.rcvideo.v2.account.Index account() {
        return this.account(null);
    }

    public com.ringcentral.paths.rcvideo.v2.account.Index account(String accountId) {
        return new com.ringcentral.paths.rcvideo.v2.account.Index(this, accountId);
    }


    public com.ringcentral.paths.rcvideo.v2.bridges.Index bridges() {
        return this.bridges(null);
    }

    public com.ringcentral.paths.rcvideo.v2.bridges.Index bridges(String bridgeId) {
        return new com.ringcentral.paths.rcvideo.v2.bridges.Index(this, bridgeId);
    }

}
