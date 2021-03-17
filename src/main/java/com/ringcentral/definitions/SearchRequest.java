package com.ringcentral.definitions;


public class SearchRequest
{
    /**
         * page size
         */
        public Long count;
  public SearchRequest count(Long count)
  {
    this.count = count;
    return this;
  }
  

        /**
         * only support 'userName' or 'email' filter expressions for now
         */
        public String filter;
  public SearchRequest filter(String filter)
  {
    this.filter = filter;
    return this;
  }
  

        /**
         */
        public String[] schemas;
  public SearchRequest schemas(String[] schemas)
  {
    this.schemas = schemas;
    return this;
  }
  

        /**
         * start index (1-based)
         */
        public Long startIndex;
  public SearchRequest startIndex(Long startIndex)
  {
    this.startIndex = startIndex;
    return this;
  }
  
}
