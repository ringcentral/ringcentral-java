package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ExtensionInfoProvisionPhoneNumbers
{
    // Internal identifier of an extension
    public String id;
    public ExtensionInfoProvisionPhoneNumbers id(String id) {
        this.id = id;
        return this;
    }
    // For Partner Applications Internal identifier of an extension created by partner. The RingCentral supports the mapping of accounts and stores the corresponding account ID/extension ID for each partner ID of a client application. In request URIs partner IDs are accepted instead of regular RingCentral native IDs as path parameters using pid = XXX clause. Though in response URIs contain the corresponding account IDs and extension IDs. In all request and response bodies these values are reflected via partnerId attributes of account and extension
    public String partnerId;
    public ExtensionInfoProvisionPhoneNumbers partnerId(String partnerId) {
        this.partnerId = partnerId;
        return this;
    }
}
