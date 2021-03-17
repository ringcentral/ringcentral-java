package com.ringcentral.definitions;


    // Pagination details
public class PagingResource
{
    /**
         * Page token of the current response list
         */
        public String pageToken;
  public PagingResource pageToken(String pageToken)
  {
    this.pageToken = pageToken;
    return this;
  }
  

        /**
         * Number of records per page
         */
        public Long perPage;
  public PagingResource perPage(Long perPage)
  {
    this.perPage = perPage;
    return this;
  }
  

        /**
         * First page token of the current filter criteria
         */
        public String firstPageToken;
  public PagingResource firstPageToken(String firstPageToken)
  {
    this.firstPageToken = firstPageToken;
    return this;
  }
  

        /**
         * Previous page token of the current filter criteria
         */
        public String previousPageToken;
  public PagingResource previousPageToken(String previousPageToken)
  {
    this.previousPageToken = previousPageToken;
    return this;
  }
  

        /**
         * Next page token of the current filter criteria
         */
        public String nextPageToken;
  public PagingResource nextPageToken(String nextPageToken)
  {
    this.nextPageToken = nextPageToken;
    return this;
  }
  
}
