package com.ringcentral.definitions;


public class SessionInfoResponse {
    /**
     * Identifier (key) of a client application
     * Required
     */
    public String client_id;
    /**
     * List of permissions (space separated) granted to the application with this token
     * Example: AccountInfo CallLog ExtensionInfo Messages SMS
     */
    public String scope;
    /**
     * Subject of the token (extension ID or the owner)
     */
    public String sub;
    /**
     * RC account ID associated with the token
     */
    public String account_id;
    /**
     * Remaining time in seconds until session expiration due to absolute timeout
     * Format: int32
     */
    public Long session_expires_in;
    /**
     * Absolute value of session expiration time in ISO date formatted string
     * Format: date-time
     * Example: 2023-04-01T12:00:01Z
     */
    public String session_expiration_time;
    /**
     * OAuth session ID
     * Required
     */
    public String session_id;
    /**
     * Nominal value of session idle timeout in seconds
     * Format: int32
     */
    public Long session_idle_timeout;

    public SessionInfoResponse client_id(String client_id) {
        this.client_id = client_id;
        return this;
    }

    public SessionInfoResponse scope(String scope) {
        this.scope = scope;
        return this;
    }

    public SessionInfoResponse sub(String sub) {
        this.sub = sub;
        return this;
    }

    public SessionInfoResponse account_id(String account_id) {
        this.account_id = account_id;
        return this;
    }

    public SessionInfoResponse session_expires_in(Long session_expires_in) {
        this.session_expires_in = session_expires_in;
        return this;
    }

    public SessionInfoResponse session_expiration_time(String session_expiration_time) {
        this.session_expiration_time = session_expiration_time;
        return this;
    }

    public SessionInfoResponse session_id(String session_id) {
        this.session_id = session_id;
        return this;
    }

    public SessionInfoResponse session_idle_timeout(Long session_idle_timeout) {
        this.session_idle_timeout = session_idle_timeout;
        return this;
    }
}
