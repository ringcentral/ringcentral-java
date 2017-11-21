package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class MakeRingOutRequest
{
    // Phone number of the caller. This number corresponds to the 1st leg of the RingOut call. This number can be one of user's configured forwarding numbers or arbitrary number
    public MakeRingOutCallerInfoRequestFrom from;
    public MakeRingOutRequest from(MakeRingOutCallerInfoRequestFrom from) {
        this.from = from;
        return this;
    }
    // Phone number of the called party. This number corresponds to the 2nd leg of the RingOut call
    public MakeRingOutCallerInfoRequestTo to;
    public MakeRingOutRequest to(MakeRingOutCallerInfoRequestTo to) {
        this.to = to;
        return this;
    }
    // The number which will be displayed to the called party
    public MakeRingOutCallerInfoRequestTo callerId;
    public MakeRingOutRequest callerId(MakeRingOutCallerInfoRequestTo callerId) {
        this.callerId = callerId;
        return this;
    }
    // The audio prompt that the calling party hears when the call is connected
    public Boolean playPrompt;
    public MakeRingOutRequest playPrompt(Boolean playPrompt) {
        this.playPrompt = playPrompt;
        return this;
    }
    // Optional. Dialing plan country data. If not specified, then extension home country is applied by default
    public MakeRingOutCoutryInfo country;
    public MakeRingOutRequest country(MakeRingOutCoutryInfo country) {
        this.country = country;
        return this;
    }
}
