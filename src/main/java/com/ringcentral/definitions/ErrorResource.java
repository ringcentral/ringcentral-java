package com.ringcentral.definitions;


    /**
* Standard error resource which is returned in case of any unsuccessful operation
*/
public class ErrorResource
{
    /**
     * The array of errors (there will be just one in the most of cases)
     * Required
     */
    public ResponseErrorModel[] errors;
    public ErrorResource errors(ResponseErrorModel[] errors)
    {
        this.errors = errors;
        return this;
    }
}