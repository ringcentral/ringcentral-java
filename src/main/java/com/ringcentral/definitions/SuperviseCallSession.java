package com.ringcentral.definitions;


public class SuperviseCallSession
{
    /**
         */
        public SupervisePartyFrom from;
  public SuperviseCallSession from(SupervisePartyFrom from)
  {
    this.from = from;
    return this;
  }
  

        /**
         */
        public SupervisePartyTo to;
  public SuperviseCallSession to(SupervisePartyTo to)
  {
    this.to = to;
    return this;
  }
  

        /**
         * Direction of a call
         * Enum: Outbound, Inbound
         */
        public String direction;
  public SuperviseCallSession direction(String direction)
  {
    this.direction = direction;
    return this;
  }
  

        /**
         * Internal identifier of a party that monitors a call
         */
        public String id;
  public SuperviseCallSession id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Internal identifier of an account that monitors a call
         */
        public String accountId;
  public SuperviseCallSession accountId(String accountId)
  {
    this.accountId = accountId;
    return this;
  }
  

        /**
         * Internal identifier of an extension that monitors a call
         */
        public String extensionId;
  public SuperviseCallSession extensionId(String extensionId)
  {
    this.extensionId = extensionId;
    return this;
  }
  

        /**
         * Specifies if a call participant is muted or not. **Note:** If a call is also controlled via Hard phone or RingCentral App (not only through the API by calling call control methods) then it cannot be fully muted/unmuted via API only, in this case the action should be duplicated via Hard phone/RC App interfaces
         */
        public Boolean muted;
  public SuperviseCallSession muted(Boolean muted)
  {
    this.muted = muted;
    return this;
  }
  

        /**
         */
        public OwnerInfo owner;
  public SuperviseCallSession owner(OwnerInfo owner)
  {
    this.owner = owner;
    return this;
  }
  

        /**
         * If 'True' then the party is not connected to a session voice conference, 'False' means the party is connected to other parties in a session
         */
        public Boolean standAlone;
  public SuperviseCallSession standAlone(Boolean standAlone)
  {
    this.standAlone = standAlone;
    return this;
  }
  

        /**
         */
        public CallStatusInfo status;
  public SuperviseCallSession status(CallStatusInfo status)
  {
    this.status = status;
    return this;
  }
  
}
