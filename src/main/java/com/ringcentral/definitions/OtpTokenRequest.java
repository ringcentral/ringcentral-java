package com.ringcentral.definitions;


/**
 * Token endpoint request parameters used in the "One-time Password" (OTP) authorization flow with the `otp` grant type
 */
public class OtpTokenRequest {
    /**
     * Grant type
     * Enum: otp
     */
    public String grant_type;
    /**
     * For `otp` grant type only.
     * One-time password code
     * Required
     */
    public String code;

    public OtpTokenRequest grant_type(String grant_type) {
        this.grant_type = grant_type;
        return this;
    }

    public OtpTokenRequest code(String code) {
        this.code = code;
        return this;
    }
}
