package com.ringcentral.paths.teammessaging;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;

    public Index(RestClient rc) {
        this.rc = rc;
    }

    public String path() {
        return "" + "/team-messaging";
    }

    public String path(Boolean withParameter) {
        return path();
    }


    public com.ringcentral.paths.teammessaging.v1.Index v1() {
        return new com.ringcentral.paths.teammessaging.v1.Index(this);
    }

}
