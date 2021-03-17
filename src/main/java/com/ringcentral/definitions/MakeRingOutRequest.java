package com.ringcentral.definitions;


public class MakeRingOutRequest
{
    /**
         * Required
         */
        public MakeRingOutCallerInfoRequestFrom from;
  public MakeRingOutRequest from(MakeRingOutCallerInfoRequestFrom from)
  {
    this.from = from;
    return this;
  }
  

        /**
         * Required
         */
        public MakeRingOutCallerInfoRequestTo to;
  public MakeRingOutRequest to(MakeRingOutCallerInfoRequestTo to)
  {
    this.to = to;
    return this;
  }
  

        /**
         */
        public MakeRingOutCallerIdInfo callerId;
  public MakeRingOutRequest callerId(MakeRingOutCallerIdInfo callerId)
  {
    this.callerId = callerId;
    return this;
  }
  

        /**
         * The audio prompt that the calling party hears when the call is connected
         */
        public Boolean playPrompt;
  public MakeRingOutRequest playPrompt(Boolean playPrompt)
  {
    this.playPrompt = playPrompt;
    return this;
  }
  

        /**
         */
        public MakeRingOutCoutryInfo country;
  public MakeRingOutRequest country(MakeRingOutCoutryInfo country)
  {
    this.country = country;
    return this;
  }
  
}
