package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class FederationExtensionNumbers
{
    // List of extension numbers of the current federation
    public FederationExtensionNumbersExtensionInfo[] records;
    public FederationExtensionNumbers records(FederationExtensionNumbersExtensionInfo[] records) {
        this.records = records;
        return this;
    }
}
