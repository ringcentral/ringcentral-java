package com.ringcentral.definitions;


public class BillingPlanInfo {
    /**
     * Internal identifier of a billing plan
     */
    public String id;
    /**
     * Billing plan name
     */
    public String name;
    /**
     * Duration period
     * Enum: Month, Day
     */
    public String durationUnit;
    /**
     * Number of duration units
     */
    public Long duration;
    /**
     * Billing plan type
     * Enum: Initial, Regular, Suspended, Trial, TrialNoCC, Free
     */
    public String type;
    /**
     * Included digital lines count
     */
    public Long includedPhoneLines;

    public BillingPlanInfo id(String id) {
        this.id = id;
        return this;
    }

    public BillingPlanInfo name(String name) {
        this.name = name;
        return this;
    }

    public BillingPlanInfo durationUnit(String durationUnit) {
        this.durationUnit = durationUnit;
        return this;
    }

    public BillingPlanInfo duration(Long duration) {
        this.duration = duration;
        return this;
    }

    public BillingPlanInfo type(String type) {
        this.type = type;
        return this;
    }

    public BillingPlanInfo includedPhoneLines(Long includedPhoneLines) {
        this.includedPhoneLines = includedPhoneLines;
        return this;
    }

}
