package com.ringcentral.definitions;


public class ReadGlipPostsParameters
{
    /**
         * Max number of posts to be fetched by one request (not more than 250)
         * Maximum: 250
         * Default: 30
         */
        public Long recordCount;
  public ReadGlipPostsParameters recordCount(Long recordCount)
  {
    this.recordCount = recordCount;
    return this;
  }
  

        /**
         * Pagination token.
         */
        public String pageToken;
  public ReadGlipPostsParameters pageToken(String pageToken)
  {
    this.pageToken = pageToken;
    return this;
  }
  
}
