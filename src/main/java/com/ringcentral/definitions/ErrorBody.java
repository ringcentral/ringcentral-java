package com.ringcentral.definitions;


public class ErrorBody
{
    /**
     * ANL error code
     * Required
     */
    public String errorCode;
    public ErrorBody errorCode(String errorCode)
    {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * Detailed description of the error
     * Required
     */
    public String message;
    public ErrorBody message(String message)
    {
        this.message = message;
        return this;
    }
}