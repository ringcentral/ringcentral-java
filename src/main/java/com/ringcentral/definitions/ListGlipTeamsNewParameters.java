package com.ringcentral.definitions;


    /**
* Query parameters for operation listGlipTeamsNew
*/
public class ListGlipTeamsNewParameters
{
    /**
     * Number of teams to be fetched by one request. The maximum value is 250, by default - 30
     * Maximum: 250
     * Format: int32
     * Default: 30
     */
    public Long recordCount;
    public ListGlipTeamsNewParameters recordCount(Long recordCount)
    {
        this.recordCount = recordCount;
        return this;
    }

    /**
     * Pagination token.
     */
    public String pageToken;
    public ListGlipTeamsNewParameters pageToken(String pageToken)
    {
        this.pageToken = pageToken;
        return this;
    }
}