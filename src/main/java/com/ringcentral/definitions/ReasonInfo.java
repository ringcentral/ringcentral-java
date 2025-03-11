package com.ringcentral.definitions;


/**
 * Reason for the feature unavailability. Returned only if `available`
 * is set to `false`
 */
public class ReasonInfo {
    /**
     * Reason code
     * Enum: ServicePlanLimitation, AccountLimitation, ExtensionTypeLimitation, ExtensionLimitation, InsufficientPermissions, ConfigurationLimitation, PermissionLimitation
     */
    public String code;
    /**
     * Reason description
     */
    public String message;
    /**
     *
     */
    public String permission;

    public ReasonInfo code(String code) {
        this.code = code;
        return this;
    }

    public ReasonInfo message(String message) {
        this.message = message;
        return this;
    }

    public ReasonInfo permission(String permission) {
        this.permission = permission;
        return this;
    }
}
