package com.ringcentral.paths.rcvideo.v2.bridges.pin;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.rcvideo.v2.bridges.Index parent;

    public Index(com.ringcentral.paths.rcvideo.v2.bridges.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/pin";
    }


    public com.ringcentral.paths.rcvideo.v2.bridges.pin.web.Index web() {
        return this.web(null);
    }

    public com.ringcentral.paths.rcvideo.v2.bridges.pin.web.Index web(String pin) {
        return new com.ringcentral.paths.rcvideo.v2.bridges.pin.web.Index(this, pin);
    }


    public com.ringcentral.paths.rcvideo.v2.bridges.pin.pstn.Index pstn() {
        return this.pstn(null);
    }

    public com.ringcentral.paths.rcvideo.v2.bridges.pin.pstn.Index pstn(String pin) {
        return new com.ringcentral.paths.rcvideo.v2.bridges.pin.pstn.Index(this, pin);
    }

}
