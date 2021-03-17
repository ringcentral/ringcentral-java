package com.ringcentral.definitions;


    // Information on a party of a call session
public class CallParty
{
    /**
         * Internal identifier of a party
         */
        public String id;
  public CallParty id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         */
        public CallStatusInfo status;
  public CallParty status(CallStatusInfo status)
  {
    this.status = status;
    return this;
  }
  

        /**
         * Specifies if a call participant is muted or not. **Note:** If a call is also controlled via Hard phone or RingCentral App (not only through the API by calling call control methods) then it cannot be fully muted/unmuted via API only, in this case the action should be duplicated via Hard phone/RC App interfaces
         */
        public Boolean muted;
  public CallParty muted(Boolean muted)
  {
    this.muted = muted;
    return this;
  }
  

        /**
         * If 'True' then the party is not connected to a session voice conference, 'False' means the party is connected to other parties in a session
         */
        public Boolean standAlone;
  public CallParty standAlone(Boolean standAlone)
  {
    this.standAlone = standAlone;
    return this;
  }
  

        /**
         */
        public ParkInfo park;
  public CallParty park(ParkInfo park)
  {
    this.park = park;
    return this;
  }
  

        /**
         */
        public PartyInfo from;
  public CallParty from(PartyInfo from)
  {
    this.from = from;
    return this;
  }
  

        /**
         */
        public PartyInfo to;
  public CallParty to(PartyInfo to)
  {
    this.to = to;
    return this;
  }
  

        /**
         */
        public OwnerInfo owner;
  public CallParty owner(OwnerInfo owner)
  {
    this.owner = owner;
    return this;
  }
  

        /**
         * Direction of a call
         * Enum: Inbound, Outbound
         */
        public String direction;
  public CallParty direction(String direction)
  {
    this.direction = direction;
    return this;
  }
  

        /**
         * A party's role in the conference scenarios. For calls of 'Conference' type only
         * Enum: Host, Participant
         */
        public String conferenceRole;
  public CallParty conferenceRole(String conferenceRole)
  {
    this.conferenceRole = conferenceRole;
    return this;
  }
  

        /**
         * A party's role in 'Ring Me'/'RingOut' scenarios. For calls of 'Ringout' type only
         * Enum: Initiator, Target
         */
        public String ringOutRole;
  public CallParty ringOutRole(String ringOutRole)
  {
    this.ringOutRole = ringOutRole;
    return this;
  }
  

        /**
         * A party's role in 'Ring Me'/'RingOut' scenarios. For calls of 'Ringme' type only
         * Enum: Initiator, Target
         */
        public String ringMeRole;
  public CallParty ringMeRole(String ringMeRole)
  {
    this.ringMeRole = ringMeRole;
    return this;
  }
  

        /**
         * Active recordings list
         */
        public RecordingInfo[] recordings;
  public CallParty recordings(RecordingInfo[] recordings)
  {
    this.recordings = recordings;
    return this;
  }
  
}
