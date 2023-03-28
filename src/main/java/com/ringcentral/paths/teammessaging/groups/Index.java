package com.ringcentral.paths.teammessaging.groups;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.teammessaging.Index parent;
    public String groupId;

    public Index(com.ringcentral.paths.teammessaging.Index parent, String groupId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.groupId = groupId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && groupId != null) {
            return parent.path() + "/groups/" + groupId;
        }
        return parent.path() + "/groups";
    }

    public String path() {
        return path(true);
    }


    public com.ringcentral.paths.teammessaging.groups.events.Index events() {
        return new com.ringcentral.paths.teammessaging.groups.events.Index(this);
    }


    public com.ringcentral.paths.teammessaging.groups.webhooks.Index webhooks() {
        return new com.ringcentral.paths.teammessaging.groups.webhooks.Index(this);
    }

}
