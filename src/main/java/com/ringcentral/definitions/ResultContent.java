package com.ringcentral.definitions;


    /**
* Flags controlling parsing result content.
*/
public class ResultContent
{
    /**
     * Indicates that `results.dialingDetails` section should be returned for particular result items in the response.
     * Default: true
     */
    public Boolean includeDialingDetails;
    public ResultContent includeDialingDetails(Boolean includeDialingDetails)
    {
        this.includeDialingDetails = includeDialingDetails;
        return this;
    }

    /**
     * Indicates that `results.numberDetails` section should be returned for particular result items in the response.
     * Example: true
     * Default: true
     */
    public Boolean includeNumberDetails;
    public ResultContent includeNumberDetails(Boolean includeNumberDetails)
    {
        this.includeNumberDetails = includeNumberDetails;
        return this;
    }

    /**
     * Indicates that `results.formats` section should be returned for particular result items in the response.
     * Example: true
     * Default: true
     */
    public Boolean includeFormats;
    public ResultContent includeFormats(Boolean includeFormats)
    {
        this.includeFormats = includeFormats;
        return this;
    }
}