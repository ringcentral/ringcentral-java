package com.ringcentral.paths.webinar;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;

    public Index(RestClient rc) {
        this.rc = rc;
    }

    public String path() {
        return "" + "/webinar";
    }

    public String path(Boolean withParameter) {
        return path();
    }


    public com.ringcentral.paths.webinar.history.Index history() {
        return new com.ringcentral.paths.webinar.history.Index(this);
    }


    public com.ringcentral.paths.webinar.registration.Index registration() {
        return new com.ringcentral.paths.webinar.registration.Index(this);
    }


    public com.ringcentral.paths.webinar.notifications.Index notifications() {
        return new com.ringcentral.paths.webinar.notifications.Index(this);
    }


    public com.ringcentral.paths.webinar.configuration.Index configuration() {
        return new com.ringcentral.paths.webinar.configuration.Index(this);
    }

}
