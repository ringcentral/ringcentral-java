package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class OrderLicensesRequest
{
    // List of licenses to be purchased
    public LicenseInfoRequest[] addedLicenses;
    public OrderLicensesRequest addedLicenses(LicenseInfoRequest[] addedLicenses) {
        this.addedLicenses = addedLicenses;
        return this;
    }
}
