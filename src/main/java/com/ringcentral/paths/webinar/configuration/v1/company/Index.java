package com.ringcentral.paths.webinar.configuration.v1.company;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.webinar.configuration.v1.Index parent;

    public Index(com.ringcentral.paths.webinar.configuration.v1.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path(false) + "/company";
    }

    public String path(Boolean withParameter) {
        return path();
    }


    public com.ringcentral.paths.webinar.configuration.v1.company.sessions.Index sessions() {
        return new com.ringcentral.paths.webinar.configuration.v1.company.sessions.Index(this);
    }

}
