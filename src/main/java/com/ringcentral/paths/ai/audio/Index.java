package com.ringcentral.paths.ai.audio;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.ai.Index parent;

    public Index(com.ringcentral.paths.ai.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/audio";
    }


    public com.ringcentral.paths.ai.audio.v1.Index v1() {
        return new com.ringcentral.paths.ai.audio.v1.Index(this);
    }

}
