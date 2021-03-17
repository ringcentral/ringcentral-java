package com.ringcentral.definitions;


public class UserSearchResponse
{
    /**
         * user list
         */
        public UserResponse[] Resources;
  public UserSearchResponse Resources(UserResponse[] Resources)
  {
    this.Resources = Resources;
    return this;
  }
  

        /**
         */
        public Long itemsPerPage;
  public UserSearchResponse itemsPerPage(Long itemsPerPage)
  {
    this.itemsPerPage = itemsPerPage;
    return this;
  }
  

        /**
         */
        public String[] schemas;
  public UserSearchResponse schemas(String[] schemas)
  {
    this.schemas = schemas;
    return this;
  }
  

        /**
         */
        public Long startIndex;
  public UserSearchResponse startIndex(Long startIndex)
  {
    this.startIndex = startIndex;
    return this;
  }
  

        /**
         */
        public Long totalResults;
  public UserSearchResponse totalResults(Long totalResults)
  {
    this.totalResults = totalResults;
    return this;
  }
  
}
