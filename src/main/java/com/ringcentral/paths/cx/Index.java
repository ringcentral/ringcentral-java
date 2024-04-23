package com.ringcentral.paths.cx;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;

    public Index(RestClient rc) {
        this.rc = rc;
    }

    public String path() {
        return "" + "/cx";
    }

    public String path(Boolean withParameter) {
        return path();
    }


    public com.ringcentral.paths.cx.socialmessaging.Index socialMessaging() {
        return new com.ringcentral.paths.cx.socialmessaging.Index(this);
    }

}
