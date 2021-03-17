package com.ringcentral.definitions;


    // Billing information. Returned for device update request if `prestatement` query parameter is set to 'true'
public class BillingStatementInfo
{
    /**
         * Currency code complying with [ISO-4217](https://en.wikipedia.org/wiki/ISO_4217) standard
         */
        public String currency;
  public BillingStatementInfo currency(String currency)
  {
    this.currency = currency;
    return this;
  }
  

        /**
         */
        public BillingStatementCharges[] charges;
  public BillingStatementInfo charges(BillingStatementCharges[] charges)
  {
    this.charges = charges;
    return this;
  }
  

        /**
         */
        public BillingStatementFees[] fees;
  public BillingStatementInfo fees(BillingStatementFees[] fees)
  {
    this.fees = fees;
    return this;
  }
  

        /**
         */
        public Double totalCharged;
  public BillingStatementInfo totalCharged(Double totalCharged)
  {
    this.totalCharged = totalCharged;
    return this;
  }
  

        /**
         */
        public Double totalCharges;
  public BillingStatementInfo totalCharges(Double totalCharges)
  {
    this.totalCharges = totalCharges;
    return this;
  }
  

        /**
         */
        public Double totalFees;
  public BillingStatementInfo totalFees(Double totalFees)
  {
    this.totalFees = totalFees;
    return this;
  }
  

        /**
         */
        public Double subtotal;
  public BillingStatementInfo subtotal(Double subtotal)
  {
    this.subtotal = subtotal;
    return this;
  }
  

        /**
         */
        public Double totalFreeServiceCredit;
  public BillingStatementInfo totalFreeServiceCredit(Double totalFreeServiceCredit)
  {
    this.totalFreeServiceCredit = totalFreeServiceCredit;
    return this;
  }
  
}
