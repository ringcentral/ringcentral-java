package com.ringcentral.definitions;


public class GetRingOutStatusResponse {
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

    public GetRingOutStatusResponse id(Long id) {
        this.id = id;
        return this;
    }

    public GetRingOutStatusResponse uri(String uri) {
        this.uri = uri;
        return this;
    }

    public GetRingOutStatusResponse status(RingOutStatusInfo status) {
        this.status = status;
        return this;
    }

}
