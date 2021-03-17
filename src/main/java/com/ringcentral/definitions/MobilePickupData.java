package com.ringcentral.definitions;


public class MobilePickupData
{
    /**
         * List of extension IDs, configured to pick up a call from Desktop/Mobile applications
         */
        public String[] ccMailboxes;
  public MobilePickupData ccMailboxes(String[] ccMailboxes)
  {
    this.ccMailboxes = ccMailboxes;
    return this;
  }
  

        /**
         * SIP proxy registration name
         */
        public String to;
  public MobilePickupData to(String to)
  {
    this.to = to;
    return this;
  }
  

        /**
         * User data
         */
        public String sid;
  public MobilePickupData sid(String sid)
  {
    this.sid = sid;
    return this;
  }
  

        /**
         * User data
         */
        public String srvlvl;
  public MobilePickupData srvlvl(String srvlvl)
  {
    this.srvlvl = srvlvl;
    return this;
  }
  

        /**
         * User data
         */
        public String srvLvlExt;
  public MobilePickupData srvLvlExt(String srvLvlExt)
  {
    this.srvLvlExt = srvLvlExt;
    return this;
  }
  
}
