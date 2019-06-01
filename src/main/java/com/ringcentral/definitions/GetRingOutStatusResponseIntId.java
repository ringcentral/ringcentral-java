package com.ringcentral.definitions;


public class GetRingOutStatusResponseIntId {
    /**
     * Internal identifier of a RingOut call
     */
    public Long id;
    /**
     *
     */
    public String uri;
    /**
     * RingOut status information
     */
    public RingOutStatusInfo status;

    public GetRingOutStatusResponseIntId id(Long id) {
        this.id = id;
        return this;
    }

    public GetRingOutStatusResponseIntId uri(String uri) {
        this.uri = uri;
        return this;
    }

    public GetRingOutStatusResponseIntId status(RingOutStatusInfo status) {
        this.status = status;
        return this;
    }

}
