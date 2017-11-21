package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class AccountBusinessAddressResource
{
    //
    public String uri;
    public AccountBusinessAddressResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public ContactAddressInfo businessAddress;
    public AccountBusinessAddressResource businessAddress(ContactAddressInfo businessAddress) {
        this.businessAddress = businessAddress;
        return this;
    }
    //
    public String company;
    public AccountBusinessAddressResource company(String company) {
        this.company = company;
        return this;
    }
    //
    public String email;
    public AccountBusinessAddressResource email(String email) {
        this.email = email;
        return this;
    }
}
