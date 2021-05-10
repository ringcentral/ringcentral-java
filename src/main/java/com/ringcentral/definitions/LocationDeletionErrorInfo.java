package com.ringcentral.definitions;


public class LocationDeletionErrorInfo {
    /**
     * Error code
     */
    public String errorCode;
    /**
     * Error message
     */
    public String message;
    /**
     * Additional attribute for this error, for example `parameterName`
     */
    public String additionalInfo;

    public LocationDeletionErrorInfo errorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public LocationDeletionErrorInfo message(String message) {
        this.message = message;
        return this;
    }

    public LocationDeletionErrorInfo additionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
        return this;
    }
}
