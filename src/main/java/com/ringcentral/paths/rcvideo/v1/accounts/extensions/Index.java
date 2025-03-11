package com.ringcentral.paths.rcvideo.v1.accounts.extensions;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.rcvideo.v1.accounts.Index parent;
    public String extensionId;

    public Index(com.ringcentral.paths.rcvideo.v1.accounts.Index parent, String extensionId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.extensionId = extensionId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && extensionId != null) {
            return parent.path() + "/extensions/" + extensionId;
        }
        return parent.path() + "/extensions";
    }

    public String path() {
        return path(true);
    }


    public com.ringcentral.paths.rcvideo.v1.accounts.extensions.delegators.Index delegators() {
        return new com.ringcentral.paths.rcvideo.v1.accounts.extensions.delegators.Index(this);
    }

}
