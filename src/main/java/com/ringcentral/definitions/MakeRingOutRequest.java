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
     * The audio prompt that the calling party hears when the call is connected
     */
    public Boolean playPrompt;
    /**
     *
     */
    public MakeRingOutCoutryInfo country;

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

    public MakeRingOutRequest country(MakeRingOutCoutryInfo country) {
        this.country = country;
        return this;
    }
}
