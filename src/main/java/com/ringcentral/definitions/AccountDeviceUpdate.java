package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class AccountDeviceUpdate
{
    // Address for emergency cases. The same emergency address is assigned to all numbers of a single device
    public EmergencyAddressInfoRequest emergencyServiceAddress;
    public AccountDeviceUpdate emergencyServiceAddress(EmergencyAddressInfoRequest emergencyServiceAddress) {
        this.emergencyServiceAddress = emergencyServiceAddress;
        return this;
    }
}
