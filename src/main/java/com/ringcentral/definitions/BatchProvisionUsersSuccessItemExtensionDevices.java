package com.ringcentral.definitions;


public class BatchProvisionUsersSuccessItemExtensionDevices {
    /**
     * The internal identifier of device created
     * Example: 12345
     */
    public String id;
    /**
     * Phone number in e.164 format (with &#039;+&#039; prefix)
     * Example: +16501234567
     */
    public String phoneNumber;

    public BatchProvisionUsersSuccessItemExtensionDevices id(String id) {
        this.id = id;
        return this;
    }

    public BatchProvisionUsersSuccessItemExtensionDevices phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
}
