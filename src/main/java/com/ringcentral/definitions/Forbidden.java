package com.ringcentral.definitions;


public class Forbidden
{
    /**
     * List of errors
     */
    public ErrorBody[] errors;
    public Forbidden errors(ErrorBody[] errors)
    {
        this.errors = errors;
        return this;
    }
}