package com.ringcentral.definitions;


public class CreateMultipleSwitchesRequest
{
    /**
         */
        public CreateSwitchInfo[] records;
  public CreateMultipleSwitchesRequest records(CreateSwitchInfo[] records)
  {
    this.records = records;
    return this;
  }
  
}
