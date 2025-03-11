package com.ringcentral.paths.webinar.registration.v1;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.webinar.registration.Index parent;

    public Index(com.ringcentral.paths.webinar.registration.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path(false) + "/v1";
    }

    public String path(Boolean withParameter) {
        return path();
    }


    public com.ringcentral.paths.webinar.registration.v1.sessions.Index sessions() {
        return this.sessions(null);
    }

    public com.ringcentral.paths.webinar.registration.v1.sessions.Index sessions(String sessionId) {
        return new com.ringcentral.paths.webinar.registration.v1.sessions.Index(this, sessionId);
    }

}
