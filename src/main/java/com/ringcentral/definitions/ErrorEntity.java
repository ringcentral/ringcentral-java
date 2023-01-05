package com.ringcentral.definitions;


public class ErrorEntity
{
    /**
     * Error code
     */
    public String errorCode;
    public ErrorEntity errorCode(String errorCode)
    {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * Error message
     */
    public String message;
    public ErrorEntity message(String message)
    {
        this.message = message;
        return this;
    }

    /**
     * Name of invalid parameter
     */
    public String parameterName;
    public ErrorEntity parameterName(String parameterName)
    {
        this.parameterName = parameterName;
        return this;
    }

    /**
     * Value of invalid parameter
     */
    public String parameterValue;
    public ErrorEntity parameterValue(String parameterValue)
    {
        this.parameterValue = parameterValue;
        return this;
    }
}