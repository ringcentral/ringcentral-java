package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class FederationConflicts
{
    // List of conflicting federation extensions
    public FederationExtensionInfo[] records;
    public FederationConflicts records(FederationExtensionInfo[] records) {
        this.records = records;
        return this;
    }
}
