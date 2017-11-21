package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class LicenseInfoRequest
{
    // Type of a license
    public LicenseTypeInfoRequest type;
    public LicenseInfoRequest type(LicenseTypeInfoRequest type) {
        this.type = type;
        return this;
    }
    // Quantity of licenses to be purchased
    public Long quantity;
    public LicenseInfoRequest quantity(Long quantity) {
        this.quantity = quantity;
        return this;
    }
}
