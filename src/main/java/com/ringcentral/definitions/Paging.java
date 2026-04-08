package com.ringcentral.definitions;


    /**
* Paging information
*/
public class Paging
{
    /**
     * Current offset token
     * Required
     */
    public String currentPageToken;
    public Paging currentPageToken(String currentPageToken)
    {
        this.currentPageToken = currentPageToken;
        return this;
    }

    /**
     * Next page offset token
     */
    public String nextPageToken;
    public Paging nextPageToken(String nextPageToken)
    {
        this.nextPageToken = nextPageToken;
        return this;
    }

    /**
     * Number of records returned
     * Required
     * Format: int32
     */
    public Long perPage;
    public Paging perPage(Long perPage)
    {
        this.perPage = perPage;
        return this;
    }
}