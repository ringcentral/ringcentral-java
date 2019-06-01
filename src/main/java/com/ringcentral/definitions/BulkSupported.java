package com.ringcentral.definitions;


public class BulkSupported {
    /**
     *
     */
    public Long maxOperations;
    /**
     *
     */
    public Long maxPayloadSize;
    /**
     *
     */
    public Boolean supported;

    public BulkSupported maxOperations(Long maxOperations) {
        this.maxOperations = maxOperations;
        return this;
    }

    public BulkSupported maxPayloadSize(Long maxPayloadSize) {
        this.maxPayloadSize = maxPayloadSize;
        return this;
    }

    public BulkSupported supported(Boolean supported) {
        this.supported = supported;
        return this;
    }

}
