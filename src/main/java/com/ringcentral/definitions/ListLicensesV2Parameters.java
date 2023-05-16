package com.ringcentral.definitions;


/**
 * Query parameters for operation listLicensesV2
 */
public class ListLicensesV2Parameters {
    /**
     * Identifiers of cost centers to return licenses for
     */
    public String[] costCenterIds;

    public ListLicensesV2Parameters costCenterIds(String[] costCenterIds) {
        this.costCenterIds = costCenterIds;
        return this;
    }
}
