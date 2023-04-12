package com.ringcentral.paths.teammessaging.v1.recent;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.teammessaging.v1.Index parent;

    public Index(com.ringcentral.paths.teammessaging.v1.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/recent";
    }


    public com.ringcentral.paths.teammessaging.v1.recent.chats.Index chats() {
        return new com.ringcentral.paths.teammessaging.v1.recent.chats.Index(this);
    }

}
