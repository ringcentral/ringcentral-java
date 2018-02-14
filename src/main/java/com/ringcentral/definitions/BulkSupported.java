package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class BulkSupported
{
    //
    public Long maxOperations;
    public BulkSupported maxOperations(Long maxOperations) {
        this.maxOperations = maxOperations;
        return this;
    }
    //
    public Long maxPayloadSize;
    public BulkSupported maxPayloadSize(Long maxPayloadSize) {
        this.maxPayloadSize = maxPayloadSize;
        return this;
    }
    //
    public Boolean supported;
    public BulkSupported supported(Boolean supported) {
        this.supported = supported;
        return this;
    }
}
