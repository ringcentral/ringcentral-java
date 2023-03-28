package com.ringcentral.definitions;


public class BillingStatementCharges {
    /**
     *
     */
    public String description;
    /**
     * Format: double
     */
    public Double amount;
    /**
     *
     */
    public String feature;
    /**
     * Format: double
     */
    public Double freeServiceCredit;

    public BillingStatementCharges description(String description) {
        this.description = description;
        return this;
    }

    public BillingStatementCharges amount(Double amount) {
        this.amount = amount;
        return this;
    }

    public BillingStatementCharges feature(String feature) {
        this.feature = feature;
        return this;
    }

    public BillingStatementCharges freeServiceCredit(Double freeServiceCredit) {
        this.freeServiceCredit = freeServiceCredit;
        return this;
    }
}
