package com.ringcentral.definitions;


public class ReadUserFeaturesParameters
{
    /**
         */
        public Boolean availableOnly;
  public ReadUserFeaturesParameters availableOnly(Boolean availableOnly)
  {
    this.availableOnly = availableOnly;
    return this;
  }
  

        /**
         */
        public String[] featureId;
  public ReadUserFeaturesParameters featureId(String[] featureId)
  {
    this.featureId = featureId;
    return this;
  }
  
}