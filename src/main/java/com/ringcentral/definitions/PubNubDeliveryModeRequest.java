package com.ringcentral.definitions;


public class PubNubDeliveryModeRequest {
    /**
     * The transport type for this subscription
     * Required
     * Enum: PubNub
     */
    public String transportType;
    /**
     * Optional. Specifies if notification messages will be encrypted
     * or not. Please note that for some event filters (e.g. presence) encryption is mandatory and
     * `false` value provided by caller will be ignored.
     */
    public Boolean encryption;

    public PubNubDeliveryModeRequest transportType(String transportType) {
        this.transportType = transportType;
        return this;
    }

    public PubNubDeliveryModeRequest encryption(Boolean encryption) {
        this.encryption = encryption;
        return this;
    }
}
