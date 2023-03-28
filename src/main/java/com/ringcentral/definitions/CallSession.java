package com.ringcentral.definitions;


public class CallSession {
    /**
     *
     */
    public CallSessionObject session;

    public CallSession session(CallSessionObject session) {
        this.session = session;
        return this;
    }
}
