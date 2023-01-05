package com.ringcentral.definitions;


public class MakeCallOutRequest
{
    /**
     * Required
     */
    public MakeCallOutCallerInfoRequestFrom from;
    public MakeCallOutRequest from(MakeCallOutCallerInfoRequestFrom from)
    {
        this.from = from;
        return this;
    }

    /**
     * Required
     */
    public MakeCallOutCallerInfoRequestTo to;
    public MakeCallOutRequest to(MakeCallOutCallerInfoRequestTo to)
    {
        this.to = to;
        return this;
    }
}