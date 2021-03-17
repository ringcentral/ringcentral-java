package com.ringcentral.definitions;


public class GlipPostsList
{
    /**
         * List of posts
         * Required
         */
        public GlipPostInfo[] records;
  public GlipPostsList records(GlipPostInfo[] records)
  {
    this.records = records;
    return this;
  }
  

        /**
         */
        public GlipNavigationInfo navigation;
  public GlipPostsList navigation(GlipNavigationInfo navigation)
  {
    this.navigation = navigation;
    return this;
  }
  
}
