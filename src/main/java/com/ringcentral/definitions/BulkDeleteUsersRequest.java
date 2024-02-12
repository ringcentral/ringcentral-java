package com.ringcentral.definitions;


public class BulkDeleteUsersRequest {
    /**
     * Indicates that the freed users&#039; assets (phone numbers and devices) should be moved
     * to account inventory rather than deleted. If set to `true`, the phone numbers and devices
     * assigned to deleted extensions will be kept in the account&#039;s inventory. If set to `false`,
     * these assets will be deleted from the account and returned to either the partner&#039;s phone
     * numbers or RingCentral&#039;s phone number pool
     * Default: true
     */
    public Boolean keepAssetsInInventory;
    /**
     * Required
     */
    public BulkOperationExtensionReference[] records;

    public BulkDeleteUsersRequest keepAssetsInInventory(Boolean keepAssetsInInventory) {
        this.keepAssetsInInventory = keepAssetsInInventory;
        return this;
    }

    public BulkDeleteUsersRequest records(BulkOperationExtensionReference[] records) {
        this.records = records;
        return this;
    }
}
