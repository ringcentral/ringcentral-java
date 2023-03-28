package com.ringcentral.definitions;


public class BridgePstnPins {
    /**
     * Host PSTN PIN. If it is not specified while creation, then a PIN will be generated.
     * Example: 432331057631
     */
    public String host;
    /**
     * Participant PSTN PIN. If it is not specified while creation, then a PIN will be generated.
     * Example: 013409241367
     */
    public String participant;

    public BridgePstnPins host(String host) {
        this.host = host;
        return this;
    }

    public BridgePstnPins participant(String participant) {
        this.participant = participant;
        return this;
    }
}
