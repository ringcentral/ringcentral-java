package com.ringcentral.definitions;


public class GetMessageInfoMultiResponse {
    /**
     * Internal identifier of a resource
     * Required
     * Example: 1724099032020
     */
    public String resourceId;
    /**
     * HTTP status code of an operation on given resource
     * Required
     * Format: int32
     * Example: 200
     */
    public Long status;
    /**
     * Required
     */
    public GetMessageInfoResponse body;

    public GetMessageInfoMultiResponse resourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    public GetMessageInfoMultiResponse status(Long status) {
        this.status = status;
        return this;
    }

    public GetMessageInfoMultiResponse body(GetMessageInfoResponse body) {
        this.body = body;
        return this;
    }
}
