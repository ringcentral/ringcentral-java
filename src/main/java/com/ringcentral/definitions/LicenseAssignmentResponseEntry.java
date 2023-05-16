package com.ringcentral.definitions;


public class LicenseAssignmentResponseEntry {
    /**
     * Indicates if an assignment operation was successful for this item
     * Required
     */
    public Boolean bulkItemSuccess;
    /**
     * SKU of a license
     * Required
     */
    public String skuId;
    /**
     * Format: int64
     */
    public Long extensionId;
    /**
     * The list of errors occurred during processing of particular item of bulk operation.
     * Returned only if `bulkItemSuccess` is false
     */
    public ApiError[] bulkItemErrors;

    public LicenseAssignmentResponseEntry bulkItemSuccess(Boolean bulkItemSuccess) {
        this.bulkItemSuccess = bulkItemSuccess;
        return this;
    }

    public LicenseAssignmentResponseEntry skuId(String skuId) {
        this.skuId = skuId;
        return this;
    }

    public LicenseAssignmentResponseEntry extensionId(Long extensionId) {
        this.extensionId = extensionId;
        return this;
    }

    public LicenseAssignmentResponseEntry bulkItemErrors(ApiError[] bulkItemErrors) {
        this.bulkItemErrors = bulkItemErrors;
        return this;
    }
}
