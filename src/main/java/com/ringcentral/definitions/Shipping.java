package com.ringcentral.definitions;


    // Shipping information, according to which devices (in case of HardPhone ) or e911 stickers (in case of SoftPhone and OtherPhone ) will be delivered to the customer
public class Shipping
{
    /**
         */
        public DeviceEmergencyServiceAddressResource address;
  public Shipping address(DeviceEmergencyServiceAddressResource address)
  {
    this.address = address;
    return this;
  }
  

        /**
         */
        public MethodResource method;
  public Shipping method(MethodResource method)
  {
    this.method = method;
    return this;
  }
  

        /**
         */
        public String status;
  public Shipping status(String status)
  {
    this.status = status;
    return this;
  }
  

        /**
         */
        public String carrier;
  public Shipping carrier(String carrier)
  {
    this.carrier = carrier;
    return this;
  }
  

        /**
         */
        public String trackingNumber;
  public Shipping trackingNumber(String trackingNumber)
  {
    this.trackingNumber = trackingNumber;
    return this;
  }
  
}
