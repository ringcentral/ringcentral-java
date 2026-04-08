package com.ringcentral.definitions;

public class MsTeamsUserListResponseMappings {
    /** RingCentral extension ID of the user to connect */
    public String extensionId;

    public MsTeamsUserListResponseMappings extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }

    /** Phone number in e.164 format (with &#039;+&#039; prefix) Example: +16501234567 */
    public String phoneNumber;

    public MsTeamsUserListResponseMappings phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Connection status of the Microsoft Teams Direct Routing user Enum: Connected, Initial,
     * RemoteNotFound, OutOfSync, Connecting, Disconnecting, DisconnectFailed, RemoteUserRemoved
     */
    public String status;

    public MsTeamsUserListResponseMappings status(String status) {
        this.status = status;
        return this;
    }
}
