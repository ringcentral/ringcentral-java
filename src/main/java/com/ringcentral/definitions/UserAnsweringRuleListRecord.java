package com.ringcentral.definitions;


public class UserAnsweringRuleListRecord
{
    /**
         * Canonical URI to an answering rule resource
         */
        public String uri;
  public UserAnsweringRuleListRecord uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         * Internal identifier of an asnwering rule
         */
        public String id;
  public UserAnsweringRuleListRecord id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Type of an answering rule
         * Enum: BusinessHours, AfterHours, Custom
         */
        public String type;
  public UserAnsweringRuleListRecord type(String type)
  {
    this.type = type;
    return this;
  }
  

        /**
         * Name of an answering rule specified by user
         */
        public String name;
  public UserAnsweringRuleListRecord name(String name)
  {
    this.name = name;
    return this;
  }
  

        /**
         * Specifies if an answering rule is active or inactive
         */
        public Boolean enabled;
  public UserAnsweringRuleListRecord enabled(Boolean enabled)
  {
    this.enabled = enabled;
    return this;
  }
  

        /**
         */
        public SharedLinesInfo sharedLines;
  public UserAnsweringRuleListRecord sharedLines(SharedLinesInfo sharedLines)
  {
    this.sharedLines = sharedLines;
    return this;
  }
  
}
