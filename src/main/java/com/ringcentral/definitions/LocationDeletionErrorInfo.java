package com.ringcentral.definitions;


public class LocationDeletionErrorInfo
{
    /**
     * Error code
     */
    public String errorCode;
    public LocationDeletionErrorInfo errorCode(String errorCode)
    {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * Error message
     */
    public String message;
    public LocationDeletionErrorInfo message(String message)
    {
        this.message = message;
        return this;
    }

    /**
     * Additional attribute for this error, for example `parameterName`
     */
    public String additionalInfo;
    public LocationDeletionErrorInfo additionalInfo(String additionalInfo)
    {
        this.additionalInfo = additionalInfo;
        return this;
    }
}