package com.ringcentral.definitions;


    /**
* Phone Number Parser service's Parse Phone Numbers API 5xx error response schema.
*/
public class ServerErrorsResponse
{
    /**
     * Required
     */
    public ServerErrorsResponseErrors[] errors;
    public ServerErrorsResponse errors(ServerErrorsResponseErrors[] errors)
    {
        this.errors = errors;
        return this;
    }
}