package com.ringcentral.paths.webinar.registration;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.webinar.Index parent;

    public Index(com.ringcentral.paths.webinar.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/registration";
    }


    public com.ringcentral.paths.webinar.registration.v1.Index v1() {
        return new com.ringcentral.paths.webinar.registration.v1.Index(this);
    }

}
