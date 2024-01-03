package com.ringcentral.paths.rcvideo.v2.account.extension;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.rcvideo.v2.account.Index parent;
    public String extensionId;

    public Index(com.ringcentral.paths.rcvideo.v2.account.Index parent, String extensionId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.extensionId = extensionId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && extensionId != null) {
            return parent.path() + "/extension/" + extensionId;
        }
        return parent.path() + "/extension";
    }

    public String path() {
        return path(true);
    }


    public com.ringcentral.paths.rcvideo.v2.account.extension.bridges.Index bridges() {
        return new com.ringcentral.paths.rcvideo.v2.account.extension.bridges.Index(this);
    }

}
