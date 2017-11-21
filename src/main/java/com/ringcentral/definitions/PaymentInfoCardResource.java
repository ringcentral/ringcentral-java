package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class PaymentInfoCardResource
{
    //
    public String cardType;
    public PaymentInfoCardResource cardType(String cardType) {
        this.cardType = cardType;
        return this;
    }
    //
    public String number;
    public PaymentInfoCardResource number(String number) {
        this.number = number;
        return this;
    }
    //
    public String securityCode;
    public PaymentInfoCardResource securityCode(String securityCode) {
        this.securityCode = securityCode;
        return this;
    }
    //
    public String expiry;
    public PaymentInfoCardResource expiry(String expiry) {
        this.expiry = expiry;
        return this;
    }
    //
    public String token;
    public PaymentInfoCardResource token(String token) {
        this.token = token;
        return this;
    }
    //
    public PaymentInfoCardHolderResource holder;
    public PaymentInfoCardResource holder(PaymentInfoCardHolderResource holder) {
        this.holder = holder;
        return this;
    }
}
