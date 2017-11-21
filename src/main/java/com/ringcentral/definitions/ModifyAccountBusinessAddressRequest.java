package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ModifyAccountBusinessAddressRequest
{
    // Company business name
    public String company;
    public ModifyAccountBusinessAddressRequest company(String company) {
        this.company = company;
        return this;
    }
    // Company business email address
    public String email;
    public ModifyAccountBusinessAddressRequest email(String email) {
        this.email = email;
        return this;
    }
    // Company business address
    public BusinessAddressInfo businessAddress;
    public ModifyAccountBusinessAddressRequest businessAddress(BusinessAddressInfo businessAddress) {
        this.businessAddress = businessAddress;
        return this;
    }
}
