package com.ringcentral.definitions;


public class ForwardAllCallsReason {
    /**
     * Specifies the type of limitation. `ExtensionLimitation` means that the feature is turned off for this particular extension. `FeatureLimitation` means that the user may enable this feature and setup the rule via the Service Web UI
     * Enum: ExtensionLimitation, FeatureLimitation
     */
    public String code;
    /**
     * Error message depending on the type of limitation
     */
    public String message;

    public ForwardAllCallsReason code(String code) {
        this.code = code;
        return this;
    }

    public ForwardAllCallsReason message(String message) {
        this.message = message;
        return this;
    }
}
