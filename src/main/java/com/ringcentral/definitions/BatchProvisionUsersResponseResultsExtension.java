package com.ringcentral.definitions;


public class BatchProvisionUsersResponseResultsExtension {
    /**
     * The internal identifier of RingCentral extension created
     * Example: 12345
     */
    public String id;
    /**
     *
     */
    public BatchProvisionUsersResponseResultsExtensionDevices[] devices;

    public BatchProvisionUsersResponseResultsExtension id(String id) {
        this.id = id;
        return this;
    }

    public BatchProvisionUsersResponseResultsExtension devices(BatchProvisionUsersResponseResultsExtensionDevices[] devices) {
        this.devices = devices;
        return this;
    }
}
