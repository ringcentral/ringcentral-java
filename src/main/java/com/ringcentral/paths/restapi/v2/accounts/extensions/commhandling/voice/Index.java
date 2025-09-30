package com.ringcentral.paths.restapi.v2.accounts.extensions.commhandling.voice;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.v2.accounts.extensions.commhandling.Index parent;

    public Index(com.ringcentral.paths.restapi.v2.accounts.extensions.commhandling.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path(false) + "/voice";
    }

    public String path(Boolean withParameter) {
        return path();
    }


    public com.ringcentral.paths.restapi.v2.accounts.extensions.commhandling.voice.staterules.Index stateRules() {
        return this.stateRules(null);
    }

    public com.ringcentral.paths.restapi.v2.accounts.extensions.commhandling.voice.staterules.Index stateRules(String stateId) {
        return new com.ringcentral.paths.restapi.v2.accounts.extensions.commhandling.voice.staterules.Index(this, stateId);
    }


    public com.ringcentral.paths.restapi.v2.accounts.extensions.commhandling.voice.interactionrules.Index interactionRules() {
        return this.interactionRules(null);
    }

    public com.ringcentral.paths.restapi.v2.accounts.extensions.commhandling.voice.interactionrules.Index interactionRules(String ruleId) {
        return new com.ringcentral.paths.restapi.v2.accounts.extensions.commhandling.voice.interactionrules.Index(this, ruleId);
    }


    public com.ringcentral.paths.restapi.v2.accounts.extensions.commhandling.voice.forwardingtargets.Index forwardingTargets() {
        return new com.ringcentral.paths.restapi.v2.accounts.extensions.commhandling.voice.forwardingtargets.Index(this);
    }

}
