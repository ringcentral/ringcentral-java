package com.ringcentral.paths.restapi.account.a2psms;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.Index parent;

    public Index(com.ringcentral.paths.restapi.account.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/a2p-sms";
    }

    public String path(Boolean withParameter) {
        return path();
    }


    public com.ringcentral.paths.restapi.account.a2psms.batches.Index batches() {
        return this.batches(null);
    }

    public com.ringcentral.paths.restapi.account.a2psms.batches.Index batches(String batchId) {
        return new com.ringcentral.paths.restapi.account.a2psms.batches.Index(this, batchId);
    }


    public com.ringcentral.paths.restapi.account.a2psms.messages.Index messages() {
        return this.messages(null);
    }

    public com.ringcentral.paths.restapi.account.a2psms.messages.Index messages(String messageId) {
        return new com.ringcentral.paths.restapi.account.a2psms.messages.Index(this, messageId);
    }


    public com.ringcentral.paths.restapi.account.a2psms.statuses.Index statuses() {
        return new com.ringcentral.paths.restapi.account.a2psms.statuses.Index(this);
    }


    public com.ringcentral.paths.restapi.account.a2psms.optouts.Index optOuts() {
        return new com.ringcentral.paths.restapi.account.a2psms.optouts.Index(this);
    }

}
