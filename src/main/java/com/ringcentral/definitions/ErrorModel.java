package com.ringcentral.definitions;


    /**
* Generalized API error structure
*/
public class ErrorModel
{
    /**
     * Logical error code (typically, 3 letters followed with number, dash separated)
     * Required
     * Example: XXX-123
     */
    public String errorCode;
    public ErrorModel errorCode(String errorCode)
    {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * User-friendly error message
     * Required
     * Example: Something went wrong
     */
    public String message;
    public ErrorModel message(String message)
    {
        this.message = message;
        return this;
    }
}