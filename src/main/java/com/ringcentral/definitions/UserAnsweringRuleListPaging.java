package com.ringcentral.definitions;


public class UserAnsweringRuleListPaging
{
    /**
         * The current page number. 1-indexed, so the first page is 1 by default. May be omitted if result is empty (because non-existent page was specified or perPage=0 was requested)
         */
        public Long page;
  public UserAnsweringRuleListPaging page(Long page)
  {
    this.page = page;
    return this;
  }
  

        /**
         * The total number of pages in a dataset.
         */
        public Long totalPages;
  public UserAnsweringRuleListPaging totalPages(Long totalPages)
  {
    this.totalPages = totalPages;
    return this;
  }
  

        /**
         * Current page size, describes how many items are in each page. Default value is 100. Maximum value is 1000. If perPage value in the request is greater than 1000, the maximum value (1000) is applied
         */
        public Long perPage;
  public UserAnsweringRuleListPaging perPage(Long perPage)
  {
    this.perPage = perPage;
    return this;
  }
  

        /**
         * The total number of elements in a dataset.
         */
        public Long totalElements;
  public UserAnsweringRuleListPaging totalElements(Long totalElements)
  {
    this.totalElements = totalElements;
    return this;
  }
  

        /**
         * The zero-based number of the first element on the current page. Omitted if the page is omitted or result is empty
         */
        public Long pageStart;
  public UserAnsweringRuleListPaging pageStart(Long pageStart)
  {
    this.pageStart = pageStart;
    return this;
  }
  

        /**
         * The zero-based index of the last element on the current page. Omitted if the page is omitted or result is empty
         */
        public Long pageEnd;
  public UserAnsweringRuleListPaging pageEnd(Long pageEnd)
  {
    this.pageEnd = pageEnd;
    return this;
  }
  
}
