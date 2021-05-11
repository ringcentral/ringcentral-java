package com.ringcentral.paths.restapi.glip.recent;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.glip.Index parent;

    public Index(com.ringcentral.paths.restapi.glip.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/recent";
    }


    public com.ringcentral.paths.restapi.glip.recent.chats.Index chats() {
        return new com.ringcentral.paths.restapi.glip.recent.chats.Index(this);
    }

}
