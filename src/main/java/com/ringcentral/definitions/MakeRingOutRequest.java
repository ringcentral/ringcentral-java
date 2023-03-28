package com.ringcentral.definitions;


public class MakeRingOutRequest {
    /**
     * Required
     */
    public MakeRingOutCallerInfoRequestFrom from;
    /**
     * Required
     */
    public MakeRingOutCallerInfoRequestTo to;
    /**
     *
     */
    public MakeRingOutCallerIdInfo callerId;
    /**
     * Audio prompt that a calling party hears when a call
     * is connected
     */
    public Boolean playPrompt;
    /**
     *
     */
    public MakeRingOutCountryInfo country;

    public MakeRingOutRequest from(MakeRingOutCallerInfoRequestFrom from) {
        this.from = from;
        return this;
    }

    public MakeRingOutRequest to(MakeRingOutCallerInfoRequestTo to) {
        this.to = to;
        return this;
    }

    public MakeRingOutRequest callerId(MakeRingOutCallerIdInfo callerId) {
        this.callerId = callerId;
        return this;
    }

    public MakeRingOutRequest playPrompt(Boolean playPrompt) {
        this.playPrompt = playPrompt;
        return this;
    }

    public MakeRingOutRequest country(MakeRingOutCountryInfo country) {
        this.country = country;
        return this;
    }
}
