package com.ringcentral.definitions;


public class MobilePickupData {
    /**
     * List of extension IDs, configured to pick up a call from Desktop/Mobile applications
     */
    public String[] ccMailboxes;
    /**
     * SIP proxy registration name
     */
    public String to;
    /**
     * User data
     */
    public String sid;
    /**
     * User data
     */
    public String srvlvl;
    /**
     * User data
     */
    public String srvLvlExt;

    public MobilePickupData ccMailboxes(String[] ccMailboxes) {
        this.ccMailboxes = ccMailboxes;
        return this;
    }

    public MobilePickupData to(String to) {
        this.to = to;
        return this;
    }

    public MobilePickupData sid(String sid) {
        this.sid = sid;
        return this;
    }

    public MobilePickupData srvlvl(String srvlvl) {
        this.srvlvl = srvlvl;
        return this;
    }

    public MobilePickupData srvLvlExt(String srvLvlExt) {
        this.srvLvlExt = srvLvlExt;
        return this;
    }
}
