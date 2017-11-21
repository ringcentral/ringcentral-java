package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class LicenseTypeInfoRequest
{
    // Name of a license type = ['RMS', 'RCN', 'WBR-100', 'WBR-500', 'WBR-1000', 'WBR-3000', 'LRM-50', 'LRM-100', 'LRM-200']
    public String sku;
    public LicenseTypeInfoRequest sku(String sku) {
        this.sku = sku;
        return this;
    }
}
