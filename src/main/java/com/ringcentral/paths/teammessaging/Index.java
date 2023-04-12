package com.ringcentral.paths.teammessaging;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;

    public Index(RestClient rc) {
        this.rc = rc;
    }

    public String path() {
        return "" + "/team-messaging";
    }


    public com.ringcentral.paths.teammessaging.v1.Index v1() {
        return new com.ringcentral.paths.teammessaging.v1.Index(this);
    }

}
