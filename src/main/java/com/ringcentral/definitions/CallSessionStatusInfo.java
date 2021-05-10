package com.ringcentral.definitions;


public class CallSessionStatusInfo {
    /**
     *
     */
    public String code;
    /**
     *
     */
    public String reason;
    /**
     *
     */
    public String parkData;
    /**
     *
     */
    public PeerInfo peerId;
    /**
     *
     */
    public MobilePickupData mobilePickupData;

    public CallSessionStatusInfo code(String code) {
        this.code = code;
        return this;
    }

    public CallSessionStatusInfo reason(String reason) {
        this.reason = reason;
        return this;
    }

    public CallSessionStatusInfo parkData(String parkData) {
        this.parkData = parkData;
        return this;
    }

    public CallSessionStatusInfo peerId(PeerInfo peerId) {
        this.peerId = peerId;
        return this;
    }

    public CallSessionStatusInfo mobilePickupData(MobilePickupData mobilePickupData) {
        this.mobilePickupData = mobilePickupData;
        return this;
    }
}
