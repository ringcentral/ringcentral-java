package com.ringcentral.definitions;


public class ScimBulkSupported {
    /**
     * Format: int32
     */
    public Long maxOperations;
    /**
     * Format: int32
     */
    public Long maxPayloadSize;
    /**
     *
     */
    public Boolean supported;

    public ScimBulkSupported maxOperations(Long maxOperations) {
        this.maxOperations = maxOperations;
        return this;
    }

    public ScimBulkSupported maxPayloadSize(Long maxPayloadSize) {
        this.maxPayloadSize = maxPayloadSize;
        return this;
    }

    public ScimBulkSupported supported(Boolean supported) {
        this.supported = supported;
        return this;
    }
}
