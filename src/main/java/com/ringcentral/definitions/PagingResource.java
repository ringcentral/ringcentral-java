package com.ringcentral.definitions;


    /**
* Pagination details
*/
public class PagingResource
{
    /**
     * Page token of the current response list
     * Example: pgt1
     */
    public String pageToken;
    public PagingResource pageToken(String pageToken)
    {
        this.pageToken = pageToken;
        return this;
    }

    /**
     * Number of records per page
     * Format: int32
     * Example: 3
     */
    public Long perPage;
    public PagingResource perPage(Long perPage)
    {
        this.perPage = perPage;
        return this;
    }

    /**
     * First page token of the current filter criteria
     * Example: fpgt1
     */
    public String firstPageToken;
    public PagingResource firstPageToken(String firstPageToken)
    {
        this.firstPageToken = firstPageToken;
        return this;
    }

    /**
     * Previous page token of the current filter criteria
     * Example: lpgt1
     */
    public String previousPageToken;
    public PagingResource previousPageToken(String previousPageToken)
    {
        this.previousPageToken = previousPageToken;
        return this;
    }

    /**
     * Next page token of the current filter criteria
     * Example: npgt1
     */
    public String nextPageToken;
    public PagingResource nextPageToken(String nextPageToken)
    {
        this.nextPageToken = nextPageToken;
        return this;
    }
}