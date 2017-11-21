package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class PhoneNumberForProvisioningResource
{
    //
    public String phoneNumber;
    public PhoneNumberForProvisioningResource phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    //
    public String vanityPattern;
    public PhoneNumberForProvisioningResource vanityPattern(String vanityPattern) {
        this.vanityPattern = vanityPattern;
        return this;
    }
    //
    public String source;
    public PhoneNumberForProvisioningResource source(String source) {
        this.source = source;
        return this;
    }
    //
    public String type;
    public PhoneNumberForProvisioningResource type(String type) {
        this.type = type;
        return this;
    }
    //
    public String usageType;
    public PhoneNumberForProvisioningResource usageType(String usageType) {
        this.usageType = usageType;
        return this;
    }
    //
    public ExtensionReferenceResource extension;
    public PhoneNumberForProvisioningResource extension(ExtensionReferenceResource extension) {
        this.extension = extension;
        return this;
    }
    //
    public String reservationId;
    public PhoneNumberForProvisioningResource reservationId(String reservationId) {
        this.reservationId = reservationId;
        return this;
    }
}
