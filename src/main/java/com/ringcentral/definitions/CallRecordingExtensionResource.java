package com.ringcentral.definitions;


public class CallRecordingExtensionResource {
    /**
     * Internal identifier of an extension
     */
    public String id;
    /**
     *
     */
    public String uri;
    /**
     *
     */
    public String extensionNumber;
    /**
     *
     */
    public String type;
    /**
     * Direction of call
     * Enum: Outbound, Inbound, All
     */
    public String callDirection;

    public CallRecordingExtensionResource id(String id) {
        this.id = id;
        return this;
    }

    public CallRecordingExtensionResource uri(String uri) {
        this.uri = uri;
        return this;
    }

    public CallRecordingExtensionResource extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    public CallRecordingExtensionResource type(String type) {
        this.type = type;
        return this;
    }

    public CallRecordingExtensionResource callDirection(String callDirection) {
        this.callDirection = callDirection;
        return this;
    }

}
