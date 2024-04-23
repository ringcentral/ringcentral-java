package com.ringcentral.paths.cx.socialmessaging;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.cx.Index parent;

    public Index(com.ringcentral.paths.cx.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path(false) + "/social-messaging";
    }

    public String path(Boolean withParameter) {
        return path();
    }


    public com.ringcentral.paths.cx.socialmessaging.v1.Index v1() {
        return new com.ringcentral.paths.cx.socialmessaging.v1.Index(this);
    }

}
