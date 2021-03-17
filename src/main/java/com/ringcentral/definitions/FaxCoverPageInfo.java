package com.ringcentral.definitions;


public class FaxCoverPageInfo
{
    /**
         * Internal identifier of a fax cover page. The possible value range is 0-13 (for language setting en-US) and 0, 15-28 (for all other languages)
         */
        public String id;
  public FaxCoverPageInfo id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Name of a fax cover page pattern
         */
        public String name;
  public FaxCoverPageInfo name(String name)
  {
    this.name = name;
    return this;
  }
  
}
