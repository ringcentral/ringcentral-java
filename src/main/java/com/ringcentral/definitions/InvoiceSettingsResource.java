package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class InvoiceSettingsResource
{
    //
    public Long maxAmountPerFirstMonth;
    public InvoiceSettingsResource maxAmountPerFirstMonth(Long maxAmountPerFirstMonth) {
        this.maxAmountPerFirstMonth = maxAmountPerFirstMonth;
        return this;
    }
    //
    public Long maxAmountPerMonth;
    public InvoiceSettingsResource maxAmountPerMonth(Long maxAmountPerMonth) {
        this.maxAmountPerMonth = maxAmountPerMonth;
        return this;
    }
    //
    public Long paymentTerm;
    public InvoiceSettingsResource paymentTerm(Long paymentTerm) {
        this.paymentTerm = paymentTerm;
        return this;
    }
    //
    public Long period;
    public InvoiceSettingsResource period(Long period) {
        this.period = period;
        return this;
    }
    //
    public Address address;
    public InvoiceSettingsResource address(Address address) {
        this.address = address;
        return this;
    }
}
