package com.ringcentral.definitions;


public class DirectoryResource
{
    /**
         */
        public CompanyContactsPagingInfo paging;
  public DirectoryResource paging(CompanyContactsPagingInfo paging)
  {
    this.paging = paging;
    return this;
  }
  

        /**
         */
        public ContactResource[] records;
  public DirectoryResource records(ContactResource[] records)
  {
    this.records = records;
    return this;
  }
  
}
