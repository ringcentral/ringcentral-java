package com.ringcentral.paths.restapi.account.emergencyaddressautoupdate;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.Index parent;

    public Index(com.ringcentral.paths.restapi.account.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/emergency-address-auto-update";
    }

    public String path(Boolean withParameter) {
        return path();
    }


    public com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.tasks.Index tasks() {
        return this.tasks(null);
    }

    public com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.tasks.Index tasks(String taskId) {
        return new com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.tasks.Index(this, taskId);
    }


    public com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.users.Index users() {
        return new com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.users.Index(this);
    }


    public com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.devices.Index devices() {
        return new com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.devices.Index(this);
    }


    public com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.networks.Index networks() {
        return this.networks(null);
    }

    public com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.networks.Index networks(String networkId) {
        return new com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.networks.Index(this, networkId);
    }


    public com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.switches.Index switches() {
        return this.switches(null);
    }

    public com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.switches.Index switches(String switchId) {
        return new com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.switches.Index(this, switchId);
    }


    public com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.wirelesspoints.Index wirelessPoints() {
        return this.wirelessPoints(null);
    }

    public com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.wirelesspoints.Index wirelessPoints(String pointId) {
        return new com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.wirelesspoints.Index(this, pointId);
    }


    public com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.switchesbulkcreate.Index switchesBulkCreate() {
        return new com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.switchesbulkcreate.Index(this);
    }


    public com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.switchesbulkupdate.Index switchesBulkUpdate() {
        return new com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.switchesbulkupdate.Index(this);
    }


    public com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.switchesbulkvalidate.Index switchesBulkValidate() {
        return new com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.switchesbulkvalidate.Index(this);
    }


    public com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.wirelesspointsbulkcreate.Index wirelessPointsBulkCreate() {
        return new com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.wirelesspointsbulkcreate.Index(this);
    }


    public com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.wirelesspointsbulkupdate.Index wirelessPointsBulkUpdate() {
        return new com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.wirelesspointsbulkupdate.Index(this);
    }


    public com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.wirelesspointsbulkvalidate.Index wirelessPointsBulkValidate() {
        return new com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.wirelesspointsbulkvalidate.Index(this);
    }

}
