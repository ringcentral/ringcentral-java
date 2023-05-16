package com.ringcentral.definitions;


public class BatchProvisionUsersResponseResultsExtensionDevices {
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

    public BatchProvisionUsersResponseResultsExtensionDevices id(String id) {
        this.id = id;
        return this;
    }

    public BatchProvisionUsersResponseResultsExtensionDevices phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
}
