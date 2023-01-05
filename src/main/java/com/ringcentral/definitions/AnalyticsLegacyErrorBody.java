package com.ringcentral.definitions;


public class AnalyticsLegacyErrorBody
{
    /**
     * Required
     */
    public String errorCode;
    public AnalyticsLegacyErrorBody errorCode(String errorCode)
    {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * Required
     */
    public String message;
    public AnalyticsLegacyErrorBody message(String message)
    {
        this.message = message;
        return this;
    }
}