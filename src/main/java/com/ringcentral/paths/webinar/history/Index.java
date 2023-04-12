package com.ringcentral.paths.webinar.history;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.webinar.Index parent;

    public Index(com.ringcentral.paths.webinar.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/history";
    }


    public com.ringcentral.paths.webinar.history.v1.Index v1() {
        return new com.ringcentral.paths.webinar.history.v1.Index(this);
    }

}
