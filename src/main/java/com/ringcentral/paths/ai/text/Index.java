package com.ringcentral.paths.ai.text;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.ai.Index parent;

    public Index(com.ringcentral.paths.ai.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/text";
    }


    public com.ringcentral.paths.ai.text.v1.Index v1() {
        return new com.ringcentral.paths.ai.text.v1.Index(this);
    }

}
