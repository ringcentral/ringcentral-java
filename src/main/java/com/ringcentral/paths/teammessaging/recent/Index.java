package com.ringcentral.paths.teammessaging.recent;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.teammessaging.Index parent;

    public Index(com.ringcentral.paths.teammessaging.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/recent";
    }


    public com.ringcentral.paths.teammessaging.recent.chats.Index chats() {
        return new com.ringcentral.paths.teammessaging.recent.chats.Index(this);
    }

}
