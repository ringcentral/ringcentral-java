package com.ringcentral.definitions;


public class ReplyParty
{
    /**
         * Internal identifier of a party
         */
        public String id;
  public ReplyParty id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         */
        public CallStatusInfo status;
  public ReplyParty status(CallStatusInfo status)
  {
    this.status = status;
    return this;
  }
  

        /**
         * Specifies if a call participant is muted or not. **Note:** If a call is also controlled via Hard phone or RingCentral App (not only through the API by calling call control methods) then it cannot be fully muted/unmuted via API only, in this case the action should be duplicated via Hard phone/RC App interfaces
         */
        public Boolean muted;
  public ReplyParty muted(Boolean muted)
  {
    this.muted = muted;
    return this;
  }
  

        /**
         * If 'True' then the party is not connected to a session voice conference, 'False' means the party is connected to other parties in a session
         */
        public Boolean standAlone;
  public ReplyParty standAlone(Boolean standAlone)
  {
    this.standAlone = standAlone;
    return this;
  }
  

        /**
         */
        public ParkInfo park;
  public ReplyParty park(ParkInfo park)
  {
    this.park = park;
    return this;
  }
  

        /**
         */
        public PartyInfo from;
  public ReplyParty from(PartyInfo from)
  {
    this.from = from;
    return this;
  }
  

        /**
         */
        public PartyInfo to;
  public ReplyParty to(PartyInfo to)
  {
    this.to = to;
    return this;
  }
  

        /**
         */
        public OwnerInfo owner;
  public ReplyParty owner(OwnerInfo owner)
  {
    this.owner = owner;
    return this;
  }
  

        /**
         * Direction of a call
         * Enum: Inbound, Outbound
         */
        public String direction;
  public ReplyParty direction(String direction)
  {
    this.direction = direction;
    return this;
  }
  
}
