package com.ringcentral.definitions;


public class ValidationError
{
    /**
         * Error code
         */
        public String errorCode;
  public ValidationError errorCode(String errorCode)
  {
    this.errorCode = errorCode;
    return this;
  }
  

        /**
         * Error message
         */
        public String message;
  public ValidationError message(String message)
  {
    this.message = message;
    return this;
  }
  

        /**
         * Name of invalid parameter
         */
        public String parameterName;
  public ValidationError parameterName(String parameterName)
  {
    this.parameterName = parameterName;
    return this;
  }
  

        /**
         */
        public String featureName;
  public ValidationError featureName(String featureName)
  {
    this.featureName = featureName;
    return this;
  }
  

        /**
         */
        public String parameterValue;
  public ValidationError parameterValue(String parameterValue)
  {
    this.parameterValue = parameterValue;
    return this;
  }
  
}
