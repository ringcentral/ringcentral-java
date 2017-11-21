package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class FederationExtensionNumbersExtensionInfo
{
    // Internal identifier of an extension
    public String id;
    public FederationExtensionNumbersExtensionInfo id(String id) {
        this.id = id;
        return this;
    }
    // Number of an extension
    public String extensionNumber;
    public FederationExtensionNumbersExtensionInfo extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }
}
