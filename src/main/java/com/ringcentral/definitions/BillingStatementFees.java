package com.ringcentral.definitions;


public class BillingStatementFees
{
    /**
         */
        public String description;
  public BillingStatementFees description(String description)
  {
    this.description = description;
    return this;
  }
  

        /**
         */
        public Double amount;
  public BillingStatementFees amount(Double amount)
  {
    this.amount = amount;
    return this;
  }
  

        /**
         */
        public Double freeServiceCredit;
  public BillingStatementFees freeServiceCredit(Double freeServiceCredit)
  {
    this.freeServiceCredit = freeServiceCredit;
    return this;
  }
  
}
