package com.ringcentral.paths.restapi.account.extension.meetingconfiguration;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.extension.Index parent;

    public Index(com.ringcentral.paths.restapi.account.extension.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/meeting-configuration";
    }


    public com.ringcentral.paths.restapi.account.extension.meetingconfiguration.profileimage.Index profileImage() {
        return new com.ringcentral.paths.restapi.account.extension.meetingconfiguration.profileimage.Index(this);
    }

}
