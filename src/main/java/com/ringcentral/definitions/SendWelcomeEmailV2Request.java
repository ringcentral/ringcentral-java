package com.ringcentral.definitions;


/**
 * Request body for operation sendWelcomeEmailV2
 */
public class SendWelcomeEmailV2Request {
    /**
     * Format: email
     * Example: user@email.com
     */
    public String email;

    public SendWelcomeEmailV2Request email(String email) {
        this.email = email;
        return this;
    }
}
