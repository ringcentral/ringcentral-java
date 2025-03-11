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


    public com.ringcentral.paths.ai.text.Index text() {
        return new com.ringcentral.paths.ai.text.Index(this);
    }


    public com.ringcentral.paths.ai.audio.Index audio() {
        return new com.ringcentral.paths.ai.audio.Index(this);
    }


    public com.ringcentral.paths.ai.status.Index status() {
        return new com.ringcentral.paths.ai.status.Index(this);
    }


    public com.ringcentral.paths.ai.insights.Index insights() {
        return new com.ringcentral.paths.ai.insights.Index(this);
    }


    public com.ringcentral.paths.ai.ringsense.Index ringsense() {
        return new com.ringcentral.paths.ai.ringsense.Index(this);
    }

}
