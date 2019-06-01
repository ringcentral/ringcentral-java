package com.ringcentral.definitions;


public class CallSession {
    /**
     * Call session information
     */
    public CallSessionObject session;

    public CallSession session(CallSessionObject session) {
        this.session = session;
        return this;
    }

}
