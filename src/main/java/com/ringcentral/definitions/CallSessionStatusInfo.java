package com.ringcentral.definitions;


public class CallSessionStatusInfo
{
    /**
         */
        public String code;
  public CallSessionStatusInfo code(String code)
  {
    this.code = code;
    return this;
  }
  

        /**
         */
        public String reason;
  public CallSessionStatusInfo reason(String reason)
  {
    this.reason = reason;
    return this;
  }
  

        /**
         */
        public String parkData;
  public CallSessionStatusInfo parkData(String parkData)
  {
    this.parkData = parkData;
    return this;
  }
  

        /**
         */
        public PeerInfo peerId;
  public CallSessionStatusInfo peerId(PeerInfo peerId)
  {
    this.peerId = peerId;
    return this;
  }
  

        /**
         */
        public MobilePickupData mobilePickupData;
  public CallSessionStatusInfo mobilePickupData(MobilePickupData mobilePickupData)
  {
    this.mobilePickupData = mobilePickupData;
    return this;
  }
  
}
