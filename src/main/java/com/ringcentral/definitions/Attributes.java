package com.ringcentral.definitions;


public class Attributes {
    /**
     * Indicates that this party is agent of new call queue
     */
    public Boolean queueCall;
    /**
     * Indicates that it was emergency ringback to party
     */
    public Boolean emergencyCallback;

    public Attributes queueCall(Boolean queueCall) {
        this.queueCall = queueCall;
        return this;
    }

    public Attributes emergencyCallback(Boolean emergencyCallback) {
        this.emergencyCallback = emergencyCallback;
        return this;
    }
}
