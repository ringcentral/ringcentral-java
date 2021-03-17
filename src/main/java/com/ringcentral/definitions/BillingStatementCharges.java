package com.ringcentral.definitions;


public class BillingStatementCharges
{
    /**
         */
        public String description;
  public BillingStatementCharges description(String description)
  {
    this.description = description;
    return this;
  }
  

        /**
         */
        public Double amount;
  public BillingStatementCharges amount(Double amount)
  {
    this.amount = amount;
    return this;
  }
  

        /**
         */
        public String feature;
  public BillingStatementCharges feature(String feature)
  {
    this.feature = feature;
    return this;
  }
  

        /**
         */
        public Double freeServiceCredit;
  public BillingStatementCharges freeServiceCredit(Double freeServiceCredit)
  {
    this.freeServiceCredit = freeServiceCredit;
    return this;
  }
  
}
