package com.ringcentral.definitions;

public class RingOutInfo {
    // Internal identifier of a RingOut call
    public String id;
    // RingOut status information
    public RingOutStatusInfo status;

    public RingOutInfo id(String id) {
        this.id = id;
        return this;
    }

    public RingOutInfo status(RingOutStatusInfo status) {
        this.status = status;
        return this;
    }
}
