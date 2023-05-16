package com.ringcentral.definitions;


public class LicenseAssignmentEntry {
    /**
     * SKU of a license
     * Required
     */
    public String skuId;
    /**
     * Required
     * Format: int64
     */
    public Long extensionId;

    public LicenseAssignmentEntry skuId(String skuId) {
        this.skuId = skuId;
        return this;
    }

    public LicenseAssignmentEntry extensionId(Long extensionId) {
        this.extensionId = extensionId;
        return this;
    }
}
