package com.ringcentral.definitions;


    /**
* Phone Number Parser service's Parse Phone Numbers API 4xx error response schema.
*/
public class ClientErrorsResponse
{
    /**
     * Required
     */
    public ClientErrorsResponseErrors[] errors;
    public ClientErrorsResponse errors(ClientErrorsResponseErrors[] errors)
    {
        this.errors = errors;
        return this;
    }
}