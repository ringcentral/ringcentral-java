package com.ringcentral.definitions;


public class FavoriteContactList
{
    /**
         */
        public String uri;
  public FavoriteContactList uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         */
        public FavoriteContactResource[] records;
  public FavoriteContactList records(FavoriteContactResource[] records)
  {
    this.records = records;
    return this;
  }
  
}
