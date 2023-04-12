package com.ringcentral.paths.ai.text.v1.async;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.ai.text.v1.Index parent;

    public Index(com.ringcentral.paths.ai.text.v1.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/async";
    }


    public com.ringcentral.paths.ai.text.v1.async.summarize.Index summarize() {
        return new com.ringcentral.paths.ai.text.v1.async.summarize.Index(this);
    }


    public com.ringcentral.paths.ai.text.v1.async.punctuate.Index punctuate() {
        return new com.ringcentral.paths.ai.text.v1.async.punctuate.Index(this);
    }

}
