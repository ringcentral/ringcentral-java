package com.ringcentral.paths.ai.text.v1.async;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.ai.text.v1.Index parent;

    public Index(com.ringcentral.paths.ai.text.v1.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path(false) + "/async";
    }

    public String path(Boolean withParameter) {
        return path();
    }


    public com.ringcentral.paths.ai.text.v1.async.summarize.Index summarize() {
        return new com.ringcentral.paths.ai.text.v1.async.summarize.Index(this);
    }


    public com.ringcentral.paths.ai.text.v1.async.punctuate.Index punctuate() {
        return new com.ringcentral.paths.ai.text.v1.async.punctuate.Index(this);
    }

}
