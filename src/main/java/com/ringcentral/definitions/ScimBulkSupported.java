package com.ringcentral.definitions;


public class ScimBulkSupported
{
    /**
     * Format: int32
     */
    public Long maxOperations;
    public ScimBulkSupported maxOperations(Long maxOperations)
    {
        this.maxOperations = maxOperations;
        return this;
    }

    /**
     * Format: int32
     */
    public Long maxPayloadSize;
    public ScimBulkSupported maxPayloadSize(Long maxPayloadSize)
    {
        this.maxPayloadSize = maxPayloadSize;
        return this;
    }

    /**
     */
    public Boolean supported;
    public ScimBulkSupported supported(Boolean supported)
    {
        this.supported = supported;
        return this;
    }
}