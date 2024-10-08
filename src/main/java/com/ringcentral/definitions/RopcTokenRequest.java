package com.ringcentral.definitions;


/**
 * Token endpoint request parameters used in the "Password" (also known as "Resource Owner Password Credentials" - ROPC)
 * authorization flow with the `password` grant type
 */
public class RopcTokenRequest {
    /**
     * Grant type
     * Required
     * Enum: password
     */
    public String grant_type;
    /**
     * For `password` grant type only. User login name: email or phone number in E.164 format
     * Required
     */
    public String username;
    /**
     * For `password` grant type only. User&#039;s password
     * Required
     * Format: password
     */
    public String password;
    /**
     * For `password` grant type only. Optional. Extension short number. If a company number
     * is specified as a username, and extension is not specified, the
     * server will attempt to authenticate client as main company administrator
     * <p>
     * DEPRECATED: use extension number embedded into username string like `+16501234567*101`
     */
    public String extension;
    /**
     * IVR pin for pin-based authentication.
     * <p>
     * DEPRECATED: use a dedicated `ivr_pin` grant type instead
     */
    public String pin;

    public RopcTokenRequest grant_type(String grant_type) {
        this.grant_type = grant_type;
        return this;
    }

    public RopcTokenRequest username(String username) {
        this.username = username;
        return this;
    }

    public RopcTokenRequest password(String password) {
        this.password = password;
        return this;
    }

    public RopcTokenRequest extension(String extension) {
        this.extension = extension;
        return this;
    }

    public RopcTokenRequest pin(String pin) {
        this.pin = pin;
        return this;
    }
}
