package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class PaymentInfoCardHolderResource
{
    //
    public String firstName;
    public PaymentInfoCardHolderResource firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }
    //
    public String lastName;
    public PaymentInfoCardHolderResource lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
    //
    public PaymentInfoAddressResource address;
    public PaymentInfoCardHolderResource address(PaymentInfoAddressResource address) {
        this.address = address;
        return this;
    }
}
