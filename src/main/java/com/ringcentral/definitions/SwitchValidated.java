package com.ringcentral.definitions;


public class SwitchValidated
{
    /**
         * Internal identifier of a switch
         */
        public String id;
  public SwitchValidated id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Unique identifier of a network switch
         */
        public String chassisId;
  public SwitchValidated chassisId(String chassisId)
  {
    this.chassisId = chassisId;
    return this;
  }
  

        /**
         * Validation result status
         * Enum: Valid, Invalid
         */
        public String status;
  public SwitchValidated status(String status)
  {
    this.status = status;
    return this;
  }
  

        /**
         */
        public ValidationError[] errors;
  public SwitchValidated errors(ValidationError[] errors)
  {
    this.errors = errors;
    return this;
  }
  
}
