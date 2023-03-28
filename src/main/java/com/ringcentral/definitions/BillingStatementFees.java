package com.ringcentral.definitions;


public class BillingStatementFees {
    /**
     *
     */
    public String description;
    /**
     *
     */
    public Double amount;
    /**
     *
     */
    public Double freeServiceCredit;

    public BillingStatementFees description(String description) {
        this.description = description;
        return this;
    }

    public BillingStatementFees amount(Double amount) {
        this.amount = amount;
        return this;
    }

    public BillingStatementFees freeServiceCredit(Double freeServiceCredit) {
        this.freeServiceCredit = freeServiceCredit;
        return this;
    }
}
