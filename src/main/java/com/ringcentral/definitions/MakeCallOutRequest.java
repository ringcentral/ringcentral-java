package com.ringcentral.definitions;


public class MakeCallOutRequest {
    /**
     * Required
     */
    public MakeCallOutCallerInfoRequestFrom from;
    /**
     * Required
     */
    public MakeCallOutCallerInfoRequestTo to;

    public MakeCallOutRequest from(MakeCallOutCallerInfoRequestFrom from) {
        this.from = from;
        return this;
    }

    public MakeCallOutRequest to(MakeCallOutCallerInfoRequestTo to) {
        this.to = to;
        return this;
    }

}
