package com.ringcentral.definitions;


public class BridgeResponseSecurity {
    /**
     * Specifies if a meeting is password protected.
     */
    public Boolean passwordProtected;
    /**
     *
     */
    public BridgeResponseSecurityPassword password;
    /**
     * If true, only authenticated users can join to a meeting.
     */
    public Boolean noGuests;
    /**
     * If true, only users have the same account can join to a meeting.
     */
    public Boolean sameAccount;
    /**
     * If true, end to end encryption will be enabled for a meeting.
     */
    public Boolean e2ee;

    public BridgeResponseSecurity passwordProtected(Boolean passwordProtected) {
        this.passwordProtected = passwordProtected;
        return this;
    }

    public BridgeResponseSecurity password(BridgeResponseSecurityPassword password) {
        this.password = password;
        return this;
    }

    public BridgeResponseSecurity noGuests(Boolean noGuests) {
        this.noGuests = noGuests;
        return this;
    }

    public BridgeResponseSecurity sameAccount(Boolean sameAccount) {
        this.sameAccount = sameAccount;
        return this;
    }

    public BridgeResponseSecurity e2ee(Boolean e2ee) {
        this.e2ee = e2ee;
        return this;
    }
}
