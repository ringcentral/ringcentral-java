package com.ringcentral.definitions;


public class MultipartResponseEntryBase {
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

    public MultipartResponseEntryBase resourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    public MultipartResponseEntryBase status(Long status) {
        this.status = status;
        return this;
    }
}
