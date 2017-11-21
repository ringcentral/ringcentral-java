package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class PaymentInfoResource
{
    //
    public String uri;
    public PaymentInfoResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public String paymentType;
    public PaymentInfoResource paymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    //
    public PaymentInfoCardResource card;
    public PaymentInfoResource card(PaymentInfoCardResource card) {
        this.card = card;
        return this;
    }
    //
    public InvoiceSettingsResource invoiceSettings;
    public PaymentInfoResource invoiceSettings(InvoiceSettingsResource invoiceSettings) {
        this.invoiceSettings = invoiceSettings;
        return this;
    }
}
