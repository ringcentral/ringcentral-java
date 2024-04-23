package com.ringcentral.paths.cx.socialmessaging.v1;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.cx.socialmessaging.Index parent;

    public Index(com.ringcentral.paths.cx.socialmessaging.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path(false) + "/v1";
    }

    public String path(Boolean withParameter) {
        return path();
    }


    public com.ringcentral.paths.cx.socialmessaging.v1.contents.Index contents() {
        return this.contents(null);
    }

    public com.ringcentral.paths.cx.socialmessaging.v1.contents.Index contents(String contentId) {
        return new com.ringcentral.paths.cx.socialmessaging.v1.contents.Index(this, contentId);
    }


    public com.ringcentral.paths.cx.socialmessaging.v1.identities.Index identities() {
        return this.identities(null);
    }

    public com.ringcentral.paths.cx.socialmessaging.v1.identities.Index identities(String identityId) {
        return new com.ringcentral.paths.cx.socialmessaging.v1.identities.Index(this, identityId);
    }

}
