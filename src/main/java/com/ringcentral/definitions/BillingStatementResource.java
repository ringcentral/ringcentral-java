package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class BillingStatementResource
{
    //
    public FeeChargeResource[] fees;
    public BillingStatementResource fees(FeeChargeResource[] fees) {
        this.fees = fees;
        return this;
    }
    //
    public FeeChargeResource[] charges;
    public BillingStatementResource charges(FeeChargeResource[] charges) {
        this.charges = charges;
        return this;
    }
    //
    public Double totalCharges;
    public BillingStatementResource totalCharges(Double totalCharges) {
        this.totalCharges = totalCharges;
        return this;
    }
    //
    public Double totalFees;
    public BillingStatementResource totalFees(Double totalFees) {
        this.totalFees = totalFees;
        return this;
    }
    //
    public Double subtotal;
    public BillingStatementResource subtotal(Double subtotal) {
        this.subtotal = subtotal;
        return this;
    }
    //
    public String currency;
    public BillingStatementResource currency(String currency) {
        this.currency = currency;
        return this;
    }
}
