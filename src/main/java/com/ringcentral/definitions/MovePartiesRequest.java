package com.ringcentral.definitions;


/**
 * Request body for operation moveParties
 */
public class MovePartiesRequest {
    /**
     *
     */
    public RCCInfo rcc;
    /**
     * Array of parties to drop from session
     */
    public String[] dropParties;
    /**
     * RCV token for Server Based Conferencing
     */
    public String rcvToken;

    public MovePartiesRequest rcc(RCCInfo rcc) {
        this.rcc = rcc;
        return this;
    }

    public MovePartiesRequest dropParties(String[] dropParties) {
        this.dropParties = dropParties;
        return this;
    }

    public MovePartiesRequest rcvToken(String rcvToken) {
        this.rcvToken = rcvToken;
        return this;
    }
}
