package com.ringcentral.definitions;

public class CallRecordingExtensionResource {
    /** Internal identifier of an extension */
    public String id;

    public CallRecordingExtensionResource id(String id) {
        this.id = id;
        return this;
    }

    /** Format: uri */
    public String uri;

    public CallRecordingExtensionResource uri(String uri) {
        this.uri = uri;
        return this;
    }

    /** */
    public String extensionNumber;

    public CallRecordingExtensionResource extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    /** */
    public String type;

    public CallRecordingExtensionResource type(String type) {
        this.type = type;
        return this;
    }

    /** Direction of a call Enum: Outbound, Inbound, All */
    public String callDirection;

    public CallRecordingExtensionResource callDirection(String callDirection) {
        this.callDirection = callDirection;
        return this;
    }

    /**
     * Alternate call recording setting. Status of the smart ACR for outbound call recordings.
     * Supported for &quot;Outbound&quot; and &quot;All&quot; call directions.
     */
    public Boolean alternateOutboundCallRecordingMode;

    public CallRecordingExtensionResource alternateOutboundCallRecordingMode(
            Boolean alternateOutboundCallRecordingMode) {
        this.alternateOutboundCallRecordingMode = alternateOutboundCallRecordingMode;
        return this;
    }
}
