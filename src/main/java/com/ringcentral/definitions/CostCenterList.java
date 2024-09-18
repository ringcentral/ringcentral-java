package com.ringcentral.definitions;


public class CostCenterList {
    /**
     * Required
     */
    public CostCenterItem[] records;

    public CostCenterList records(CostCenterItem[] records) {
        this.records = records;
        return this;
    }
}
