package com.ringcentral.definitions;


/**
 * Billing information. Returned for device update request if `prestatement` query parameter is set to 'true'
 */
public class BillingStatementInfo {
    /**
     * Currency code complying with [ISO-4217](https://en.wikipedia.org/wiki/ISO_4217) standard
     */
    public String currency;
    /**
     *
     */
    public BillingStatementCharges[] charges;
    /**
     *
     */
    public BillingStatementFees[] fees;
    /**
     *
     */
    public Double totalCharged;
    /**
     *
     */
    public Double totalCharges;
    /**
     *
     */
    public Double totalFees;
    /**
     *
     */
    public Double subtotal;
    /**
     *
     */
    public Double totalFreeServiceCredit;

    public BillingStatementInfo currency(String currency) {
        this.currency = currency;
        return this;
    }

    public BillingStatementInfo charges(BillingStatementCharges[] charges) {
        this.charges = charges;
        return this;
    }

    public BillingStatementInfo fees(BillingStatementFees[] fees) {
        this.fees = fees;
        return this;
    }

    public BillingStatementInfo totalCharged(Double totalCharged) {
        this.totalCharged = totalCharged;
        return this;
    }

    public BillingStatementInfo totalCharges(Double totalCharges) {
        this.totalCharges = totalCharges;
        return this;
    }

    public BillingStatementInfo totalFees(Double totalFees) {
        this.totalFees = totalFees;
        return this;
    }

    public BillingStatementInfo subtotal(Double subtotal) {
        this.subtotal = subtotal;
        return this;
    }

    public BillingStatementInfo totalFreeServiceCredit(Double totalFreeServiceCredit) {
        this.totalFreeServiceCredit = totalFreeServiceCredit;
        return this;
    }
}
