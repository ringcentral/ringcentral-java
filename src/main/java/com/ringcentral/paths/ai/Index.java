package com.ringcentral.paths.ai;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;

    public Index(RestClient rc) {
        this.rc = rc;
    }

    public String path() {
        return "" + "/ai";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    public com.ringcentral.paths.ai.ringsense.Index ringsense() {
        return new com.ringcentral.paths.ai.ringsense.Index(this);
    }
}
