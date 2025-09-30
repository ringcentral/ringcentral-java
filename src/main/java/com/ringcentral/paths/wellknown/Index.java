package com.ringcentral.paths.wellknown;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;

    public Index(RestClient rc) {
        this.rc = rc;
    }

    public String path() {
        return "" + "/.well-known";
    }

    public String path(Boolean withParameter) {
        return path();
    }


    public com.ringcentral.paths.wellknown.openidconfiguration.Index openidConfiguration() {
        return new com.ringcentral.paths.wellknown.openidconfiguration.Index(this);
    }

}
