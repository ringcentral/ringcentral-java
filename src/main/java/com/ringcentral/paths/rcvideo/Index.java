package com.ringcentral.paths.rcvideo;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;

    public Index(RestClient rc) {
        this.rc = rc;
    }

    public String path() {
        return "" + "/rcvideo";
    }

    public String path(Boolean withParameter) {
        return path();
    }


    public com.ringcentral.paths.rcvideo.v1.Index v1() {
        return new com.ringcentral.paths.rcvideo.v1.Index(this);
    }


    public com.ringcentral.paths.rcvideo.v2.Index v2() {
        return new com.ringcentral.paths.rcvideo.v2.Index(this);
    }

}
