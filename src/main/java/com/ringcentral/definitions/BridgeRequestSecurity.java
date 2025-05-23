package com.ringcentral.definitions;


public class BridgeRequestSecurity {
    /**
     * Specifies if a meeting is password protected.
     * <p>
     * By default, `Instant` and `Scheduled` bridges are not password protected. For default (PMI) bridge, password
     * protection will be turned on and the password will be generated if it is not specified while creation.
     * <p>
     * While creation to set password protection you should set this field to true and specify a password in the
     * `password` field. If you want to change password or set password protection for an unprotected bridge,
     * you should set this field to true and specify a password in the `password` field in the update operation.
     * <p>
     * To make protected bridge as unprotected you should set this field to false in the update operation.
     * Example: true
     */
    public Boolean passwordProtected;
    /**
     * Specifies a password if bridge meetings should be password protected (passwordProtected field is true).
     * Besides that, if the field is specified in the request but `passwordProtected` field is missing then
     * it means that `passwordProtected` field is set to true.
     * Example: Wq123ygs15
     */
    public String password;
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

    public BridgeRequestSecurity passwordProtected(Boolean passwordProtected) {
        this.passwordProtected = passwordProtected;
        return this;
    }

    public BridgeRequestSecurity password(String password) {
        this.password = password;
        return this;
    }

    public BridgeRequestSecurity noGuests(Boolean noGuests) {
        this.noGuests = noGuests;
        return this;
    }

    public BridgeRequestSecurity sameAccount(Boolean sameAccount) {
        this.sameAccount = sameAccount;
        return this;
    }

    public BridgeRequestSecurity e2ee(Boolean e2ee) {
        this.e2ee = e2ee;
        return this;
    }
}
