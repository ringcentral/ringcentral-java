package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ProvisionPhoneNumberRequest
{
    // Information on extension which the phone number is added to, only for provisioning extension-level numbers
    public ExtensionInfoProvisionPhoneNumbers extensionId;
    public ProvisionPhoneNumberRequest extensionId(ExtensionInfoProvisionPhoneNumbers extensionId) {
        this.extensionId = extensionId;
        return this;
    }
    // Phone number to purchase returned in E.164 (11-digits) format
    public String phoneNumber;
    public ProvisionPhoneNumberRequest phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    // Internal identifier of phone number reservation; encoded data including reservation type (by brand, by account, by session), particular brand/account/session data, and reservation date and time
    public String reservationId;
    public ProvisionPhoneNumberRequest reservationId(String reservationId) {
        this.reservationId = reservationId;
        return this;
    }
    // Custom user name of a phone number, if any. Supported for numbers assigned to Auto-Receptionist, with usage type 'CompanyNumber
    public String label;
    public ProvisionPhoneNumberRequest label(String label) {
        this.label = label;
        return this;
    }
    // Usage type of a phone number. The default value is 'DirectNumber'
    public String usageType;
    public ProvisionPhoneNumberRequest usageType(String usageType) {
        this.usageType = usageType;
        return this;
    }
    // Type of a phone number
    public String type;
    public ProvisionPhoneNumberRequest type(String type) {
        this.type = type;
        return this;
    }
    //  Vanity pattern that was used to find this number. It should be passed as if it was returned from the Number Lookup call
    public String vanityPattern;
    public ProvisionPhoneNumberRequest vanityPattern(String vanityPattern) {
        this.vanityPattern = vanityPattern;
        return this;
    }
}
