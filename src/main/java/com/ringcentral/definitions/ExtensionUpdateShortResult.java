package com.ringcentral.definitions;


public class ExtensionUpdateShortResult {
    /**
     * Internal identifier of an extension
     */
    public String extensionId;
    /**
     * Extension update status
     * Enum: Fail, Success
     */
    public String status;
    /**
     *
     */
    public ErrorEntity[] errors;

    public ExtensionUpdateShortResult extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }

    public ExtensionUpdateShortResult status(String status) {
        this.status = status;
        return this;
    }

    public ExtensionUpdateShortResult errors(ErrorEntity[] errors) {
        this.errors = errors;
        return this;
    }
}
