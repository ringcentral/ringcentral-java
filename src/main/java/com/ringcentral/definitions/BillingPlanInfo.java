package com.ringcentral.definitions;


    // Information on account billing plan
public class BillingPlanInfo
{
    /**
         * Internal identifier of a billing plan
         */
        public String id;
  public BillingPlanInfo id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Billing plan name
         */
        public String name;
  public BillingPlanInfo name(String name)
  {
    this.name = name;
    return this;
  }
  

        /**
         * Duration period
         * Enum: Day, Month, Year
         */
        public String durationUnit;
  public BillingPlanInfo durationUnit(String durationUnit)
  {
    this.durationUnit = durationUnit;
    return this;
  }
  

        /**
         * Number of duration units
         */
        public Long duration;
  public BillingPlanInfo duration(Long duration)
  {
    this.duration = duration;
    return this;
  }
  

        /**
         * Billing plan type
         * Enum: Initial, Regular, Suspended, Trial, TrialNoCC, Free
         */
        public String type;
  public BillingPlanInfo type(String type)
  {
    this.type = type;
    return this;
  }
  

        /**
         * Included digital lines count
         */
        public Long includedPhoneLines;
  public BillingPlanInfo includedPhoneLines(Long includedPhoneLines)
  {
    this.includedPhoneLines = includedPhoneLines;
    return this;
  }
  
}
