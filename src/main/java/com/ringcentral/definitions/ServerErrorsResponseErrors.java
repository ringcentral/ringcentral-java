package com.ringcentral.definitions;


public class ServerErrorsResponseErrors
{
    /**
     * Logical error code.
     */
    public String errorCode;
    public ServerErrorsResponseErrors errorCode(String errorCode)
    {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * Detailed user-friendly description of error.
     */
    public String message;
    public ServerErrorsResponseErrors message(String message)
    {
        this.message = message;
        return this;
    }
}