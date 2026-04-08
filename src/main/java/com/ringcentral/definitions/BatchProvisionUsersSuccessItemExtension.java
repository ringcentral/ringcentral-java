package com.ringcentral.definitions;

public class BatchProvisionUsersSuccessItemExtension {
    /** The internal identifier of RingCentral extension created Example: 12345 */
    public String id;

    public BatchProvisionUsersSuccessItemExtension id(String id) {
        this.id = id;
        return this;
    }

    /** */
    public BatchProvisionUsersSuccessItemExtensionDevices[] devices;

    public BatchProvisionUsersSuccessItemExtension devices(
            BatchProvisionUsersSuccessItemExtensionDevices[] devices) {
        this.devices = devices;
        return this;
    }
}
