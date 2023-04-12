package com.ringcentral.definitions;


public class SBCMoveToRCV {
    /**
     * Array of parties to drop from session
     */
    public String[] dropParties;
    /**
     * RCV token for Server Based Conferencing
     */
    public String rcvToken;

    public SBCMoveToRCV dropParties(String[] dropParties) {
        this.dropParties = dropParties;
        return this;
    }

    public SBCMoveToRCV rcvToken(String rcvToken) {
        this.rcvToken = rcvToken;
        return this;
    }
}
