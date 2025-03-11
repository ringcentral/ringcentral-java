package com.ringcentral.paths.rcvideo.v1.account.extension;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.rcvideo.v1.account.Index parent;
    public String extensionId;

    public Index(com.ringcentral.paths.rcvideo.v1.account.Index parent, String extensionId) {
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


    public com.ringcentral.paths.rcvideo.v1.account.extension.recordings.Index recordings() {
        return new com.ringcentral.paths.rcvideo.v1.account.extension.recordings.Index(this);
    }

}
