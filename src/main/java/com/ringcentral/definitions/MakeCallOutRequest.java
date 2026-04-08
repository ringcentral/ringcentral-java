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

    /**
     * Optional. Dialing plan country data. If not specified, then extension home country is applied by default.
     * Format: int64
     */
    public Long countryId;
    public MakeCallOutRequest countryId(Long countryId)
    {
        this.countryId = countryId;
        return this;
    }
}