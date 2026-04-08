package com.ringcentral.definitions;


public class GetMessageInfoMultiResponse
{
    /**
     * Internal identifier of a resource
     * Required
     * Example: 1724099032020
     */
    public String resourceId;
    public GetMessageInfoMultiResponse resourceId(String resourceId)
    {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * HTTP status code of an operation on given resource
     * Required
     * Format: int32
     * Example: 200
     */
    public Long status;
    public GetMessageInfoMultiResponse status(Long status)
    {
        this.status = status;
        return this;
    }

    /**
     * Required
     */
    public GetMessageInfoResponse body;
    public GetMessageInfoMultiResponse body(GetMessageInfoResponse body)
    {
        this.body = body;
        return this;
    }
}