package com.ringcentral.definitions;


    // Schedule when an answering rule should be applied
public class CompanyAnsweringRuleScheduleInfo
{
    /**
         */
        public CompanyAnsweringRuleWeeklyScheduleInfoRequest weeklyRanges;
  public CompanyAnsweringRuleScheduleInfo weeklyRanges(CompanyAnsweringRuleWeeklyScheduleInfoRequest weeklyRanges)
  {
    this.weeklyRanges = weeklyRanges;
    return this;
  }
  

        /**
         * Specific data ranges. If specified, weeklyRanges cannot be specified
         */
        public RangesInfo[] ranges;
  public CompanyAnsweringRuleScheduleInfo ranges(RangesInfo[] ranges)
  {
    this.ranges = ranges;
    return this;
  }
  

        /**
         * Reference to Business Hours or After Hours schedule = ['BusinessHours', 'AfterHours']
         * Enum: BusinessHours, AfterHours
         */
        public String ref;
  public CompanyAnsweringRuleScheduleInfo ref(String ref)
  {
    this.ref = ref;
    return this;
  }
  
}
