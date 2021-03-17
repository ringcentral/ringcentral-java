package com.ringcentral.definitions;


public class CreateForwardingNumberRequest
{
    /**
         * Number assigned to the call flip phone number, corresponds to the shortcut dial number
         */
        public Long flipNumber;
  public CreateForwardingNumberRequest flipNumber(Long flipNumber)
  {
    this.flipNumber = flipNumber;
    return this;
  }
  

        /**
         * Forwarding/Call flip phone number
         */
        public String phoneNumber;
  public CreateForwardingNumberRequest phoneNumber(String phoneNumber)
  {
    this.phoneNumber = phoneNumber;
    return this;
  }
  

        /**
         * Forwarding/Call flip number title
         */
        public String label;
  public CreateForwardingNumberRequest label(String label)
  {
    this.label = label;
    return this;
  }
  

        /**
         * Forwarding/Call flip phone type. If specified, 'label' attribute value is ignored. The default value is 'Other'
         * Enum: PhoneLine, Home, Mobile, Work, Other
         */
        public String type;
  public CreateForwardingNumberRequest type(String type)
  {
    this.type = type;
    return this;
  }
  

        /**
         */
        public CreateForwardingNumberDeviceInfo device;
  public CreateForwardingNumberRequest device(CreateForwardingNumberDeviceInfo device)
  {
    this.device = device;
    return this;
  }
  
}
