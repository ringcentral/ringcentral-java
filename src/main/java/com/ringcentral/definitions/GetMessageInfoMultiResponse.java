package com.ringcentral.definitions;


public class GetMessageInfoMultiResponse {
    /**
     * Internal identifier of a resource
     */
    public String resourceId;
    /**
     * Status code of resource retrieval
     */
    public Long status;
    /**
     *
     */
    public MessageBody body;

    public GetMessageInfoMultiResponse resourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    public GetMessageInfoMultiResponse status(Long status) {
        this.status = status;
        return this;
    }

    public GetMessageInfoMultiResponse body(MessageBody body) {
        this.body = body;
        return this;
    }

}
